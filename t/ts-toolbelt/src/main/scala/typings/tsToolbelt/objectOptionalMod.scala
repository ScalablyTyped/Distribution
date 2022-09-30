package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectOptionalMod {
  
  type Optional[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0PatchFlat<O, depth, K>[ts-toolbelt.ts-toolbelt/out/Any/Equals.Equals<ts-toolbelt.ts-toolbelt/out/Any/Key.Key, K>] */ js.Any
  
  type OptionalDeep[O] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]:? ts-toolbelt.ts-toolbelt/out/Object/Optional.OptionalDeep<O[K]>}
    */ typings.tsToolbelt.tsToolbeltStrings.OptionalDeep & TopLevel[O]
  
  type OptionalFlat[O] = typings.tsToolbelt.tsToolbeltStrings.OptionalFlat & TopLevel[O] & js.Object
  
  type OptionalPart[O /* <: js.Object */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepOptionalDeep<O>[depth] */ js.Any
}
