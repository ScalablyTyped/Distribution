package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - import x = require("mod");
  * - import x = M.x;
  */
@js.native
trait ImportEqualsDeclaration
  extends DeclarationStatement
     with JSDocContainer
     with _HasJSDoc {
  @JSName("kind")
  var kind_ImportEqualsDeclaration: typescriptLib.typescriptMod.SyntaxKind.ImportEqualsDeclaration = js.native
  var moduleReference: ModuleReference = js.native
  @JSName("name")
  var name_ImportEqualsDeclaration: Identifier = js.native
  @JSName("parent")
  var parent_ImportEqualsDeclaration: SourceFile | ModuleBlock = js.native
}

