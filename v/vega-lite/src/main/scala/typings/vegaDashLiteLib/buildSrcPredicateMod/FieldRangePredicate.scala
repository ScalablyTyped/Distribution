package typings
package vegaDashLiteLib.buildSrcPredicateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldRangePredicate
  extends FieldPredicateBase
     with FieldPredicate
     with _Predicate {
  /**
    * An array of inclusive minimum and maximum values
    * for a field value of a data item to be included in the filtered data.
    * @maxItems 2
    * @minItems 2
    */
  var range: js.Array[scala.Double | vegaDashLiteLib.buildSrcDatetimeMod.DateTime | scala.Null]
}

object FieldRangePredicate {
  @scala.inline
  def apply(
    field: java.lang.String,
    range: js.Array[scala.Double | vegaDashLiteLib.buildSrcDatetimeMod.DateTime | scala.Null],
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null
  ): FieldRangePredicate = {
    val __obj = js.Dynamic.literal(field = field, range = range)
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldRangePredicate]
  }
}

