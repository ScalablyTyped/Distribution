package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.Type
import typings.typescript.mod.TypeOperatorNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeOperatorMod {
  
  @JSImport("typedoc/dist/lib/converter/types/type-operator", "TypeOperatorConverter")
  @js.native
  class TypeOperatorConverter protected () extends TypeNodeConverter[Type, TypeOperatorNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    val supportedOperatorNames: js.Any = js.native
  }
}
