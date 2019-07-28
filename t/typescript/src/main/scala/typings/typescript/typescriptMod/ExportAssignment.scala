package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is either an `export =` or an `export default` declaration.
  * Unless `isExportEquals` is set, this node was parsed as an `export default`.
  */
@js.native
trait ExportAssignment extends DeclarationStatement {
  var expression: Expression = js.native
  var isExportEquals: js.UndefOr[Boolean] = js.native
  @JSName("kind")
  var kind_ExportAssignment: typings.typescript.typescriptMod.SyntaxKind.ExportAssignment = js.native
  @JSName("parent")
  var parent_ExportAssignment: SourceFile = js.native
}

