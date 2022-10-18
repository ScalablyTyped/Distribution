package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceScreamingSnakeCaseMod {
  
  /**
  Returns a boolean for whether the string is screaming snake case.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Value extends std.Uppercase<Value> ? type-fest.type-fest/source/includes.Includes<type-fest.type-fest/source/delimiter-case.SplitIncludingDelimiters<std.Lowercase<Value>, '_'>, '_'> extends true ? true : false : false
    }}}
    */
  @js.native
  trait IsScreamingSnakeCase[Value /* <: String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Value extends string ? type-fest.type-fest/source/screaming-snake-case.IsScreamingSnakeCase<Value> extends true ? Value : std.Uppercase<type-fest.type-fest/source/snake-case.SnakeCase<Value>> : Value
    }}}
    */
  @js.native
  trait ScreamingSnakeCase[Value] extends StObject
}
