package typings.urqlCore

import typings.graphql.mod.GraphQLError
import typings.std.Error
import typings.urqlCore.anon.NetworkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/utils/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  @js.native
  class CombinedError protected () extends Error {
    def this(hasNetworkErrorGraphQLErrorsResponse: NetworkError) = this()
    var graphQLErrors: js.Array[GraphQLError] = js.native
    var networkError: js.UndefOr[Error] = js.native
    var response: js.UndefOr[js.Any] = js.native
  }
  
}

