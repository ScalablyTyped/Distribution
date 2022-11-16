package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outAnyAtMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    A extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? number extends A['length'] ? K extends number | / * template literal string: ${number} * / string ? A[never] | undefined : undefined : K extends keyof A ? A[K] : undefined : unknown extends A ? unknown : K extends keyof A ? A[K] : undefined
    }}}
    */
  type At[A /* <: Any */, K /* <: Key */] = js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: A[never] */ js.Any
  ]
}
