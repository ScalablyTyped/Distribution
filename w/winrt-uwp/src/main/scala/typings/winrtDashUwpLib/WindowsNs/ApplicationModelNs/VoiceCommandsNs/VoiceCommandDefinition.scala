package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables operations on a specific installed command set. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinition")
@js.native
abstract class VoiceCommandDefinition () extends js.Object {
  /** Gets the language ( xml:lang ) value of the CommandSet element in the Voice Command Definition (VCD) file. */
  var language: java.lang.String = js.native
  /** Gets the Name attribute value of the CommandSet element in the Voice Command Definition (VCD) file. */
  var name: java.lang.String = js.native
  /**
                   * Populates a PhraseList element with an array of Item elements.
                   * @param phraseListName The string that corresponds to the label attribute of the PhraseList element.
                   * @param phraseList A string array of values that will be added to the PhraseList element as Item elements.
                   * @return A string array of values that will be added to the PhraseList element as Item elements.
                   */
  def setPhraseListAsync(
    phraseListName: java.lang.String,
    phraseList: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

