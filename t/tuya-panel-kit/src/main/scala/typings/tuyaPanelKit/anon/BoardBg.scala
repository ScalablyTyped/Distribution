package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoardBg extends js.Object {
  
  var boardBg: js.UndefOr[String] = js.native
  
  var cellBg: js.UndefOr[String] = js.native
  
  var cellLine: js.UndefOr[String] = js.native
  
  var cellRadius: js.UndefOr[Double] = js.native
  
  var descFontColor: js.UndefOr[String] = js.native
  
  var fontColor: js.UndefOr[String] = js.native
  
  var margin: js.UndefOr[js.Array[Double] | Double] = js.native
  
  var padding: js.UndefOr[js.Array[Double] | Double] = js.native
  
  var subFontColor: js.UndefOr[String] = js.native
}
object BoardBg {
  
  @scala.inline
  def apply(): BoardBg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoardBg]
  }
  
  @scala.inline
  implicit class BoardBgOps[Self <: BoardBg] (val x: Self) extends AnyVal {
    
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
    def setBoardBg(value: String): Self = this.set("boardBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoardBg: Self = this.set("boardBg", js.undefined)
    
    @scala.inline
    def setCellBg(value: String): Self = this.set("cellBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellBg: Self = this.set("cellBg", js.undefined)
    
    @scala.inline
    def setCellLine(value: String): Self = this.set("cellLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellLine: Self = this.set("cellLine", js.undefined)
    
    @scala.inline
    def setCellRadius(value: Double): Self = this.set("cellRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellRadius: Self = this.set("cellRadius", js.undefined)
    
    @scala.inline
    def setDescFontColor(value: String): Self = this.set("descFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescFontColor: Self = this.set("descFontColor", js.undefined)
    
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = this.set("margin", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: js.Array[Double] | Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: js.Array[Double] | Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setSubFontColor(value: String): Self = this.set("subFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubFontColor: Self = this.set("subFontColor", js.undefined)
  }
}
