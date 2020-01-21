package typings.vegaExpression

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlacklist extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  var constants: js.UndefOr[js.Object] = js.undefined
  var fieldvar: js.UndefOr[String] = js.undefined
  var functions: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var globalvar: String
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonBlacklist {
  @scala.inline
  def apply(
    globalvar: String,
    blacklist: js.Array[String] = null,
    constants: js.Object = null,
    fieldvar: String = null,
    functions: StringDictionary[js.Function] = null,
    whitelist: js.Array[String] = null
  ): AnonBlacklist = {
    val __obj = js.Dynamic.literal(globalvar = globalvar.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (constants != null) __obj.updateDynamic("constants")(constants.asInstanceOf[js.Any])
    if (fieldvar != null) __obj.updateDynamic("fieldvar")(fieldvar.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlacklist]
  }
}

