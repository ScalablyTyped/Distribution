package typings
package vscodeLib.vscodeMod

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
  		 * The absolute file path of the directory containing this extension.
  		 */
  val extensionPath: java.lang.String
  /**
  		 * The canonical extension identifier in the form of: `publisher.name`.
  		 */
  val id: java.lang.String
  /**
  		 * `true` if the extension has been activated.
  		 */
  val isActive: scala.Boolean
  /**
  		 * The parsed contents of the extension's package.json.
  		 */
  val packageJSON: js.Any
  /**
  		 * Activates this extension and returns its public API.
  		 *
  		 * @return A promise that will resolve when this extension has been activated.
  		 */
  def activate(): vscodeLib.Thenable[T]
}

object Extension {
  @scala.inline
  def apply[T](
    activate: () => vscodeLib.Thenable[T],
    exports: T,
    extensionPath: java.lang.String,
    id: java.lang.String,
    isActive: scala.Boolean,
    packageJSON: js.Any
  ): Extension[T] = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), exports = exports.asInstanceOf[js.Any], extensionPath = extensionPath, id = id, isActive = isActive, packageJSON = packageJSON)
  
    __obj.asInstanceOf[Extension[T]]
  }
}

