package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumValueDefinition extends js.Object {
  var deprecationReason: java.lang.String
  var description: java.lang.String
  var name: java.lang.String
  var value: js.Any
}

object GraphQLEnumValueDefinition {
  @scala.inline
  def apply(
    deprecationReason: java.lang.String,
    description: java.lang.String,
    name: java.lang.String,
    value: js.Any
  ): GraphQLEnumValueDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deprecationReason")(deprecationReason)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GraphQLEnumValueDefinition]
  }
}

