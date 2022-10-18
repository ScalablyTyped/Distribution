package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outObjectPickMod._Pick
import typings.tsToolbelt.outUnionExcludeMod.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectOmitMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Omit._Omit<O, K> : never
    }}}
    */
  @js.native
  trait Omit[O /* <: js.Object */, K /* <: Key */] extends StObject
  
  type _Omit[O /* <: js.Object */, K /* <: Key */] = _Pick[O, Exclude[/* keyof O */ String, K]]
}
