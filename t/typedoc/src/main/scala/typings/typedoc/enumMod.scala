package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.EnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/enum", "EnumConverter")
  @js.native
  class EnumConverter protected () extends ConverterNodeComponent[EnumDeclaration] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    /* private */ var convertMember: js.Any = js.native
  }
}
