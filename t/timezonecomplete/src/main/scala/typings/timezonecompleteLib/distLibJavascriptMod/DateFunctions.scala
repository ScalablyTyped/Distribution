package typings
package timezonecompleteLib.distLibJavascriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateFunctions extends js.Object

@JSImport("timezonecomplete/dist/lib/javascript", "DateFunctions")
@js.native
object DateFunctions extends js.Object {
  /**
       * Use the Date.getFullYear(), Date.getMonth(), ... functions.
       */
  @js.native
  sealed trait Get
    extends timezonecompleteLib.distLibJavascriptMod.DateFunctions
  
  /**
       * Use the Date.getUTCFullYear(), Date.getUTCMonth(), ... functions.
       */
  @js.native
  sealed trait GetUTC
    extends timezonecompleteLib.distLibJavascriptMod.DateFunctions
  
  /* 0 */ val Get: Get with scala.Double = js.native
  /* 1 */ val GetUTC: GetUTC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[timezonecompleteLib.distLibJavascriptMod.DateFunctions with scala.Double] = js.native
}

