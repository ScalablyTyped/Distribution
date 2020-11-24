package typings.uifabricUtilities.customizerContextMod

import typings.uifabricUtilities.customizationsMod.ICustomizations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomizerContext extends js.Object {
  
  var customizations: ICustomizations = js.native
}
object ICustomizerContext {
  
  @scala.inline
  def apply(customizations: ICustomizations): ICustomizerContext = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomizerContext]
  }
  
  @scala.inline
  implicit class ICustomizerContextOps[Self <: ICustomizerContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomizations(value: ICustomizations): Self = this.set("customizations", value.asInstanceOf[js.Any])
  }
}
