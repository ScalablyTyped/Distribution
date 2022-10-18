package typings.themeUiComponents

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTypesMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T & U ]: P extends keyof T? T[P] : P extends keyof U? U[P] : never}
    }}}
    */
  @js.native
  trait Assign[T, U] extends StObject
  
  type ForwardRef[T, P] = ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]]
}
