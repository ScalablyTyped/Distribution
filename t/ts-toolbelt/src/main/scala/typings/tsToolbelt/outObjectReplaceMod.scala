package typings.tsToolbelt

import typings.tsToolbelt.outAnyInternalMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectReplaceMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Replace._Replace<O, M, A, match> : never
    }}}
    */
  @js.native
  trait Replace[O /* <: js.Object */, M /* <: Any */, A /* <: Any */, `match` /* <: Match */] extends StObject
  
  type _Replace[O /* <: js.Object */, M /* <: Any */, A /* <: Any */, `match` /* <: Match */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: {  1 :A,   0 :O[K]}[ts-toolbelt.ts-toolbelt/out/Any/Is.Is<M, O[K], match>]} */ js.Any) & js.Object
}
