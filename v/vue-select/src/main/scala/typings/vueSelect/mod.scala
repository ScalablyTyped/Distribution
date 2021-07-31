package typings.vueSelect

import org.scalablytyped.runtime.Shortcut
import typings.std.Event
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-select", JSImport.Default)
  @js.native
  val default: VueSelectConstructor = js.native
  
  @JSImport("vue-select", "VueSelect")
  @js.native
  val VueSelect: VueSelectConstructor = js.native
  
  trait DropdownClasses extends StObject {
    
    var disabled: Boolean
    
    var loading: Boolean
    
    var open: Boolean
    
    var rtl: Boolean
    
    var searchable: Boolean
    
    var searching: Boolean
    
    var single: Boolean
    
    var unsearchable: Boolean
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
  
  trait VueSelectComputed extends StObject {
    
    def clearSearchOnBlur(): Boolean
    
    def dropdownClasses(): DropdownClasses
    
    def dropdownOpen(): Boolean
    
    def filteredOptions(): js.Array[js.Any]
    
    def isValueEmpty(): Boolean
    
    def searchPlaceholder(): Boolean
    
    def searching(): Boolean
    
    def showClearButton(): Boolean
    
    def valueAsArray(): js.Array[js.Any]
  }
  object VueSelectComputed {
    
    @scala.inline
    def apply(
      clearSearchOnBlur: () => Boolean,
      dropdownClasses: () => DropdownClasses,
      dropdownOpen: () => Boolean,
      filteredOptions: () => js.Array[js.Any],
      isValueEmpty: () => Boolean,
      searchPlaceholder: () => Boolean,
      searching: () => Boolean,
      showClearButton: () => Boolean,
      valueAsArray: () => js.Array[js.Any]
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
      def setFilteredOptions(value: () => js.Array[js.Any]): Self = StObject.set(x, "filteredOptions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsValueEmpty(value: () => Boolean): Self = StObject.set(x, "isValueEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSearchPlaceholder(value: () => Boolean): Self = StObject.set(x, "searchPlaceholder", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSearching(value: () => Boolean): Self = StObject.set(x, "searching", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowClearButton(value: () => Boolean): Self = StObject.set(x, "showClearButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValueAsArray(value: () => js.Array[js.Any]): Self = StObject.set(x, "valueAsArray", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait VueSelectConstructor
    extends StObject
       with VueConstructor[Vue] {
    
    var computed: VueSelectComputed = js.native
    
    def data(): VueSelectData = js.native
    
    var methods: VueSelectMethods = js.native
    
    var props: VueSelectProps = js.native
    
    var watch: VueSelectWatch = js.native
  }
  
  trait VueSelectData extends StObject {
    
    var mutableOptions: js.Array[js.Any]
    
    var mutableValue: js.Any
    
    var open: Boolean
    
    var search: String
  }
  object VueSelectData {
    
    @scala.inline
    def apply(mutableOptions: js.Array[js.Any], mutableValue: js.Any, open: Boolean, search: String): VueSelectData = {
      val __obj = js.Dynamic.literal(mutableOptions = mutableOptions.asInstanceOf[js.Any], mutableValue = mutableValue.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueSelectData]
    }
    
    @scala.inline
    implicit class VueSelectDataMutableBuilder[Self <: VueSelectData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMutableOptions(value: js.Array[js.Any]): Self = StObject.set(x, "mutableOptions", value.asInstanceOf[js.Any])
      
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
  
  trait VueSelectMethods extends StObject {
    
    def clearSelection(): Unit
    
    def deselect(option: js.Any): Unit
    @JSName("deselect")
    var deselect_Original: OptionConsumer
    
    def isOptionSelected(option: js.Any): Boolean
    
    def maybeDeleteValue(): Unit
    
    def maybePushTag(option: js.Any): Unit
    @JSName("maybePushTag")
    var maybePushTag_Original: OptionConsumer
    
    def onAfterSelect(option: js.Any): Unit
    @JSName("onAfterSelect")
    var onAfterSelect_Original: OptionConsumer
    
    def onEscape(): Unit
    
    def onSearchBlur(): Unit
    
    def onSearchFocus(): Unit
    
    def optionExists(option: js.Any): Boolean
    
    def select(option: js.Any): Unit
    @JSName("select")
    var select_Original: OptionConsumer
    
    def toggleDropdown(e: Event): Unit
  }
  object VueSelectMethods {
    
    @scala.inline
    def apply(
      clearSelection: () => Unit,
      deselect: /* option */ js.Any => Unit,
      isOptionSelected: js.Any => Boolean,
      maybeDeleteValue: () => Unit,
      maybePushTag: /* option */ js.Any => Unit,
      onAfterSelect: /* option */ js.Any => Unit,
      onEscape: () => Unit,
      onSearchBlur: () => Unit,
      onSearchFocus: () => Unit,
      optionExists: js.Any => Boolean,
      select: /* option */ js.Any => Unit,
      toggleDropdown: Event => Unit
    ): VueSelectMethods = {
      val __obj = js.Dynamic.literal(clearSelection = js.Any.fromFunction0(clearSelection), deselect = js.Any.fromFunction1(deselect), isOptionSelected = js.Any.fromFunction1(isOptionSelected), maybeDeleteValue = js.Any.fromFunction0(maybeDeleteValue), maybePushTag = js.Any.fromFunction1(maybePushTag), onAfterSelect = js.Any.fromFunction1(onAfterSelect), onEscape = js.Any.fromFunction0(onEscape), onSearchBlur = js.Any.fromFunction0(onSearchBlur), onSearchFocus = js.Any.fromFunction0(onSearchFocus), optionExists = js.Any.fromFunction1(optionExists), select = js.Any.fromFunction1(select), toggleDropdown = js.Any.fromFunction1(toggleDropdown))
      __obj.asInstanceOf[VueSelectMethods]
    }
    
    @scala.inline
    implicit class VueSelectMethodsMutableBuilder[Self <: VueSelectMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearSelection(value: () => Unit): Self = StObject.set(x, "clearSelection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeselect(value: /* option */ js.Any => Unit): Self = StObject.set(x, "deselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsOptionSelected(value: js.Any => Boolean): Self = StObject.set(x, "isOptionSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaybeDeleteValue(value: () => Unit): Self = StObject.set(x, "maybeDeleteValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMaybePushTag(value: /* option */ js.Any => Unit): Self = StObject.set(x, "maybePushTag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAfterSelect(value: /* option */ js.Any => Unit): Self = StObject.set(x, "onAfterSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscape(value: () => Unit): Self = StObject.set(x, "onEscape", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSearchBlur(value: () => Unit): Self = StObject.set(x, "onSearchBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSearchFocus(value: () => Unit): Self = StObject.set(x, "onSearchFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptionExists(value: js.Any => Boolean): Self = StObject.set(x, "optionExists", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelect(value: /* option */ js.Any => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleDropdown(value: Event => Unit): Self = StObject.set(x, "toggleDropdown", js.Any.fromFunction1(value))
    }
  }
  
  trait VueSelectProps extends StObject {
    
    var autocomplete: String
    
    var clearSearchOnSelect: Boolean
    
    var clearable: Boolean
    
    var closeOnSelect: Boolean
    
    def createOption(option: js.Any): js.Any
    
    var dir: String
    
    var disabled: Boolean
    
    def filter(options: js.Array[js.Any], search: String): Boolean
    
    def filterBy(option: js.Any, label: String, search: String): Boolean
    
    var filterable: Boolean
    
    def getOptionLabel(option: js.Any): String
    
    var index: String | Null
    
    var inputId: String | Null
    
    var label: String
    
    var maxHeight: String
    
    var multiple: Boolean
    
    var noDrop: Boolean
    
    def onChange(`val`: js.Any): Unit
    
    def onInput(`val`: js.Any): Unit
    
    def onTab(): Unit
    
    var options: js.Array[js.Any]
    
    var placeholder: String
    
    var pushTags: Boolean
    
    var resetOnOptionsChange: Boolean
    
    var searchable: Boolean
    
    var selectOnTab: Boolean
    
    var tabindex: Double | Null
    
    var taggable: Boolean
    
    var transition: String
    
    var value: js.Any
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
      filter: (js.Array[js.Any], String) => Boolean,
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
      options: js.Array[js.Any],
      placeholder: String,
      pushTags: Boolean,
      resetOnOptionsChange: Boolean,
      searchable: Boolean,
      selectOnTab: Boolean,
      taggable: Boolean,
      transition: String,
      value: js.Any
    ): VueSelectProps = {
      val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], clearSearchOnSelect = clearSearchOnSelect.asInstanceOf[js.Any], clearable = clearable.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], createOption = js.Any.fromFunction1(createOption), dir = dir.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], filter = js.Any.fromFunction2(filter), filterBy = js.Any.fromFunction3(filterBy), filterable = filterable.asInstanceOf[js.Any], getOptionLabel = js.Any.fromFunction1(getOptionLabel), label = label.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], noDrop = noDrop.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onInput = js.Any.fromFunction1(onInput), onTab = js.Any.fromFunction0(onTab), options = options.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], pushTags = pushTags.asInstanceOf[js.Any], resetOnOptionsChange = resetOnOptionsChange.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], selectOnTab = selectOnTab.asInstanceOf[js.Any], taggable = taggable.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], index = null, inputId = null, tabindex = null)
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
      def setFilter(value: (js.Array[js.Any], String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
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
      def setOptions(value: js.Array[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
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
  
  trait VueSelectWatch extends StObject {
    
    def created(): Unit
    
    def multiple(reset: Boolean): Unit
    
    def mutableOptions(): Unit
    
    def mutableValue(`val`: js.Any, old: js.Any): Unit
    
    def options(`val`: js.Any): Unit
    
    def value(`val`: js.Any): Unit
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
