package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebviewOptions extends js.Object {
  /**
  		 * Controls whether command uris are enabled in webview content or not.
  		 *
  		 * Defaults to false.
  		 */
  val enableCommandUris: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Controls whether scripts are enabled in the webview content or not.
  		 *
  		 * Defaults to false (scripts-disabled).
  		 */
  val enableScripts: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Root paths from which the webview can load local (filesystem) resources using the `vscode-resource:` scheme.
  		 *
  		 * Default to the root folders of the current workspace plus the extension's install directory.
  		 *
  		 * Pass in an empty array to disallow access to any local resources.
  		 */
  val localResourceRoots: js.UndefOr[js.Array[Uri]] = js.undefined
}

object WebviewOptions {
  @scala.inline
  def apply(
    enableCommandUris: js.UndefOr[scala.Boolean] = js.undefined,
    enableScripts: js.UndefOr[scala.Boolean] = js.undefined,
    localResourceRoots: js.Array[Uri] = null
  ): WebviewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableCommandUris)) __obj.updateDynamic("enableCommandUris")(enableCommandUris)
    if (!js.isUndefined(enableScripts)) __obj.updateDynamic("enableScripts")(enableScripts)
    if (localResourceRoots != null) __obj.updateDynamic("localResourceRoots")(localResourceRoots)
    __obj.asInstanceOf[WebviewOptions]
  }
}

