package typings.typedoc

import typings.typedoc.componentsMod.TypeConverter
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.ConditionalType
import typings.typescript.mod.ConditionalTypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalMod {
  
  @JSImport("typedoc/dist/lib/converter/types/conditional", "ConditionalConverter")
  @js.native
  class ConditionalConverter protected () extends TypeConverter[ConditionalType, ConditionalTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
