package typings.typedoc

import typings.typedoc.componentsMod.TypeConverter
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.UnionOrIntersectionType
import typings.typescript.mod.UnionOrIntersectionTypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unionOrIntersectionMod {
  
  @JSImport("typedoc/dist/lib/converter/types/union-or-intersection", "UnionOrIntersectionConverter")
  @js.native
  class UnionOrIntersectionConverter protected () extends TypeConverter[UnionOrIntersectionType, UnionOrIntersectionTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
