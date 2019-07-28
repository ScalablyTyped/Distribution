package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentReaction extends js.Object {
  /**
  		 * Whether the [author](CommentAuthorInformation) of the comment has reacted to this reaction
  		 */
  val authorHasReacted: Boolean
  /**
  		 * The number of users who have reacted to this reaction
  		 */
  val count: Double
  /**
  		 * Icon for the reaction shown in UI.
  		 */
  val iconPath: String | Uri
  /**
  		 * The human-readable label for the reaction
  		 */
  val label: String
}

object CommentReaction {
  @scala.inline
  def apply(authorHasReacted: Boolean, count: Double, iconPath: String | Uri, label: String): CommentReaction = {
    val __obj = js.Dynamic.literal(authorHasReacted = authorHasReacted, count = count, iconPath = iconPath.asInstanceOf[js.Any], label = label)
  
    __obj.asInstanceOf[CommentReaction]
  }
}

