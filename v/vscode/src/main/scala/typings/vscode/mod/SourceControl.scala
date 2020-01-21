package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceControl extends js.Object {
  /**
  		 * Optional accept input command.
  		 *
  		 * This command will be invoked when the user accepts the value
  		 * in the Source Control input.
  		 */
  var acceptInputCommand: js.UndefOr[Command] = js.undefined
  /**
  		 * Optional commit template string.
  		 *
  		 * The Source Control viewlet will populate the Source Control
  		 * input with this value when appropriate.
  		 */
  var commitTemplate: js.UndefOr[String] = js.undefined
  /**
  		 * The UI-visible count of [resource states](#SourceControlResourceState) of
  		 * this source control.
  		 *
  		 * Equals to the total number of [resource state](#SourceControlResourceState)
  		 * of this source control, if undefined.
  		 */
  var count: js.UndefOr[Double] = js.undefined
  /**
  		 * The id of this source control.
  		 */
  val id: String
  /**
  		 * The [input box](#SourceControlInputBox) for this source control.
  		 */
  val inputBox: SourceControlInputBox
  /**
  		 * The human-readable label of this source control.
  		 */
  val label: String
  /**
  		 * An optional [quick diff provider](#QuickDiffProvider).
  		 */
  var quickDiffProvider: js.UndefOr[QuickDiffProvider] = js.undefined
  /**
  		 * The (optional) Uri of the root of this source control.
  		 */
  val rootUri: js.UndefOr[Uri] = js.undefined
  /**
  		 * Optional status bar commands.
  		 *
  		 * These commands will be displayed in the editor's status bar.
  		 */
  var statusBarCommands: js.UndefOr[js.Array[Command]] = js.undefined
  /**
  		 * Create a new [resource group](#SourceControlResourceGroup).
  		 */
  def createResourceGroup(id: String, label: String): SourceControlResourceGroup
  /**
  		 * Dispose this source control.
  		 */
  def dispose(): Unit
}

object SourceControl {
  @scala.inline
  def apply(
    createResourceGroup: (String, String) => SourceControlResourceGroup,
    dispose: () => Unit,
    id: String,
    inputBox: SourceControlInputBox,
    label: String,
    acceptInputCommand: Command = null,
    commitTemplate: String = null,
    count: Int | Double = null,
    quickDiffProvider: QuickDiffProvider = null,
    rootUri: Uri = null,
    statusBarCommands: js.Array[Command] = null
  ): SourceControl = {
    val __obj = js.Dynamic.literal(createResourceGroup = js.Any.fromFunction2(createResourceGroup), dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], inputBox = inputBox.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (acceptInputCommand != null) __obj.updateDynamic("acceptInputCommand")(acceptInputCommand.asInstanceOf[js.Any])
    if (commitTemplate != null) __obj.updateDynamic("commitTemplate")(commitTemplate.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (quickDiffProvider != null) __obj.updateDynamic("quickDiffProvider")(quickDiffProvider.asInstanceOf[js.Any])
    if (rootUri != null) __obj.updateDynamic("rootUri")(rootUri.asInstanceOf[js.Any])
    if (statusBarCommands != null) __obj.updateDynamic("statusBarCommands")(statusBarCommands.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControl]
  }
}

