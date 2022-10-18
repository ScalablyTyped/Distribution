package typings.typeFest

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
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends type-fest.type-fest/source/empty-object.EmptyObject ? true : false
    }}}
    */
  @js.native
  trait IsEmptyObject[T] extends StObject
}
