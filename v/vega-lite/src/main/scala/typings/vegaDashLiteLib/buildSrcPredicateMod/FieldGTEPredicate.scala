package typings
package vegaDashLiteLib.buildSrcPredicateMod

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
  var gte: java.lang.String | scala.Double | vegaDashLiteLib.buildSrcDatetimeMod.DateTime
}

object FieldGTEPredicate {
  @scala.inline
  def apply(
    field: java.lang.String,
    gte: java.lang.String | scala.Double | vegaDashLiteLib.buildSrcDatetimeMod.DateTime,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null
  ): FieldGTEPredicate = {
    val __obj = js.Dynamic.literal(field = field, gte = gte.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldGTEPredicate]
  }
}

