package typings.tsToolbelt

import typings.tsToolbelt.castMod.Cast
import typings.tsToolbelt.iterationInternalMod.Way
import typings.tsToolbelt.iterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  type Range[From /* <: Double */, To /* <: Double */, way /* <: Way */] = _Range[From, To, way]
  
  /**
    * @hidden
    */
  type RangeBack[From /* <: Iteration */, To /* <: Iteration */, L /* <: typings.tsToolbelt.listMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0RangeBack<From, To, L>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<From, To>] */ js.Any
  
  /**
    * @hidden
    */
  type RangeForth[From /* <: Iteration */, To /* <: Iteration */, L /* <: typings.tsToolbelt.listMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0RangeForth<From, To, L>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<From, To>] */ js.Any
  
  type _Range[From /* <: Double */, To /* <: Double */, way /* <: Way */] = Cast[Any, js.Array[String | Double]]
  
  /**
    * @hidden
    */
  type __Range[From /* <: Iteration */, To /* <: Iteration */, way /* <: Way */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.RangeForth<To, From>[way] */ js.Any
}
