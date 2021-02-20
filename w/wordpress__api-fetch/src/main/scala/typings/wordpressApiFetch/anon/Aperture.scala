package typings.wordpressApiFetch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aperture extends StObject {
  
  var aperture: String = js.native
  
  var camera: String = js.native
  
  var caption: String = js.native
  
  var copyright: String = js.native
  
  var created_timestamp: String = js.native
  
  var credit: String = js.native
  
  var focal_length: String = js.native
  
  var iso: String = js.native
  
  var keywords: js.Array[String] = js.native
  
  var orientation: String = js.native
  
  var shutter_speed: String = js.native
  
  var title: String = js.native
}
object Aperture {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ApertureMutableBuilder[Self <: Aperture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAperture(value: String): Self = StObject.set(x, "aperture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: String): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_timestamp(value: String): Self = StObject.set(x, "created_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredit(value: String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocal_length(value: String): Self = StObject.set(x, "focal_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso(value: String): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShutter_speed(value: String): Self = StObject.set(x, "shutter_speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
