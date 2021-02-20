package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes properties for customizing the appearance of the rendering area of a TimedTextCue . */
@js.native
trait TimedTextRegion extends StObject {
  
  /** Gets or sets the background color of the TimedTextRegion . */
  var background: Color = js.native
  
  /** Gets or sets the display alignment of the TimedTextRegion . */
  var displayAlignment: TimedTextDisplayAlignment = js.native
  
  /** Gets or sets the extent of the TimedTextRegion , which is the rendered size of the region either in pixels or in percentage of available space. */
  var extent: TimedTextSize = js.native
  
  /** Gets or sets a value indicating whether text overflowing the region is clipped. */
  var isOverflowClipped: Boolean = js.native
  
  /** Gets or sets a value that indicates the height of each line of content. */
  var lineHeight: TimedTextDouble = js.native
  
  /** Gets or sets a string representing the name of the TimedTextRegion . */
  var name: String = js.native
  
  /** Gets or sets a value that indicates the thickness of padding space between the boundaries of the content area and the content displayed by a TimedTextRegion . */
  var padding: TimedTextPadding = js.native
  
  /** Gets or sets the position of the TimedTextRegion , relative to the top left corner of the video frame. */
  var position: TimedTextPoint = js.native
  
  /** Gets a value indicating the method in which lines of text scroll through the region. */
  var scrollMode: TimedTextScrollMode = js.native
  
  /** Gets or sets a value indicating whether text wraps when it reaches the edge of the TimedTextRegion . */
  var textWrapping: TimedTextWrapping = js.native
  
  /** Gets or sets a value indicating the direction that text flows within the TimedTextRegion . */
  var writingMode: TimedTextWritingMode = js.native
  
  /** Gets or sets the Z-order of the TimedTextRegion , relative to other active regions on the screen, in case they overlap. */
  var zindex: Double = js.native
}
object TimedTextRegion {
  
  @scala.inline
  def apply(
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
  implicit class TimedTextRegionMutableBuilder[Self <: TimedTextRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAlignment(value: TimedTextDisplayAlignment): Self = StObject.set(x, "displayAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtent(value: TimedTextSize): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOverflowClipped(value: Boolean): Self = StObject.set(x, "isOverflowClipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: TimedTextDouble): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: TimedTextPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: TimedTextPoint): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollMode(value: TimedTextScrollMode): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextWrapping(value: TimedTextWrapping): Self = StObject.set(x, "textWrapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingMode(value: TimedTextWritingMode): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
  }
}
