package typings
package winrtLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProcessorArchitecture extends js.Object

@JSGlobal("Windows.System.ProcessorArchitecture")
@js.native
object ProcessorArchitecture extends js.Object {
  @js.native
  sealed trait arm
    extends winrtLib.WindowsNs.SystemNs.ProcessorArchitecture
  
  @js.native
  sealed trait neutral
    extends winrtLib.WindowsNs.SystemNs.ProcessorArchitecture
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.SystemNs.ProcessorArchitecture
  
  @js.native
  sealed trait x64
    extends winrtLib.WindowsNs.SystemNs.ProcessorArchitecture
  
  @js.native
  sealed trait x86
    extends winrtLib.WindowsNs.SystemNs.ProcessorArchitecture
  
  /* 1 */ val arm: arm with scala.Double = js.native
  /* 3 */ val neutral: neutral with scala.Double = js.native
  /* 4 */ val unknown: unknown with scala.Double = js.native
  /* 2 */ val x64: x64 with scala.Double = js.native
  /* 0 */ val x86: x86 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.SystemNs.ProcessorArchitecture with scala.Double] = js.native
}

