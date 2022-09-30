package typings.tsToolbelt

import typings.tsToolbelt.appendMod.Append
import typings.tsToolbelt.castMod.Cast
import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.iterationOfMod.IterationOf
import typings.tsToolbelt.tsToolbeltInts.`0`
import typings.tsToolbelt.tsToolbeltStrings.default
import typings.tsToolbelt.unionSelectMod.Select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listOfMod {
  
  /**
    * @hidden
    */
  type AppendExists[O /* <: js.Object */, LN /* <: typings.tsToolbelt.listMod.List[Any] */, I /* <: Iteration */] = LN | (Append[
    LN, 
    /* import warning: importer.ImportType#apply Failed type conversion: O[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
  ])
  
  type ListOf[O /* <: js.Object */] = _ListOf[O]
  
  type _ListOf[O /* <: js.Object */] = Cast[Any, typings.tsToolbelt.listMod.List[Any]]
  
  /**
    * @hidden
    */
  type __ListOf[O /* <: js.Object */] = (___ListOf[
    O, 
    Select[
      /* keyof O */ String, 
      Double | (/* template literal string: ${number} */ String), 
      default
    ], 
    js.Array[Any], 
    IterationOf[`0`]
  ]) | (js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: O[symbol] */ js.Any
  ])
  
  /**
    * @hidden
    */
  type ___ListOf[O /* <: js.Object */, K, LN /* <: typings.tsToolbelt.listMod.List[Any] */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0ListOf<O, K, I, LN>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<[K], [never]>] */ js.Any
}
