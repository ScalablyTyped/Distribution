package typings.vegaDashLite.buildSrcPredicateMod

import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldPredicateBase extends js.Object {
  /**
    * Field to be filtered.
    */
  var field: String
  /**
    * Time unit for the field to be filtered.
    */
  var timeUnit: js.UndefOr[TimeUnit] = js.undefined
}

object FieldPredicateBase {
  @scala.inline
  def apply(field: String, timeUnit: TimeUnit = null): FieldPredicateBase = {
    val __obj = js.Dynamic.literal(field = field)
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldPredicateBase]
  }
}

