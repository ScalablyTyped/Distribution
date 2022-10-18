package typings.tsToolbelt

import typings.tsToolbelt.outAnyInternalMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectExcludeKeysMod {
  
  type ExcludeKeys[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.Default<O, O1>[match] */ js.Any
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/ExcludeKeys._ExcludeMatch<O, O1, match> : never
    }}}
    */
  @js.native
  trait ExcludeMatch[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] extends StObject
  
  type _ExcludeMatch[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: -? {  0 :K}[ts-toolbelt.ts-toolbelt/out/Any/Is.Is<O[K], ts-toolbelt.ts-toolbelt/out/Any/At.At<O1, K>, match>]}[keyof O] */ js.Any
}
