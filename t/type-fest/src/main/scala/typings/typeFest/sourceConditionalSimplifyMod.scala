package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceConditionalSimplifyMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Type extends ExcludeType ? Type : Type extends IncludeType ? {[ TypeKey in keyof Type ]: Type[TypeKey]} : Type
    }}}
    */
  @js.native
  trait ConditionalSimplify[Type, ExcludeType, IncludeType] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Type extends ExcludeType ? Type : Type extends IncludeType ? {[ TypeKey in keyof Type ]: type-fest.type-fest/source/conditional-simplify.ConditionalSimplifyDeep<Type[TypeKey], ExcludeType, IncludeType>} : Type
    }}}
    */
  @js.native
  trait ConditionalSimplifyDeep[Type, ExcludeType, IncludeType] extends StObject
}
