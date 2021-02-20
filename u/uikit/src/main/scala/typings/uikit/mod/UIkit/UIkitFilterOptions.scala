package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitFilterOptions extends StObject {
  
  var selActive: js.UndefOr[String | Boolean] = js.native
  
  var target: js.UndefOr[String] = js.native
}
object UIkitFilterOptions {
  
  @scala.inline
  def apply(): UIkitFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitFilterOptions]
  }
  
  @scala.inline
  implicit class UIkitFilterOptionsMutableBuilder[Self <: UIkitFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelActive(value: String | Boolean): Self = StObject.set(x, "selActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelActiveUndefined: Self = StObject.set(x, "selActive", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
