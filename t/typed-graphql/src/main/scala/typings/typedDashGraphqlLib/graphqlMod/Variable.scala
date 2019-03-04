package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable
  extends Node
     with Value {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
}

object Variable {
  @scala.inline
  def apply(kind: java.lang.String, name: Name, loc: Location = null): Variable = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Variable]
  }
}

