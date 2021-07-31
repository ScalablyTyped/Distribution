package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.BindingPattern
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingArrayMod {
  
  @JSImport("typedoc/dist/lib/converter/types/binding-array", "BindingArrayConverter")
  @js.native
  class BindingArrayConverter protected () extends TypeNodeConverter[Type, BindingPattern] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
