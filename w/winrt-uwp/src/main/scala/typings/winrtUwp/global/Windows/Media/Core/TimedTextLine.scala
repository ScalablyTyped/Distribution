package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a line of text that is displayed with a TimedTextCue . */
@JSGlobal("Windows.Media.Core.TimedTextLine")
@js.native
/** Initializes a new instance of the TimedTextLine class. */
open class TimedTextLine ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.TimedTextLine {
  
  /** Gets a list of TimedTextSubformat objects that provide formatting for substrings within the TimedTextLine . */
  /* CompleteClass */
  var subformats: IVector[typings.winrtUwp.Windows.Media.Core.TimedTextSubformat] = js.native
  
  /** Gets or sets the text content of the TimedTextLine . */
  /* CompleteClass */
  var text: String = js.native
}
