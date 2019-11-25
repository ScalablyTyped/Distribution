package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFormattedError extends js.Object {
  var locations: js.Array[GraphQLErrorLocation]
  var message: String
}

object GraphQLFormattedError {
  @scala.inline
  def apply(locations: js.Array[GraphQLErrorLocation], message: String): GraphQLFormattedError = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphQLFormattedError]
  }
}

