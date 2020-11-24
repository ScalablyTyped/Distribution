package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebviewOptions extends js.Object {
  
  /**
    * Controls whether command uris are enabled in webview content or not.
    *
    * Defaults to false.
    */
  val enableCommandUris: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls whether scripts are enabled in the webview content or not.
    *
    * Defaults to false (scripts-disabled).
    */
  val enableScripts: js.UndefOr[Boolean] = js.native
  
  /**
    * Root paths from which the webview can load local (filesystem) resources using uris from `asWebviewUri`
    *
    * Default to the root folders of the current workspace plus the extension's install directory.
    *
    * Pass in an empty array to disallow access to any local resources.
    */
  val localResourceRoots: js.UndefOr[js.Array[Uri]] = js.native
  
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
  val portMapping: js.UndefOr[js.Array[WebviewPortMapping]] = js.native
}
object WebviewOptions {
  
  @scala.inline
  def apply(): WebviewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebviewOptions]
  }
  
  @scala.inline
  implicit class WebviewOptionsOps[Self <: WebviewOptions] (val x: Self) extends AnyVal {
    
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
    def setEnableCommandUris(value: Boolean): Self = this.set("enableCommandUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCommandUris: Self = this.set("enableCommandUris", js.undefined)
    
    @scala.inline
    def setEnableScripts(value: Boolean): Self = this.set("enableScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableScripts: Self = this.set("enableScripts", js.undefined)
    
    @scala.inline
    def setLocalResourceRootsVarargs(value: Uri*): Self = this.set("localResourceRoots", js.Array(value :_*))
    
    @scala.inline
    def setLocalResourceRoots(value: js.Array[Uri]): Self = this.set("localResourceRoots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalResourceRoots: Self = this.set("localResourceRoots", js.undefined)
    
    @scala.inline
    def setPortMappingVarargs(value: WebviewPortMapping*): Self = this.set("portMapping", js.Array(value :_*))
    
    @scala.inline
    def setPortMapping(value: js.Array[WebviewPortMapping]): Self = this.set("portMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortMapping: Self = this.set("portMapping", js.undefined)
  }
}
