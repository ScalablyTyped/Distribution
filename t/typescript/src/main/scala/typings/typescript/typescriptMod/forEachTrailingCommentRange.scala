package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "forEachTrailingCommentRange")
@js.native
object forEachTrailingCommentRange extends js.Object {
  def apply[U](
    text: String,
    pos: Double,
    cb: js.Function4[
      /* pos */ Double, 
      /* end */ Double, 
      /* kind */ CommentKind, 
      /* hasTrailingNewLine */ Boolean, 
      U
    ]
  ): js.UndefOr[U] = js.native
  def apply[T, U](
    text: String,
    pos: Double,
    cb: js.Function5[
      /* pos */ Double, 
      /* end */ Double, 
      /* kind */ CommentKind, 
      /* hasTrailingNewLine */ Boolean, 
      /* state */ T, 
      U
    ],
    state: T
  ): js.UndefOr[U] = js.native
}

