package typings.uploadcare

import typings.uploadcare.anon.FromUrl
import typings.uploadcare.anon.Remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(publicKey: String, privateKey: String): Instance = (^.asInstanceOf[js.Dynamic].apply(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  @JSImport("uploadcare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait File extends StObject {
    
    var datetime_removed: String | Null
    
    var datetime_stored: String
    
    var datetime_uploaded: String
    
    var image_info: ImageInfo
    
    var is_image: Boolean
    
    var is_ready: Boolean
    
    var mime_type: String
    
    var original_file_url: String
    
    var original_filename: String
    
    var size: Double
    
    var url: String
    
    var uuid: String
  }
  object File {
    
    inline def apply(
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
      val __obj = js.Dynamic.literal(datetime_stored = datetime_stored.asInstanceOf[js.Any], datetime_uploaded = datetime_uploaded.asInstanceOf[js.Any], image_info = image_info.asInstanceOf[js.Any], is_image = is_image.asInstanceOf[js.Any], is_ready = is_ready.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], original_file_url = original_file_url.asInstanceOf[js.Any], original_filename = original_filename.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], datetime_removed = null)
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setDatetime_removed(value: String): Self = StObject.set(x, "datetime_removed", value.asInstanceOf[js.Any])
      
      inline def setDatetime_removedNull: Self = StObject.set(x, "datetime_removed", null)
      
      inline def setDatetime_stored(value: String): Self = StObject.set(x, "datetime_stored", value.asInstanceOf[js.Any])
      
      inline def setDatetime_uploaded(value: String): Self = StObject.set(x, "datetime_uploaded", value.asInstanceOf[js.Any])
      
      inline def setImage_info(value: ImageInfo): Self = StObject.set(x, "image_info", value.asInstanceOf[js.Any])
      
      inline def setIs_image(value: Boolean): Self = StObject.set(x, "is_image", value.asInstanceOf[js.Any])
      
      inline def setIs_ready(value: Boolean): Self = StObject.set(x, "is_ready", value.asInstanceOf[js.Any])
      
      inline def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
      
      inline def setOriginal_file_url(value: String): Self = StObject.set(x, "original_file_url", value.asInstanceOf[js.Any])
      
      inline def setOriginal_filename(value: String): Self = StObject.set(x, "original_filename", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageInfo extends StObject {
    
    var datetime_original: Null
    
    var dpi: js.Array[Double]
    
    var format: String
    
    var geo_location: Null
    
    var height: Double
    
    var orientation: Null
    
    var sequence: Boolean
    
    var width: Double
  }
  object ImageInfo {
    
    inline def apply(
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
    
    extension [Self <: ImageInfo](x: Self) {
      
      inline def setDatetime_original(value: Null): Self = StObject.set(x, "datetime_original", value.asInstanceOf[js.Any])
      
      inline def setDpi(value: js.Array[Double]): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
      
      inline def setDpiVarargs(value: Double*): Self = StObject.set(x, "dpi", js.Array(value*))
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setGeo_location(value: Null): Self = StObject.set(x, "geo_location", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: Null): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: Boolean): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Instance extends StObject {
    
    var file: FromUrl
    
    var files: Remove
  }
  object Instance {
    
    inline def apply(file: FromUrl, files: Remove): Instance = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    extension [Self <: Instance](x: Self) {
      
      inline def setFile(value: FromUrl): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: Remove): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    }
  }
}
