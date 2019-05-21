package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionContext extends js.Object {
  /**
  		 * The absolute file path of the directory containing the extension.
  		 */
  var extensionPath: java.lang.String
  /**
  		 * A memento object that stores state independent
  		 * of the current opened [workspace](#workspace.workspaceFolders).
  		 */
  var globalState: Memento
  /**
  		 * An absolute file path in which the extension can store global state.
  		 * The directory might not exist on disk and creation is
  		 * up to the extension. However, the parent directory is guaranteed to be existent.
  		 *
  		 * Use [`globalState`](#ExtensionContext.globalState) to store key value data.
  		 */
  var globalStoragePath: java.lang.String
  /**
  		 * An absolute file path of a directory in which the extension can create log files.
  		 * The directory might not exist on disk and creation is up to the extension. However,
  		 * the parent directory is guaranteed to be existent.
  		 */
  var logPath: java.lang.String
  /**
  		 * An absolute file path of a workspace specific directory in which the extension
  		 * can store private state. The directory might not exist on disk and creation is
  		 * up to the extension. However, the parent directory is guaranteed to be existent.
  		 *
  		 * Use [`workspaceState`](#ExtensionContext.workspaceState) or
  		 * [`globalState`](#ExtensionContext.globalState) to store key value data.
  		 */
  var storagePath: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * An array to which disposables can be added. When this
  		 * extension is deactivated the disposables will be disposed.
  		 */
  var subscriptions: js.Array[vscodeLib.Anon_Dispose]
  /**
  		 * A memento object that stores state in the context
  		 * of the currently opened [workspace](#workspace.workspaceFolders).
  		 */
  var workspaceState: Memento
  /**
  		 * Get the absolute path of a resource contained in the extension.
  		 *
  		 * @param relativePath A relative path to a resource contained in the extension.
  		 * @return The absolute path of the resource.
  		 */
  def asAbsolutePath(relativePath: java.lang.String): java.lang.String
}

object ExtensionContext {
  @scala.inline
  def apply(
    asAbsolutePath: java.lang.String => java.lang.String,
    extensionPath: java.lang.String,
    globalState: Memento,
    globalStoragePath: java.lang.String,
    logPath: java.lang.String,
    subscriptions: js.Array[vscodeLib.Anon_Dispose],
    workspaceState: Memento,
    storagePath: java.lang.String = null
  ): ExtensionContext = {
    val __obj = js.Dynamic.literal(asAbsolutePath = js.Any.fromFunction1(asAbsolutePath), extensionPath = extensionPath, globalState = globalState, globalStoragePath = globalStoragePath, logPath = logPath, subscriptions = subscriptions, workspaceState = workspaceState)
    if (storagePath != null) __obj.updateDynamic("storagePath")(storagePath)
    __obj.asInstanceOf[ExtensionContext]
  }
}

