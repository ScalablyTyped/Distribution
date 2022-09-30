package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectOmitMod._Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pOmitMod {
  
  type Omit[O /* <: js.Object */, Path /* <: typings.tsToolbelt.listMod.List[Key] */] = OmitAt[O, Path]
  
  /**
    * @hidden
    */
  type OmitAt[O, Path /* <: typings.tsToolbelt.listMod.List[Key] */] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: K extends Path[0]? ts-toolbelt.ts-toolbelt/out/Object/P/Omit.OmitAt<O[K], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<Path>> : O[K]}
    */ typings.tsToolbelt.tsToolbeltStrings.OmitAt & TopLevel[Any]) | O | (_Omit[
    O, 
    /* import warning: importer.ImportType#apply Failed type conversion: Path[0] */ js.Any
  ]) | (typings.tsToolbelt.omitMod._Omit[
    O, 
    /* import warning: importer.ImportType#apply Failed type conversion: Path[0] */ js.Any
  ])
}
