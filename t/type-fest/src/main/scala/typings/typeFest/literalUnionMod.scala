package typings.typeFest

import typings.typeFest.anon._empty
import typings.typeFest.basicMod.Primitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object literalUnionMod {
  
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: Primitive */] = LiteralType | (BaseType & _empty)
}
