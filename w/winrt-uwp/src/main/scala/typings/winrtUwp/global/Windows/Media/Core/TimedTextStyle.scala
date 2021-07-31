package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Media.Core.TimedTextDouble
import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the style of the rendered text in a TimedTextCue . You can set the style of a substring within a TimedTextLine by using the Subformats property. */
@JSGlobal("Windows.Media.Core.TimedTextStyle")
@js.native
/** Initializes a new instance of the TimedTextStyle class. */
class TimedTextStyle ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.TimedTextStyle {
  
  /** Gets or sets the background color of timed text. */
  /* CompleteClass */
  var background: Color = js.native
  
  /** Gets or sets a value indicating the direction that timed text is flowed. */
  /* CompleteClass */
  var flowDirection: typings.winrtUwp.Windows.Media.Core.TimedTextFlowDirection = js.native
  
  /** Gets or sets the font family of timed text. */
  /* CompleteClass */
  var fontFamily: String = js.native
  
  /** Gets or sets the font size of timed text. */
  /* CompleteClass */
  var fontSize: TimedTextDouble = js.native
  
  /** Gets or sets the weight of timed text. */
  /* CompleteClass */
  var fontWeight: typings.winrtUwp.Windows.Media.Core.TimedTextWeight = js.native
  
  /** Gets or sets the color of the timed text glyphs. */
  /* CompleteClass */
  var foreground: Color = js.native
  
  /** Gets or sets a value indicating if the background color stays visible when no text is being displayed. */
  /* CompleteClass */
  var isBackgroundAlwaysShown: Boolean = js.native
  
  /** Gets or sets the alignment of timed text lines. */
  /* CompleteClass */
  var lineAlignment: typings.winrtUwp.Windows.Media.Core.TimedTextLineAlignment = js.native
  
  /** Gets or sets the name of the timed text style. */
  /* CompleteClass */
  var name: String = js.native
  
  /** Gets or sets the outline color of timed text. */
  /* CompleteClass */
  var outlineColor: Color = js.native
  
  /** Gets or sets the radius of the blur applied to outline of the timed text. */
  /* CompleteClass */
  var outlineRadius: TimedTextDouble = js.native
  
  /** Gets or sets the thickness of the outline of the timed text. */
  /* CompleteClass */
  var outlineThickness: TimedTextDouble = js.native
}
