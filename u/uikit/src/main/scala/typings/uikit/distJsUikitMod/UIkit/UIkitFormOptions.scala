package typings.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitFormOptions extends StObject {
  
  var target: js.UndefOr[String | Boolean] = js.undefined
}
object UIkitFormOptions {
  
  inline def apply(): UIkitFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitFormOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIkitFormOptions] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: String | Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
