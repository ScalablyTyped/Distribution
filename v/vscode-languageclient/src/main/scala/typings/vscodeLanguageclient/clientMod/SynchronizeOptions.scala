package typings.vscodeLanguageclient.clientMod

import typings.vscode.mod.FileSystemWatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var configurationSection: js.UndefOr[String | js.Array[String]] = js.native
  /**
    *
    */
  var fileEvents: js.UndefOr[FileSystemWatcher | js.Array[FileSystemWatcher]] = js.native
}

object SynchronizeOptions {
  @scala.inline
  def apply(): SynchronizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizeOptions]
  }
  @scala.inline
  implicit class SynchronizeOptionsOps[Self <: SynchronizeOptions] (val x: Self) extends AnyVal {
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
    def setConfigurationSectionVarargs(value: String*): Self = this.set("configurationSection", js.Array(value :_*))
    @scala.inline
    def setConfigurationSection(value: String | js.Array[String]): Self = this.set("configurationSection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationSection: Self = this.set("configurationSection", js.undefined)
    @scala.inline
    def setFileEventsVarargs(value: FileSystemWatcher*): Self = this.set("fileEvents", js.Array(value :_*))
    @scala.inline
    def setFileEvents(value: FileSystemWatcher | js.Array[FileSystemWatcher]): Self = this.set("fileEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileEvents: Self = this.set("fileEvents", js.undefined)
  }
  
}

