package typings
package vegaDashLiteLib.buildSrcPredicateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldLTPredicate
  extends FieldPredicateBase
     with FieldPredicate
     with _Predicate {
  /**
    * The value that the field should be less than.
    */
  var lt: java.lang.String | scala.Double | vegaDashLiteLib.buildSrcDatetimeMod.DateTime
}

object FieldLTPredicate {
  @scala.inline
  def apply(
    field: java.lang.String,
    lt: java.lang.String | scala.Double | vegaDashLiteLib.buildSrcDatetimeMod.DateTime,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null
  ): FieldLTPredicate = {
    val __obj = js.Dynamic.literal(field = field, lt = lt.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldLTPredicate]
  }
}

