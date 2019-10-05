package typings.tsutils.utilUtilMod

import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "forEachComment")
@js.native
object forEachComment extends js.Object {
  def apply(node: Node, cb: ForEachCommentCallback): Unit = js.native
  def apply(node: Node, cb: ForEachCommentCallback, sourceFile: SourceFile): Unit = js.native
}

