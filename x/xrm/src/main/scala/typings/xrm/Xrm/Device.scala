package typings.xrm.Xrm

import typings.xrm.Xrm.Async.PromiseLike
import typings.xrm.Xrm.Device.CaptureFileResponse
import typings.xrm.Xrm.Device.CaptureImageOptions
import typings.xrm.Xrm.Device.GetCurrentPositionResponse
import typings.xrm.Xrm.Device.PickFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for Xrm.Device API
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-device External Link: Xrm.Device (Client API reference)}
  */
@js.native
trait Device extends StObject {
  
  /**
    * Invokes the device microphone to record audio.
    * @returns On success, returns Base64 encoded file
    */
  def captureAudio(): PromiseLike[CaptureFileResponse] = js.native
  
  /**
    * Invokes the device camera to capture an image.
    * @returns On success, returns Base64 encoded file
    */
  def captureImage(): PromiseLike[CaptureFileResponse] = js.native
  def captureImage(imageOptions: CaptureImageOptions): PromiseLike[CaptureFileResponse] = js.native
  
  /**
    * Invokes the device camera to capture video.
    * @returns On success, returns Base64 encoded file
    */
  def captureVideo(): PromiseLike[CaptureFileResponse] = js.native
  
  /**
    * Invokes the device camera to scan the barcode information, such as a product number.
    * @returns On success, Barcode value is returned as a String
    */
  def getBarcodeValue(): PromiseLike[String] = js.native
  
  /**
    * Returns the current location using the device geolocation capability.
    * @returns On success, returns current geolocation information
    */
  def getCurrentPosition(): PromiseLike[GetCurrentPositionResponse] = js.native
  
  /**
    * Opens a dialog box to select files from your computer (web client) or mobile device (mobile clients).
    * @returns On success, returns an array of files
    */
  def pickFile(): PromiseLike[js.Array[CaptureFileResponse]] = js.native
  def pickFile(pickFileOptions: PickFileOptions): PromiseLike[js.Array[CaptureFileResponse]] = js.native
}
/**
  * Namespace to hold Xrm.Device related types
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-device External Link: Xrm.Device (Client API reference)}
  */
object Device {
  
  /**
    * Xrm.Device.captureAudio/captureImage/captureVideo response
    */
  @js.native
  trait CaptureFileResponse extends StObject {
    
    /**
      * Base64 encoded contents of the file.
      */
    var fileContent: String = js.native
    
    /**
      * Name of the audio file.
      */
    var fileName: String = js.native
    
    /**
      * Size of the file in KB.
      */
    var fileSize: Double = js.native
    
    /**
      * File MIME type.
      */
    var mimeType: String = js.native
  }
  object CaptureFileResponse {
    
    @scala.inline
    def apply(fileContent: String, fileName: String, fileSize: Double, mimeType: String): CaptureFileResponse = {
      val __obj = js.Dynamic.literal(fileContent = fileContent.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptureFileResponse]
    }
    
    @scala.inline
    implicit class CaptureFileResponseMutableBuilder[Self <: CaptureFileResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileContent(value: String): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options for Xrm.Device.captureImage
    */
  @js.native
  trait CaptureImageOptions extends StObject {
    
    /**
      * Indicates whether to edit the image before saving.
      */
    var allowEdit: Boolean = js.native
    
    /**
      * Height of the image to capture.
      */
    var height: Double = js.native
    
    /**
      * Indicates whether to capture image using the front camera of the device.
      */
    var preferFrontCamera: Boolean = js.native
    
    /**
      * Quality of the image file in percentage. Number.
      */
    var quality: Double = js.native
    
    /**
      * Width of the image to capture
      */
    var width: Double = js.native
  }
  object CaptureImageOptions {
    
    @scala.inline
    def apply(allowEdit: Boolean, height: Double, preferFrontCamera: Boolean, quality: Double, width: Double): CaptureImageOptions = {
      val __obj = js.Dynamic.literal(allowEdit = allowEdit.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], preferFrontCamera = preferFrontCamera.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptureImageOptions]
    }
    
    @scala.inline
    implicit class CaptureImageOptionsMutableBuilder[Self <: CaptureImageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEdit(value: Boolean): Self = StObject.set(x, "allowEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferFrontCamera(value: Boolean): Self = StObject.set(x, "preferFrontCamera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface for Xrm.Device.getCurrentPosition response
    */
  @js.native
  trait GetCurrentPositionResponse extends StObject {
    
    /**
      * Contains a set of geographic coordinates along with associated accuracy as well as a set of other optional attributes such as altitude and speed.
      */
    var coords: js.Any = js.native
    
    /**
      * Represents the time when the object was acquired and is represented as DOMTimeStamp.
      */
    var timestamp: Double = js.native
  }
  object GetCurrentPositionResponse {
    
    @scala.inline
    def apply(coords: js.Any, timestamp: Double): GetCurrentPositionResponse = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCurrentPositionResponse]
    }
    
    @scala.inline
    implicit class GetCurrentPositionResponseMutableBuilder[Self <: GetCurrentPositionResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoords(value: js.Any): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface for Xrm.Device.pickFile options
    */
  @js.native
  trait PickFileOptions extends StObject {
    
    /**
      * Image file types to select.
      */
    var accept: PickFileTypes = js.native
    
    /**
      * Indicates whether to allow selecting multiple files.
      */
    var allowMultipleFiles: Boolean = js.native
    
    /**
      * Maximum size of the files(s) to be selected.
      */
    var maximumAllowedFileSize: Double = js.native
  }
  object PickFileOptions {
    
    @scala.inline
    def apply(accept: PickFileTypes, allowMultipleFiles: Boolean, maximumAllowedFileSize: Double): PickFileOptions = {
      val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], allowMultipleFiles = allowMultipleFiles.asInstanceOf[js.Any], maximumAllowedFileSize = maximumAllowedFileSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickFileOptions]
    }
    
    @scala.inline
    implicit class PickFileOptionsMutableBuilder[Self <: PickFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: PickFileTypes): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultipleFiles(value: Boolean): Self = StObject.set(x, "allowMultipleFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumAllowedFileSize(value: Double): Self = StObject.set(x, "maximumAllowedFileSize", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Posible file types for Xrm.Device.pickFile options
    * @see {@link XrmEnum.DevicePickFileType}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.audio
    - typings.xrm.xrmStrings.video
    - typings.xrm.xrmStrings.image
  */
  trait PickFileTypes extends StObject
  object PickFileTypes {
    
    @scala.inline
    def audio: typings.xrm.xrmStrings.audio = "audio".asInstanceOf[typings.xrm.xrmStrings.audio]
    
    @scala.inline
    def image: typings.xrm.xrmStrings.image = "image".asInstanceOf[typings.xrm.xrmStrings.image]
    
    @scala.inline
    def video: typings.xrm.xrmStrings.video = "video".asInstanceOf[typings.xrm.xrmStrings.video]
  }
}
