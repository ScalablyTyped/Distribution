package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDeclaration
  extends DeclarationStatement
     with JSDocContainer
     with _HasJSDoc {
  /** Will not be assigned in the case of `export * from "foo";` */
  var exportClause: js.UndefOr[NamedExports] = js.native
  /** If this is not a StringLiteral it will be a grammar error. */
  var moduleSpecifier: js.UndefOr[Expression] = js.native
  @JSName("parent")
  var parent_ExportDeclaration: SourceFile | ModuleBlock = js.native
}

