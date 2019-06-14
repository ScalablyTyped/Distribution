package typings
package winrtDashUwpLib.WindowsNs.SystemNs

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
  sealed trait arm
    extends winrtDashUwpLib.WindowsNs.SystemNs.ProcessorArchitecture
  
  /** A neutral processor architecture. */
  @js.native
  sealed trait neutral
    extends winrtDashUwpLib.WindowsNs.SystemNs.ProcessorArchitecture
  
  /** An unknown processor architecture. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.SystemNs.ProcessorArchitecture
  
  /** The x64 processor architecture. */
  @js.native
  sealed trait x64
    extends winrtDashUwpLib.WindowsNs.SystemNs.ProcessorArchitecture
  
  /** The x86 processor architecture. */
  @js.native
  sealed trait x86
    extends winrtDashUwpLib.WindowsNs.SystemNs.ProcessorArchitecture
  
  /* 1 */ val arm: arm with scala.Double = js.native
  /* 3 */ val neutral: neutral with scala.Double = js.native
  /* 4 */ val unknown: unknown with scala.Double = js.native
  /* 2 */ val x64: x64 with scala.Double = js.native
  /* 0 */ val x86: x86 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.ProcessorArchitecture with scala.Double] = js.native
}

