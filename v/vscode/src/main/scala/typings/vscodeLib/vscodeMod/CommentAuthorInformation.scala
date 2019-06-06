package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentAuthorInformation extends js.Object {
  /**
  		 * The optional icon path for the author
  		 */
  var iconPath: js.UndefOr[Uri] = js.undefined
  /**
  		 * The display name of the author of the comment
  		 */
  var name: java.lang.String
}

object CommentAuthorInformation {
  @scala.inline
  def apply(name: java.lang.String, iconPath: Uri = null): CommentAuthorInformation = {
    val __obj = js.Dynamic.literal(name = name)
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath)
    __obj.asInstanceOf[CommentAuthorInformation]
  }
}

