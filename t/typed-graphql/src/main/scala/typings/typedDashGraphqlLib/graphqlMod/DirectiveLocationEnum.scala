package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DirectiveLocationEnum extends js.Object

// type/directives.js
@JSImport("graphql", "DirectiveLocationEnum")
@js.native
object DirectiveLocationEnum extends js.Object {
  @js.native
  sealed trait FIELD
    extends typedDashGraphqlLib.graphqlMod.DirectiveLocationEnum
  
  @js.native
  sealed trait FRAGMENT_DEFINITION
    extends typedDashGraphqlLib.graphqlMod.DirectiveLocationEnum
  
  @js.native
  sealed trait FRAGMENT_SPREAD
    extends typedDashGraphqlLib.graphqlMod.DirectiveLocationEnum
  
  @js.native
  sealed trait INLINE_FRAGMENT
    extends typedDashGraphqlLib.graphqlMod.DirectiveLocationEnum
  
  @js.native
  sealed trait MUTATION
    extends typedDashGraphqlLib.graphqlMod.DirectiveLocationEnum
  
  @js.native
  sealed trait QUERY
    extends typedDashGraphqlLib.graphqlMod.DirectiveLocationEnum
  
  @js.native
  sealed trait SUBSCRIPTION
    extends typedDashGraphqlLib.graphqlMod.DirectiveLocationEnum
  
}

