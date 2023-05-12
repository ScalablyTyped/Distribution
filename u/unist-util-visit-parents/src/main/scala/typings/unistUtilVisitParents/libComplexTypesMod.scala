package typings.unistUtilVisitParents

import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComplexTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Tree extends unist.unist.Parent<unist.unist.Node<unist.unist.Data>, unist.unist.NodeData<unist.unist.Node<unist.unist.Data>>> ? Tree | unist-util-visit-parents.unist-util-visit-parents/lib/complex-types.InclusiveDescendant<std.Exclude<Tree['children'][number], Found | Tree>, Found | Tree> : Tree
    }}}
    */
  type InclusiveDescendant[Tree /* <: Node[Data] */, Found] = Tree
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    // Is this a list?
  Check extends std.Array<any> ? unist-util-visit-parents.unist-util-visit-parents/lib/complex-types.MatchesOne<Value, Check[keyof Check]> : unist-util-visit-parents.unist-util-visit-parents/lib/complex-types.MatchesOne<Value, Check>
    }}}
    */
  type Matches[Value, Check] = Value
  
  /**
    * Check if a node matches a test.
    *
    * Returns either the node if it matches or `never` otherwise.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    // Is this a node?
  Value extends unist.unist.Node<unist.unist.Data> ? // No test.
  Check extends null ? Value : // No test.
  Check extends undefined ? Value : // Function test.
  Check extends std.Function ? std.Extract<Value, unist-util-visit-parents.unist-util-visit-parents/lib/complex-types.Predicate<Check, Value>> : // String (type) test.
  Value['type'] extends Check ? Value : // Partial test.
  Value extends Check ? Value : never : never
    }}}
    */
  type MatchesOne[Value, Check] = Value
  
  /**
    * Infer the thing that is asserted from a type guard.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Fn extends (value : any): value is infer Thing ? Thing : Fallback
    }}}
    */
  type Predicate[Fn, Fallback] = Fallback
}
