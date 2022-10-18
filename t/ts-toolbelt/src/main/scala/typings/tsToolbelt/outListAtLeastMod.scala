package typings.tsToolbelt

import typings.tsToolbelt.outListInternalMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListAtLeastMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Object/AtLeast.AtLeast<ts-toolbelt.ts-toolbelt/out/List/ObjectOf.ObjectOf<L>, / * template literal string: ${K&number} * / string | K> extends infer U ? U extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/ListOf._ListOf<U & {}> : never : never
    }}}
    */
  @js.native
  trait AtLeast[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, K /* <: Key */] extends StObject
}
