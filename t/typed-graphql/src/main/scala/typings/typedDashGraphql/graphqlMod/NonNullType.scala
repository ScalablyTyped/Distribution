package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonNullType
  extends Node
     with Type {
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var `type`: NamedType | ListType
}

object NonNullType {
  @scala.inline
  def apply(kind: String, `type`: NamedType | ListType, loc: Location = null): NonNullType = {
    val __obj = js.Dynamic.literal(kind = kind)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[NonNullType]
  }
}

