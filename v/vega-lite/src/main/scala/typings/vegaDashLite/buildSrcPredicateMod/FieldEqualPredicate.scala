package typings.vegaDashLite.buildSrcPredicateMod

import typings.vegaDashLite.buildSrcDatetimeMod.DateTime
import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldEqualPredicate
  extends FieldPredicateBase
     with FieldPredicate
     with _Predicate {
  /**
    * The value that the field should be equal to.
    */
  var equal: String | Double | Boolean | DateTime
}

object FieldEqualPredicate {
  @scala.inline
  def apply(equal: String | Double | Boolean | DateTime, field: String, timeUnit: TimeUnit = null): FieldEqualPredicate = {
    val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], field = field)
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldEqualPredicate]
  }
}

