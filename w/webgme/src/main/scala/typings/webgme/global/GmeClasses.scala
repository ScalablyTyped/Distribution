package typings.webgme.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmeClasses")
@js.native
object GmeClasses extends js.Object {
  @js.native
  class Project ()
    extends typings.webgme.GmeClasses.Project
  
  @js.native
  object TraversalOrder extends js.Object {
    /* 0 */ val BFS: typings.webgme.GmeClasses.TraversalOrder.BFS with Double = js.native
    /* 1 */ val DFS: typings.webgme.GmeClasses.TraversalOrder.DFS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.webgme.GmeClasses.TraversalOrder with Double] = js.native
  }
  
}

