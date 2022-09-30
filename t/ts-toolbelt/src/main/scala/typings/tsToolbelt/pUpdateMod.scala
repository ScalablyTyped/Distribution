package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.keyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pUpdateMod {
  
  type Update[O /* <: js.Object */, Path /* <: typings.tsToolbelt.listMod.List[Key] */, A /* <: Any */] = UpdateAt[O, Path, A]
  
  /**
    * @hidden
    */
  type UpdateAt[O, Path /* <: typings.tsToolbelt.listMod.List[Key] */, A] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: K extends Path[0]? ts-toolbelt.ts-toolbelt/out/Object/P/Update.UpdateAt<O[K], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<Path>, A> : O[K]}
    */ typings.tsToolbelt.tsToolbeltStrings.UpdateAt & TopLevel[Any]) | O | (typings.tsToolbelt.objectUpdateMod.Update[
    O, 
    /* import warning: importer.ImportType#apply Failed type conversion: Path[0] */ js.Any, 
    A
  ]) | (typings.tsToolbelt.updateMod.Update[
    O, 
    /* import warning: importer.ImportType#apply Failed type conversion: Path[0] */ js.Any, 
    A
  ])
}
