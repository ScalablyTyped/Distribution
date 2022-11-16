package typings.typeFest

import typings.typeFest.typeFestBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceScreamingSnakeCaseMod {
  
  /**
  Returns a boolean for whether the string is screaming snake case.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Value extends std.Uppercase<Value> ? type-fest.type-fest/source/includes.Includes<type-fest.type-fest/source/delimiter-case.SplitIncludingDelimiters<std.Lowercase<Value>, '_'>, '_'> extends true ? true : false : false
    }}}
    */
  type IsScreamingSnakeCase[Value /* <: String */] = `true`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Value extends string ? type-fest.type-fest/source/screaming-snake-case.IsScreamingSnakeCase<Value> extends true ? Value : std.Uppercase<type-fest.type-fest/source/snake-case.SnakeCase<Value>> : Value
    }}}
    */
  type ScreamingSnakeCase[Value] = Value
}
