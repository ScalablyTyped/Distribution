package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argument extends Node {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
  var value: Value
}

object Argument {
  @scala.inline
  def apply(kind: java.lang.String, name: Name, value: Value, loc: Location = null): Argument = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, value = value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Argument]
  }
}

