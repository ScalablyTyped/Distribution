package typings.toposort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](edges: js.Array[js.Tuple2[T, js.UndefOr[T]]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(edges.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @JSImport("toposort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This is a convenience method that allows you to define nodes that may or
    * may not be connected to any other nodes. The ordering of unconnected
    * nodes is not defined.
    * @param nodes An array of nodes
    * @param edges An array of directed edges. You don't need to mention all
    *              `nodes` here.
    * @returns a list of vertices, sorted from "start" to "end"
    * @throws if there are any cycles in the graph
    */
  inline def array[T](nodes: js.Array[T], edges: js.Array[js.Tuple2[T, js.UndefOr[T]]]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(nodes.asInstanceOf[js.Any], edges.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
