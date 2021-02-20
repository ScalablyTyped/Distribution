package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension[T] extends StObject {
  
  /**
    * Activates this extension and returns its public API.
    *
    * @return A promise that will resolve when this extension has been activated.
    */
  def activate(): Thenable[T] = js.native
  
  /**
    * The public API exported by this extension. It is an invalid action
    * to access this field before this extension has been activated.
    */
  val exports: T = js.native
  
  /**
    * The extension kind describes if an extension runs where the UI runs
    * or if an extension runs where the remote extension host runs. The extension kind
    * is defined in the `package.json`-file of extensions but can also be refined
    * via the `remote.extensionKind`-setting. When no remote extension host exists,
    * the value is [`ExtensionKind.UI`](#ExtensionKind.UI).
    */
  var extensionKind: ExtensionKind = js.native
  
  /**
    * The absolute file path of the directory containing this extension. Shorthand
    * notation for [Extension.extensionUri.fsPath](#Extension.extensionUri) (independent of the uri scheme).
    */
  val extensionPath: String = js.native
  
  /**
    * The uri of the directory containing the extension.
    */
  val extensionUri: Uri = js.native
  
  /**
    * The canonical extension identifier in the form of: `publisher.name`.
    */
  val id: String = js.native
  
  /**
    * `true` if the extension has been activated.
    */
  val isActive: Boolean = js.native
  
  /**
    * The parsed contents of the extension's package.json.
    */
  val packageJSON: js.Any = js.native
}
object Extension {
  
  @scala.inline
  def apply[T](
    activate: () => Thenable[T],
    exports: T,
    extensionKind: ExtensionKind,
    extensionPath: String,
    extensionUri: Uri,
    id: String,
    isActive: Boolean,
    packageJSON: js.Any
  ): Extension[T] = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), exports = exports.asInstanceOf[js.Any], extensionKind = extensionKind.asInstanceOf[js.Any], extensionPath = extensionPath.asInstanceOf[js.Any], extensionUri = extensionUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], packageJSON = packageJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension[T]]
  }
  
  @scala.inline
  implicit class ExtensionMutableBuilder[Self <: Extension[_], T] (val x: Self with Extension[T]) extends AnyVal {
    
    @scala.inline
    def setActivate(value: () => Thenable[T]): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExports(value: T): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionKind(value: ExtensionKind): Self = StObject.set(x, "extensionKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionPath(value: String): Self = StObject.set(x, "extensionPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUri(value: Uri): Self = StObject.set(x, "extensionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageJSON(value: js.Any): Self = StObject.set(x, "packageJSON", value.asInstanceOf[js.Any])
  }
}
