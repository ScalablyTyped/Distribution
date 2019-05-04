package typings
package vegaDashLiteLib.buildSrcPredicateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldOneOfPredicate
  extends FieldPredicateBase
     with FieldPredicate
     with _Predicate {
  /**
    * A set of values that the `field`'s value should be a member of,
    * for a data item included in the filtered data.
    */
  var oneOf: js.Array[java.lang.String] | js.Array[scala.Double] | js.Array[scala.Boolean] | js.Array[vegaDashLiteLib.buildSrcDatetimeMod.DateTime]
}

object FieldOneOfPredicate {
  @scala.inline
  def apply(
    field: java.lang.String,
    oneOf: js.Array[java.lang.String] | js.Array[scala.Double] | js.Array[scala.Boolean] | js.Array[vegaDashLiteLib.buildSrcDatetimeMod.DateTime],
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null
  ): FieldOneOfPredicate = {
    val __obj = js.Dynamic.literal(field = field, oneOf = oneOf.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldOneOfPredicate]
  }
}

