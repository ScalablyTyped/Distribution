package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A read-only version of a DataPackage . Apps that receive shared content get this object when acquiring content. */
@js.native
trait DataPackageView extends js.Object {
  /** Returns the formats the DataPackageView contains. */
  var availableFormats: IVectorView[String] = js.native
  /** Gets a DataPackagePropertySetView object, which contains a read-only set of properties for the data in the DataPackageView object. */
  var properties: DataPackagePropertySetView = js.native
  /** Gets the requested operation (such as copy or move). Primarily used for Clipboard actions. */
  var requestedOperation: DataPackageOperation = js.native
  /**
    * Checks to see if the DataPackageView contains a specific data format.
    * @param formatId The name of the format.
    * @return True if the DataPackageView contains the format; false otherwise.
    */
  def contains(formatId: String): Boolean = js.native
  /**
    * Gets the application link in the DataPackageView object.
    * @return The application link.
    */
  def getApplicationLinkAsync(): IPromiseWithIAsyncOperation[Uri] = js.native
  /**
    * Gets the bitmap image contained in the DataPackageView
    * @return A stream containing the bitmap image.
    */
  def getBitmapAsync(): IPromiseWithIAsyncOperation[RandomAccessStreamReference] = js.native
  /**
    * Gets the data contained in the DataPackageView .
    * @param formatId Specifies the format of the data. We recommend that you set this value by using the StandardDataFormats class.
    * @return The data.
    */
  def getDataAsync(formatId: String): IPromiseWithIAsyncOperation[_] = js.native
  /**
    * Gets the HTML stored in the DataPackageView object.
    * @return The HTML.
    */
  def getHtmlFormatAsync(): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Gets the data (such as an image) referenced in HTML content.
    * @return The data referenced in the HTML content.
    */
  def getResourceMapAsync(): IPromiseWithIAsyncOperation[IMapView[_, _]] = js.native
  /**
    * Gets the rich text formatted (RTF) content contained in a DataPackageView .
    * @return The rich text formatted content for the DataPackage.
    */
  def getRtfAsync(): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Gets the files and folders stored in a DataPackageView object.
    * @return An array of files and folders stored in a DataPackageView .
    */
  def getStorageItemsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets the text in the DataPackageView object.
    * @return The text.
    */
  def getTextAsync(): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Gets the text in the DataPackageView object.
    * @param formatId A string that represents the data format. Usually StandardDataFormats.text .
    * @return The text.
    */
  def getTextAsync(formatId: String): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Gets the URI contained in the DataPackageView .
    * @return The Uri.
    */
  def getUriAsync(): IPromiseWithIAsyncOperation[Uri] = js.native
  /**
    * Gets the web link in the DataPackageView object.
    * @return The web link.
    */
  def getWebLinkAsync(): IPromiseWithIAsyncOperation[Uri] = js.native
  /**
    * Informs the system that your app is finished using the DataPackageView object. Primarily used for Clipboard operations.
    * @param value An enumeration that states what operation (such as copy or move) was completed. At most one operation flag can be set.
    */
  def reportOperationCompleted(value: DataPackageOperation): Unit = js.native
  /**
    * Requests permission to unlock and access a data package that is secured with a protection policy.
    * @return When this method completes, it returns the results of the protection policy evaluation, which indicates whether or not the data is accessible.
    */
  def requestAccessAsync(): IPromiseWithIAsyncOperation[ProtectionPolicyEvaluationResult] = js.native
  /**
    * Requests permission to unlock and access a data package that is secured with a protection policy.
    * @param enterpriseId The enterprise Id.
    * @return When this method completes, it returns the results of the protection policy evaluation, which indicates whether or not the data is accessible.
    */
  def requestAccessAsync(enterpriseId: String): IPromiseWithIAsyncOperation[ProtectionPolicyEvaluationResult] = js.native
  /**
    * Sets the accepted format Id.
    * @param formatId The format Id.
    */
  def setAcceptedFormatId(formatId: String): Unit = js.native
  /**
    * Unlocks a data package and assumes an enterprise identity for it.
    * @return When this method completes, it returns the results of the protection policy evaluation.
    */
  def unlockAndAssumeEnterpriseIdentity(): ProtectionPolicyEvaluationResult = js.native
}

