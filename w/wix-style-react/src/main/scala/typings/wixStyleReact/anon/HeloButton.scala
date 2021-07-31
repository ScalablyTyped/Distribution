package typings.wixStyleReact.anon

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeloButton extends StObject {
  
  var HeloButton: js.UndefOr[FC[js.Object]] = js.undefined
}
object HeloButton {
  
  @scala.inline
  def apply(): HeloButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeloButton]
  }
  
  @scala.inline
  implicit class HeloButtonMutableBuilder[Self <: HeloButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeloButton(value: FC[js.Object]): Self = StObject.set(x, "HeloButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeloButtonUndefined: Self = StObject.set(x, "HeloButton", js.undefined)
  }
}
