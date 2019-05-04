package typings
package vegaDashLiteLib.buildSrcPredicateMod

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
  var equal: java.lang.String | scala.Double | scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime
}

object FieldEqualPredicate {
  @scala.inline
  def apply(
    equal: java.lang.String | scala.Double | scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime,
    field: java.lang.String,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null
  ): FieldEqualPredicate = {
    val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], field = field)
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldEqualPredicate]
  }
}

