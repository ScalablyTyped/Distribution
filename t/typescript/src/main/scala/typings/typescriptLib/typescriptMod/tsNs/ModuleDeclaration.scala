package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleDeclaration
  extends DeclarationStatement
     with JSDocContainer {
  var body: js.UndefOr[ModuleBody | JSDocNamespaceDeclaration] = js.native
  @JSName("name")
  var name_ModuleDeclaration: ModuleName = js.native
  @JSName("parent")
  var parent_ModuleDeclaration: ModuleBody | SourceFile = js.native
}

