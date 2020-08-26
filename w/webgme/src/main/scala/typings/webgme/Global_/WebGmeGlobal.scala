package typings.webgme.Global_

import typings.webgme.GmeConfig.GmeConfig
import typings.webgme.GmePanel.LayoutManager
import typings.webgme.GmePanel.PanelManager
import typings.webgme.Toolbar.Toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGmeGlobal extends js.Object {
  var GitHubVersion: js.UndefOr[String] = js.native
  var KeyboardManager: js.UndefOr[typings.webgme.Global_.KeyboardManager] = js.native
  var LayoutManager: js.UndefOr[typings.webgme.GmePanel.LayoutManager] = js.native
  var NpmVersion: js.UndefOr[String] = js.native
  var PanelManager: js.UndefOr[typings.webgme.GmePanel.PanelManager] = js.native
  var State: js.UndefOr[typings.webgme.Global_.State] = js.native
  var Toolbar: js.UndefOr[typings.webgme.Toolbar.Toolbar] = js.native
  var gmeConfig: GmeConfig = js.native
  var history: js.UndefOr[History] = js.native
  var userInfo: js.UndefOr[UserInfo] = js.native
  var version: js.UndefOr[String] = js.native
  def getConfig(): GmeConfig = js.native
}

object WebGmeGlobal {
  @scala.inline
  def apply(getConfig: () => GmeConfig, gmeConfig: GmeConfig): WebGmeGlobal = {
    val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), gmeConfig = gmeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGmeGlobal]
  }
  @scala.inline
  implicit class WebGmeGlobalOps[Self <: WebGmeGlobal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetConfig(value: () => GmeConfig): Self = this.set("getConfig", js.Any.fromFunction0(value))
    @scala.inline
    def setGmeConfig(value: GmeConfig): Self = this.set("gmeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setGitHubVersion(value: String): Self = this.set("GitHubVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitHubVersion: Self = this.set("GitHubVersion", js.undefined)
    @scala.inline
    def setKeyboardManager(value: KeyboardManager): Self = this.set("KeyboardManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardManager: Self = this.set("KeyboardManager", js.undefined)
    @scala.inline
    def setLayoutManager(value: LayoutManager): Self = this.set("LayoutManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutManager: Self = this.set("LayoutManager", js.undefined)
    @scala.inline
    def setNpmVersion(value: String): Self = this.set("NpmVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNpmVersion: Self = this.set("NpmVersion", js.undefined)
    @scala.inline
    def setPanelManager(value: PanelManager): Self = this.set("PanelManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanelManager: Self = this.set("PanelManager", js.undefined)
    @scala.inline
    def setState(value: State): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setToolbar(value: Toolbar): Self = this.set("Toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("Toolbar", js.undefined)
    @scala.inline
    def setHistory(value: History): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setUserInfo(value: UserInfo): Self = this.set("userInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserInfo: Self = this.set("userInfo", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

