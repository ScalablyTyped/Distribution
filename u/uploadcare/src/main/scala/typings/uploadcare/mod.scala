package typings.uploadcare

import typings.uploadcare.anon.FromUrl
import typings.uploadcare.anon.Remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uploadcare", JSImport.Namespace)
  @js.native
  def apply(publicKey: String, privateKey: String): Instance = js.native
  
  @js.native
  trait File extends StObject {
    
    var datetime_removed: String | Null = js.native
    
    var datetime_stored: String = js.native
    
    var datetime_uploaded: String = js.native
    
    var image_info: ImageInfo = js.native
    
    var is_image: Boolean = js.native
    
    var is_ready: Boolean = js.native
    
    var mime_type: String = js.native
    
    var original_file_url: String = js.native
    
    var original_filename: String = js.native
    
    var size: Double = js.native
    
    var url: String = js.native
    
    var uuid: String = js.native
  }
  object File {
    
    @scala.inline
    def apply(
      datetime_stored: String,
      datetime_uploaded: String,
      image_info: ImageInfo,
      is_image: Boolean,
      is_ready: Boolean,
      mime_type: String,
      original_file_url: String,
      original_filename: String,
      size: Double,
      url: String,
      uuid: String
    ): File = {
      val __obj = js.Dynamic.literal(datetime_stored = datetime_stored.asInstanceOf[js.Any], datetime_uploaded = datetime_uploaded.asInstanceOf[js.Any], image_info = image_info.asInstanceOf[js.Any], is_image = is_image.asInstanceOf[js.Any], is_ready = is_ready.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], original_file_url = original_file_url.asInstanceOf[js.Any], original_filename = original_filename.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatetime_removed(value: String): Self = StObject.set(x, "datetime_removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatetime_removedNull: Self = StObject.set(x, "datetime_removed", null)
      
      @scala.inline
      def setDatetime_stored(value: String): Self = StObject.set(x, "datetime_stored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatetime_uploaded(value: String): Self = StObject.set(x, "datetime_uploaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_info(value: ImageInfo): Self = StObject.set(x, "image_info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_image(value: Boolean): Self = StObject.set(x, "is_image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_ready(value: Boolean): Self = StObject.set(x, "is_ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_file_url(value: String): Self = StObject.set(x, "original_file_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_filename(value: String): Self = StObject.set(x, "original_filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ImageInfo extends StObject {
    
    var datetime_original: Null = js.native
    
    var dpi: js.Array[Double] = js.native
    
    var format: String = js.native
    
    var geo_location: Null = js.native
    
    var height: Double = js.native
    
    var orientation: Null = js.native
    
    var sequence: Boolean = js.native
    
    var width: Double = js.native
  }
  object ImageInfo {
    
    @scala.inline
    def apply(
      datetime_original: Null,
      dpi: js.Array[Double],
      format: String,
      geo_location: Null,
      height: Double,
      orientation: Null,
      sequence: Boolean,
      width: Double
    ): ImageInfo = {
      val __obj = js.Dynamic.literal(datetime_original = datetime_original.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], geo_location = geo_location.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageInfo]
    }
    
    @scala.inline
    implicit class ImageInfoMutableBuilder[Self <: ImageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatetime_original(value: Null): Self = StObject.set(x, "datetime_original", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpi(value: js.Array[Double]): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpiVarargs(value: Double*): Self = StObject.set(x, "dpi", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeo_location(value: Null): Self = StObject.set(x, "geo_location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientation(value: Null): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequence(value: Boolean): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance extends StObject {
    
    var file: FromUrl = js.native
    
    var files: Remove = js.native
  }
  object Instance {
    
    @scala.inline
    def apply(file: FromUrl, files: Remove): Instance = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: FromUrl): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: Remove): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    }
  }
}
