package typings.vueSelect.mod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueSelectMethods extends js.Object {
  @JSName("deselect")
  var deselect_Original: OptionConsumer = js.native
  @JSName("maybePushTag")
  var maybePushTag_Original: OptionConsumer = js.native
  @JSName("onAfterSelect")
  var onAfterSelect_Original: OptionConsumer = js.native
  @JSName("select")
  var select_Original: OptionConsumer = js.native
  def clearSelection(): Unit = js.native
  def deselect(option: js.Any): Unit = js.native
  def isOptionSelected(option: js.Any): Boolean = js.native
  def maybeDeleteValue(): Unit = js.native
  def maybePushTag(option: js.Any): Unit = js.native
  def onAfterSelect(option: js.Any): Unit = js.native
  def onEscape(): Unit = js.native
  def onSearchBlur(): Unit = js.native
  def onSearchFocus(): Unit = js.native
  def optionExists(option: js.Any): Boolean = js.native
  def select(option: js.Any): Unit = js.native
  def toggleDropdown(e: Event_): Unit = js.native
}

