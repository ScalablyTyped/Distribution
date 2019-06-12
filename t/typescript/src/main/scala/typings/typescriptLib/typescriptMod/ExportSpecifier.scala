package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSpecifier
  extends NamedDeclaration
     with ImportOrExportSpecifier {
  @JSName("kind")
  var kind_ExportSpecifier: typescriptLib.typescriptMod.SyntaxKind.ExportSpecifier = js.native
  @JSName("name")
  var name_ExportSpecifier: Identifier = js.native
  @JSName("parent")
  var parent_ExportSpecifier: NamedExports = js.native
  var propertyName: js.UndefOr[Identifier] = js.native
}

