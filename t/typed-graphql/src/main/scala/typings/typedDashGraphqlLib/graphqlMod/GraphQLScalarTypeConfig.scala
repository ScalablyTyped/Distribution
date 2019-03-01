package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLScalarTypeConfig extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var parseLiteral: js.UndefOr[js.Function1[/* valueAST */ Value, _]] = js.undefined
  var parseValue: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  def serialize(value: js.Any): js.Any
}

object GraphQLScalarTypeConfig {
  @scala.inline
  def apply(
    name: java.lang.String,
    serialize: js.Function1[js.Any, js.Any],
    description: java.lang.String = null,
    parseLiteral: js.Function1[/* valueAST */ Value, _] = null,
    parseValue: js.Function1[/* value */ js.Any, _] = null
  ): GraphQLScalarTypeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("serialize")(serialize)
    if (description != null) __obj.updateDynamic("description")(description)
    if (parseLiteral != null) __obj.updateDynamic("parseLiteral")(parseLiteral)
    if (parseValue != null) __obj.updateDynamic("parseValue")(parseValue)
    __obj.asInstanceOf[GraphQLScalarTypeConfig]
  }
}

