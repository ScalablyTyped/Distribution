package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.SignatureDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessorMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/accessor", "AccessorConverter")
  @js.native
  class AccessorConverter protected () extends ConverterNodeComponent[SignatureDeclaration] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
