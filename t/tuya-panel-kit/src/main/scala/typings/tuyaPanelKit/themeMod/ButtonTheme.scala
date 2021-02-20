package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonTheme extends StObject {
  
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
  implicit class ButtonThemeMutableBuilder[Self <: ButtonTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgHeight(value: Double): Self = StObject.set(x, "bgHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgHeightNull: Self = StObject.set(x, "bgHeight", null)
    
    @scala.inline
    def setBgRadius(value: Double): Self = StObject.set(x, "bgRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgRadiusNull: Self = StObject.set(x, "bgRadius", null)
    
    @scala.inline
    def setBgWidth(value: Double): Self = StObject.set(x, "bgWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgWidthNull: Self = StObject.set(x, "bgWidth", null)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
  }
}
