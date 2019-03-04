package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type/directives.js
trait GraphQLDirective extends js.Object {
  var args: js.Array[GraphQLArgument]
  var description: java.lang.String
  var name: java.lang.String
  var onField: scala.Boolean
  var onFragment: scala.Boolean
  var onOperation: scala.Boolean
}

object GraphQLDirective {
  @scala.inline
  def apply(
    args: js.Array[GraphQLArgument],
    description: java.lang.String,
    name: java.lang.String,
    onField: scala.Boolean,
    onFragment: scala.Boolean,
    onOperation: scala.Boolean
  ): GraphQLDirective = {
    val __obj = js.Dynamic.literal(args = args, description = description, name = name, onField = onField, onFragment = onFragment, onOperation = onOperation)
  
    __obj.asInstanceOf[GraphQLDirective]
  }
}

