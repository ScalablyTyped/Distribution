package typings.typedGraphql.mod

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
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onField = onField.asInstanceOf[js.Any], onFragment = onFragment.asInstanceOf[js.Any], onOperation = onOperation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphQLDirective]
  }
}

