package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ExportSpecifier
import typings.typescript.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createExportSpecifier")
@js.native
object createExportSpecifier extends js.Object {
  def apply(propertyName: js.UndefOr[Identifier | String], name: String): ExportSpecifier = js.native
  def apply(propertyName: js.UndefOr[Identifier | String], name: Identifier): ExportSpecifier = js.native
}

