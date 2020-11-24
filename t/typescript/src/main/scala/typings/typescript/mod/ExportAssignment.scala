package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportAssignment
  extends DeclarationStatement
     with JSDocContainer
     with _HasJSDoc {
  
  val expression: Expression = js.native
  
  val isExportEquals: js.UndefOr[Boolean] = js.native
  
  @JSName("kind")
  val kind_ExportAssignment: typings.typescript.mod.SyntaxKind.ExportAssignment = js.native
  
  @JSName("parent")
  val parent_ExportAssignment: SourceFile = js.native
}
