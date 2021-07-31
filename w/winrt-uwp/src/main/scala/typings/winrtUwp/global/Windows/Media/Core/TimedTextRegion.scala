package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Media.Core.TimedTextDouble
import typings.winrtUwp.Windows.Media.Core.TimedTextPadding
import typings.winrtUwp.Windows.Media.Core.TimedTextPoint
import typings.winrtUwp.Windows.Media.Core.TimedTextSize
import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes properties for customizing the appearance of the rendering area of a TimedTextCue . */
@JSGlobal("Windows.Media.Core.TimedTextRegion")
@js.native
/** Initializes a new instance of the TimedTextRegion class. */
class TimedTextRegion ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.TimedTextRegion {
  
  /** Gets or sets the background color of the TimedTextRegion . */
  /* CompleteClass */
  var background: Color = js.native
  
  /** Gets or sets the display alignment of the TimedTextRegion . */
  /* CompleteClass */
  var displayAlignment: typings.winrtUwp.Windows.Media.Core.TimedTextDisplayAlignment = js.native
  
  /** Gets or sets the extent of the TimedTextRegion , which is the rendered size of the region either in pixels or in percentage of available space. */
  /* CompleteClass */
  var extent: TimedTextSize = js.native
  
  /** Gets or sets a value indicating whether text overflowing the region is clipped. */
  /* CompleteClass */
  var isOverflowClipped: Boolean = js.native
  
  /** Gets or sets a value that indicates the height of each line of content. */
  /* CompleteClass */
  var lineHeight: TimedTextDouble = js.native
  
  /** Gets or sets a string representing the name of the TimedTextRegion . */
  /* CompleteClass */
  var name: String = js.native
  
  /** Gets or sets a value that indicates the thickness of padding space between the boundaries of the content area and the content displayed by a TimedTextRegion . */
  /* CompleteClass */
  var padding: TimedTextPadding = js.native
  
  /** Gets or sets the position of the TimedTextRegion , relative to the top left corner of the video frame. */
  /* CompleteClass */
  var position: TimedTextPoint = js.native
  
  /** Gets a value indicating the method in which lines of text scroll through the region. */
  /* CompleteClass */
  var scrollMode: typings.winrtUwp.Windows.Media.Core.TimedTextScrollMode = js.native
  
  /** Gets or sets a value indicating whether text wraps when it reaches the edge of the TimedTextRegion . */
  /* CompleteClass */
  var textWrapping: typings.winrtUwp.Windows.Media.Core.TimedTextWrapping = js.native
  
  /** Gets or sets a value indicating the direction that text flows within the TimedTextRegion . */
  /* CompleteClass */
  var writingMode: typings.winrtUwp.Windows.Media.Core.TimedTextWritingMode = js.native
  
  /** Gets or sets the Z-order of the TimedTextRegion , relative to other active regions on the screen, in case they overlap. */
  /* CompleteClass */
  var zindex: Double = js.native
}
