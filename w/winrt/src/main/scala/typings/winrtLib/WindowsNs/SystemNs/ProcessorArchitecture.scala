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
  
  val arm: arm with java.lang.String = js.native
  val neutral: neutral with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val x64: x64 with java.lang.String = js.native
  val x86: x86 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.SystemNs.ProcessorArchitecture with java.lang.String] = js.native
}

