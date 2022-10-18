package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceOpaqueMod {
  
  @JSImport("type-fest/source/opaque", "tag")
  @js.native
  val tag: js.Symbol = js.native
  
  type Opaque[Type, Token] = Type & Tagged[Token]
  
  @js.native
  trait Tagged[Token] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    OpaqueType extends type-fest.type-fest/source/opaque.Opaque<infer Type, OpaqueType[symbol]> ? Type : OpaqueType
    }}}
    */
  @js.native
  trait UnwrapOpaque[OpaqueType /* <: Tagged[Any] */] extends StObject
}
