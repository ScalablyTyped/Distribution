package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedTextOptions extends StObject {
  
  var animation: AnimationOption
  
  var attr: js.UndefOr[js.Object] = js.undefined
  
  var internal: js.UndefOr[Boolean] = js.undefined
}
object AnimatedTextOptions {
  
  inline def apply(animation: AnimationOption): AnimatedTextOptions = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedTextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimatedTextOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: AnimationOption): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationVarargs(value: String*): Self = StObject.set(x, "animation", js.Array(value*))
    
    inline def setAttr(value: js.Object): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
  }
}
