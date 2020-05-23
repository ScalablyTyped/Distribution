package typings.vscode.mod

import typings.vscode.anon.Dark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceEditEntryMetadata extends js.Object {
  /**
    * A human-readable string which is rendered less prominent on the same line.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The icon path or [ThemeIcon](#ThemeIcon) for the edit.
    */
  var iconPath: js.UndefOr[Uri | Dark | ThemeIcon] = js.undefined
  /**
    * A human-readable string which is rendered prominent.
    */
  var label: String
  /**
    * A flag which indicates that user confirmation is needed.
    */
  var needsConfirmation: Boolean
}

object WorkspaceEditEntryMetadata {
  @scala.inline
  def apply(
    label: String,
    needsConfirmation: Boolean,
    description: String = null,
    iconPath: Uri | Dark | ThemeIcon = null
  ): WorkspaceEditEntryMetadata = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], needsConfirmation = needsConfirmation.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceEditEntryMetadata]
  }
}

