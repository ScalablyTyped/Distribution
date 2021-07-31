package typings.typedoc

import typings.typedoc.componentsMod.TypeConverter
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.ArrayTypeNode
import typings.typescript.mod.TypeReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("typedoc/dist/lib/converter/types/array", "ArrayConverter")
  @js.native
  class ArrayConverter protected () extends TypeConverter[TypeReference, ArrayTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
