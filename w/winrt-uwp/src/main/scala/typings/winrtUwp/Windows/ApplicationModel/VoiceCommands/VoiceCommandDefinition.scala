package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables operations on a specific installed command set. */
trait VoiceCommandDefinition extends js.Object {
  /** Gets the language ( xml:lang ) value of the CommandSet element in the Voice Command Definition (VCD) file. */
  var language: String
  /** Gets the Name attribute value of the CommandSet element in the Voice Command Definition (VCD) file. */
  var name: String
  /**
    * Populates a PhraseList element with an array of Item elements.
    * @param phraseListName The string that corresponds to the label attribute of the PhraseList element.
    * @param phraseList A string array of values that will be added to the PhraseList element as Item elements.
    * @return A string array of values that will be added to the PhraseList element as Item elements.
    */
  def setPhraseListAsync(phraseListName: String, phraseList: IIterable[String]): IPromiseWithIAsyncAction
}

object VoiceCommandDefinition {
  @scala.inline
  def apply(
    language: String,
    name: String,
    setPhraseListAsync: (String, IIterable[String]) => IPromiseWithIAsyncAction
  ): VoiceCommandDefinition = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setPhraseListAsync = js.Any.fromFunction2(setPhraseListAsync))
    __obj.asInstanceOf[VoiceCommandDefinition]
  }
}

