package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DirectiveLocationEnum extends StObject
// type/directives.js
@JSImport("graphql", "DirectiveLocationEnum")
@js.native
object DirectiveLocationEnum extends StObject {
  
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
