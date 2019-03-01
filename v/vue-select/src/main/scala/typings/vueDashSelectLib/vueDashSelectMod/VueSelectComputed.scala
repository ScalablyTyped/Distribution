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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearSearchOnBlur")(clearSearchOnBlur)
    __obj.updateDynamic("dropdownClasses")(dropdownClasses)
    __obj.updateDynamic("dropdownOpen")(dropdownOpen)
    __obj.updateDynamic("filteredOptions")(filteredOptions)
    __obj.updateDynamic("isValueEmpty")(isValueEmpty)
    __obj.updateDynamic("searchPlaceholder")(searchPlaceholder)
    __obj.updateDynamic("searching")(searching)
    __obj.updateDynamic("showClearButton")(showClearButton)
    __obj.updateDynamic("valueAsArray")(valueAsArray)
    __obj.asInstanceOf[VueSelectComputed]
  }
}

