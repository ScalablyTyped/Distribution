package typings.vueSelect

import org.scalablytyped.runtime.Shortcut
import typings.std.Event
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-select", JSImport.Default)
  @js.native
  val default: VueSelectConstructor = js.native
  
  @JSImport("vue-select", "VueSelect")
  @js.native
  val VueSelect: VueSelectConstructor = js.native
  
  @js.native
  trait DropdownClasses extends StObject {
    
    var disabled: Boolean = js.native
    
    var loading: Boolean = js.native
    
    var open: Boolean = js.native
    
    var rtl: Boolean = js.native
    
    var searchable: Boolean = js.native
    
    var searching: Boolean = js.native
    
    var single: Boolean = js.native
    
    var unsearchable: Boolean = js.native
  }
  object DropdownClasses {
    
    @scala.inline
    def apply(
      disabled: Boolean,
      loading: Boolean,
      open: Boolean,
      rtl: Boolean,
      searchable: Boolean,
      searching: Boolean,
      single: Boolean,
      unsearchable: Boolean
    ): DropdownClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], searching = searching.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], unsearchable = unsearchable.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownClasses]
    }
    
    @scala.inline
    implicit class DropdownClassesMutableBuilder[Self <: DropdownClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearching(value: Boolean): Self = StObject.set(x, "searching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsearchable(value: Boolean): Self = StObject.set(x, "unsearchable", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionConsumer = js.Function1[/* option */ js.Any, Unit]
  
  @js.native
  trait VueSelectComputed extends StObject {
    
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
    implicit class VueSelectComputedMutableBuilder[Self <: VueSelectComputed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearSearchOnBlur(value: () => Boolean): Self = StObject.set(x, "clearSearchOnBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDropdownClasses(value: () => DropdownClasses): Self = StObject.set(x, "dropdownClasses", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDropdownOpen(value: () => Boolean): Self = StObject.set(x, "dropdownOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFilteredOptions(value: () => js.Array[_]): Self = StObject.set(x, "filteredOptions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsValueEmpty(value: () => Boolean): Self = StObject.set(x, "isValueEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSearchPlaceholder(value: () => Boolean): Self = StObject.set(x, "searchPlaceholder", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSearching(value: () => Boolean): Self = StObject.set(x, "searching", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowClearButton(value: () => Boolean): Self = StObject.set(x, "showClearButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValueAsArray(value: () => js.Array[_]): Self = StObject.set(x, "valueAsArray", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait VueSelectConstructor extends VueConstructor[Vue] {
    
    var computed: VueSelectComputed = js.native
    
    def data(): VueSelectData = js.native
    
    var methods: VueSelectMethods = js.native
    
    var props: VueSelectProps = js.native
    
    var watch: VueSelectWatch = js.native
  }
  
  @js.native
  trait VueSelectData extends StObject {
    
    var mutableOptions: js.Array[_] = js.native
    
    var mutableValue: js.Any = js.native
    
    var open: Boolean = js.native
    
    var search: String = js.native
  }
  object VueSelectData {
    
    @scala.inline
    def apply(mutableOptions: js.Array[_], mutableValue: js.Any, open: Boolean, search: String): VueSelectData = {
      val __obj = js.Dynamic.literal(mutableOptions = mutableOptions.asInstanceOf[js.Any], mutableValue = mutableValue.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueSelectData]
    }
    
    @scala.inline
    implicit class VueSelectDataMutableBuilder[Self <: VueSelectData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMutableOptions(value: js.Array[_]): Self = StObject.set(x, "mutableOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutableOptionsVarargs(value: js.Any*): Self = StObject.set(x, "mutableOptions", js.Array(value :_*))
      
      @scala.inline
      def setMutableValue(value: js.Any): Self = StObject.set(x, "mutableValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VueSelectMethods extends StObject {
    
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
  
  @js.native
  trait VueSelectProps extends StObject {
    
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
    implicit class VueSelectPropsMutableBuilder[Self <: VueSelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearSearchOnSelect(value: Boolean): Self = StObject.set(x, "clearSearchOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateOption(value: js.Any => js.Any): Self = StObject.set(x, "createOption", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: (js.Array[_], String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterBy(value: (js.Any, String, String) => Boolean): Self = StObject.set(x, "filterBy", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetOptionLabel(value: js.Any => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNull: Self = StObject.set(x, "index", null)
      
      @scala.inline
      def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIdNull: Self = StObject.set(x, "inputId", null)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDrop(value: Boolean): Self = StObject.set(x, "noDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInput(value: js.Any => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTab(value: () => Unit): Self = StObject.set(x, "onTab", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptions(value: js.Array[_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: js.Any*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushTags(value: Boolean): Self = StObject.set(x, "pushTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetOnOptionsChange(value: Boolean): Self = StObject.set(x, "resetOnOptionsChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectOnTab(value: Boolean): Self = StObject.set(x, "selectOnTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabindexNull: Self = StObject.set(x, "tabindex", null)
      
      @scala.inline
      def setTaggable(value: Boolean): Self = StObject.set(x, "taggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VueSelectWatch extends StObject {
    
    def created(): Unit = js.native
    
    def multiple(reset: Boolean): Unit = js.native
    
    def mutableOptions(): Unit = js.native
    
    def mutableValue(`val`: js.Any, old: js.Any): Unit = js.native
    
    def options(`val`: js.Any): Unit = js.native
    
    def value(`val`: js.Any): Unit = js.native
  }
  object VueSelectWatch {
    
    @scala.inline
    def apply(
      created: () => Unit,
      multiple: Boolean => Unit,
      mutableOptions: () => Unit,
      mutableValue: (js.Any, js.Any) => Unit,
      options: js.Any => Unit,
      value: js.Any => Unit
    ): VueSelectWatch = {
      val __obj = js.Dynamic.literal(created = js.Any.fromFunction0(created), multiple = js.Any.fromFunction1(multiple), mutableOptions = js.Any.fromFunction0(mutableOptions), mutableValue = js.Any.fromFunction2(mutableValue), options = js.Any.fromFunction1(options), value = js.Any.fromFunction1(value))
      __obj.asInstanceOf[VueSelectWatch]
    }
    
    @scala.inline
    implicit class VueSelectWatchMutableBuilder[Self <: VueSelectWatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMultiple(value: Boolean => Unit): Self = StObject.set(x, "multiple", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMutableOptions(value: () => Unit): Self = StObject.set(x, "mutableOptions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMutableValue(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "mutableValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptions(value: js.Any => Unit): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: js.Any => Unit): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    }
  }
  
  type _To = VueSelectConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueSelectConstructor = default
}
