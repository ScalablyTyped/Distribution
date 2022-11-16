package typings.tsToolbelt

import typings.tsToolbelt.outStringInternalMod.Literal
import typings.tsToolbelt.tsToolbeltStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outStringJoinMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/String/Join._Join<T, D> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, string> : never
    }}}
    */
  type Join[T /* <: typings.tsToolbelt.outListListMod.List[Literal] */, D /* <: String */] = String
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends [] ? '' : T extends [ts-toolbelt.ts-toolbelt/out/String/_Internal.Literal] ? / * template literal string: ${T[0]} * / string : T extends [ts-toolbelt.ts-toolbelt/out/String/_Internal.Literal, ...infer R] ? / * template literal string: ${T[0]}${D}${_Join<R,D>} * / string : string
    }}}
    */
  type _Join[T /* <: typings.tsToolbelt.outListListMod.List[Any] */, D /* <: String */] = _empty
}
