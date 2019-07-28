package typings.atUifabricMergeDashStyles.libStylesheetMod

import typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesNumbers.`0`
import typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesNumbers.`1`
import typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesNumbers.`0`
  - typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesNumbers.`1`
  - typings.atUifabricMergeDashStyles.atUifabricMergeDashStylesNumbers.`2`
*/
trait InjectionMode extends js.Object

@JSImport("@uifabric/merge-styles/lib/Stylesheet", "InjectionMode")
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

