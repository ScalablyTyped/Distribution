package typings.wixUiCore.anon

import typings.wixUiCore.srcComponentsMediaImageMediaImageMod.MediaImageScaling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var scale: MediaImageScaling
}
object `4` {
  
  @scala.inline
  def apply(scale: MediaImageScaling): `4` = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: MediaImageScaling): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
