package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListValue
  extends Node
     with Value {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var values: js.Array[Value]
}

object ListValue {
  @scala.inline
  def apply(kind: java.lang.String, values: js.Array[Value], loc: Location = null): ListValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("values")(values)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ListValue]
  }
}

