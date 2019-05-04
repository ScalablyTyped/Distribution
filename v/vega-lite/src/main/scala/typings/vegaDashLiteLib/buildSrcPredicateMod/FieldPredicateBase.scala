package typings
package vegaDashLiteLib.buildSrcPredicateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldPredicateBase extends js.Object {
  /**
    * Field to be filtered.
    */
  var field: java.lang.String
  /**
    * Time unit for the field to be filtered.
    */
  var timeUnit: js.UndefOr[vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit] = js.undefined
}

object FieldPredicateBase {
  @scala.inline
  def apply(field: java.lang.String, timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null): FieldPredicateBase = {
    val __obj = js.Dynamic.literal(field = field)
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldPredicateBase]
  }
}

