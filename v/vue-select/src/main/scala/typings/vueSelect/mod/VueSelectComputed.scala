package typings.vueSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueSelectComputed extends js.Object {
  
  def clearSearchOnBlur(): Boolean = js.native
  
  def dropdownClasses(): DropdownClasses = js.native
  
  def dropdownOpen(): Boolean = js.native
  
  def filteredOptions(): js.Array[_] = js.native
  
  def isValueEmpty(): Boolean = js.native
  
  def searchPlaceholder(): Boolean = js.native
  
  def searching(): Boolean = js.native
  
  def showClearButton(): Boolean = js.native
  
  def valueAsArray(): js.Array[_] = js.native
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
  
  @scala.inline
  implicit class VueSelectComputedOps[Self <: VueSelectComputed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearSearchOnBlur(value: () => Boolean): Self = this.set("clearSearchOnBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDropdownClasses(value: () => DropdownClasses): Self = this.set("dropdownClasses", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDropdownOpen(value: () => Boolean): Self = this.set("dropdownOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFilteredOptions(value: () => js.Array[_]): Self = this.set("filteredOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValueEmpty(value: () => Boolean): Self = this.set("isValueEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSearchPlaceholder(value: () => Boolean): Self = this.set("searchPlaceholder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSearching(value: () => Boolean): Self = this.set("searching", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowClearButton(value: () => Boolean): Self = this.set("showClearButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueAsArray(value: () => js.Array[_]): Self = this.set("valueAsArray", js.Any.fromFunction0(value))
  }
}
