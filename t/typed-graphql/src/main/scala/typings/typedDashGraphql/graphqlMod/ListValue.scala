package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListValue
  extends Node
     with Value {
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var values: js.Array[Value]
}

object ListValue {
  @scala.inline
  def apply(kind: String, values: js.Array[Value], loc: Location = null): ListValue = {
    val __obj = js.Dynamic.literal(kind = kind, values = values)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ListValue]
  }
}

