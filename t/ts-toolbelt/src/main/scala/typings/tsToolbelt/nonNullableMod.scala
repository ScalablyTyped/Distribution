package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.castMod.Cast
import typings.tsToolbelt.listInternalMod.Key
import typings.tsToolbelt.objectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonNullableMod {
  
  type NonNullable[L /* <: typings.tsToolbelt.listMod.List[Any] */, K /* <: Key */, depth /* <: Depth */] = Cast[
    NonNullablePart[L, (/* template literal string: ${K&number} */ String) | K, depth], 
    typings.tsToolbelt.listMod.List[Any]
  ]
  
  type NonNullableDeep[O, K /* <: Key */] = _NonNullableDeep[NonNullableFlat[O, K]]
  
  type NonNullableFlat[O, K /* <: Key */] = typings.tsToolbelt.tsToolbeltStrings.NonNullableFlat & TopLevel[Any] & js.Object
  
  type NonNullablePart[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.Flat<O, K>[depth] */ js.Any
  
  /**
    * @hidden
    */
  type _NonNullableDeep[O] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: O[K] extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn? O[K] : ts-toolbelt.ts-toolbelt/out/List/NonNullable.NonNullableDeep<O[K], ts-toolbelt.ts-toolbelt/out/List/_Internal.Key>}
    */ typings.tsToolbelt.tsToolbeltStrings._NonNullableDeep & TopLevel[Any]
}
