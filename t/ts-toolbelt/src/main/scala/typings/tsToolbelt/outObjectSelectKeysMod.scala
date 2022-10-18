package typings.tsToolbelt

import typings.tsToolbelt.outAnyInternalMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectSelectKeysMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/SelectKeys._SelectKeys<O, M, match> : never
    }}}
    */
  @js.native
  trait SelectKeys[O /* <: js.Object */, M /* <: Any */, `match` /* <: Match */] extends StObject
  
  type _SelectKeys[O /* <: js.Object */, M /* <: Any */, `match` /* <: Match */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: -? {  1 :K}[ts-toolbelt.ts-toolbelt/out/Any/Is.Is<O[K], M, match>]}[keyof O] */ js.Any
}
