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

object objectCompulsoryMod {
  
  type Compulsory[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = _Compulsory[O, K, depth]
  
  type CompulsoryDeep[O] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: -? O[K] extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn? O[K] : ts-toolbelt.ts-toolbelt/out/Object/Compulsory.CompulsoryDeep<ts-toolbelt.ts-toolbelt/out/Union/NonNullable.NonNullable<O[K]>>}
    */ typings.tsToolbelt.tsToolbeltStrings.CompulsoryDeep & TopLevel[Any]
  
  type CompulsoryFlat[O] = typings.tsToolbelt.tsToolbeltStrings.CompulsoryFlat & TopLevel[O] & js.Object
  
  type CompulsoryPart[O /* <: js.Object */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepFlat<O>[depth] */ js.Any
  
  type _Compulsory[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = PatchFlat[CompulsoryPart[_Pick[O, K], depth], O, BuiltIn, scala.Nothing]
}
