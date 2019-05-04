package typings
package vegaDashLiteLib.buildSrcFielddefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDefWithCondition[F /* <: FieldDef[_] */] extends js.Object {
  /**
    * A field definition or one or more value definition(s) with a selection predicate.
    */
  var condition: js.UndefOr[Conditional[F] | Conditional[ValueDef] | js.Array[Conditional[ValueDef]]] = js.undefined
  /**
    * A constant value in visual domain.
    */
  var value: js.UndefOr[scala.Double | java.lang.String | scala.Boolean] = js.undefined
}

object ValueDefWithCondition {
  @scala.inline
  def apply[F /* <: FieldDef[_] */](
    condition: Conditional[F] | Conditional[ValueDef] | js.Array[Conditional[ValueDef]] = null,
    value: scala.Double | java.lang.String | scala.Boolean = null
  ): ValueDefWithCondition[F] = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDefWithCondition[F]]
  }
}

