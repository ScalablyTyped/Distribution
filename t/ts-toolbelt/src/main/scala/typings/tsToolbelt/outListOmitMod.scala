package typings.tsToolbelt

import typings.tsToolbelt.outListInternalMod.Key
import typings.tsToolbelt.outListObjectOfMod.ObjectOf
import typings.tsToolbelt.outObjectListOfMod._ListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListOmitMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    L extends unknown ? ts-toolbelt.ts-toolbelt/out/List/Omit._Omit<L, K> : never
    }}}
    */
  @js.native
  trait Omit[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, K /* <: Key */] extends StObject
  
  type _Omit[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, K /* <: Key */] = _ListOf[
    typings.tsToolbelt.outObjectOmitMod._Omit[ObjectOf[L], (/* template literal string: ${K&number} */ String) | K]
  ]
}
