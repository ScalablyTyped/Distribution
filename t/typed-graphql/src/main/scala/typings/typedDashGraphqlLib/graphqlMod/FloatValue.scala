package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatValue
  extends Node
     with Value {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var value: java.lang.String
}

object FloatValue {
  @scala.inline
  def apply(kind: java.lang.String, value: java.lang.String, loc: Location = null): FloatValue = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FloatValue]
  }
}

