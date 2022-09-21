package typings.unistUtilVisitChildren

import typings.unist.mod.Data
import typings.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-visit-children", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def visitChildren(visitor: Visitor): Visit = ^.asInstanceOf[js.Dynamic].applyDynamic("visitChildren")(visitor.asInstanceOf[js.Any]).asInstanceOf[Visit]
  
  type Node = typings.unist.mod.Node[Data]
  
  type Parent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  type Visit = js.Function1[/* node */ Parent, Unit]
  
  type Visitor = js.Function3[/* node */ Node, /* index */ Double, /* parent */ Parent, Unit]
}
