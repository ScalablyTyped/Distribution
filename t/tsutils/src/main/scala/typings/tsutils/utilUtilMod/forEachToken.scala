package typings.tsutils.utilUtilMod

import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "forEachToken")
@js.native
object forEachToken extends js.Object {
  def apply(node: Node, cb: js.Function1[/* node */ Node, Unit]): Unit = js.native
  def apply(node: Node, cb: js.Function1[/* node */ Node, Unit], sourceFile: SourceFile): Unit = js.native
}

