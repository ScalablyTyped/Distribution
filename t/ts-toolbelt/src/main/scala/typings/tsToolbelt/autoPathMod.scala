package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.std.Exclude
import typings.tsToolbelt.headMod.Head
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectPathMod.Path
import typings.tsToolbelt.objectUnionOfMod.UnionOf
import typings.tsToolbelt.popMod.Pop
import typings.tsToolbelt.splitMod.Split
import typings.tsToolbelt.tsToolbeltStrings.default
import typings.tsToolbelt.unionSelectMod.Select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoPathMod {
  
  type AutoPath[O /* <: Any */, P /* <: String */, D /* <: String */] = _AutoPath[O, P, D, Split[P, D]]
  
  /**
    * @ignore
    */
  type ExecPath[A, SP /* <: typings.tsToolbelt.listMod.List[Index] */, Delimiter /* <: String */] = NextPath[Path[MetaPath[A, Delimiter, SP, js.Array[Any]], SP]]
  
  /**
    * @ignore
    */
  type HintPath[A, P /* <: String */, SP /* <: typings.tsToolbelt.listMod.List[Index] */, Exec /* <: String */, D /* <: String */] = Exec | P | (ExecPath[A, Pop[SP], D])
  
  /**
    * @ignore
    */
  type Index = Double | String
  
  /**
    * @ignore
    */
  type KeyToIndex[K /* <: Key */, SP /* <: typings.tsToolbelt.listMod.List[Index] */] = (K & Index) | Head[SP]
  
  /**
    * @ignore
    */
  type MetaPath[O, D /* <: String */, SP /* <: typings.tsToolbelt.listMod.List[Index] */, P /* <: typings.tsToolbelt.listMod.List[Index] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: ts-toolbelt.ts-toolbelt/out/Function/AutoPath.MetaPath<O[K], D, ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<SP>, [...P, ts-toolbelt.ts-toolbelt/out/Function/AutoPath.KeyToIndex<K, SP>]> | ts-toolbelt.ts-toolbelt/out/String/Join.Join<[...P, ts-toolbelt.ts-toolbelt/out/Function/AutoPath.KeyToIndex<K, SP>], D>}
    */ typings.tsToolbelt.tsToolbeltStrings.MetaPath & TopLevel[O]
  
  /**
    * @ignore
    */
  type NextPath[OP] = Select[UnionOf[(Exclude[OP, String]) & js.Object], String, default]
  
  /**
    * @ignore
    */
  type _AutoPath[A, P /* <: String */, D /* <: String */, SP /* <: typings.tsToolbelt.listMod.List[Index] */] = HintPath[A, P, SP, ExecPath[A, SP, D], D]
}
