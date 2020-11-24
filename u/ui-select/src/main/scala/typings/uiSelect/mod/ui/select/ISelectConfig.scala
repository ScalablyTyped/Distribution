package typings.uiSelect.mod.ui.select

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelectConfig extends js.Object {
  
  var appendToBody: Boolean = js.native
  
  var backspaceReset: Boolean = js.native
  
  var closeOnSelect: Boolean = js.native
  
  var dropdownPosition: String = js.native
  
  def generateId(): Double = js.native
  
  var paste: js.UndefOr[IPasteFn] = js.native
  
  var placeholder: String = js.native
  
  var refreshDelay: Double = js.native
  
  var removeSelected: Boolean = js.native
  
  var resetSearchInput: Boolean = js.native
  
  var searchEnabled: Boolean = js.native
  
  var skipFocusser: Boolean = js.native
  
  var sortable: Boolean = js.native
  
  var spinnerClass: String = js.native
  
  var spinnerEnabled: Boolean = js.native
  
  var theme: String = js.native
}
object ISelectConfig {
  
  @scala.inline
  def apply(
    appendToBody: Boolean,
    backspaceReset: Boolean,
    closeOnSelect: Boolean,
    dropdownPosition: String,
    generateId: () => Double,
    placeholder: String,
    refreshDelay: Double,
    removeSelected: Boolean,
    resetSearchInput: Boolean,
    searchEnabled: Boolean,
    skipFocusser: Boolean,
    sortable: Boolean,
    spinnerClass: String,
    spinnerEnabled: Boolean,
    theme: String
  ): ISelectConfig = {
    val __obj = js.Dynamic.literal(appendToBody = appendToBody.asInstanceOf[js.Any], backspaceReset = backspaceReset.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], dropdownPosition = dropdownPosition.asInstanceOf[js.Any], generateId = js.Any.fromFunction0(generateId), placeholder = placeholder.asInstanceOf[js.Any], refreshDelay = refreshDelay.asInstanceOf[js.Any], removeSelected = removeSelected.asInstanceOf[js.Any], resetSearchInput = resetSearchInput.asInstanceOf[js.Any], searchEnabled = searchEnabled.asInstanceOf[js.Any], skipFocusser = skipFocusser.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], spinnerClass = spinnerClass.asInstanceOf[js.Any], spinnerEnabled = spinnerEnabled.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectConfig]
  }
  
  @scala.inline
  implicit class ISelectConfigOps[Self <: ISelectConfig] (val x: Self) extends AnyVal {
    
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
    def setAppendToBody(value: Boolean): Self = this.set("appendToBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackspaceReset(value: Boolean): Self = this.set("backspaceReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnSelect(value: Boolean): Self = this.set("closeOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownPosition(value: String): Self = this.set("dropdownPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateId(value: () => Double): Self = this.set("generateId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshDelay(value: Double): Self = this.set("refreshDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveSelected(value: Boolean): Self = this.set("removeSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetSearchInput(value: Boolean): Self = this.set("resetSearchInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchEnabled(value: Boolean): Self = this.set("searchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipFocusser(value: Boolean): Self = this.set("skipFocusser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinnerClass(value: String): Self = this.set("spinnerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinnerEnabled(value: Boolean): Self = this.set("spinnerEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaste(value: /* data */ String => Unit): Self = this.set("paste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
  }
}
