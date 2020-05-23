package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullDeclGroup extends js.Object {
  var _decls: js.Any
  var name: String
  def addDecl(decl: PullDecl): Unit
  def getDecls(): js.Array[PullDecl]
}

object PullDeclGroup {
  @scala.inline
  def apply(_decls: js.Any, addDecl: PullDecl => Unit, getDecls: () => js.Array[PullDecl], name: String): PullDeclGroup = {
    val __obj = js.Dynamic.literal(_decls = _decls.asInstanceOf[js.Any], addDecl = js.Any.fromFunction1(addDecl), getDecls = js.Any.fromFunction0(getDecls), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullDeclGroup]
  }
}

