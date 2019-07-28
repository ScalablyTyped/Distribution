package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type/directives.js
trait GraphQLDirective extends js.Object {
  var args: js.Array[GraphQLArgument]
  var description: String
  var name: String
  var onField: Boolean
  var onFragment: Boolean
  var onOperation: Boolean
}

object GraphQLDirective {
  @scala.inline
  def apply(
    args: js.Array[GraphQLArgument],
    description: String,
    name: String,
    onField: Boolean,
    onFragment: Boolean,
    onOperation: Boolean
  ): GraphQLDirective = {
    val __obj = js.Dynamic.literal(args = args, description = description, name = name, onField = onField, onFragment = onFragment, onOperation = onOperation)
  
    __obj.asInstanceOf[GraphQLDirective]
  }
}

