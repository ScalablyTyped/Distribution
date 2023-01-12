package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes properties for customizing the appearance of the rendering area of a TimedTextCue . */
trait TimedTextRegion extends StObject {
  
  /** Gets or sets the background color of the TimedTextRegion . */
  var background: Color
  
  /** Gets or sets the display alignment of the TimedTextRegion . */
  var displayAlignment: TimedTextDisplayAlignment
  
  /** Gets or sets the extent of the TimedTextRegion , which is the rendered size of the region either in pixels or in percentage of available space. */
  var extent: TimedTextSize
  
  /** Gets or sets a value indicating whether text overflowing the region is clipped. */
  var isOverflowClipped: Boolean
  
  /** Gets or sets a value that indicates the height of each line of content. */
  var lineHeight: TimedTextDouble
  
  /** Gets or sets a string representing the name of the TimedTextRegion . */
  var name: String
  
  /** Gets or sets a value that indicates the thickness of padding space between the boundaries of the content area and the content displayed by a TimedTextRegion . */
  var padding: TimedTextPadding
  
  /** Gets or sets the position of the TimedTextRegion , relative to the top left corner of the video frame. */
  var position: TimedTextPoint
  
  /** Gets a value indicating the method in which lines of text scroll through the region. */
  var scrollMode: TimedTextScrollMode
  
  /** Gets or sets a value indicating whether text wraps when it reaches the edge of the TimedTextRegion . */
  var textWrapping: TimedTextWrapping
  
  /** Gets or sets a value indicating the direction that text flows within the TimedTextRegion . */
  var writingMode: TimedTextWritingMode
  
  /** Gets or sets the Z-order of the TimedTextRegion , relative to other active regions on the screen, in case they overlap. */
  var zindex: Double
}
object TimedTextRegion {
  
  inline def apply(
    background: Color,
    displayAlignment: TimedTextDisplayAlignment,
    extent: TimedTextSize,
    isOverflowClipped: Boolean,
    lineHeight: TimedTextDouble,
    name: String,
    padding: TimedTextPadding,
    position: TimedTextPoint,
    scrollMode: TimedTextScrollMode,
    textWrapping: TimedTextWrapping,
    writingMode: TimedTextWritingMode,
    zindex: Double
  ): TimedTextRegion = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], displayAlignment = displayAlignment.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], isOverflowClipped = isOverflowClipped.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scrollMode = scrollMode.asInstanceOf[js.Any], textWrapping = textWrapping.asInstanceOf[js.Any], writingMode = writingMode.asInstanceOf[js.Any], zindex = zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextRegion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimedTextRegion] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setDisplayAlignment(value: TimedTextDisplayAlignment): Self = StObject.set(x, "displayAlignment", value.asInstanceOf[js.Any])
    
    inline def setExtent(value: TimedTextSize): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setIsOverflowClipped(value: Boolean): Self = StObject.set(x, "isOverflowClipped", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: TimedTextDouble): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: TimedTextPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: TimedTextPoint): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setScrollMode(value: TimedTextScrollMode): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
    
    inline def setTextWrapping(value: TimedTextWrapping): Self = StObject.set(x, "textWrapping", value.asInstanceOf[js.Any])
    
    inline def setWritingMode(value: TimedTextWritingMode): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
    
    inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
  }
}
