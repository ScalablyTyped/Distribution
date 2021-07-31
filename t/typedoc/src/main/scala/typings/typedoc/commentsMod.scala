package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentsMod {
  
  @JSImport("typedoc/dist/lib/models/comments", "Comment")
  @js.native
  class Comment ()
    extends typings.typedoc.commentsCommentMod.Comment {
    def this(shortText: String) = this()
    def this(shortText: String, text: String) = this()
    def this(shortText: Unit, text: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/comments", "CommentTag")
  @js.native
  class CommentTag protected ()
    extends typings.typedoc.tagMod.CommentTag {
    def this(tagName: String) = this()
    def this(tagName: String, paramName: String) = this()
    def this(tagName: String, paramName: String, text: String) = this()
    def this(tagName: String, paramName: Unit, text: String) = this()
  }
}
