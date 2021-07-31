package typings.typedoc

import typings.typedoc.componentsMod.TypeConverter
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.LiteralType
import typings.typescript.mod.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringLiteralMod {
  
  @JSImport("typedoc/dist/lib/converter/types/string-literal", "StringLiteralConverter")
  @js.native
  class StringLiteralConverter protected () extends TypeConverter[LiteralType, StringLiteral] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
