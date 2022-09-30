package typings.tsToolbelt

import typings.tsToolbelt.appendMod.Append
import typings.tsToolbelt.booleanInternalMod.Boolean
import typings.tsToolbelt.castMod.Cast
import typings.tsToolbelt.concatMod.Concat
import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.unionOfMod.UnionOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unNestMod {
  
  /**
    * @hidden
    */
  type Flatter[L /* <: typings.tsToolbelt.listMod.List[Any] */, LN /* <: typings.tsToolbelt.listMod.List[Any] */, I /* <: Iteration */] = (Append[
    LN, 
    /* import warning: importer.ImportType#apply Failed type conversion: L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
  ]) | (Concat[
    LN, 
    /* import warning: importer.ImportType#apply Failed type conversion: L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
  ])
  
  type UnNest[L /* <: typings.tsToolbelt.listMod.List[Any] */, strict /* <: Boolean */] = _UnNest[L, strict]
  
  /**
    * @hidden
    */
  type UnNestLoose[L /* <: typings.tsToolbelt.listMod.List[Any] */] = js.Array[UnionOf[Any]]
  
  /**
    * @hidden
    */
  type UnNestStrict[L /* <: typings.tsToolbelt.listMod.List[Any] */, LN /* <: typings.tsToolbelt.listMod.List[Any] */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0UnNestStrict<L, LN, I>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>, ts-toolbelt.ts-toolbelt/out/List/Length.Length<L>>] */ js.Any
  
  type _UnNest[L /* <: typings.tsToolbelt.listMod.List[Any] */, strict /* <: Boolean */] = Cast[Any, typings.tsToolbelt.listMod.List[Any]]
  
  /**
    * @hidden
    */
  type __UnNest[L /* <: typings.tsToolbelt.listMod.List[Any] */, strict /* <: Boolean */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0UnNestLoose<L>[ts-toolbelt.ts-toolbelt/out/Boolean/And.And<ts-toolbelt.ts-toolbelt/out/Boolean/Not.Not<ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<number, ts-toolbelt.ts-toolbelt/out/List/Length.Length<L>>>, strict>] */ js.Any
}
