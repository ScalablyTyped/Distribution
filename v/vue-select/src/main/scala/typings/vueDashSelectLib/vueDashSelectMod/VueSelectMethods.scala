package typings
package vueDashSelectLib.vueDashSelectMod

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
  def clearSelection(): scala.Unit = js.native
  def deselect(option: js.Any): scala.Unit = js.native
  def isOptionSelected(option: js.Any): scala.Boolean = js.native
  def maybeDeleteValue(): scala.Unit = js.native
  def maybePushTag(option: js.Any): scala.Unit = js.native
  def onAfterSelect(option: js.Any): scala.Unit = js.native
  def onEscape(): scala.Unit = js.native
  def onSearchBlur(): scala.Unit = js.native
  def onSearchFocus(): scala.Unit = js.native
  def optionExists(option: js.Any): scala.Boolean = js.native
  def select(option: js.Any): scala.Unit = js.native
  def toggleDropdown(e: stdLib.Event): scala.Unit = js.native
}

