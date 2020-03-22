package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CommentRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getTrailingCommentRanges")
@js.native
object getTrailingCommentRanges extends js.Object {
  def apply(text: String, pos: Double): js.UndefOr[js.Array[CommentRange]] = js.native
}

