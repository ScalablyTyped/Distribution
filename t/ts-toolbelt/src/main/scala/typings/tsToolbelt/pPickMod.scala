package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.listOfMod._ListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pPickMod {
  
  type Pick[O /* <: js.Object */, Path /* <: typings.tsToolbelt.listMod.List[Key] */] = PickAt[O, Path]
  
  /**
    * @hidden
    */
  type PickAt[O, Path /* <: typings.tsToolbelt.listMod.List[Key] */] = O | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, Path[0]> ]: ts-toolbelt.ts-toolbelt/out/Object/P/Pick.PickAt<O[K], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<Path>>}
    */ typings.tsToolbelt.tsToolbeltStrings.PickAt & TopLevel[O]) | (_ListOf[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, Path[0]> ]: ts-toolbelt.ts-toolbelt/out/Object/P/Pick.PickAt<O[K], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<Path>>}
    */ typings.tsToolbelt.tsToolbeltStrings.PickAt & TopLevel[O]
  ])
}
