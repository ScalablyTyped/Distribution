package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumValueDefinition extends js.Object {
  var deprecationReason: String
  var description: String
  var name: String
  var value: js.Any
}

object GraphQLEnumValueDefinition {
  @scala.inline
  def apply(deprecationReason: String, description: String, name: String, value: js.Any): GraphQLEnumValueDefinition = {
    val __obj = js.Dynamic.literal(deprecationReason = deprecationReason.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLEnumValueDefinition]
  }
}

