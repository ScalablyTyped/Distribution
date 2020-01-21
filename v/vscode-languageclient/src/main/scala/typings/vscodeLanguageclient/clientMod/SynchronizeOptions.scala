package typings.vscodeLanguageclient.clientMod

import typings.vscode.mod.FileSystemWatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynchronizeOptions extends js.Object {
  /**
    * The configuration sections to synchronize. Pushing settings from the
    * client to the server is deprecated in favour of the new pull model
    * that allows servers to query settings scoped on resources. In this
    * model the client can only deliver an empty change event since the
    * actually setting value can vary on the provided resource scope.
    *
    * @deprecated Use the new pull model (`workspace/configuration` request)
    */
  var configurationSection: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    *
    */
  var fileEvents: js.UndefOr[FileSystemWatcher | js.Array[FileSystemWatcher]] = js.undefined
}

object SynchronizeOptions {
  @scala.inline
  def apply(
    configurationSection: String | js.Array[String] = null,
    fileEvents: FileSystemWatcher | js.Array[FileSystemWatcher] = null
  ): SynchronizeOptions = {
    val __obj = js.Dynamic.literal()
    if (configurationSection != null) __obj.updateDynamic("configurationSection")(configurationSection.asInstanceOf[js.Any])
    if (fileEvents != null) __obj.updateDynamic("fileEvents")(fileEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynchronizeOptions]
  }
}

