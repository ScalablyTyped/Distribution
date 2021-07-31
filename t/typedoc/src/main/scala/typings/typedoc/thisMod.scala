package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.ThisTypeNode
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thisMod {
  
  @JSImport("typedoc/dist/lib/converter/types/this", "ThisConverter")
  @js.native
  class ThisConverter protected () extends TypeNodeConverter[Type, ThisTypeNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
