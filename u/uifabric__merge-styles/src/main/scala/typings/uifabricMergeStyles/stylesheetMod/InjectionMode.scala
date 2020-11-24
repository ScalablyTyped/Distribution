package typings.uifabricMergeStyles.stylesheetMod

import typings.uifabricMergeStyles.uifabricMergeStylesNumbers.`0`
import typings.uifabricMergeStyles.uifabricMergeStylesNumbers.`1`
import typings.uifabricMergeStyles.uifabricMergeStylesNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  none :0,   insertNode :1,   appendChild :2}[keyof {  none :0,   insertNode :1,   appendChild :2}] */
/* Rewritten from type alias, can be one of: 
  - typings.uifabricMergeStyles.uifabricMergeStylesNumbers.`0`
  - typings.uifabricMergeStyles.uifabricMergeStylesNumbers.`1`
  - typings.uifabricMergeStyles.uifabricMergeStylesNumbers.`2`
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
