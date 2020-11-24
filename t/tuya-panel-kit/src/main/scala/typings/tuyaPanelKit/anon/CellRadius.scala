package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellRadius extends js.Object {
  
  var cellBg: js.UndefOr[String] = js.native
  
  var cellRadius: js.UndefOr[Double] = js.native
  
  var descFontColor: js.UndefOr[String] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var margin: js.UndefOr[js.Array[Double] | Double] = js.native
  
  var maximumTrackTintColor: js.UndefOr[String] = js.native
  
  var minimumTrackTintColor: js.UndefOr[String] = js.native
  
  var padding: js.UndefOr[js.Array[Double] | Double] = js.native
  
  var thumbRadius: js.UndefOr[Double] = js.native
  
  var thumbSize: js.UndefOr[Double] = js.native
  
  var thumbTintColor: js.UndefOr[String] = js.native
  
  var trackHeight: js.UndefOr[Double] = js.native
  
  var trackRadius: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object CellRadius {
  
  @scala.inline
  def apply(): CellRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellRadius]
  }
  
  @scala.inline
  implicit class CellRadiusOps[Self <: CellRadius] (val x: Self) extends AnyVal {
    
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
    def setCellBg(value: String): Self = this.set("cellBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellBg: Self = this.set("cellBg", js.undefined)
    
    @scala.inline
    def setCellRadius(value: Double): Self = this.set("cellRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellRadius: Self = this.set("cellRadius", js.undefined)
    
    @scala.inline
    def setDescFontColor(value: String): Self = this.set("descFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescFontColor: Self = this.set("descFontColor", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = this.set("margin", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: js.Array[Double] | Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = this.set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumTrackTintColor: Self = this.set("maximumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMinimumTrackTintColor(value: String): Self = this.set("minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumTrackTintColor: Self = this.set("minimumTrackTintColor", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: js.Array[Double] | Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setThumbRadius(value: Double): Self = this.set("thumbRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbRadius: Self = this.set("thumbRadius", js.undefined)
    
    @scala.inline
    def setThumbSize(value: Double): Self = this.set("thumbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbSize: Self = this.set("thumbSize", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: String): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbTintColor: Self = this.set("thumbTintColor", js.undefined)
    
    @scala.inline
    def setTrackHeight(value: Double): Self = this.set("trackHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackHeight: Self = this.set("trackHeight", js.undefined)
    
    @scala.inline
    def setTrackRadius(value: Double): Self = this.set("trackRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackRadius: Self = this.set("trackRadius", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
