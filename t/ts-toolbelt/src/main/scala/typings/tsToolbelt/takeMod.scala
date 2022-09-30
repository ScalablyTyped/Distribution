package typings.tsToolbelt

import typings.tsToolbelt.castMod.Cast
import typings.tsToolbelt.iterationInternalMod.Way
import typings.tsToolbelt.iterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object takeMod {
  
  type Take[L /* <: typings.tsToolbelt.listMod.List[Any] */, N /* <: Double */, way /* <: Way */] = _Take[L, N, way]
  
  /**
    * starts in reverse from the end till `N` = 0
    * @hidden
    */
  type TakeBack[L /* <: typings.tsToolbelt.listMod.List[Any] */, N /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0TakeBack<L, N>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<0, ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<N>>] */ js.Any
  
  /**
    * starts in reverse from `N` till `N` = 0
    * @hidden
    */
  type TakeForth[L /* <: typings.tsToolbelt.listMod.List[Any] */, N /* <: Iteration */, I /* <: Iteration */, LN /* <: typings.tsToolbelt.listMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0TakeForth<L, N, I, LN>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<-1, ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>>] */ js.Any
  
  type _Take[L /* <: typings.tsToolbelt.listMod.List[Any] */, N /* <: Double */, way /* <: Way */] = Cast[Any, typings.tsToolbelt.listMod.List[Any]]
  
  /**
    * @hidden
    */
  type __Take[L /* <: typings.tsToolbelt.listMod.List[Any] */, N /* <: Iteration */, way /* <: Way */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.TakeForth<L, N>[way] */ js.Any
}
