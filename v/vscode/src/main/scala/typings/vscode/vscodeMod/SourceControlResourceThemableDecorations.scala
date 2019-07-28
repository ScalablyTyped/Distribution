package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceControlResourceThemableDecorations extends js.Object {
  /**
  		 * The icon path for a specific
  		 * [source control resource state](#SourceControlResourceState).
  		 */
  val iconPath: js.UndefOr[String | Uri] = js.undefined
}

object SourceControlResourceThemableDecorations {
  @scala.inline
  def apply(iconPath: String | Uri = null): SourceControlResourceThemableDecorations = {
    val __obj = js.Dynamic.literal()
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlResourceThemableDecorations]
  }
}

