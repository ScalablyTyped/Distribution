package typings.webgme.GmeClasses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TraversalOrder extends js.Object
@JSGlobal("GmeClasses.TraversalOrder")
@js.native
object TraversalOrder extends js.Object {
  
  @js.native
  sealed trait BFS extends TraversalOrder
  
  @js.native
  sealed trait DFS extends TraversalOrder
}
