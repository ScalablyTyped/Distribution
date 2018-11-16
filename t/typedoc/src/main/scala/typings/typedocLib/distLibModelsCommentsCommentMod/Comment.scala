package typings
package typedocLib.distLibModelsCommentsCommentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/comments/comment", "Comment")
@js.native
class Comment () extends js.Object {
  def this(shortText: java.lang.String) = this()
  def this(shortText: java.lang.String, text: java.lang.String) = this()
  var returns: java.lang.String = js.native
  var shortText: java.lang.String = js.native
  var tags: js.Array[typedocLib.distLibModelsCommentsTagMod.CommentTag] = js.native
  var text: java.lang.String = js.native
  def copyFrom(comment: Comment): scala.Unit = js.native
  def getTag(tagName: java.lang.String): typedocLib.distLibModelsCommentsTagMod.CommentTag = js.native
  def getTag(tagName: java.lang.String, paramName: java.lang.String): typedocLib.distLibModelsCommentsTagMod.CommentTag = js.native
  def hasTag(tagName: java.lang.String): scala.Boolean = js.native
  def hasVisibleComponent(): scala.Boolean = js.native
  def toObject(): js.Any = js.native
}

