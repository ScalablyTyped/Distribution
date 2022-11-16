package typings.tsToolbelt

import typings.tsToolbelt.outStringInternalMod.Literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outStringReplaceMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/String/Replace._Replace<S, R, W> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, string> : never
    }}}
    */
  type Replace[S /* <: String */, R /* <: Literal */, W /* <: Literal */] = String
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferBS}${R}${inferAS} * / string ? ts-toolbelt.ts-toolbelt/out/String/Replace.Replace</ * template literal string: ${BS}${W}${AS} * / string, R, W> : S
    }}}
    */
  type _Replace[S /* <: String */, R /* <: Literal */, W /* <: Literal */] = S
}
