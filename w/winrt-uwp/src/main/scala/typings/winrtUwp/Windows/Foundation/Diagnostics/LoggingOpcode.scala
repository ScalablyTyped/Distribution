package typings.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoggingOpcode extends StObject
/** Specifies an event opcode. Opcodes represent an operation within a component of an application and are used to logically group events. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingOpcode")
@js.native
object LoggingOpcode extends StObject {
  
  /** An informational event. */
  @js.native
  sealed trait info
    extends StObject
       with LoggingOpcode
  
  /** A reply event. */
  @js.native
  sealed trait reply
    extends StObject
       with LoggingOpcode
  
  /** An event that represents an activity resuming after being suspended. */
  @js.native
  sealed trait resume
    extends StObject
       with LoggingOpcode
  
  /** An event that represents transferring activity to another component. */
  @js.native
  sealed trait send
    extends StObject
       with LoggingOpcode
  
  /** An event that represents the start of an activity. */
  @js.native
  sealed trait start
    extends StObject
       with LoggingOpcode
  
  /** An event that represents the end of an activity. The event corresponds to the last unpaired Start event. */
  @js.native
  sealed trait stop
    extends StObject
       with LoggingOpcode
  
  /** An event that represents the activity being suspended pending another activity's completion. */
  @js.native
  sealed trait suspend
    extends StObject
       with LoggingOpcode
}
