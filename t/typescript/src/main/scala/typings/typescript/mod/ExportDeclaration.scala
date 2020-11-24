package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportDeclaration
  extends DeclarationStatement
     with JSDocContainer
     with _HasJSDoc {
  
  /** Will not be assigned in the case of `export * from "foo";` */
  val exportClause: js.UndefOr[NamedExportBindings] = js.native
  
  val isTypeOnly: Boolean = js.native
  
  @JSName("kind")
  val kind_ExportDeclaration: typings.typescript.mod.SyntaxKind.ExportDeclaration = js.native
  
  /** If this is not a StringLiteral it will be a grammar error. */
  val moduleSpecifier: js.UndefOr[Expression] = js.native
  
  @JSName("parent")
  val parent_ExportDeclaration: SourceFile | ModuleBlock = js.native
}
