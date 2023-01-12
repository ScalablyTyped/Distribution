package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extension[T] extends StObject {
  
  /**
    * Activates this extension and returns its public API.
    *
    * @return A promise that will resolve when this extension has been activated.
    */
  def activate(): Thenable[T]
  
  /**
    * The public API exported by this extension (return value of `activate`).
    * It is an invalid action to access this field before this extension has been activated.
    */
  val exports: T
  
  /**
    * The extension kind describes if an extension runs where the UI runs
    * or if an extension runs where the remote extension host runs. The extension kind
    * is defined in the `package.json`-file of extensions but can also be refined
    * via the `remote.extensionKind`-setting. When no remote extension host exists,
    * the value is {@linkcode ExtensionKind.UI}.
    */
  var extensionKind: ExtensionKind
  
  /**
    * The absolute file path of the directory containing this extension. Shorthand
    * notation for {@link Extension.extensionUri Extension.extensionUri.fsPath} (independent of the uri scheme).
    */
  val extensionPath: String
  
  /**
    * The uri of the directory containing the extension.
    */
  val extensionUri: Uri
  
  /**
    * The canonical extension identifier in the form of: `publisher.name`.
    */
  val id: String
  
  /**
    * `true` if the extension has been activated.
    */
  val isActive: Boolean
  
  /**
    * The parsed contents of the extension's package.json.
    */
  val packageJSON: Any
}
object Extension {
  
  inline def apply[T](
    activate: () => Thenable[T],
    exports: T,
    extensionKind: ExtensionKind,
    extensionPath: String,
    extensionUri: Uri,
    id: String,
    isActive: Boolean,
    packageJSON: Any
  ): Extension[T] = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), exports = exports.asInstanceOf[js.Any], extensionKind = extensionKind.asInstanceOf[js.Any], extensionPath = extensionPath.asInstanceOf[js.Any], extensionUri = extensionUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], packageJSON = packageJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extension[?], T] (val x: Self & Extension[T]) extends AnyVal {
    
    inline def setActivate(value: () => Thenable[T]): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
    
    inline def setExports(value: T): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExtensionKind(value: ExtensionKind): Self = StObject.set(x, "extensionKind", value.asInstanceOf[js.Any])
    
    inline def setExtensionPath(value: String): Self = StObject.set(x, "extensionPath", value.asInstanceOf[js.Any])
    
    inline def setExtensionUri(value: Uri): Self = StObject.set(x, "extensionUri", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setPackageJSON(value: Any): Self = StObject.set(x, "packageJSON", value.asInstanceOf[js.Any])
  }
}
