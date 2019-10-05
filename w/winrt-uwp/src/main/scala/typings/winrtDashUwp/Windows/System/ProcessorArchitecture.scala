package typings.winrtDashUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProcessorArchitecture extends js.Object

/** Specifies the processor architecture supported by an app. */
@JSGlobal("Windows.System.ProcessorArchitecture")
@js.native
object ProcessorArchitecture extends js.Object {
  /** The ARM processor architecture. */
  @js.native
  sealed trait arm extends ProcessorArchitecture
  
  /** A neutral processor architecture. */
  @js.native
  sealed trait neutral extends ProcessorArchitecture
  
  /** An unknown processor architecture. */
  @js.native
  sealed trait unknown extends ProcessorArchitecture
  
  /** The x64 processor architecture. */
  @js.native
  sealed trait x64 extends ProcessorArchitecture
  
  /** The x86 processor architecture. */
  @js.native
  sealed trait x86 extends ProcessorArchitecture
  
  /* 1 */ val arm: typings.winrtDashUwp.Windows.System.ProcessorArchitecture.arm with Double = js.native
  /* 3 */ val neutral: typings.winrtDashUwp.Windows.System.ProcessorArchitecture.neutral with Double = js.native
  /* 4 */ val unknown: typings.winrtDashUwp.Windows.System.ProcessorArchitecture.unknown with Double = js.native
  /* 2 */ val x64: typings.winrtDashUwp.Windows.System.ProcessorArchitecture.x64 with Double = js.native
  /* 0 */ val x86: typings.winrtDashUwp.Windows.System.ProcessorArchitecture.x86 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessorArchitecture with Double] = js.native
}

