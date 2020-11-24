package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTheme extends js.Object {
  
  var boardBg: String = js.native
  
  var cellBg: String = js.native
  
  var cellLine: String = js.native
  
  var cellRadius: Double = js.native
  
  var descFontColor: String = js.native
  
  var fontColor: String = js.native
  
  var iconColor: String = js.native
  
  var margin: js.Array[Double] = js.native
  
  var padding: js.Array[Double] = js.native
  
  var subFontColor: String = js.native
}
object ListTheme {
  
  @scala.inline
  def apply(
    boardBg: String,
    cellBg: String,
    cellLine: String,
    cellRadius: Double,
    descFontColor: String,
    fontColor: String,
    iconColor: String,
    margin: js.Array[Double],
    padding: js.Array[Double],
    subFontColor: String
  ): ListTheme = {
    val __obj = js.Dynamic.literal(boardBg = boardBg.asInstanceOf[js.Any], cellBg = cellBg.asInstanceOf[js.Any], cellLine = cellLine.asInstanceOf[js.Any], cellRadius = cellRadius.asInstanceOf[js.Any], descFontColor = descFontColor.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], iconColor = iconColor.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], subFontColor = subFontColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTheme]
  }
  
  @scala.inline
  implicit class ListThemeOps[Self <: ListTheme] (val x: Self) extends AnyVal {
    
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
    def setCellBg(value: String): Self = this.set("cellBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellLine(value: String): Self = this.set("cellLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRadius(value: Double): Self = this.set("cellRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescFontColor(value: String): Self = this.set("descFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = this.set("margin", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: js.Array[Double]): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubFontColor(value: String): Self = this.set("subFontColor", value.asInstanceOf[js.Any])
  }
}
