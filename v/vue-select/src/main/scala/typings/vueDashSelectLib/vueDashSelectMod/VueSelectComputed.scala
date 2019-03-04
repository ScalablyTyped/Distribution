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
    clearSearchOnBlur: js.Function0[scala.Boolean],
    dropdownClasses: js.Function0[DropdownClasses],
    dropdownOpen: js.Function0[scala.Boolean],
    filteredOptions: js.Function0[js.Array[_]],
    isValueEmpty: js.Function0[scala.Boolean],
    searchPlaceholder: js.Function0[scala.Boolean],
    searching: js.Function0[scala.Boolean],
    showClearButton: js.Function0[scala.Boolean],
    valueAsArray: js.Function0[js.Array[_]]
  ): VueSelectComputed = {
    val __obj = js.Dynamic.literal(clearSearchOnBlur = clearSearchOnBlur, dropdownClasses = dropdownClasses, dropdownOpen = dropdownOpen, filteredOptions = filteredOptions, isValueEmpty = isValueEmpty, searchPlaceholder = searchPlaceholder, searching = searching, showClearButton = showClearButton, valueAsArray = valueAsArray)
  
    __obj.asInstanceOf[VueSelectComputed]
  }
}

