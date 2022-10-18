package typings.typeFest

import typings.std.Record
import typings.typeFest.sourcePrimitiveMod.Primitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceLiteralUnionMod {
  
  type LiteralUnion[LiteralType, BaseType /* <: Primitive */] = LiteralType | (BaseType & (Record[scala.Nothing, scala.Nothing]))
}
