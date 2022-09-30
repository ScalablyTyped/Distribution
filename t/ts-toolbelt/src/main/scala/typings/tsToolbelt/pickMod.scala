package typings.tsToolbelt

import typings.tsToolbelt.listInternalMod.Key
import typings.tsToolbelt.listOfMod._ListOf
import typings.tsToolbelt.objectOfMod.ObjectOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickMod {
  
  type Pick[L /* <: typings.tsToolbelt.listMod.List[Any] */, K /* <: Key */] = _Pick[L, K]
  
  type _Pick[L /* <: typings.tsToolbelt.listMod.List[Any] */, K /* <: Key */] = _ListOf[
    typings.tsToolbelt.objectPickMod._Pick[ObjectOf[L], (/* template literal string: ${K&number} */ String) | K]
  ]
}
