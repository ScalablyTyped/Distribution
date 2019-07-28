package typings.webgme.GlobalNs

import typings.webgme.GmeConfigNs.GmeConfig
import typings.webgme.GmePanelNs.LayoutManager
import typings.webgme.GmePanelNs.PanelManager
import typings.webgme.ToolbarNs.Toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGmeGlobal extends js.Object {
  var GitHubVersion: js.UndefOr[String] = js.undefined
  var KeyboardManager: js.UndefOr[typings.webgme.GlobalNs.KeyboardManager] = js.undefined
  var LayoutManager: js.UndefOr[typings.webgme.GmePanelNs.LayoutManager] = js.undefined
  var NpmVersion: js.UndefOr[String] = js.undefined
  var PanelManager: js.UndefOr[typings.webgme.GmePanelNs.PanelManager] = js.undefined
  var State: js.UndefOr[typings.webgme.GlobalNs.State] = js.undefined
  var Toolbar: js.UndefOr[typings.webgme.ToolbarNs.Toolbar] = js.undefined
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
    val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), gmeConfig = gmeConfig)
    if (GitHubVersion != null) __obj.updateDynamic("GitHubVersion")(GitHubVersion)
    if (KeyboardManager != null) __obj.updateDynamic("KeyboardManager")(KeyboardManager)
    if (LayoutManager != null) __obj.updateDynamic("LayoutManager")(LayoutManager)
    if (NpmVersion != null) __obj.updateDynamic("NpmVersion")(NpmVersion)
    if (PanelManager != null) __obj.updateDynamic("PanelManager")(PanelManager)
    if (State != null) __obj.updateDynamic("State")(State)
    if (Toolbar != null) __obj.updateDynamic("Toolbar")(Toolbar)
    if (history != null) __obj.updateDynamic("history")(history)
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[WebGmeGlobal]
  }
}

