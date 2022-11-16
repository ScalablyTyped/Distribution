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
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    L extends unknown ? ts-toolbelt.ts-toolbelt/out/List/Omit._Omit<L, K> : never
    }}}
    */
  type Omit[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, K /* <: Key */] = typings.tsToolbelt.outListListMod.List[Any]
  
  type _Omit[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, K /* <: Key */] = _ListOf[
    typings.tsToolbelt.outObjectOmitMod._Omit[ObjectOf[L], (/* template literal string: ${K&number} */ String) | K]
  ]
}
