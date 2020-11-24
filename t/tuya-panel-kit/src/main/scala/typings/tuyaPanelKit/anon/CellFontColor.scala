package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellFontColor extends js.Object {
  
  var cellFontColor: js.UndefOr[String] = js.native
}
object CellFontColor {
  
  @scala.inline
  def apply(): CellFontColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellFontColor]
  }
  
  @scala.inline
  implicit class CellFontColorOps[Self <: CellFontColor] (val x: Self) extends AnyVal {
    
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
    def setCellFontColor(value: String): Self = this.set("cellFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellFontColor: Self = this.set("cellFontColor", js.undefined)
  }
}
