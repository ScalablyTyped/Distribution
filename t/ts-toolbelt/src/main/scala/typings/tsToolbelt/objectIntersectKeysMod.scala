package typings.tsToolbelt

import typings.tsToolbelt.internalMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectIntersectKeysMod {
  
  type IntersectKeys[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.Equals<O, O1>[match] */ js.Any
  
  /**
    * @hidden
    */
  type IntersectMatch[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] = _IntersectMatch[O, O1, `match`]
  
  type _IntersectMatch[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: -? {  1 :K}[ts-toolbelt.ts-toolbelt/out/Any/Is.Is<O[K], ts-toolbelt.ts-toolbelt/out/Any/At.At<O1, K>, match>]}[keyof O] */ js.Any
}
