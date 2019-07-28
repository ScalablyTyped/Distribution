package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListType
  extends Node
     with Type {
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var `type`: Type
}

object ListType {
  @scala.inline
  def apply(kind: String, `type`: Type, loc: Location = null): ListType = {
    val __obj = js.Dynamic.literal(kind = kind)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ListType]
  }
}

