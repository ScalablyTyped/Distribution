package typings
package vscodeLib.vscodeMod

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
  var commitTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The UI-visible count of [resource states](#SourceControlResourceState) of
  		 * this source control.
  		 *
  		 * Equals to the total number of [resource state](#SourceControlResourceState)
  		 * of this source control, if undefined.
  		 */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * The id of this source control.
  		 */
  val id: java.lang.String
  /**
  		 * The human-readable label of this source control.
  		 */
  val label: java.lang.String
  /**
  		 * An optional [quick diff provider](#QuickDiffProvider).
  		 */
  var quickDiffProvider: js.UndefOr[QuickDiffProvider] = js.undefined
  /**
  		 * Optional status bar commands.
  		 *
  		 * These commands will be displayed in the editor's status bar.
  		 */
  var statusBarCommands: js.UndefOr[js.Array[Command]] = js.undefined
  /**
  		 * Create a new [resource group](#SourceControlResourceGroup).
  		 */
  def createResourceGroup(id: java.lang.String, label: java.lang.String): SourceControlResourceGroup
  /**
  		 * Dispose this source control.
  		 */
  def dispose(): scala.Unit
}

object SourceControl {
  @scala.inline
  def apply(
    createResourceGroup: (java.lang.String, java.lang.String) => SourceControlResourceGroup,
    dispose: () => scala.Unit,
    id: java.lang.String,
    label: java.lang.String,
    acceptInputCommand: Command = null,
    commitTemplate: java.lang.String = null,
    count: scala.Int | scala.Double = null,
    quickDiffProvider: QuickDiffProvider = null,
    statusBarCommands: js.Array[Command] = null
  ): SourceControl = {
    val __obj = js.Dynamic.literal(createResourceGroup = js.Any.fromFunction2(createResourceGroup), dispose = js.Any.fromFunction0(dispose), id = id, label = label)
    if (acceptInputCommand != null) __obj.updateDynamic("acceptInputCommand")(acceptInputCommand)
    if (commitTemplate != null) __obj.updateDynamic("commitTemplate")(commitTemplate)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (quickDiffProvider != null) __obj.updateDynamic("quickDiffProvider")(quickDiffProvider)
    if (statusBarCommands != null) __obj.updateDynamic("statusBarCommands")(statusBarCommands)
    __obj.asInstanceOf[SourceControl]
  }
}

