package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitHeightMatchOptions extends StObject {
  
  var row: js.UndefOr[Boolean] = js.native
  
  var target: js.UndefOr[String] = js.native
}
object UIkitHeightMatchOptions {
  
  @scala.inline
  def apply(): UIkitHeightMatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitHeightMatchOptions]
  }
  
  @scala.inline
  implicit class UIkitHeightMatchOptionsMutableBuilder[Self <: UIkitHeightMatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRow(value: Boolean): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
