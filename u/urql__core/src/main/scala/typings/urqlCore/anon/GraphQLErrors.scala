package typings.urqlCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLErrors extends js.Object {
  var graphQLErrors: js.Array[PartialGraphQLError | String] = js.native
  var networkError: js.UndefOr[String] = js.native
}

object GraphQLErrors {
  @scala.inline
  def apply(graphQLErrors: js.Array[PartialGraphQLError | String]): GraphQLErrors = {
    val __obj = js.Dynamic.literal(graphQLErrors = graphQLErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLErrors]
  }
  @scala.inline
  implicit class GraphQLErrorsOps[Self <: GraphQLErrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGraphQLErrorsVarargs(value: (PartialGraphQLError | String)*): Self = this.set("graphQLErrors", js.Array(value :_*))
    @scala.inline
    def setGraphQLErrors(value: js.Array[PartialGraphQLError | String]): Self = this.set("graphQLErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkError(value: String): Self = this.set("networkError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkError: Self = this.set("networkError", js.undefined)
  }
  
}

