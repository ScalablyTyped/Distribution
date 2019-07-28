package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntValue
  extends Node
     with Value {
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var value: String
}

object IntValue {
  @scala.inline
  def apply(kind: String, value: String, loc: Location = null): IntValue = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[IntValue]
  }
}

