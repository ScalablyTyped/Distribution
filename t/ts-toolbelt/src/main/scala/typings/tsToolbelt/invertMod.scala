package typings.tsToolbelt

import typings.tsToolbelt.computeMod.ComputeRaw
import typings.tsToolbelt.intersectOfMod.IntersectOf
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectRecordMod.Record
import typings.tsToolbelt.tsToolbeltStrings.Exclamationmark
import typings.tsToolbelt.tsToolbeltStrings.W
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invertMod {
  
  type Invert[O /* <: Record[/* keyof O */ String, Key, js.Tuple2[Exclamationmark, W]] */] = _Invert[O]
  
  type _Invert[O /* <: Record[Key, Key, js.Tuple2[Exclamationmark, W]] */] = ComputeRaw[
    IntersectOf[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: ts-toolbelt.ts-toolbelt/out/Object/Record.Record<O[K], K, ['!', 'W']>}[keyof O] */ js.Any
    ]
  ]
}
