package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the style of the rendered text in a TimedTextCue . You can set the style of a substring within a TimedTextLine by using the Subformats property. */
trait TimedTextStyle extends StObject {
  
  /** Gets or sets the background color of timed text. */
  var background: Color
  
  /** Gets or sets a value indicating the direction that timed text is flowed. */
  var flowDirection: TimedTextFlowDirection
  
  /** Gets or sets the font family of timed text. */
  var fontFamily: String
  
  /** Gets or sets the font size of timed text. */
  var fontSize: TimedTextDouble
  
  /** Gets or sets the weight of timed text. */
  var fontWeight: TimedTextWeight
  
  /** Gets or sets the color of the timed text glyphs. */
  var foreground: Color
  
  /** Gets or sets a value indicating if the background color stays visible when no text is being displayed. */
  var isBackgroundAlwaysShown: Boolean
  
  /** Gets or sets the alignment of timed text lines. */
  var lineAlignment: TimedTextLineAlignment
  
  /** Gets or sets the name of the timed text style. */
  var name: String
  
  /** Gets or sets the outline color of timed text. */
  var outlineColor: Color
  
  /** Gets or sets the radius of the blur applied to outline of the timed text. */
  var outlineRadius: TimedTextDouble
  
  /** Gets or sets the thickness of the outline of the timed text. */
  var outlineThickness: TimedTextDouble
}
object TimedTextStyle {
  
  inline def apply(
    background: Color,
    flowDirection: TimedTextFlowDirection,
    fontFamily: String,
    fontSize: TimedTextDouble,
    fontWeight: TimedTextWeight,
    foreground: Color,
    isBackgroundAlwaysShown: Boolean,
    lineAlignment: TimedTextLineAlignment,
    name: String,
    outlineColor: Color,
    outlineRadius: TimedTextDouble,
    outlineThickness: TimedTextDouble
  ): TimedTextStyle = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], flowDirection = flowDirection.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], isBackgroundAlwaysShown = isBackgroundAlwaysShown.asInstanceOf[js.Any], lineAlignment = lineAlignment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outlineColor = outlineColor.asInstanceOf[js.Any], outlineRadius = outlineRadius.asInstanceOf[js.Any], outlineThickness = outlineThickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimedTextStyle] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setFlowDirection(value: TimedTextFlowDirection): Self = StObject.set(x, "flowDirection", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: TimedTextDouble): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: TimedTextWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setForeground(value: Color): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    inline def setIsBackgroundAlwaysShown(value: Boolean): Self = StObject.set(x, "isBackgroundAlwaysShown", value.asInstanceOf[js.Any])
    
    inline def setLineAlignment(value: TimedTextLineAlignment): Self = StObject.set(x, "lineAlignment", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutlineColor(value: Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineRadius(value: TimedTextDouble): Self = StObject.set(x, "outlineRadius", value.asInstanceOf[js.Any])
    
    inline def setOutlineThickness(value: TimedTextDouble): Self = StObject.set(x, "outlineThickness", value.asInstanceOf[js.Any])
  }
}
