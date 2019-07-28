package typings.vegaDashLite.buildSrcPredicateMod

import typings.vegaDashLite.buildSrcDatetimeMod.DateTime
import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
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
  var lt: String | Double | DateTime
}

object FieldLTPredicate {
  @scala.inline
  def apply(field: String, lt: String | Double | DateTime, timeUnit: TimeUnit = null): FieldLTPredicate = {
    val __obj = js.Dynamic.literal(field = field, lt = lt.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldLTPredicate]
  }
}

