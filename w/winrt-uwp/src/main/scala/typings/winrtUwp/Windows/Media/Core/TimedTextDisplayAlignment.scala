package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimedTextDisplayAlignment extends StObject
/** Specifies the alignment of a TimedTextRegion relative to the video frame. */
@JSGlobal("Windows.Media.Core.TimedTextDisplayAlignment")
@js.native
object TimedTextDisplayAlignment extends StObject {
  
  /** The text region is aligned in the direction of the end of the text. */
  @js.native
  sealed trait after
    extends StObject
       with TimedTextDisplayAlignment
  
  /** The text region is aligned in the direction of the start of the text. */
  @js.native
  sealed trait before
    extends StObject
       with TimedTextDisplayAlignment
  
  /** The text region is aligned in the center. */
  @js.native
  sealed trait center
    extends StObject
       with TimedTextDisplayAlignment
}
