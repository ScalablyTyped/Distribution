package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTrimMod {
  
  type Trim[V /* <: String */] = TrimLeft[TrimRight[V]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    V extends / * template literal string:  ${inferR} * / string ? type-fest.type-fest/source/trim.TrimLeft</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : V
    }}}
    */
  @js.native
  trait TrimLeft[V /* <: String */] extends StObject
  
  /**
  Remove spaces from the right side.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    V extends / * template literal string: ${inferR}  * / string ? type-fest.type-fest/source/trim.TrimRight</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : V
    }}}
    */
  @js.native
  trait TrimRight[V /* <: String */] extends StObject
}
