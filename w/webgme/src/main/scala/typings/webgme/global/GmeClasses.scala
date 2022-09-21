package typings.webgme.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmeClasses {
  
  @JSGlobal("GmeClasses.Project")
  @js.native
  open class Project ()
    extends StObject
       with typings.webgme.GmeClasses.Project
  
  @JSGlobal("GmeClasses.TraversalOrder")
  @js.native
  object TraversalOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.webgme.GmeClasses.TraversalOrder & Double] = js.native
    
    /* 0 */ val BFS: typings.webgme.GmeClasses.TraversalOrder.BFS & Double = js.native
    
    /* 1 */ val DFS: typings.webgme.GmeClasses.TraversalOrder.DFS & Double = js.native
  }
}
