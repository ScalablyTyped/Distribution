package typings.tabris.mod

import typings.tabris.OmitSearchActionset
import typings.tabris.tabrisStrings.message
import typings.tabris.tabrisStrings.proposals
import typings.tabris.tabrisStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "SearchAction")
@js.native
class SearchAction () extends Action {
  def this(properties: Properties[SearchAction, OmitSearchActionset]) = this()
  /**
    * A hint text that is displayed when the search input is empty.
    */
  var message: String = js.native
  /**
    * Fired when a text input has been submitted by pressing the keyboard's search key.
    */
  var onAccept: Listeners[SearchActionAcceptEvent[this.type]] = js.native
  /**
    * Fired when the user inputs text.
    */
  var onInput: Listeners[SearchActionInputEvent[this.type]] = js.native
  /**
    * Fired when the [*message*](#message) property has changed.
    */
  var onMessageChanged: ChangeListeners[this.type, message] = js.native
  /**
    * Fired when the [*proposals*](#proposals) property has changed.
    */
  var onProposalsChanged: ChangeListeners[this.type, proposals] = js.native
  /**
    * Fired when the [*text*](#text) property has changed.
    */
  var onTextChanged: ChangeListeners[this.type, text] = js.native
  /**
    * The list of proposals to display.
    */
  var proposals: js.Array[String] = js.native
  /**
    * The text in the search input field.
    */
  var text: String = js.native
  /**
    * Invokes the search action, i.e. displays the UI to perform a search.
    */
  def open(): Unit = js.native
}

