package typings
package typescriptLib.typescriptMod.tsNs

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
     with JSDocContainer {
  var moduleReference: ModuleReference = js.native
  @JSName("name")
  var name_ImportEqualsDeclaration: Identifier = js.native
  @JSName("parent")
  var parent_ImportEqualsDeclaration: SourceFile | ModuleBlock = js.native
}

