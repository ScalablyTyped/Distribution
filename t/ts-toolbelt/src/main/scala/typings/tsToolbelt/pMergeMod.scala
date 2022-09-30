package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.builtInMod.BuiltIn
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pMergeMod {
  
  type Merge[O /* <: js.Object */, Path /* <: typings.tsToolbelt.listMod.List[Key] */, O1 /* <: js.Object */, depth /* <: Depth */] = MergeAt[O, Path, O1, depth]
  
  /**
    * @hidden
    */
  type MergeAt[O, Path /* <: typings.tsToolbelt.listMod.List[Key] */, O1, depth /* <: Depth */] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: K extends Path[0]? ts-toolbelt.ts-toolbelt/out/Object/P/Merge.MergeAt<O[K], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<Path>, O1, depth> : O[K]}
    */ typings.tsToolbelt.tsToolbeltStrings.MergeAt & TopLevel[Any]) | O | (typings.tsToolbelt.objectMergeMod.Merge[O, O1 & js.Object, depth, BuiltIn, Unit])
}
