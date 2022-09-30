package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectUndefinableMod {
  
  type Undefinable[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = _Undefinable[O, K, depth]
  
  type UndefinableDeep[O] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: O[K] extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn? O[K] : ts-toolbelt.ts-toolbelt/out/Object/Undefinable.UndefinableDeep<O[K] | undefined>}
    */ typings.tsToolbelt.tsToolbeltStrings.UndefinableDeep & TopLevel[Any]
  
  type UndefinableFlat[O] = typings.tsToolbelt.tsToolbeltStrings.UndefinableFlat & TopLevel[O] & js.Object
  
  /**
    * @hidden
    */
  type UndefinablePart[O /* <: js.Object */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepUndefinableDeep<O>[depth] */ js.Any
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped ts-toolbelt.ts-toolbelt/out/Object/Undefinable.UndefinablePart<ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, K>, depth> extends unknown ? O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchFlatChoice<ts-toolbelt.ts-toolbelt/out/Object/Undefinable.UndefinablePart<ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, K>, depth>, O, ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn, never> : never : never */ trait _Undefinable[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] extends StObject
}
