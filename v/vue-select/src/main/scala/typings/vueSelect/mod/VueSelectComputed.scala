package typings.vueSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueSelectComputed extends js.Object {
  def clearSearchOnBlur(): Boolean
  def dropdownClasses(): DropdownClasses
  def dropdownOpen(): Boolean
  def filteredOptions(): js.Array[_]
  def isValueEmpty(): Boolean
  def searchPlaceholder(): Boolean
  def searching(): Boolean
  def showClearButton(): Boolean
  def valueAsArray(): js.Array[_]
}

object VueSelectComputed {
  @scala.inline
  def apply(
    clearSearchOnBlur: () => Boolean,
    dropdownClasses: () => DropdownClasses,
    dropdownOpen: () => Boolean,
    filteredOptions: () => js.Array[_],
    isValueEmpty: () => Boolean,
    searchPlaceholder: () => Boolean,
    searching: () => Boolean,
    showClearButton: () => Boolean,
    valueAsArray: () => js.Array[_]
  ): VueSelectComputed = {
    val __obj = js.Dynamic.literal(clearSearchOnBlur = js.Any.fromFunction0(clearSearchOnBlur), dropdownClasses = js.Any.fromFunction0(dropdownClasses), dropdownOpen = js.Any.fromFunction0(dropdownOpen), filteredOptions = js.Any.fromFunction0(filteredOptions), isValueEmpty = js.Any.fromFunction0(isValueEmpty), searchPlaceholder = js.Any.fromFunction0(searchPlaceholder), searching = js.Any.fromFunction0(searching), showClearButton = js.Any.fromFunction0(showClearButton), valueAsArray = js.Any.fromFunction0(valueAsArray))
    __obj.asInstanceOf[VueSelectComputed]
  }
}

