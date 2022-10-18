package typings.tokeyCssSelectorParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Function ? T : T extends object ? @tokey/css-selector-parser.@tokey/css-selector-parser/dist/types.ImmutableMap<T> : T
    }}}
    */
  @js.native
  trait Immutable[T] extends StObject
  
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
