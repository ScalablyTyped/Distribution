package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDefinition extends Node {
  var arguments: js.Array[InputValueDefinition]
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
  var `type`: Type
}

object FieldDefinition {
  @scala.inline
  def apply(
    arguments: js.Array[InputValueDefinition],
    kind: String,
    name: Name,
    `type`: Type,
    loc: Location = null
  ): FieldDefinition = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDefinition]
  }
}

