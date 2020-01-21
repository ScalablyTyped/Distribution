package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebviewOptions extends js.Object {
  /**
  		 * Controls whether command uris are enabled in webview content or not.
  		 *
  		 * Defaults to false.
  		 */
  val enableCommandUris: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Controls whether scripts are enabled in the webview content or not.
  		 *
  		 * Defaults to false (scripts-disabled).
  		 */
  val enableScripts: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Root paths from which the webview can load local (filesystem) resources using the `vscode-resource:` scheme.
  		 *
  		 * Default to the root folders of the current workspace plus the extension's install directory.
  		 *
  		 * Pass in an empty array to disallow access to any local resources.
  		 */
  val localResourceRoots: js.UndefOr[js.Array[Uri]] = js.undefined
  /**
  		 * Mappings of localhost ports used inside the webview.
  		 *
  		 * Port mapping allow webviews to transparently define how localhost ports are resolved. This can be used
  		 * to allow using a static localhost port inside the webview that is resolved to random port that a service is
  		 * running on.
  		 *
  		 * If a webview accesses localhost content, we recommend that you specify port mappings even if
  		 * the `webviewPort` and `extensionHostPort` ports are the same.
  		 *
  		 * *Note* that port mappings only work for `http` or `https` urls. Websocket urls (e.g. `ws://localhost:3000`)
  		 * cannot be mapped to another port.
  		 */
  val portMapping: js.UndefOr[js.Array[WebviewPortMapping]] = js.undefined
}

object WebviewOptions {
  @scala.inline
  def apply(
    enableCommandUris: js.UndefOr[Boolean] = js.undefined,
    enableScripts: js.UndefOr[Boolean] = js.undefined,
    localResourceRoots: js.Array[Uri] = null,
    portMapping: js.Array[WebviewPortMapping] = null
  ): WebviewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableCommandUris)) __obj.updateDynamic("enableCommandUris")(enableCommandUris.asInstanceOf[js.Any])
    if (!js.isUndefined(enableScripts)) __obj.updateDynamic("enableScripts")(enableScripts.asInstanceOf[js.Any])
    if (localResourceRoots != null) __obj.updateDynamic("localResourceRoots")(localResourceRoots.asInstanceOf[js.Any])
    if (portMapping != null) __obj.updateDynamic("portMapping")(portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebviewOptions]
  }
}

