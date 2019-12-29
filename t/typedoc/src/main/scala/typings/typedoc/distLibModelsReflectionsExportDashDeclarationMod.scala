package typings.typedoc

import typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import typings.typescript.typescriptMod.ExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/export-declaration", JSImport.Namespace)
@js.native
object distLibModelsReflectionsExportDashDeclarationMod extends js.Object {
  @js.native
  class ExportDeclarationReflection protected () extends DeclarationReflection {
    def this(node: ExportDeclaration, parent: Reflection) = this()
    var exportDeclaration: ExportDeclaration = js.native
  }
  
}

