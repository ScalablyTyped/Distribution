package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceControl extends js.Object {
  /**
    * Optional accept input command.
    *
    * This command will be invoked when the user accepts the value
    * in the Source Control input.
    */
  var acceptInputCommand: js.UndefOr[Command] = js.native
  /**
    * Optional commit template string.
    *
    * The Source Control viewlet will populate the Source Control
    * input with this value when appropriate.
    */
  var commitTemplate: js.UndefOr[String] = js.native
  /**
    * The UI-visible count of [resource states](#SourceControlResourceState) of
    * this source control.
    *
    * Equals to the total number of [resource state](#SourceControlResourceState)
    * of this source control, if undefined.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * The id of this source control.
    */
  val id: String = js.native
  /**
    * The [input box](#SourceControlInputBox) for this source control.
    */
  val inputBox: SourceControlInputBox = js.native
  /**
    * The human-readable label of this source control.
    */
  val label: String = js.native
  /**
    * An optional [quick diff provider](#QuickDiffProvider).
    */
  var quickDiffProvider: js.UndefOr[QuickDiffProvider] = js.native
  /**
    * The (optional) Uri of the root of this source control.
    */
  val rootUri: js.UndefOr[Uri] = js.native
  /**
    * Optional status bar commands.
    *
    * These commands will be displayed in the editor's status bar.
    */
  var statusBarCommands: js.UndefOr[js.Array[Command]] = js.native
  /**
    * Create a new [resource group](#SourceControlResourceGroup).
    */
  def createResourceGroup(id: String, label: String): SourceControlResourceGroup = js.native
  /**
    * Dispose this source control.
    */
  def dispose(): Unit = js.native
}

object SourceControl {
  @scala.inline
  def apply(
    createResourceGroup: (String, String) => SourceControlResourceGroup,
    dispose: () => Unit,
    id: String,
    inputBox: SourceControlInputBox,
    label: String
  ): SourceControl = {
    val __obj = js.Dynamic.literal(createResourceGroup = js.Any.fromFunction2(createResourceGroup), dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], inputBox = inputBox.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControl]
  }
  @scala.inline
  implicit class SourceControlOps[Self <: SourceControl] (val x: Self) extends AnyVal {
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
    def setCreateResourceGroup(value: (String, String) => SourceControlResourceGroup): Self = this.set("createResourceGroup", js.Any.fromFunction2(value))
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputBox(value: SourceControlInputBox): Self = this.set("inputBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptInputCommand(value: Command): Self = this.set("acceptInputCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptInputCommand: Self = this.set("acceptInputCommand", js.undefined)
    @scala.inline
    def setCommitTemplate(value: String): Self = this.set("commitTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitTemplate: Self = this.set("commitTemplate", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setQuickDiffProvider(value: QuickDiffProvider): Self = this.set("quickDiffProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuickDiffProvider: Self = this.set("quickDiffProvider", js.undefined)
    @scala.inline
    def setRootUri(value: Uri): Self = this.set("rootUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootUri: Self = this.set("rootUri", js.undefined)
    @scala.inline
    def setStatusBarCommandsVarargs(value: Command*): Self = this.set("statusBarCommands", js.Array(value :_*))
    @scala.inline
    def setStatusBarCommands(value: js.Array[Command]): Self = this.set("statusBarCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarCommands: Self = this.set("statusBarCommands", js.undefined)
  }
  
}

