package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.InterfaceDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/interface", "InterfaceConverter")
  @js.native
  class InterfaceConverter protected () extends ConverterNodeComponent[InterfaceDeclaration] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
