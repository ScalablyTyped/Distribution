package typings
package vueDashSelectLib.vueDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueSelectComputed extends js.Object {
  def clearSearchOnBlur(): scala.Boolean
  def dropdownClasses(): DropdownClasses
  def dropdownOpen(): scala.Boolean
  def filteredOptions(): js.Array[_]
  def isValueEmpty(): scala.Boolean
  def searchPlaceholder(): scala.Boolean
  def searching(): scala.Boolean
  def showClearButton(): scala.Boolean
  def valueAsArray(): js.Array[_]
}

object VueSelectComputed {
  @scala.inline
  def apply(
    clearSearchOnBlur: () => scala.Boolean,
    dropdownClasses: () => DropdownClasses,
    dropdownOpen: () => scala.Boolean,
    filteredOptions: () => js.Array[_],
    isValueEmpty: () => scala.Boolean,
    searchPlaceholder: () => scala.Boolean,
    searching: () => scala.Boolean,
    showClearButton: () => scala.Boolean,
    valueAsArray: () => js.Array[_]
  ): VueSelectComputed = {
    val __obj = js.Dynamic.literal(clearSearchOnBlur = js.Any.fromFunction0(clearSearchOnBlur), dropdownClasses = js.Any.fromFunction0(dropdownClasses), dropdownOpen = js.Any.fromFunction0(dropdownOpen), filteredOptions = js.Any.fromFunction0(filteredOptions), isValueEmpty = js.Any.fromFunction0(isValueEmpty), searchPlaceholder = js.Any.fromFunction0(searchPlaceholder), searching = js.Any.fromFunction0(searching), showClearButton = js.Any.fromFunction0(showClearButton), valueAsArray = js.Any.fromFunction0(valueAsArray))
  
    __obj.asInstanceOf[VueSelectComputed]
  }
}

