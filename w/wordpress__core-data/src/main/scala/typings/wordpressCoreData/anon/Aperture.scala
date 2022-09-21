package typings.wordpressCoreData.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aperture extends StObject {
  
  var aperture: String
  
  var camera: String
  
  var caption: String
  
  var copyright: String
  
  var created_timestamp: String
  
  var credit: String
  
  var focal_length: String
  
  var iso: String
  
  var keywords: js.Array[String]
  
  var orientation: String
  
  var shutter_speed: String
  
  var title: String
}
object Aperture {
  
  inline def apply(
    aperture: String,
    camera: String,
    caption: String,
    copyright: String,
    created_timestamp: String,
    credit: String,
    focal_length: String,
    iso: String,
    keywords: js.Array[String],
    orientation: String,
    shutter_speed: String,
    title: String
  ): Aperture = {
    val __obj = js.Dynamic.literal(aperture = aperture.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], created_timestamp = created_timestamp.asInstanceOf[js.Any], credit = credit.asInstanceOf[js.Any], focal_length = focal_length.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], shutter_speed = shutter_speed.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aperture]
  }
  
  extension [Self <: Aperture](x: Self) {
    
    inline def setAperture(value: String): Self = StObject.set(x, "aperture", value.asInstanceOf[js.Any])
    
    inline def setCamera(value: String): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCreated_timestamp(value: String): Self = StObject.set(x, "created_timestamp", value.asInstanceOf[js.Any])
    
    inline def setCredit(value: String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    inline def setFocal_length(value: String): Self = StObject.set(x, "focal_length", value.asInstanceOf[js.Any])
    
    inline def setIso(value: String): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setShutter_speed(value: String): Self = StObject.set(x, "shutter_speed", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
