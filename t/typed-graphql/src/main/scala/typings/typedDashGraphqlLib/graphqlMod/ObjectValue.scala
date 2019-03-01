package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectValue
  extends Node
     with Value {
  var fields: js.Array[ObjectField]
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
}

object ObjectValue {
  @scala.inline
  def apply(fields: js.Array[ObjectField], kind: java.lang.String, loc: Location = null): ObjectValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("kind")(kind)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ObjectValue]
  }
}

