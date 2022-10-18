package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectPickMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, K> : never
    }}}
    */
  @js.native
  trait Pick[O /* <: js.Object */, K /* <: Key */] extends StObject
  
  type _Pick[O /* <: js.Object */, K /* <: Key */] = __Pick[O, (/* keyof O */ String) & K]
  
  /**
    * @hidden
    */
  type __Pick[O /* <: js.Object */, K /* <: /* keyof O */ String */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: O[P]} */ js.Any) & js.Object
}
