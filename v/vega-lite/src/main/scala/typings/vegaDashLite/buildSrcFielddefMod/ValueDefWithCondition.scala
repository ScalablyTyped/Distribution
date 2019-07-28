package typings.vegaDashLite.buildSrcFielddefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDefWithCondition[F /* <: FieldDef[_] */] extends js.Object {
  /**
    * A field definition or one or more value definition(s) with a selection predicate.
    */
  var condition: js.UndefOr[(Conditional[F | ValueDef]) | js.Array[Conditional[ValueDef]]] = js.undefined
  /**
    * A constant value in visual domain.
    */
  var value: js.UndefOr[Double | String | Boolean] = js.undefined
}

object ValueDefWithCondition {
  @scala.inline
  def apply[F /* <: FieldDef[_] */](
    condition: (Conditional[F | ValueDef]) | js.Array[Conditional[ValueDef]] = null,
    value: Double | String | Boolean = null
  ): ValueDefWithCondition[F] = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDefWithCondition[F]]
  }
}

