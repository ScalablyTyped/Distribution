package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectField extends Node {
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
  var value: Value
}

object ObjectField {
  @scala.inline
  def apply(kind: String, name: Name, value: Value, loc: Location = null): ObjectField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectField]
  }
}

