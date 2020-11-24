package typings.uiGrid.mod.infiniteScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridOptions extends js.Object {
  
  /**
    * Enable infinite scrolling for this grid
    * Defaults to true
    * @default true
    */
  var enableInfiniteScroll: js.UndefOr[Boolean] = js.native
}
object IGridOptions {
  
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
    
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
    def setEnableInfiniteScroll(value: Boolean): Self = this.set("enableInfiniteScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableInfiniteScroll: Self = this.set("enableInfiniteScroll", js.undefined)
  }
}
