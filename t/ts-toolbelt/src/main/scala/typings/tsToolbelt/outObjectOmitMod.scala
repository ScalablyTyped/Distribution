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
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Omit._Omit<O, K> : never
    }}}
    */
  type Omit[O /* <: js.Object */, K /* <: Key */] = _Omit[O, K]
  
  type _Omit[O /* <: js.Object */, K /* <: Key */] = _Pick[O, Exclude[/* keyof O */ String, K]]
}
