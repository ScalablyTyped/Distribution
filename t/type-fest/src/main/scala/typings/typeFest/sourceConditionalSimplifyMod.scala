package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceConditionalSimplifyMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Type extends ExcludeType ? Type : Type extends IncludeType ? {[ TypeKey in keyof Type ]: Type[TypeKey]} : Type
    }}}
    */
  type ConditionalSimplify[Type, ExcludeType, IncludeType] = Type
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Type extends ExcludeType ? Type : Type extends IncludeType ? {[ TypeKey in keyof Type ]: type-fest.type-fest/source/conditional-simplify.ConditionalSimplifyDeep<Type[TypeKey], ExcludeType, IncludeType>} : Type
    }}}
    */
  type ConditionalSimplifyDeep[Type, ExcludeType, IncludeType] = Type
}
