package typings.tsToolbelt

import typings.tsToolbelt.castMod.Cast
import typings.tsToolbelt.listInternalMod.Key
import typings.tsToolbelt.objectUpdateMod.Update
import typings.tsToolbelt.xMod.x
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undefinableMod {
  
  type Undefinable[L /* <: typings.tsToolbelt.listMod.List[Any] */, K /* <: Key */] = Cast[
    Update[L, (/* template literal string: ${K&number} */ String) | K, js.UndefOr[x]], 
    typings.tsToolbelt.listMod.List[Any]
  ]
}
