package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.ObjectLiteralExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object literalObjectMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/literal-object", "ObjectLiteralConverter")
  @js.native
  class ObjectLiteralConverter protected () extends ConverterNodeComponent[ObjectLiteralExpression] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
