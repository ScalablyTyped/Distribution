package typings.timezonecomplete.distLibJavascriptMod

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
  sealed trait Get extends DateFunctions
  
  /**
    * Use the Date.getUTCFullYear(), Date.getUTCMonth(), ... functions.
    */
  @js.native
  sealed trait GetUTC extends DateFunctions
  
  /* 0 */ val Get: typings.timezonecomplete.distLibJavascriptMod.DateFunctions.Get with Double = js.native
  /* 1 */ val GetUTC: typings.timezonecomplete.distLibJavascriptMod.DateFunctions.GetUTC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateFunctions with Double] = js.native
}

