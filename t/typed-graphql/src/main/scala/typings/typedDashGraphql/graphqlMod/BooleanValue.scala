package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanValue
  extends Node
     with Value {
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var value: Boolean
}

object BooleanValue {
  @scala.inline
  def apply(kind: String, value: Boolean, loc: Location = null): BooleanValue = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[BooleanValue]
  }
}

