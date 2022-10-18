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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Ancestor extends unist.unist.Parent<unist.unist.Node<unist.unist.Data>, unist.unist.NodeData<unist.unist.Node<unist.unist.Data>>> ? Child extends Ancestor['children'][number] ? Ancestor : never : never
    }}}
    */
  @js.native
  trait ParentsOf[Ancestor /* <: Node[Data] */, Child /* <: Node[Data] */] extends StObject
  
  type Visitor[Visited /* <: Node[Data] */, Ancestor /* <: Parent[Node[Data], NodeData[Node[Data]]] */] = js.Function3[
    /* node */ Visited, 
    /* import warning: importer.ImportType#apply Failed type conversion: Visited extends unist.unist.Node<unist.unist.Data> ? number | null : never */ /* index */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Ancestor extends unist.unist.Node<unist.unist.Data> ? Ancestor | null : Ancestor */ /* parent */ js.Any, 
    VisitorResult
  ]
}
