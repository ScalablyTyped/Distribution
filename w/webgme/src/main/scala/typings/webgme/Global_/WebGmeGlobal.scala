package typings.webgme.Global_

import typings.webgme.GmeConfig.GmeConfig
import typings.webgme.GmePanel.LayoutManager
import typings.webgme.GmePanel.PanelManager
import typings.webgme.Toolbar.Toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGmeGlobal extends js.Object {
  var GitHubVersion: js.UndefOr[String] = js.undefined
  var KeyboardManager: js.UndefOr[typings.webgme.Global_.KeyboardManager] = js.undefined
  var LayoutManager: js.UndefOr[typings.webgme.GmePanel.LayoutManager] = js.undefined
  var NpmVersion: js.UndefOr[String] = js.undefined
  var PanelManager: js.UndefOr[typings.webgme.GmePanel.PanelManager] = js.undefined
  var State: js.UndefOr[typings.webgme.Global_.State] = js.undefined
  var Toolbar: js.UndefOr[typings.webgme.Toolbar.Toolbar] = js.undefined
  var gmeConfig: GmeConfig
  var history: js.UndefOr[History] = js.undefined
  var userInfo: js.UndefOr[UserInfo] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  def getConfig(): GmeConfig
}

object WebGmeGlobal {
  @scala.inline
  def apply(
    getConfig: () => GmeConfig,
    gmeConfig: GmeConfig,
    GitHubVersion: String = null,
    KeyboardManager: KeyboardManager = null,
    LayoutManager: LayoutManager = null,
    NpmVersion: String = null,
    PanelManager: PanelManager = null,
    State: State = null,
    Toolbar: Toolbar = null,
    history: History = null,
    userInfo: UserInfo = null,
    version: String = null
  ): WebGmeGlobal = {
    val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), gmeConfig = gmeConfig.asInstanceOf[js.Any])
    if (GitHubVersion != null) __obj.updateDynamic("GitHubVersion")(GitHubVersion.asInstanceOf[js.Any])
    if (KeyboardManager != null) __obj.updateDynamic("KeyboardManager")(KeyboardManager.asInstanceOf[js.Any])
    if (LayoutManager != null) __obj.updateDynamic("LayoutManager")(LayoutManager.asInstanceOf[js.Any])
    if (NpmVersion != null) __obj.updateDynamic("NpmVersion")(NpmVersion.asInstanceOf[js.Any])
    if (PanelManager != null) __obj.updateDynamic("PanelManager")(PanelManager.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Toolbar != null) __obj.updateDynamic("Toolbar")(Toolbar.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGmeGlobal]
  }
}

