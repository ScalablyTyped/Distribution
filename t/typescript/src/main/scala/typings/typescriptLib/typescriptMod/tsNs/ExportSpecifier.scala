package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSpecifier
  extends NamedDeclaration
     with ImportOrExportSpecifier {
  @JSName("name")
  var name_ExportSpecifier: Identifier = js.native
  @JSName("parent")
  var parent_ExportSpecifier: NamedExports = js.native
  var propertyName: js.UndefOr[Identifier] = js.native
}

