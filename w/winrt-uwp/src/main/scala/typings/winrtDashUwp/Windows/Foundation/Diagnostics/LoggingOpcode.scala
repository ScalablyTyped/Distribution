package typings.winrtDashUwp.Windows.Foundation.Diagnostics

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
  
  /* 0 */ val info: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingOpcode.info with Double = js.native
  /* 3 */ val reply: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingOpcode.reply with Double = js.native
  /* 4 */ val resume: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingOpcode.resume with Double = js.native
  /* 6 */ val send: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingOpcode.send with Double = js.native
  /* 1 */ val start: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingOpcode.start with Double = js.native
  /* 2 */ val stop: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingOpcode.stop with Double = js.native
  /* 5 */ val suspend: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingOpcode.suspend with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoggingOpcode with Double] = js.native
}

