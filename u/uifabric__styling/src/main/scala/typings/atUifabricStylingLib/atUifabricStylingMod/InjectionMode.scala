package typings
package atUifabricStylingLib.atUifabricStylingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling", "InjectionMode")
@js.native
object InjectionMode extends js.Object {
  /**
    * Appends rules using appendChild.
    */
  var appendChild: atUifabricStylingLib.atUifabricStylingLibNumbers.`2` = js.native
  /**
    * Inserts rules using the insertRule api.
    */
  var insertNode: atUifabricStylingLib.atUifabricStylingLibNumbers.`1` = js.native
  /**
    * Avoids style injection, use getRules() to read the styles.
    */
  var none: atUifabricStylingLib.atUifabricStylingLibNumbers.`0` = js.native
}

