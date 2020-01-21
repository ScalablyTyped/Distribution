package typings.tsutils.utilUtilMod

import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "forEachToken")
@js.native
object forEachToken extends js.Object {
  def apply(node: Node, cb: js.Function1[/* node */ Node, Unit]): Unit = js.native
  def apply(node: Node, cb: js.Function1[/* node */ Node, Unit], sourceFile: SourceFile): Unit = js.native
}

