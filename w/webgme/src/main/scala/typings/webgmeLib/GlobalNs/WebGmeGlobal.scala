package typings
package webgmeLib.GlobalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGmeGlobal extends js.Object {
  var GitHubVersion: js.UndefOr[java.lang.String] = js.undefined
  var KeyboardManager: js.UndefOr[KeyboardManager] = js.undefined
  var LayoutManager: js.UndefOr[webgmeLib.GmePanelNs.LayoutManager] = js.undefined
  var NpmVersion: js.UndefOr[java.lang.String] = js.undefined
  var PanelManager: js.UndefOr[webgmeLib.GmePanelNs.PanelManager] = js.undefined
  var State: js.UndefOr[State] = js.undefined
  var Toolbar: js.UndefOr[webgmeLib.ToolbarNs.Toolbar] = js.undefined
  var gmeConfig: webgmeLib.GmeConfigNs.GmeConfig
  var history: js.UndefOr[History] = js.undefined
  var userInfo: js.UndefOr[UserInfo] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  def getConfig(): webgmeLib.GmeConfigNs.GmeConfig
}

object WebGmeGlobal {
  @scala.inline
  def apply(
    getConfig: js.Function0[webgmeLib.GmeConfigNs.GmeConfig],
    gmeConfig: webgmeLib.GmeConfigNs.GmeConfig,
    GitHubVersion: java.lang.String = null,
    KeyboardManager: KeyboardManager = null,
    LayoutManager: webgmeLib.GmePanelNs.LayoutManager = null,
    NpmVersion: java.lang.String = null,
    PanelManager: webgmeLib.GmePanelNs.PanelManager = null,
    State: State = null,
    Toolbar: webgmeLib.ToolbarNs.Toolbar = null,
    history: History = null,
    userInfo: UserInfo = null,
    version: java.lang.String = null
  ): WebGmeGlobal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getConfig")(getConfig)
    __obj.updateDynamic("gmeConfig")(gmeConfig)
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

