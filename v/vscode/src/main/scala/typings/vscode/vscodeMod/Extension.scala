package typings.vscode.vscodeMod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension[T] extends js.Object {
  /**
  		 * The public API exported by this extension. It is an invalid action
  		 * to access this field before this extension has been activated.
  		 */
  val exports: T
  /**
  		 * The extension kind describes if an extension runs where the UI runs
  		 * or if an extension runs where the remote extension host runs. The extension kind
  		 * is defined in the `package.json`-file of extensions but can also be refined
  		 * via the `remote.extensionKind`-setting. When no remote extension host exists,
  		 * the value is [`ExtensionKind.UI`](#ExtensionKind.UI).
  		 */
  var extensionKind: ExtensionKind
  /**
  		 * The absolute file path of the directory containing this extension.
  		 */
  val extensionPath: String
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
  val packageJSON: js.Any
  /**
  		 * Activates this extension and returns its public API.
  		 *
  		 * @return A promise that will resolve when this extension has been activated.
  		 */
  def activate(): Thenable[T]
}

object Extension {
  @scala.inline
  def apply[T](
    activate: () => Thenable[T],
    exports: T,
    extensionKind: ExtensionKind,
    extensionPath: String,
    id: String,
    isActive: Boolean,
    packageJSON: js.Any
  ): Extension[T] = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), exports = exports.asInstanceOf[js.Any], extensionKind = extensionKind.asInstanceOf[js.Any], extensionPath = extensionPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], packageJSON = packageJSON.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Extension[T]]
  }
}

