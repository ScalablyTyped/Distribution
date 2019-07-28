package typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesMod

import typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesNumbers.`0`
import typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesNumbers.`1`
import typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/merge-styles", "InjectionMode")
@js.native
object InjectionMode extends js.Object {
  /**
    * Appends rules using appendChild.
    */
  var appendChild: `2` = js.native
  /**
    * Inserts rules using the insertRule api.
    */
  var insertNode: `1` = js.native
  /**
    * Avoids style injection, use getRules() to read the styles.
    */
  var none: `0` = js.native
}

