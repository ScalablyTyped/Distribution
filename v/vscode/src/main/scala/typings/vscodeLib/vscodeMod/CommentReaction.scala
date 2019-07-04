package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentReaction extends js.Object {
  /**
  		 * Whether the [author](CommentAuthorInformation) of the comment has reacted to this reaction
  		 */
  val authorHasReacted: scala.Boolean
  /**
  		 * The number of users who have reacted to this reaction
  		 */
  val count: scala.Double
  /**
  		 * Icon for the reaction shown in UI.
  		 */
  val iconPath: java.lang.String | Uri
  /**
  		 * The human-readable label for the reaction
  		 */
  val label: java.lang.String
}

object CommentReaction {
  @scala.inline
  def apply(
    authorHasReacted: scala.Boolean,
    count: scala.Double,
    iconPath: java.lang.String | Uri,
    label: java.lang.String
  ): CommentReaction = {
    val __obj = js.Dynamic.literal(authorHasReacted = authorHasReacted, count = count, iconPath = iconPath.asInstanceOf[js.Any], label = label)
  
    __obj.asInstanceOf[CommentReaction]
  }
}

