package typings.wixUiCore.anon

import typings.wixUiCore.mediaImageMediaImageMod.MediaImageScaling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale extends StObject {
  
  var scale: MediaImageScaling
}
object Scale {
  
  @scala.inline
  def apply(scale: MediaImageScaling): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit class ScaleMutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: MediaImageScaling): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
