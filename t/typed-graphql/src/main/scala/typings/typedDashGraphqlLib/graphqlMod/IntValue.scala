package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntValue
  extends Node
     with Value {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var value: java.lang.String
}

object IntValue {
  @scala.inline
  def apply(kind: java.lang.String, value: java.lang.String, loc: Location = null): IntValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("value")(value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[IntValue]
  }
}

