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

object objectNullableMod {
  
  type Nullable[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = _Nullable[O, K, depth]
  
  type NullableDeep[O] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: ts-toolbelt.ts-toolbelt/out/Object/Nullable.NullableDeep<ts-toolbelt.ts-toolbelt/out/Union/Nullable.Nullable<O[K]>>}
    */ typings.tsToolbelt.tsToolbeltStrings.NullableDeep & TopLevel[O]
  
  type NullableFlat[O] = typings.tsToolbelt.tsToolbeltStrings.NullableFlat & TopLevel[O] & js.Object
  
  /**
    * @hidden
    */
  type NullablePart[O /* <: js.Object */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepNullableDeep<O>[depth] */ js.Any
  
  type _Nullable[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = PatchFlat[NullablePart[_Pick[O, K], depth], O, BuiltIn, scala.Nothing]
}
