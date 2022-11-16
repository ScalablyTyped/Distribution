package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTrimMod {
  
  type Trim[V /* <: String */] = TrimLeft[TrimRight[V]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    V extends / * template literal string:  ${inferR} * / string ? type-fest.type-fest/source/trim.TrimLeft</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : V
    }}}
    */
  type TrimLeft[V /* <: String */] = V
  
  /**
  Remove spaces from the right side.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    V extends / * template literal string: ${inferR}  * / string ? type-fest.type-fest/source/trim.TrimRight</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : V
    }}}
    */
  type TrimRight[V /* <: String */] = V
}
