package typings.tsToolbelt

import typings.tsToolbelt.castMod.Cast
import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.updateMod.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validPathMod {
  
  type ValidPath[O /* <: js.Object */, Path /* <: typings.tsToolbelt.listMod.List[Key] */] = _ValidPath[O, Path]
  
  /**
    * @hidden
    */
  type ValidatePath[O, Path /* <: typings.tsToolbelt.listMod.List[Key] */, I /* <: Iteration */] = Update[
    Path, 
    typings.tsToolbelt.iterationKeyMod.Key[I], 
    (/* import warning: importer.ImportType#apply Failed type conversion: Path[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any) | (/* keyof O */ String)
  ]
  
  type _ValidPath[O /* <: js.Object */, Path /* <: typings.tsToolbelt.listMod.List[Key] */] = Cast[Any, typings.tsToolbelt.listMod.List[Key]]
  
  /**
    * @hidden
    */
  type __ValidPath[O, Path /* <: typings.tsToolbelt.listMod.List[Key] */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0ValidPath<O, Path, I>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>, ts-toolbelt.ts-toolbelt/out/List/Length.Length<Path>>] */ js.Any
}
