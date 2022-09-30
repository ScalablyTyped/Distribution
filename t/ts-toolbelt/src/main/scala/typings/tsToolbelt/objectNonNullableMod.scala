package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.builtInMod.BuiltIn
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectInternalMod.Depth
import typings.tsToolbelt.objectPatchMod.PatchFlat
import typings.tsToolbelt.objectPickMod._Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectNonNullableMod {
  
  type NonNullable[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = _NonNullable[O, K, depth]
  
  type NonNullableDeep[O] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: O[K] extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn? O[K] : ts-toolbelt.ts-toolbelt/out/Object/NonNullable.NonNullableDeep<ts-toolbelt.ts-toolbelt/out/Union/NonNullable.NonNullable<O[K]>>}
    */ typings.tsToolbelt.tsToolbeltStrings.NonNullableDeep & TopLevel[Any]
  
  type NonNullableFlat[O] = typings.tsToolbelt.tsToolbeltStrings.NonNullableFlat & TopLevel[O] & js.Object
  
  type NonNullablePart[O /* <: js.Object */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepNonNullableDeep<O>[depth] */ js.Any
  
  type _NonNullable[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = PatchFlat[NonNullablePart[_Pick[O, K], depth], O, BuiltIn, scala.Nothing]
}
