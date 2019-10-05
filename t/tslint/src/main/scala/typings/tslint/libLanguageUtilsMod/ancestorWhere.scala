package typings.tslint.libLanguageUtilsMod

import typings.typescript.typescriptMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "ancestorWhere")
@js.native
object ancestorWhere extends js.Object {
  def apply[T /* <: Node */](node: Node, predicate: js.Function1[/* n */ Node, /* is T */ Boolean]): js.UndefOr[T] = js.native
}

