package typings.tsToolbelt

import typings.tsToolbelt.listInternalMod.Key
import typings.tsToolbelt.listOfMod._ListOf
import typings.tsToolbelt.objectOfMod.ObjectOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object omitMod {
  
  type Omit[L /* <: typings.tsToolbelt.listMod.List[Any] */, K /* <: Key */] = _Omit[L, K]
  
  type _Omit[L /* <: typings.tsToolbelt.listMod.List[Any] */, K /* <: Key */] = _ListOf[
    typings.tsToolbelt.objectOmitMod._Omit[ObjectOf[L], (/* template literal string: ${K&number} */ String) | K]
  ]
}
