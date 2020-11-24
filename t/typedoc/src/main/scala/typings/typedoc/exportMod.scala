package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typescript.mod.ExportAssignment
import typings.typescript.mod.ExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/export", JSImport.Namespace)
@js.native
object exportMod extends js.Object {
  
  @js.native
  class ExportConverter () extends ConverterNodeComponent[ExportAssignment]
  
  @js.native
  class ExportDeclarationConverter () extends ConverterNodeComponent[ExportDeclaration]
}
