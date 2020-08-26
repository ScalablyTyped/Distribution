package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionState extends InstalledExtensionState {
  var extensionName: String = js.native
  /**
    * The time at which the version was last checked
    */
  var lastVersionCheck: Date = js.native
  var publisherName: String = js.native
  var version: String = js.native
}

object ExtensionState {
  @scala.inline
  def apply(
    extensionName: String,
    flags: ExtensionStateFlags,
    installationIssues: js.Array[InstalledExtensionStateIssue],
    lastUpdated: Date,
    lastVersionCheck: Date,
    publisherName: String,
    version: String
  ): ExtensionState = {
    val __obj = js.Dynamic.literal(extensionName = extensionName.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], installationIssues = installationIssues.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionState]
  }
  @scala.inline
  implicit class ExtensionStateOps[Self <: ExtensionState] (val x: Self) extends AnyVal {
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
    def setExtensionName(value: String): Self = this.set("extensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastVersionCheck(value: Date): Self = this.set("lastVersionCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisherName(value: String): Self = this.set("publisherName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

