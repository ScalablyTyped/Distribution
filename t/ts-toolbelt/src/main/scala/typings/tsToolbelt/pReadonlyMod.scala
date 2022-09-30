package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pReadonlyMod {
  
  type Readonly[O /* <: js.Object */, Path /* <: typings.tsToolbelt.listMod.List[Key] */, depth /* <: Depth */] = ReadonlyAt[O, Path, depth]
  
  /**
    * @hidden
    */
  type ReadonlyAt[O, Path /* <: typings.tsToolbelt.listMod.List[Key] */, depth /* <: Depth */] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: K extends Path[0]? ts-toolbelt.ts-toolbelt/out/Object/P/Readonly.ReadonlyAt<O[K], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<Path>, depth> : O[K]}
    */ typings.tsToolbelt.tsToolbeltStrings.ReadonlyAt & TopLevel[Any]) | O | (typings.tsToolbelt.objectReadonlyMod.Readonly[
    O, 
    /* import warning: importer.ImportType#apply Failed type conversion: Path[0] */ js.Any, 
    depth
  ])
}
