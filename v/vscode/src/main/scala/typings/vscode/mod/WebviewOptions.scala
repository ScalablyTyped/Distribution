package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebviewOptions extends StObject {
  
  /**
  		 * Controls whether command uris are enabled in webview content or not.
  		 *
  		 * Defaults to `false` (command uris are disabled).
  		 *
  		 * If you pass in an array, only the commands in the array are allowed.
  		 */
  val enableCommandUris: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  /**
  		 * Controls whether forms are enabled in the webview content or not.
  		 *
  		 * Defaults to true if {@link WebviewOptions.enableScripts scripts are enabled}. Otherwise defaults to false.
  		 * Explicitly setting this property to either true or false overrides the default.
  		 */
  val enableForms: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Controls whether scripts are enabled in the webview content or not.
  		 *
  		 * Defaults to false (scripts-disabled).
  		 */
  val enableScripts: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Root paths from which the webview can load local (filesystem) resources using uris from `asWebviewUri`
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
  
  inline def apply(): WebviewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebviewOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebviewOptions] (val x: Self) extends AnyVal {
    
    inline def setEnableCommandUris(value: Boolean | js.Array[String]): Self = StObject.set(x, "enableCommandUris", value.asInstanceOf[js.Any])
    
    inline def setEnableCommandUrisUndefined: Self = StObject.set(x, "enableCommandUris", js.undefined)
    
    inline def setEnableCommandUrisVarargs(value: String*): Self = StObject.set(x, "enableCommandUris", js.Array(value*))
    
    inline def setEnableForms(value: Boolean): Self = StObject.set(x, "enableForms", value.asInstanceOf[js.Any])
    
    inline def setEnableFormsUndefined: Self = StObject.set(x, "enableForms", js.undefined)
    
    inline def setEnableScripts(value: Boolean): Self = StObject.set(x, "enableScripts", value.asInstanceOf[js.Any])
    
    inline def setEnableScriptsUndefined: Self = StObject.set(x, "enableScripts", js.undefined)
    
    inline def setLocalResourceRoots(value: js.Array[Uri]): Self = StObject.set(x, "localResourceRoots", value.asInstanceOf[js.Any])
    
    inline def setLocalResourceRootsUndefined: Self = StObject.set(x, "localResourceRoots", js.undefined)
    
    inline def setLocalResourceRootsVarargs(value: Uri*): Self = StObject.set(x, "localResourceRoots", js.Array(value*))
    
    inline def setPortMapping(value: js.Array[WebviewPortMapping]): Self = StObject.set(x, "portMapping", value.asInstanceOf[js.Any])
    
    inline def setPortMappingUndefined: Self = StObject.set(x, "portMapping", js.undefined)
    
    inline def setPortMappingVarargs(value: WebviewPortMapping*): Self = StObject.set(x, "portMapping", js.Array(value*))
  }
}
