package typings.tokeyCssSelectorParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Function ? T : T extends object ? @tokey/css-selector-parser.@tokey/css-selector-parser/dist/types.ImmutableMap<T> : T
    }}}
    */
  type Immutable[T] = T
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {readonly [ P in keyof T ]: @tokey/css-selector-parser.@tokey/css-selector-parser/dist/types.Immutable<T[P]>}
    }}}
    */
  @js.native
  trait ImmutableMap[T] extends StObject
}
