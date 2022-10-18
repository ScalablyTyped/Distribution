package typings.tsToolbelt

import typings.tsToolbelt.outAnyComputeMod.ComputeRaw
import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outObjectRecordMod.Record
import typings.tsToolbelt.outUnionIntersectOfMod.IntersectOf
import typings.tsToolbelt.tsToolbeltStrings.Exclamationmark
import typings.tsToolbelt.tsToolbeltStrings.W
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectInvertMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Invert._Invert<O> : never
    }}}
    */
  @js.native
  trait Invert[O /* <: Record[/* keyof O */ String, Key, js.Tuple2[Exclamationmark, W]] */] extends StObject
  
  type _Invert[O /* <: Record[Key, Key, js.Tuple2[Exclamationmark, W]] */] = ComputeRaw[
    IntersectOf[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: ts-toolbelt.ts-toolbelt/out/Object/Record.Record<O[K], K, ['!', 'W']>}[keyof O] */ js.Any
    ]
  ]
}
