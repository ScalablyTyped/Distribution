package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonTheme extends js.Object {
  
  var bgHeight: Double | Null = js.native
  
  var bgRadius: Double | Null = js.native
  
  var bgWidth: Double | Null = js.native
  
  var fontSize: Double = js.native
  
  var iconSize: Double = js.native
  
  var margin: js.Array[Double] = js.native
}
object ButtonTheme {
  
  @scala.inline
  def apply(fontSize: Double, iconSize: Double, margin: js.Array[Double]): ButtonTheme = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonTheme]
  }
  
  @scala.inline
  implicit class ButtonThemeOps[Self <: ButtonTheme] (val x: Self) extends AnyVal {
    
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
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = this.set("margin", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: js.Array[Double]): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgHeight(value: Double): Self = this.set("bgHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgHeightNull: Self = this.set("bgHeight", null)
    
    @scala.inline
    def setBgRadius(value: Double): Self = this.set("bgRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgRadiusNull: Self = this.set("bgRadius", null)
    
    @scala.inline
    def setBgWidth(value: Double): Self = this.set("bgWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgWidthNull: Self = this.set("bgWidth", null)
  }
}
