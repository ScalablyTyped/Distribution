package typings
package vegaDashLiteLib.buildSrcPredicateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldGTPredicate
  extends FieldPredicateBase
     with FieldPredicate
     with _Predicate {
  /**
    * The value that the field should be greater than.
    */
  var gt: java.lang.String | scala.Double | vegaDashLiteLib.buildSrcDatetimeMod.DateTime
}

object FieldGTPredicate {
  @scala.inline
  def apply(
    field: java.lang.String,
    gt: java.lang.String | scala.Double | vegaDashLiteLib.buildSrcDatetimeMod.DateTime,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null
  ): FieldGTPredicate = {
    val __obj = js.Dynamic.literal(field = field, gt = gt.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldGTPredicate]
  }
}

