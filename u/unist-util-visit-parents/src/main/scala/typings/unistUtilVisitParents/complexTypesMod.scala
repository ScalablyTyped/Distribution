package typings.unistUtilVisitParents

import typings.std.Extract
import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unist.mod.NodeData
import typings.unist.mod.Parent
import typings.unistUtilIs.mod.Test
import typings.unistUtilVisitParents.unistUtilVisitParentsStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexTypesMod {
  
  type Action = Boolean | skip
  
  type ActionTuple = js.Tuple2[js.UndefOr[Action | Null | Unit], js.UndefOr[Index | Null]]
  
  @js.native
  trait BuildVisitor[Tree /* <: Node[Data] */, Check /* <: Test */]
    extends StObject
       with Visitor[
          Matches[InclusiveDescendant[Tree, Unit], Check], 
          Extract[InclusiveDescendant[Tree, Unit], Parent[Node[Data], NodeData[Node[Data]]]]
        ]
  
  type InclusiveDescendant[Tree /* <: Node[Data] */, Found] = Tree | Any
  
  type Index = Double
  
  type Matches[Value, Check] = MatchesOne[
    Value, 
    (/* import warning: importer.ImportType#apply Failed type conversion: Check[keyof Check] */ js.Any) | Check
  ]
  
  type MatchesOne[Value, Check] = Value | (Extract[Value, Predicate[Check, Value]])
  
  type Predicate[Fn, Fallback] = Fallback
  
  @js.native
  trait Visitor[Visited /* <: Node[Data] */, Ancestor /* <: Parent[Node[Data], NodeData[Node[Data]]] */] extends StObject {
    
    def apply(node: Visited, ancestors: js.Array[Ancestor]): VisitorResult = js.native
  }
  
  type VisitorResult = js.UndefOr[Null | Action | Index | ActionTuple | Unit]
}
