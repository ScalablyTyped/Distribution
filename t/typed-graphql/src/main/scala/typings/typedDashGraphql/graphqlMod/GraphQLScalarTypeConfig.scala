package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLScalarTypeConfig extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var parseLiteral: js.UndefOr[js.Function1[/* valueAST */ Value, _]] = js.undefined
  var parseValue: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  def serialize(value: js.Any): js.Any
}

object GraphQLScalarTypeConfig {
  @scala.inline
  def apply(
    name: String,
    serialize: js.Any => js.Any,
    description: String = null,
    parseLiteral: /* valueAST */ Value => _ = null,
    parseValue: /* value */ js.Any => _ = null
  ): GraphQLScalarTypeConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (parseLiteral != null) __obj.updateDynamic("parseLiteral")(js.Any.fromFunction1(parseLiteral))
    if (parseValue != null) __obj.updateDynamic("parseValue")(js.Any.fromFunction1(parseValue))
    __obj.asInstanceOf[GraphQLScalarTypeConfig]
  }
}

