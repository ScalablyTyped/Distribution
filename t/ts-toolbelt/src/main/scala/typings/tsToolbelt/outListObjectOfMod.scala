package typings.tsToolbelt

import typings.tsToolbelt.outObjectPickMod._Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListObjectOfMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends unknown ? number extends ts-toolbelt.ts-toolbelt/out/List/Length.Length<O> ? ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, number> : ts-toolbelt.ts-toolbelt/out/Object/Omit._Omit<O, std.Array<keyof any>> : never
    }}}
    */
  type ObjectOf[O /* <: typings.tsToolbelt.outListListMod.List[Any] */] = _Pick[O, Double]
}
