package typings.tsToolbelt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectUnionOfMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/UnionOf._UnionOf<O> : never
    }}}
    */
  type UnionOf[O /* <: js.Object */] = _UnionOf[O]
  
  type _UnionOf[O /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
}
