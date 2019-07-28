package typings.vegaDashLite.buildSrcPredicateMod

import typings.vegaDashLite.buildSrcDatetimeMod.DateTime
import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldGTEPredicate
  extends FieldPredicateBase
     with FieldPredicate
     with _Predicate {
  /**
    * The value that the field should be greater than or equals to.
    */
  var gte: String | Double | DateTime
}

object FieldGTEPredicate {
  @scala.inline
  def apply(field: String, gte: String | Double | DateTime, timeUnit: TimeUnit = null): FieldGTEPredicate = {
    val __obj = js.Dynamic.literal(field = field, gte = gte.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldGTEPredicate]
  }
}

