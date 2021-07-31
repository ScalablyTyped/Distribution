package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitFormOptions extends StObject {
  
  var target: js.UndefOr[String | Boolean] = js.undefined
}
object UIkitFormOptions {
  
  @scala.inline
  def apply(): UIkitFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitFormOptions]
  }
  
  @scala.inline
  implicit class UIkitFormOptionsMutableBuilder[Self <: UIkitFormOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String | Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
