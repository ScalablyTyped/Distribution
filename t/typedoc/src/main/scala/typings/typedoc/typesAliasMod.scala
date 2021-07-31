package typings.typedoc

import typings.typedoc.anon.TypealiasSymbolSymbol
import typings.typedoc.componentsMod.TypeConverter
import typings.typedoc.contextMod.Context
import typings.typedoc.converterConverterMod.Converter
import typings.typedoc.modelsMod.ReferenceType
import typings.typescript.mod.Type
import typings.typescript.mod.TypeReferenceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAliasMod {
  
  @JSImport("typedoc/dist/lib/converter/types/alias", "AliasConverter")
  @js.native
  class AliasConverter protected () extends TypeConverter[Type, TypeReferenceNode] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def convertType(context: Context, `type`: TypealiasSymbolSymbol): ReferenceType = js.native
  }
}
