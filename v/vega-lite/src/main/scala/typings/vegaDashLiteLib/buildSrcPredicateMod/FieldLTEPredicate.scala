package typings
package vegaDashLiteLib.buildSrcPredicateMod

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
  var lte: java.lang.String | scala.Double | vegaDashLiteLib.buildSrcDatetimeMod.DateTime
}

object FieldLTEPredicate {
  @scala.inline
  def apply(
    field: java.lang.String,
    lte: java.lang.String | scala.Double | vegaDashLiteLib.buildSrcDatetimeMod.DateTime,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null
  ): FieldLTEPredicate = {
    val __obj = js.Dynamic.literal(field = field, lte = lte.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldLTEPredicate]
  }
}

