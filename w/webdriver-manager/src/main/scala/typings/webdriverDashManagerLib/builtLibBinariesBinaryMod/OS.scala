package typings
package webdriverDashManagerLib.builtLibBinariesBinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OS extends js.Object

@JSImport("webdriver-manager/built/lib/binaries/binary", "OS")
@js.native
object OS extends js.Object {
  @js.native
  sealed trait Darwin
    extends webdriverDashManagerLib.builtLibBinariesBinaryMod.OS
  
  @js.native
  sealed trait Linux
    extends webdriverDashManagerLib.builtLibBinariesBinaryMod.OS
  
  @js.native
  sealed trait Windows_NT
    extends webdriverDashManagerLib.builtLibBinariesBinaryMod.OS
  
  /* 2 */ val Darwin: Darwin with scala.Double = js.native
  /* 1 */ val Linux: Linux with scala.Double = js.native
  /* 0 */ val Windows_NT: Windows_NT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webdriverDashManagerLib.builtLibBinariesBinaryMod.OS with scala.Double] = js.native
}

