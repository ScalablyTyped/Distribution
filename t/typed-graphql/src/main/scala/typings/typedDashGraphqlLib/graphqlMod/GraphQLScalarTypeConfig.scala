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

