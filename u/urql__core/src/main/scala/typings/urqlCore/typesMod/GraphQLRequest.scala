package typings.urqlCore.typesMod

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequest extends js.Object {
  /** Unique identifier of the request. */
  var key: Double
  var query: DocumentNode
  var variables: js.UndefOr[js.Object] = js.undefined
}

object GraphQLRequest {
  @scala.inline
  def apply(key: Double, query: DocumentNode, variables: js.Object = null): GraphQLRequest = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequest]
  }
}

