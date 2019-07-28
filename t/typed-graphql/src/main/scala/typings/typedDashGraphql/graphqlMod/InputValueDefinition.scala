package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValueDefinition extends Node {
  var defaultValue: js.UndefOr[Value] = js.undefined
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
  var `type`: Type
}

object InputValueDefinition {
  @scala.inline
  def apply(kind: String, name: Name, `type`: Type, defaultValue: Value = null, loc: Location = null): InputValueDefinition = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[InputValueDefinition]
  }
}

