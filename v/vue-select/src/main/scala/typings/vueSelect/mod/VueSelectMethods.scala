package typings.vueSelect.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueSelectMethods extends js.Object {
  
  def clearSelection(): Unit = js.native
  
  def deselect(option: js.Any): Unit = js.native
  @JSName("deselect")
  var deselect_Original: OptionConsumer = js.native
  
  def isOptionSelected(option: js.Any): Boolean = js.native
  
  def maybeDeleteValue(): Unit = js.native
  
  def maybePushTag(option: js.Any): Unit = js.native
  @JSName("maybePushTag")
  var maybePushTag_Original: OptionConsumer = js.native
  
  def onAfterSelect(option: js.Any): Unit = js.native
  @JSName("onAfterSelect")
  var onAfterSelect_Original: OptionConsumer = js.native
  
  def onEscape(): Unit = js.native
  
  def onSearchBlur(): Unit = js.native
  
  def onSearchFocus(): Unit = js.native
  
  def optionExists(option: js.Any): Boolean = js.native
  
  def select(option: js.Any): Unit = js.native
  @JSName("select")
  var select_Original: OptionConsumer = js.native
  
  def toggleDropdown(e: Event): Unit = js.native
}
