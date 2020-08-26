package typings.tsutils.utilUtilMod

import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "getTokenAtPosition")
@js.native
object getTokenAtPosition extends js.Object {
  def apply(parent: Node, pos: Double): js.UndefOr[Node] = js.native
  def apply(parent: Node, pos: Double, sourceFile: js.UndefOr[scala.Nothing], allowJsDoc: Boolean): js.UndefOr[Node] = js.native
  def apply(parent: Node, pos: Double, sourceFile: SourceFile): js.UndefOr[Node] = js.native
  def apply(parent: Node, pos: Double, sourceFile: SourceFile, allowJsDoc: Boolean): js.UndefOr[Node] = js.native
}

