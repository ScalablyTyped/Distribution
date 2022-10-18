package typings.tsToolbelt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectNullableKeysMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/NullableKeys._NullableKeys<O> : never
    }}}
    */
  @js.native
  trait NullableKeys[O /* <: js.Object */] extends StObject
  
  type _NullableKeys[O /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: -? [undefined & O[K] | null & O[K]] extends [never]? never : K}[keyof O] */ js.Any
}
