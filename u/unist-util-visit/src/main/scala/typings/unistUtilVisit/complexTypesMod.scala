package typings.unistUtilVisit

import typings.std.Extract
import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unist.mod.NodeData
import typings.unist.mod.Parent
import typings.unistUtilIs.mod.Test
import typings.unistUtilVisitParents.complexTypesMod.InclusiveDescendant
import typings.unistUtilVisitParents.complexTypesMod.Matches
import typings.unistUtilVisitParents.complexTypesMod.VisitorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexTypesMod {
  
  type BuildVisitor[Tree /* <: Node[Data] */, Check /* <: Test */] = BuildVisitorFromDescendants[InclusiveDescendant[Tree, Unit], Check]
  
  type BuildVisitorFromDescendants[Descendant /* <: Node[Data] */, Check /* <: Test */] = BuildVisitorFromMatch[
    Matches[Descendant, Check], 
    Extract[Descendant, Parent[Node[Data], NodeData[Node[Data]]]]
  ]
  
  type BuildVisitorFromMatch[Visited /* <: Node[Data] */, Ancestor /* <: Parent[Node[Data], NodeData[Node[Data]]] */] = Visitor[Visited, ParentsOf[Ancestor, Visited]]
  
  type ParentsOf[Ancestor /* <: Node[Data] */, Child /* <: Node[Data] */] = Ancestor
  
  type Visitor[Visited /* <: Node[Data] */, Ancestor /* <: Parent[Node[Data], NodeData[Node[Data]]] */] = js.Function3[
    /* node */ Visited, 
    /* index */ Double | Null, 
    /* parent */ Ancestor | Null, 
    VisitorResult
  ]
}
