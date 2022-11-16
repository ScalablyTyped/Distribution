package typings.tsToolbelt

import typings.tsToolbelt.outAnyInternalMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectSelectKeysMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/SelectKeys._SelectKeys<O, M, match> : never
    }}}
    */
  type SelectKeys[O /* <: js.Object */, M /* <: Any */, `match` /* <: Match */] = _SelectKeys[O, M, `match`]
  
  type _SelectKeys[O /* <: js.Object */, M /* <: Any */, `match` /* <: Match */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: -? {  1 :K}[ts-toolbelt.ts-toolbelt/out/Any/Is.Is<O[K], M, match>]}[keyof O] */ js.Any
}
