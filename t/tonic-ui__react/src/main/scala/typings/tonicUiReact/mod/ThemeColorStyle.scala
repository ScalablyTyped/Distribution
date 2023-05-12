package typings.tonicUiReact.mod

import typings.tonicUiReact.anon.Classic
import typings.tonicUiReact.anon.Critical
import typings.tonicUiReact.anon.Emphasis
import typings.tonicUiReact.anon.Highlight
import typings.tonicUiReact.anon.Inverse
import typings.tonicUiReact.anon.Medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeColorStyle extends StObject {
  
  var background: Inverse
  
  var chart: Classic
  
  var color: Emphasis
  
  var divider: String
  
  var severity: Critical
  
  var shadow: Medium
  
  var text: Highlight
}
object ThemeColorStyle {
  
  inline def apply(
    background: Inverse,
    chart: Classic,
    color: Emphasis,
    divider: String,
    severity: Critical,
    shadow: Medium,
    text: Highlight
  ): ThemeColorStyle = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColorStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeColorStyle] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Inverse): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setChart(value: Classic): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Emphasis): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: Critical): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: Medium): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setText(value: Highlight): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
