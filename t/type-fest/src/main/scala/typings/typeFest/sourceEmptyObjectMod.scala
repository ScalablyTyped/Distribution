package typings.typeFest

import typings.typeFest.typeFestBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceEmptyObjectMod {
  
  @JSImport("type-fest/source/empty-object", "emptyObjectSymbol")
  @js.native
  val emptyObjectSymbol: js.Symbol = js.native
  
  @js.native
  trait EmptyObject extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends type-fest.type-fest/source/empty-object.EmptyObject ? true : false
    }}}
    */
  type IsEmptyObject[T] = `true`
}
