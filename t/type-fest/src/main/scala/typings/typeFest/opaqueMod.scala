package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opaqueMod {
  
  @JSImport("type-fest/source/opaque", "tag")
  @js.native
  val tag: js.Symbol = js.native
  
  type Opaque[Type, Token] = Type & Tagged[Token]
  
  @js.native
  trait Tagged[Token] extends StObject
  
  type UnwrapOpaque[OpaqueType /* <: Tagged[Any] */] = OpaqueType
}
