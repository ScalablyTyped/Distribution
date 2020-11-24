package typings.tsutils.utilUtilMod

import typings.typescript.mod.CommentRange
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tsutils/util/util", "getCommentAtPosition")
@js.native
object getCommentAtPosition extends js.Object {
  
  def apply(sourceFile: SourceFile, pos: Double): js.UndefOr[CommentRange] = js.native
  def apply(sourceFile: SourceFile, pos: Double, parent: Node): js.UndefOr[CommentRange] = js.native
}
