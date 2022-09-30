package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectInternalMod.Depth
import typings.tsToolbelt.objectOptionalKeysMod._OptionalKeys
import typings.tsToolbelt.tsToolbeltStrings.x
import typings.tsToolbelt.tsToolbeltStrings.y
import typings.tsToolbelt.unionExcludeMod.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMergeMod {
  
  /**
    * @hidden
    */
  type Longer[L /* <: typings.tsToolbelt.listMod.List[Any] */, L1 /* <: typings.tsToolbelt.listMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.1[ts-toolbelt.ts-toolbelt/out/Union/Has.Has<ts-toolbelt.ts-toolbelt/out/List/RequiredKeys.RequiredKeys<L>, ts-toolbelt.ts-toolbelt/out/List/RequiredKeys.RequiredKeys<L1>>] */ js.Any
  
  type Merge[O /* <: js.Object */, O1 /* <: js.Object */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepMergeDeep<O, O1, ignore, fill>[depth] */ js.Any
  
  type MergeDeep[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill] = MergeDeepChoice[O, O1, ignore, fill, x, y]
  
  /**
    * @hidden
    */
  type MergeDeepChoice[OK, O1K, ignore /* <: js.Object */, fill, OOKeys /* <: Key */, K /* <: Key */] = (MergeProp[OK, O1K, fill, OOKeys, K]) | (MergeDeepObject[OK, O1K, ignore, fill, _OptionalKeys[OK]]) | (MergeDeepList[OK, O1K, ignore, fill])
  
  /**
    * @hidden
    */
  type MergeDeepList[L /* <: typings.tsToolbelt.listMod.List[Any] */, L1 /* <: typings.tsToolbelt.listMod.List[Any] */, ignore /* <: js.Object */, fill] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof L1 ]: any}
    */ typings.tsToolbelt.tsToolbeltStrings.MergeDeepList & TopLevel[Any]) | js.Array[Any]
  
  /**
    * @hidden
    */
  type MergeDeepObject[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill, OOKeys /* <: Key */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof ts-toolbelt.ts-toolbelt/out/Object/_Internal.Anyfy<O> & O1 ]: ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeDeepChoice<ts-toolbelt.ts-toolbelt/out/Any/At.At<O, K>, ts-toolbelt.ts-toolbelt/out/Any/At.At<O1, K>, ignore, fill, OOKeys, K>}
    */ typings.tsToolbelt.tsToolbeltStrings.MergeDeepObject & TopLevel[Any]
  
  type MergeFlat[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill] = MergeFlatChoice[O, O1, ignore, fill]
  
  type MergeFlatChoice[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill] = (MergeFlatObject[O, O1, fill, _OptionalKeys[O]]) | (MergeFlatList[O, O1, ignore, fill, _OptionalKeys[O]]) | O
  
  /**
    * @hidden
    */
  type MergeFlatList[L /* <: typings.tsToolbelt.listMod.List[Any] */, L1 /* <: typings.tsToolbelt.listMod.List[Any] */, ignore /* <: js.Object */, fill, LOK /* <: Key */] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof L1 ]: ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeProp<ts-toolbelt.ts-toolbelt/out/Any/At.At<L, K>, L1[K], fill, LOK, K>}
    */ typings.tsToolbelt.tsToolbeltStrings.MergeFlatList & TopLevel[L1]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof L ]: ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeProp<L[K], ts-toolbelt.ts-toolbelt/out/Any/At.At<L1, K>, fill, LOK, K>}
    */ typings.tsToolbelt.tsToolbeltStrings.MergeFlatList & TopLevel[L]) | js.Array[Any]
  
  /**
    * @hidden
    */
  type MergeFlatObject[O /* <: js.Object */, O1 /* <: js.Object */, fill, OOKeys /* <: Key */] = typings.tsToolbelt.tsToolbeltStrings.MergeFlatObject & TopLevel[Any] & js.Object
  
  /**
    * @hidden
    */
  type MergeProp[OK, O1K, fill, OOKeys /* <: Key */, K /* <: Key */] = OK | O1K | (Exclude[OK, Unit])
}
