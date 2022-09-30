package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectInternalMod.Depth
import typings.tsToolbelt.tsToolbeltStrings.x
import typings.tsToolbelt.tsToolbeltStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectPatchMod {
  
  /**
    * @hidden
    */
  type Longer[L /* <: typings.tsToolbelt.listMod.List[Any] */, L1 /* <: typings.tsToolbelt.listMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.1[ts-toolbelt.ts-toolbelt/out/Union/Has.Has<keyof L, keyof L1>] */ js.Any
  
  type Patch[O /* <: js.Object */, O1 /* <: js.Object */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepPatchDeep<O, O1, ignore, fill>[depth] */ js.Any
  
  type PatchDeep[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill] = PatchDeepChoice[O, O1, ignore, fill, x, y]
  
  /**
    * @hidden
    */
  type PatchDeepChoice[OK, O1K, ignore /* <: js.Object */, fill, OKeys /* <: Key */, K /* <: Key */] = (PatchProp[OK, O1K, fill, OKeys, K]) | (PatchDeepObject[OK, O1K, ignore, fill, /* keyof OK */ String]) | (PatchDeepList[OK, O1K, ignore, fill])
  
  /**
    * @hidden
    */
  type PatchDeepList[L /* <: typings.tsToolbelt.listMod.List[Any] */, L1 /* <: typings.tsToolbelt.listMod.List[Any] */, ignore /* <: js.Object */, fill] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof L1 ]: any}
    */ typings.tsToolbelt.tsToolbeltStrings.PatchDeepList & TopLevel[Any]) | js.Array[Any]
  
  /**
    * @hidden
    */
  type PatchDeepObject[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill, OKeys /* <: Key */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O & ts-toolbelt.ts-toolbelt/out/Object/Omit._Omit<O1, OKeys> ]: ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchDeepChoice<ts-toolbelt.ts-toolbelt/out/Any/At.At<O, K>, ts-toolbelt.ts-toolbelt/out/Any/At.At<O1, K>, ignore, fill, OKeys, K>}
    */ typings.tsToolbelt.tsToolbeltStrings.PatchDeepObject & TopLevel[Any]
  
  type PatchFlat[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill] = PatchFlatChoice[O, O1, ignore, fill]
  
  type PatchFlatChoice[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill] = (PatchFlatObject[O, O1, fill, /* keyof O */ String]) | (PatchFlatList[O, O1, ignore, fill]) | O
  
  /**
    * @hidden
    */
  type PatchFlatList[L /* <: typings.tsToolbelt.listMod.List[Any] */, L1 /* <: typings.tsToolbelt.listMod.List[Any] */, ignore /* <: js.Object */, fill] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof L1 ]: ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchProp<ts-toolbelt.ts-toolbelt/out/Any/At.At<L, K>, L1[K], fill, keyof L, K>}
    */ typings.tsToolbelt.tsToolbeltStrings.PatchFlatList & TopLevel[L1]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof L ]: ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchProp<L[K], ts-toolbelt.ts-toolbelt/out/Any/At.At<L1, K>, fill, keyof L, K>}
    */ typings.tsToolbelt.tsToolbeltStrings.PatchFlatList & TopLevel[L]) | js.Array[Any]
  
  /**
    * @hidden
    */
  type PatchFlatObject[O /* <: js.Object */, O1 /* <: js.Object */, fill, OKeys /* <: Key */] = typings.tsToolbelt.tsToolbeltStrings.PatchFlatObject & TopLevel[Any] & js.Object
  
  /**
    * @hidden
    */
  type PatchProp[OK, O1K, fill, OKeys /* <: Key */, K /* <: Key */] = O1K | OK
}
