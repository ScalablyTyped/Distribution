package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectReadonlyMod {
  
  type Readonly[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = _Readonly[O, K, depth]
  
  type ReadonlyDeep[O] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof O ]: O[K] extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn? O[K] : ts-toolbelt.ts-toolbelt/out/Object/Readonly.ReadonlyDeep<O[K]>}
    */ typings.tsToolbelt.tsToolbeltStrings.ReadonlyDeep & TopLevel[Any]
  
  type ReadonlyFlat[O] = typings.tsToolbelt.tsToolbeltStrings.ReadonlyFlat & TopLevel[O] & js.Object
  
  type ReadonlyPart[O /* <: js.Object */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepReadonlyDeep<O>[depth] */ js.Any
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped ts-toolbelt.ts-toolbelt/out/Object/Readonly.ReadonlyPart<ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, K>, depth> extends unknown ? O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchFlatChoice<ts-toolbelt.ts-toolbelt/out/Object/Readonly.ReadonlyPart<ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, K>, depth>, O, ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn, never> : never : never */ trait _Readonly[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] extends StObject
}
