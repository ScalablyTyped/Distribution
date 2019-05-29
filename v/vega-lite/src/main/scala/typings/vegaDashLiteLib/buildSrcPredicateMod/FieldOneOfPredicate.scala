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
  var oneOf: js.Array[
    scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime | scala.Double | java.lang.String
  ]
}

object FieldOneOfPredicate {
  @scala.inline
  def apply(
    field: java.lang.String,
    oneOf: js.Array[
      scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime | scala.Double | java.lang.String
    ],
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null
  ): FieldOneOfPredicate = {
    val __obj = js.Dynamic.literal(field = field, oneOf = oneOf)
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldOneOfPredicate]
  }
}

