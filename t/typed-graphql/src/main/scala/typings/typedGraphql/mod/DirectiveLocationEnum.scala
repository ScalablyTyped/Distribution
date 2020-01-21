package typings.typedGraphql.mod

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
  sealed trait FIELD extends DirectiveLocationEnum
  
  @js.native
  sealed trait FRAGMENT_DEFINITION extends DirectiveLocationEnum
  
  @js.native
  sealed trait FRAGMENT_SPREAD extends DirectiveLocationEnum
  
  @js.native
  sealed trait INLINE_FRAGMENT extends DirectiveLocationEnum
  
  @js.native
  sealed trait MUTATION extends DirectiveLocationEnum
  
  @js.native
  sealed trait QUERY extends DirectiveLocationEnum
  
  @js.native
  sealed trait SUBSCRIPTION extends DirectiveLocationEnum
  
}

