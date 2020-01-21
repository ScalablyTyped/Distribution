package typings.tsutils.utilUtilMod

import typings.tsutils.AnonName
import typings.typescript.mod.BindingElement
import typings.typescript.mod.VariableDeclaration
import typings.typescript.mod.VariableDeclarationList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "forEachDeclaredVariable")
@js.native
object forEachDeclaredVariable extends js.Object {
  def apply[T](
    declarationList: VariableDeclarationList,
    cb: js.Function1[/* element */ (VariableDeclaration | BindingElement) with AnonName, T]
  ): js.UndefOr[T] = js.native
}

