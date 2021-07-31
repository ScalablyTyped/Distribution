package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.ClassDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/class", "ClassConverter")
  @js.native
  class ClassConverter protected () extends ConverterNodeComponent[ClassDeclaration] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
