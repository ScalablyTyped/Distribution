package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellPlusColor extends js.Object {
  
  var cellPlusColor: js.UndefOr[String] = js.native
  
  var maximumTrackTintColor: js.UndefOr[String] = js.native
}
object CellPlusColor {
  
  @scala.inline
  def apply(): CellPlusColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPlusColor]
  }
  
  @scala.inline
  implicit class CellPlusColorOps[Self <: CellPlusColor] (val x: Self) extends AnyVal {
    
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
    def setCellPlusColor(value: String): Self = this.set("cellPlusColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellPlusColor: Self = this.set("cellPlusColor", js.undefined)
    
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = this.set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumTrackTintColor: Self = this.set("maximumTrackTintColor", js.undefined)
  }
}
