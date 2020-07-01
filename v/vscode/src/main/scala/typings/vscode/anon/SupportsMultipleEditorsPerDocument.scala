package typings.vscode.anon

import typings.vscode.mod.WebviewPanelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportsMultipleEditorsPerDocument extends js.Object {
  /**
    * Only applies to `CustomReadonlyEditorProvider | CustomEditorProvider`.
    *
    * Indicates that the provider allows multiple editor instances to be open at the same time for
    * the same resource.
    *
    * By default, VS Code only allows one editor instance to be open at a time for each resource. If the
    * user tries to open a second editor instance for the resource, the first one is instead moved to where
    * the second one was to be opened.
    *
    * When `supportsMultipleEditorsPerDocument` is enabled, users can split and create copies of the custom
    * editor. In this case, the custom editor must make sure it can properly synchronize the states of all
    * editor instances for a resource so that they are consistent.
    */
  val supportsMultipleEditorsPerDocument: js.UndefOr[Boolean] = js.undefined
  /**
    * Content settings for the webview panels created for this custom editor.
    */
  val webviewOptions: js.UndefOr[WebviewPanelOptions] = js.undefined
}

object SupportsMultipleEditorsPerDocument {
  @scala.inline
  def apply(
    supportsMultipleEditorsPerDocument: js.UndefOr[Boolean] = js.undefined,
    webviewOptions: WebviewPanelOptions = null
  ): SupportsMultipleEditorsPerDocument = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(supportsMultipleEditorsPerDocument)) __obj.updateDynamic("supportsMultipleEditorsPerDocument")(supportsMultipleEditorsPerDocument.get.asInstanceOf[js.Any])
    if (webviewOptions != null) __obj.updateDynamic("webviewOptions")(webviewOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportsMultipleEditorsPerDocument]
  }
}

