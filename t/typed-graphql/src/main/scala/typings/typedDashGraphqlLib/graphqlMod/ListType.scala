package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListType
  extends Node
     with Type {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var `type`: Type
}

object ListType {
  @scala.inline
  def apply(kind: java.lang.String, `type`: Type, loc: Location = null): ListType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("kind")(kind)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ListType]
  }
}

