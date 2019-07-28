package typings.vegaDashLite.buildSrcPredicateMod

import typings.vegaDashLite.buildSrcDatetimeMod.DateTime
import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
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
  var gt: String | Double | DateTime
}

object FieldGTPredicate {
  @scala.inline
  def apply(field: String, gt: String | Double | DateTime, timeUnit: TimeUnit = null): FieldGTPredicate = {
    val __obj = js.Dynamic.literal(field = field, gt = gt.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldGTPredicate]
  }
}

