package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonNullType
  extends Node
     with Type {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var `type`: NamedType | ListType
}

object NonNullType {
  @scala.inline
  def apply(kind: java.lang.String, `type`: NamedType | ListType, loc: Location = null): NonNullType = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("kind")(kind)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NonNullType]
  }
}

