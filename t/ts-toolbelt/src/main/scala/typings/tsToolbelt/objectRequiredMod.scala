package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectRequiredMod {
  
  type Required[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = _Required[O, K, depth]
  
  type RequiredDeep[O] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: -? O[K] extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn? O[K] : ts-toolbelt.ts-toolbelt/out/Object/Required.RequiredDeep<O[K]>}
    */ typings.tsToolbelt.tsToolbeltStrings.RequiredDeep & TopLevel[Any]
  
  type RequiredFlat[O] = typings.tsToolbelt.tsToolbeltStrings.RequiredFlat & TopLevel[O] & js.Object
  
  type RequiredPart[O /* <: js.Object */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepRequiredDeep<O>[depth] */ js.Any
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped ts-toolbelt.ts-toolbelt/out/Object/Required.RequiredPart<ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, K>, depth> extends unknown ? O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchFlatChoice<ts-toolbelt.ts-toolbelt/out/Object/Required.RequiredPart<ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, K>, depth>, O, ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn, never> : never : never */ trait _Required[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] extends StObject
}
