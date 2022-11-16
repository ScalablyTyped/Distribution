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
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Invert._Invert<O> : never
    }}}
    */
  type Invert[O /* <: Record[/* keyof O */ String, Key, js.Tuple2[Exclamationmark, W]] */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof ts-toolbelt.ts-toolbelt/out/Union/IntersectOf.IntersectOf<{[ K in keyof O ]: ts-toolbelt.ts-toolbelt/out/Object/Record.Record<O[K], K, ['!', 'W']>}[keyof O]> ]: ts-toolbelt.ts-toolbelt/out/Union/IntersectOf.IntersectOf<{[ K in keyof O ]: ts-toolbelt.ts-toolbelt/out/Object/Record.Record<O[K], K, ['!', 'W']>}[keyof O]>[K]} */ js.Any) & Any
  
  type _Invert[O /* <: Record[Key, Key, js.Tuple2[Exclamationmark, W]] */] = ComputeRaw[
    IntersectOf[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: ts-toolbelt.ts-toolbelt/out/Object/Record.Record<O[K], K, ['!', 'W']>}[keyof O] */ js.Any
    ]
  ]
}
