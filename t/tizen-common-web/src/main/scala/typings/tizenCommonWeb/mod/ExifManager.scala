package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExifManager extends StObject {
  
  /**
    * Gets the _ExifInformation_ object to manipulate the Exif data in a JPEG file.
    *
    * This function returns (via callback) the _ExifInformation_ object that contains the Exif data in the JPEG file.
    *
    * The errorCallback is launched with these error types:
    *
    * *   NotFoundError: If the file of the input parameters is not found or the file does not contain Exif data
    * *   IOError: If access to the image file is denied due to insufficient permissions
    * *   InvalidValuesError: If any input parameter contains invalid values
    * *   UnknownError: In any other error case
    *
    *
    * @param uri URI of the JPEG file, as available in ImageContent::contentURI or returned by File::toURI().
    * @param successCallback Callback method to be invoked when Exif information has been retrieved successfully.
    * @param errorCallback Callback method to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  def getExifInfo(uri: String, successCallback: ExifInformationSuccessCallback): Unit = js.native
  def getExifInfo(uri: String, successCallback: ExifInformationSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Gets the thumbnail of the specified JPEG file. If there is no thumbnail in the JPEG file, null is returned.
    *
    * _successCallback_ is invoked with a URI as the first argument.
    * This URI is a [data URI](http://en.wikipedia.org/wiki/Data_URI_scheme).
    * It can be used as an src attribute value of the img element.
    *
    * The errorCallback is launched with these error types:
    *
    * *   NotFoundError: If the file of the input parameters is not found
    * *   IOError: If access to the thumbnail file is denied due to insufficient permissions
    * *   InvalidValuesError: If any of the input parameters contains an invalid value
    * *   UnknownError: In any other error case
    *
    *
    * @param uri URI of the JPEG file.
    * @param successCallback Callback method to be invoked when thumbnail data has been retrieved successfully.
    * @param errorCallback Callback method to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  def getThumbnail(uri: String, successCallback: ExifThumbnailSuccessCallback): Unit = js.native
  def getThumbnail(uri: String, successCallback: ExifThumbnailSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Saves the Exif data of the _ExifInformation_ object into the JPEG file.
    *
    * The errorCallback is launched with these error types:
    *
    * *   NotFoundError: If the file of the input parameters is not found
    * *   InvalidValuesError: If any input parameter contains invalid values
    * *   UnknownError: In any other error case
    *
    *
    * @param exifInfo Exif information object that contains the Exif data in the JPEG file.
    * @param successCallback Callback method to be invoked when Exif data has been saved successfully.
    * @param errorCallback Callback method to be invoked when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  def saveExifInfo(exifInfo: ExifInformation): Unit = js.native
  def saveExifInfo(exifInfo: ExifInformation, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def saveExifInfo(exifInfo: ExifInformation, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def saveExifInfo(exifInfo: ExifInformation, successCallback: SuccessCallback): Unit = js.native
  def saveExifInfo(exifInfo: ExifInformation, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
}
