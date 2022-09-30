package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectWritableMod {
  
  type Writable[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = _Writable[O, K, depth]
  
  type WritableDeep[O] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ K in keyof O ]: O[K] extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn? O[K] : ts-toolbelt.ts-toolbelt/out/Object/Writable.WritableDeep<O[K]>}
    */ typings.tsToolbelt.tsToolbeltStrings.WritableDeep & TopLevel[Any]
  
  type WritableFlat[O] = typings.tsToolbelt.tsToolbeltStrings.WritableFlat & TopLevel[O] & js.Object
  
  type WritablePart[O /* <: js.Object */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepWritableDeep<O>[depth] */ js.Any
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped ts-toolbelt.ts-toolbelt/out/Object/Writable.WritablePart<ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, K>, depth> extends unknown ? O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchFlatChoice<ts-toolbelt.ts-toolbelt/out/Object/Writable.WritablePart<ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, K>, depth>, O, ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn, never> : never : never */ trait _Writable[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] extends StObject
}
