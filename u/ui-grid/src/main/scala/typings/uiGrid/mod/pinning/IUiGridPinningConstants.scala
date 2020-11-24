package typings.uiGrid.mod.pinning

import typings.uiGrid.anon.NONE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUiGridPinningConstants extends js.Object {
  
  var container: NONE = js.native
}
object IUiGridPinningConstants {
  
  @scala.inline
  def apply(container: NONE): IUiGridPinningConstants = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUiGridPinningConstants]
  }
  
  @scala.inline
  implicit class IUiGridPinningConstantsOps[Self <: IUiGridPinningConstants] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: NONE): Self = this.set("container", value.asInstanceOf[js.Any])
  }
}
