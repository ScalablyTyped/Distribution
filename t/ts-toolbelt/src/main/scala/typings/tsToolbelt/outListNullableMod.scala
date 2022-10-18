package typings.tsToolbelt

import typings.tsToolbelt.outAnyCastMod.Cast
import typings.tsToolbelt.outAnyXMod.x
import typings.tsToolbelt.outListInternalMod.Key
import typings.tsToolbelt.outObjectUpdateMod.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListNullableMod {
  
  type Nullable[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, K /* <: Key */] = Cast[
    Update[L, (/* template literal string: ${K&number} */ String) | K, js.UndefOr[x | Null]], 
    typings.tsToolbelt.outListListMod.List[Any]
  ]
}
