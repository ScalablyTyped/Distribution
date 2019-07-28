package typings.vegaDashLite.buildSrcPredicateMod

import typings.vegaDashLite.buildSrcDatetimeMod.DateTime
import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldLTEPredicate
  extends FieldPredicateBase
     with FieldPredicate
     with _Predicate {
  /**
    * The value that the field should be less than or equals to.
    */
  var lte: String | Double | DateTime
}

object FieldLTEPredicate {
  @scala.inline
  def apply(field: String, lte: String | Double | DateTime, timeUnit: TimeUnit = null): FieldLTEPredicate = {
    val __obj = js.Dynamic.literal(field = field, lte = lte.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldLTEPredicate]
  }
}

