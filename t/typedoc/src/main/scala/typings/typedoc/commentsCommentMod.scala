package typings.typedoc

import typings.typedoc.tagMod.CommentTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentsCommentMod {
  
  @JSImport("typedoc/dist/lib/models/comments/comment", "Comment")
  @js.native
  class Comment () extends StObject {
    def this(shortText: String) = this()
    def this(shortText: js.UndefOr[scala.Nothing], text: String) = this()
    def this(shortText: String, text: String) = this()
    
    def copyFrom(comment: Comment): Unit = js.native
    
    def getTag(tagName: String): js.UndefOr[CommentTag] = js.native
    def getTag(tagName: String, paramName: String): js.UndefOr[CommentTag] = js.native
    
    def hasTag(tagName: String): Boolean = js.native
    
    def hasVisibleComponent(): Boolean = js.native
    
    def removeTags(tagName: String): Unit = js.native
    
    var returns: js.UndefOr[String] = js.native
    
    var shortText: String = js.native
    
    var tags: js.UndefOr[js.Array[CommentTag]] = js.native
    
    var text: String = js.native
  }
}
