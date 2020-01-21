package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullDeclGroup")
@js.native
class PullDeclGroup protected () extends js.Object {
  def this(name: String) = this()
  var _decls: js.Any = js.native
  var name: String = js.native
  def addDecl(decl: PullDecl): Unit = js.native
  def getDecls(): js.Array[PullDecl] = js.native
}

