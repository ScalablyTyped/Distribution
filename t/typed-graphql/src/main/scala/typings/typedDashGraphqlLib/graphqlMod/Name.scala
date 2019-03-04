package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends Node {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var value: java.lang.String
}

object Name {
  @scala.inline
  def apply(kind: java.lang.String, value: java.lang.String, loc: Location = null): Name = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Name]
  }
}

