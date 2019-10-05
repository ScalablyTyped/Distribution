package typings.tslint.libLanguageUtilsMod

import typings.typescript.typescriptMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "forEachToken")
@js.native
object forEachToken extends js.Object {
  def apply(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback): Unit = js.native
  def apply(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback, filter: FilterCallback): Unit = js.native
}

