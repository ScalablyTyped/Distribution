package typings.typedoc

import typings.typedoc.distLibModelsCommentsTagMod.CommentTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/comments/comment", JSImport.Namespace)
@js.native
object distLibModelsCommentsCommentMod extends js.Object {
  @js.native
  class Comment () extends js.Object {
    def this(shortText: String) = this()
    def this(shortText: String, text: String) = this()
    var returns: js.UndefOr[String] = js.native
    var shortText: String = js.native
    var tags: js.UndefOr[js.Array[CommentTag]] = js.native
    var text: String = js.native
    def copyFrom(comment: Comment): Unit = js.native
    def getTag(tagName: String): js.UndefOr[CommentTag] = js.native
    def getTag(tagName: String, paramName: String): js.UndefOr[CommentTag] = js.native
    def hasTag(tagName: String): Boolean = js.native
    def hasVisibleComponent(): Boolean = js.native
    def toObject(): js.Any = js.native
  }
  
}

