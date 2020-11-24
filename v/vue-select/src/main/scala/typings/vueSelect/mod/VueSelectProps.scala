package typings.vueSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueSelectProps extends js.Object {
  
  var autocomplete: String = js.native
  
  var clearSearchOnSelect: Boolean = js.native
  
  var clearable: Boolean = js.native
  
  var closeOnSelect: Boolean = js.native
  
  def createOption(option: js.Any): js.Any = js.native
  
  var dir: String = js.native
  
  var disabled: Boolean = js.native
  
  def filter(options: js.Array[_], search: String): Boolean = js.native
  
  def filterBy(option: js.Any, label: String, search: String): Boolean = js.native
  
  var filterable: Boolean = js.native
  
  def getOptionLabel(option: js.Any): String = js.native
  
  var index: String | Null = js.native
  
  var inputId: String | Null = js.native
  
  var label: String = js.native
  
  var maxHeight: String = js.native
  
  var multiple: Boolean = js.native
  
  var noDrop: Boolean = js.native
  
  def onChange(`val`: js.Any): Unit = js.native
  
  def onInput(`val`: js.Any): Unit = js.native
  
  def onTab(): Unit = js.native
  
  var options: js.Array[_] = js.native
  
  var placeholder: String = js.native
  
  var pushTags: Boolean = js.native
  
  var resetOnOptionsChange: Boolean = js.native
  
  var searchable: Boolean = js.native
  
  var selectOnTab: Boolean = js.native
  
  var tabindex: Double | Null = js.native
  
  var taggable: Boolean = js.native
  
  var transition: String = js.native
  
  var value: js.Any = js.native
}
object VueSelectProps {
  
  @scala.inline
  def apply(
    autocomplete: String,
    clearSearchOnSelect: Boolean,
    clearable: Boolean,
    closeOnSelect: Boolean,
    createOption: js.Any => js.Any,
    dir: String,
    disabled: Boolean,
    filter: (js.Array[_], String) => Boolean,
    filterBy: (js.Any, String, String) => Boolean,
    filterable: Boolean,
    getOptionLabel: js.Any => String,
    label: String,
    maxHeight: String,
    multiple: Boolean,
    noDrop: Boolean,
    onChange: js.Any => Unit,
    onInput: js.Any => Unit,
    onTab: () => Unit,
    options: js.Array[_],
    placeholder: String,
    pushTags: Boolean,
    resetOnOptionsChange: Boolean,
    searchable: Boolean,
    selectOnTab: Boolean,
    taggable: Boolean,
    transition: String,
    value: js.Any
  ): VueSelectProps = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], clearSearchOnSelect = clearSearchOnSelect.asInstanceOf[js.Any], clearable = clearable.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], createOption = js.Any.fromFunction1(createOption), dir = dir.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], filter = js.Any.fromFunction2(filter), filterBy = js.Any.fromFunction3(filterBy), filterable = filterable.asInstanceOf[js.Any], getOptionLabel = js.Any.fromFunction1(getOptionLabel), label = label.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], noDrop = noDrop.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onInput = js.Any.fromFunction1(onInput), onTab = js.Any.fromFunction0(onTab), options = options.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], pushTags = pushTags.asInstanceOf[js.Any], resetOnOptionsChange = resetOnOptionsChange.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], selectOnTab = selectOnTab.asInstanceOf[js.Any], taggable = taggable.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueSelectProps]
  }
  
  @scala.inline
  implicit class VueSelectPropsOps[Self <: VueSelectProps] (val x: Self) extends AnyVal {
    
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
    def setAutocomplete(value: String): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearSearchOnSelect(value: Boolean): Self = this.set("clearSearchOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearable(value: Boolean): Self = this.set("clearable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnSelect(value: Boolean): Self = this.set("closeOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateOption(value: js.Any => js.Any): Self = this.set("createOption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: (js.Array[_], String) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterBy(value: (js.Any, String, String) => Boolean): Self = this.set("filterBy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFilterable(value: Boolean): Self = this.set("filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetOptionLabel(value: js.Any => String): Self = this.set("getOptionLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeight(value: String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDrop(value: Boolean): Self = this.set("noDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInput(value: js.Any => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTab(value: () => Unit): Self = this.set("onTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptionsVarargs(value: js.Any*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[_]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushTags(value: Boolean): Self = this.set("pushTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetOnOptionsChange(value: Boolean): Self = this.set("resetOnOptionsChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOnTab(value: Boolean): Self = this.set("selectOnTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaggable(value: Boolean): Self = this.set("taggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNull: Self = this.set("index", null)
    
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIdNull: Self = this.set("inputId", null)
    
    @scala.inline
    def setTabindex(value: Double): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabindexNull: Self = this.set("tabindex", null)
  }
}
