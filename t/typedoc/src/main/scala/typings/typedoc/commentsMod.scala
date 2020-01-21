package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/comments", JSImport.Namespace)
@js.native
object commentsMod extends js.Object {
  @js.native
  class Comment ()
    extends typings.typedoc.commentsCommentMod.Comment {
    def this(shortText: String) = this()
    def this(shortText: String, text: String) = this()
  }
  
  @js.native
  class CommentTag protected ()
    extends typings.typedoc.tagMod.CommentTag {
    def this(tagName: String) = this()
    def this(tagName: String, paramName: String) = this()
    def this(tagName: String, paramName: String, text: String) = this()
  }
  
}

