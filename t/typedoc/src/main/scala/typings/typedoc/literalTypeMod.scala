package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.TypeLiteralNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object literalTypeMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/literal-type", "TypeLiteralConverter")
  @js.native
  class TypeLiteralConverter protected () extends ConverterNodeComponent[TypeLiteralNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
