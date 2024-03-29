package typings.wixUiCore.anon

import typings.wixUiCore.componentsMediaImageMediaImageMod.MediaImageScaling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleMediaImageScaling extends StObject {
  
  var scale: MediaImageScaling
}
object ScaleMediaImageScaling {
  
  inline def apply(scale: MediaImageScaling): ScaleMediaImageScaling = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleMediaImageScaling]
  }
  
  extension [Self <: ScaleMediaImageScaling](x: Self) {
    
    inline def setScale(value: MediaImageScaling): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
