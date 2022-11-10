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
  
  type BuildVisitor[Tree /* <: Node[Data] */, Check /* <: Test */] = Visitor[
    Matches[InclusiveDescendant[Tree, Unit], Check], 
    Extract[InclusiveDescendant[Tree, Unit], Parent[Node[Data], NodeData[Node[Data]]]]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Tree extends unist.unist.Parent<unist.unist.Node<unist.unist.Data>, unist.unist.NodeData<unist.unist.Node<unist.unist.Data>>> ? Tree | unist-util-visit-parents.unist-util-visit-parents/complex-types.InclusiveDescendant<std.Exclude<Tree['children'][number], Found | Tree>, Found | Tree> : Tree
    }}}
    */
  type InclusiveDescendant[Tree /* <: Node[Data] */, Found] = Tree
  
  type Index = Double
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    // Is this a list?
  Check extends std.Array<any> ? unist-util-visit-parents.unist-util-visit-parents/complex-types.MatchesOne<Value, Check[keyof Check]> : unist-util-visit-parents.unist-util-visit-parents/complex-types.MatchesOne<Value, Check>
    }}}
    */
  type Matches[Value, Check] = Value
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    // Is this a node?
  Value extends unist.unist.Node<unist.unist.Data> ? // No test.
  Check extends null ? Value : // No test.
  Check extends undefined ? Value : // Function test.
  Check extends std.Function ? std.Extract<Value, unist-util-visit-parents.unist-util-visit-parents/complex-types.Predicate<Check, Value>> : // String (type) test.
  Value['type'] extends Check ? Value : // Partial test.
  Value extends Check ? Value : never : never
    }}}
    */
  type MatchesOne[Value, Check] = Value
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Fn extends (value : any): value is infer Thing ? Thing : Fallback
    }}}
    */
  type Predicate[Fn, Fallback] = Fallback
  
  type Visitor[Visited /* <: Node[Data] */, Ancestor /* <: Parent[Node[Data], NodeData[Node[Data]]] */] = js.Function2[/* node */ Visited, /* ancestors */ js.Array[Ancestor], VisitorResult]
  
  type VisitorResult = js.UndefOr[Null | Action | Index | ActionTuple | Unit]
}
