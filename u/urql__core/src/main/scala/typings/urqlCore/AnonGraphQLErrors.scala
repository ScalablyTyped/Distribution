package typings.urqlCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGraphQLErrors extends js.Object {
  var graphQLErrors: js.Array[PartialGraphQLError | String]
  var networkError: js.UndefOr[String] = js.undefined
}

object AnonGraphQLErrors {
  @scala.inline
  def apply(graphQLErrors: js.Array[PartialGraphQLError | String], networkError: String = null): AnonGraphQLErrors = {
    val __obj = js.Dynamic.literal(graphQLErrors = graphQLErrors.asInstanceOf[js.Any])
    if (networkError != null) __obj.updateDynamic("networkError")(networkError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGraphQLErrors]
  }
}

