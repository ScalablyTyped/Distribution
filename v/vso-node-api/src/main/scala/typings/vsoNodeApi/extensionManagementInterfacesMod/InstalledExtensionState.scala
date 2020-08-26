package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstalledExtensionState extends js.Object {
  /**
    * States of an installed extension
    */
  var flags: ExtensionStateFlags = js.native
  /**
    * List of installation issues
    */
  var installationIssues: js.Array[InstalledExtensionStateIssue] = js.native
  /**
    * The time at which this installation was last updated
    */
  var lastUpdated: Date = js.native
}

object InstalledExtensionState {
  @scala.inline
  def apply(
    flags: ExtensionStateFlags,
    installationIssues: js.Array[InstalledExtensionStateIssue],
    lastUpdated: Date
  ): InstalledExtensionState = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], installationIssues = installationIssues.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtensionState]
  }
  @scala.inline
  implicit class InstalledExtensionStateOps[Self <: InstalledExtensionState] (val x: Self) extends AnyVal {
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
    def setFlags(value: ExtensionStateFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallationIssuesVarargs(value: InstalledExtensionStateIssue*): Self = this.set("installationIssues", js.Array(value :_*))
    @scala.inline
    def setInstallationIssues(value: js.Array[InstalledExtensionStateIssue]): Self = this.set("installationIssues", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdated(value: Date): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
  }
  
}

