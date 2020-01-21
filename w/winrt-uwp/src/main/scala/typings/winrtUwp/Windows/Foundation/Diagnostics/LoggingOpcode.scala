package typings.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoggingOpcode extends js.Object

/** Specifies an event opcode. Opcodes represent an operation within a component of an application and are used to logically group events. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingOpcode")
@js.native
object LoggingOpcode extends js.Object {
  /** An informational event. */
  @js.native
  sealed trait info extends LoggingOpcode
  
  /** A reply event. */
  @js.native
  sealed trait reply extends LoggingOpcode
  
  /** An event that represents an activity resuming after being suspended. */
  @js.native
  sealed trait resume extends LoggingOpcode
  
  /** An event that represents transferring activity to another component. */
  @js.native
  sealed trait send extends LoggingOpcode
  
  /** An event that represents the start of an activity. */
  @js.native
  sealed trait start extends LoggingOpcode
  
  /** An event that represents the end of an activity. The event corresponds to the last unpaired Start event. */
  @js.native
  sealed trait stop extends LoggingOpcode
  
  /** An event that represents the activity being suspended pending another activity's completion. */
  @js.native
  sealed trait suspend extends LoggingOpcode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoggingOpcode with Double] = js.native
  /* 0 */ @js.native
  object info extends TopLevel[info with Double]
  
  /* 3 */ @js.native
  object reply extends TopLevel[reply with Double]
  
  /* 4 */ @js.native
  object resume extends TopLevel[resume with Double]
  
  /* 6 */ @js.native
  object send extends TopLevel[send with Double]
  
  /* 1 */ @js.native
  object start extends TopLevel[start with Double]
  
  /* 2 */ @js.native
  object stop extends TopLevel[stop with Double]
  
  /* 5 */ @js.native
  object suspend extends TopLevel[suspend with Double]
  
}

