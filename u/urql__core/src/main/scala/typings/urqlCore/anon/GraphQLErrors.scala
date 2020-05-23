package typings.urqlCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLErrors extends js.Object {
  var graphQLErrors: js.Array[PartialGraphQLError | String]
  var networkError: js.UndefOr[String] = js.undefined
}

object GraphQLErrors {
  @scala.inline
  def apply(graphQLErrors: js.Array[PartialGraphQLError | String], networkError: String = null): GraphQLErrors = {
    val __obj = js.Dynamic.literal(graphQLErrors = graphQLErrors.asInstanceOf[js.Any])
    if (networkError != null) __obj.updateDynamic("networkError")(networkError.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLErrors]
  }
}

