package typings.tslint.mod

import typings.tslint.utilsMod.FilterCallback
import typings.tslint.utilsMod.ForEachTokenCallback
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "forEachToken")
@js.native
object forEachToken extends js.Object {
  def apply(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback): Unit = js.native
  def apply(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback, filter: FilterCallback): Unit = js.native
}

