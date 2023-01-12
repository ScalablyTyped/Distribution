package typings.vueSelect

import org.scalablytyped.runtime.Shortcut
import typings.std.Event
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import typings.std.InstanceType
import typings.std.KeyboardEvent
import typings.std.Record
import typings.std.ReturnType
import typings.vueSelect.anon.Attributes
import typings.vueSelect.anon.AttributesClass
import typings.vueSelect.anon.ListSlotScopedeselectVueS
import typings.vueSelect.anon.Loading
import typings.vueSelect.anon.RecordChildComponentNamea
import typings.vueSelect.anon.RecordChildComponentNameaDeselect
import typings.vueSelect.anon.Refs
import typings.vueSelect.anon.Search
import typings.vueSelect.vueSelectStrings.auto
import typings.vueSelect.vueSelectStrings.ltr
import typings.vueSelect.vueSelectStrings.rtl
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
  
  trait CalculatedPosition extends StObject {
    
    var left: String
    
    var top: String
    
    var width: String
  }
  object CalculatedPosition {
    
    inline def apply(left: String, top: String, width: String): CalculatedPosition = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalculatedPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalculatedPosition] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueSelect.vueSelectStrings.Deselect
    - typings.vueSelect.vueSelectStrings.OpenIndicator
  */
  trait ChildComponentName extends StObject
  object ChildComponentName {
    
    inline def Deselect: typings.vueSelect.vueSelectStrings.Deselect = "Deselect".asInstanceOf[typings.vueSelect.vueSelectStrings.Deselect]
    
    inline def OpenIndicator: typings.vueSelect.vueSelectStrings.OpenIndicator = "OpenIndicator".asInstanceOf[typings.vueSelect.vueSelectStrings.OpenIndicator]
  }
  
  trait ClearSearchOnBlurParameters extends StObject {
    
    var clearSearchOnSelect: Boolean
    
    var multiple: Boolean
  }
  object ClearSearchOnBlurParameters {
    
    inline def apply(clearSearchOnSelect: Boolean, multiple: Boolean): ClearSearchOnBlurParameters = {
      val __obj = js.Dynamic.literal(clearSearchOnSelect = clearSearchOnSelect.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearSearchOnBlurParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClearSearchOnBlurParameters] (val x: Self) extends AnyVal {
      
      inline def setClearSearchOnSelect(value: Boolean): Self = StObject.set(x, "clearSearchOnSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in keyof vue-select.vue-select.VueSelectComputed ]: std.ReturnType<vue-select.vue-select.VueSelectComputed[K]>} */
  trait ComputedValues extends StObject {
    
    var childComponents: ReturnType[js.Function0[RecordChildComponentNamea]]
    
    var dropdownOpen: ReturnType[js.Function0[Boolean]]
    
    var filteredOptions: ReturnType[js.Function0[js.Array[VueSelectOption]]]
    
    var isTrackingValues: ReturnType[js.Function0[Boolean]]
    
    var isValueEmpty: ReturnType[js.Function0[Boolean]]
    
    var optionList: ReturnType[js.Function0[js.Array[VueSelectOption]]]
    
    var scope: ReturnType[js.Function0[VueSelectSlotScope]]
    
    var searchEl: ReturnType[js.Function0[HTMLInputElement]]
    
    var searchPlaceholder: ReturnType[js.Function0[String]]
    
    var searching: ReturnType[js.Function0[Boolean]]
    
    var selectedValue: ReturnType[js.Function0[js.Array[VueSelectOption]]]
    
    var showClearButton: ReturnType[js.Function0[Boolean]]
    
    var stateClasses: ReturnType[js.Function0[StateClasses]]
  }
  object ComputedValues {
    
    inline def apply(
      childComponents: ReturnType[js.Function0[RecordChildComponentNamea]],
      dropdownOpen: ReturnType[js.Function0[Boolean]],
      filteredOptions: ReturnType[js.Function0[js.Array[VueSelectOption]]],
      isTrackingValues: ReturnType[js.Function0[Boolean]],
      isValueEmpty: ReturnType[js.Function0[Boolean]],
      optionList: ReturnType[js.Function0[js.Array[VueSelectOption]]],
      scope: ReturnType[js.Function0[VueSelectSlotScope]],
      searchEl: ReturnType[js.Function0[HTMLInputElement]],
      searchPlaceholder: ReturnType[js.Function0[String]],
      searching: ReturnType[js.Function0[Boolean]],
      selectedValue: ReturnType[js.Function0[js.Array[VueSelectOption]]],
      showClearButton: ReturnType[js.Function0[Boolean]],
      stateClasses: ReturnType[js.Function0[StateClasses]]
    ): ComputedValues = {
      val __obj = js.Dynamic.literal(childComponents = childComponents.asInstanceOf[js.Any], dropdownOpen = dropdownOpen.asInstanceOf[js.Any], filteredOptions = filteredOptions.asInstanceOf[js.Any], isTrackingValues = isTrackingValues.asInstanceOf[js.Any], isValueEmpty = isValueEmpty.asInstanceOf[js.Any], optionList = optionList.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], searchEl = searchEl.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], searching = searching.asInstanceOf[js.Any], selectedValue = selectedValue.asInstanceOf[js.Any], showClearButton = showClearButton.asInstanceOf[js.Any], stateClasses = stateClasses.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputedValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputedValues] (val x: Self) extends AnyVal {
      
      inline def setChildComponents(value: ReturnType[js.Function0[RecordChildComponentNamea]]): Self = StObject.set(x, "childComponents", value.asInstanceOf[js.Any])
      
      inline def setDropdownOpen(value: ReturnType[js.Function0[Boolean]]): Self = StObject.set(x, "dropdownOpen", value.asInstanceOf[js.Any])
      
      inline def setFilteredOptions(value: ReturnType[js.Function0[js.Array[VueSelectOption]]]): Self = StObject.set(x, "filteredOptions", value.asInstanceOf[js.Any])
      
      inline def setIsTrackingValues(value: ReturnType[js.Function0[Boolean]]): Self = StObject.set(x, "isTrackingValues", value.asInstanceOf[js.Any])
      
      inline def setIsValueEmpty(value: ReturnType[js.Function0[Boolean]]): Self = StObject.set(x, "isValueEmpty", value.asInstanceOf[js.Any])
      
      inline def setOptionList(value: ReturnType[js.Function0[js.Array[VueSelectOption]]]): Self = StObject.set(x, "optionList", value.asInstanceOf[js.Any])
      
      inline def setScope(value: ReturnType[js.Function0[VueSelectSlotScope]]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setSearchEl(value: ReturnType[js.Function0[HTMLInputElement]]): Self = StObject.set(x, "searchEl", value.asInstanceOf[js.Any])
      
      inline def setSearchPlaceholder(value: ReturnType[js.Function0[String]]): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSearching(value: ReturnType[js.Function0[Boolean]]): Self = StObject.set(x, "searching", value.asInstanceOf[js.Any])
      
      inline def setSelectedValue(value: ReturnType[js.Function0[js.Array[VueSelectOption]]]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setShowClearButton(value: ReturnType[js.Function0[Boolean]]): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
      
      inline def setStateClasses(value: ReturnType[js.Function0[StateClasses]]): Self = StObject.set(x, "stateClasses", value.asInstanceOf[js.Any])
    }
  }
  
  type KeyEventMap = Record[Double, js.Function1[/* event */ KeyboardEvent, Any]]
  
  trait ListSlotScope extends StObject {
    
    var filteredOptions: ReturnType[js.Function0[js.Array[VueSelectOption]]]
    
    var loading: Boolean
    
    var search: String
    
    var searching: ReturnType[js.Function0[Boolean]]
  }
  object ListSlotScope {
    
    inline def apply(
      filteredOptions: ReturnType[js.Function0[js.Array[VueSelectOption]]],
      loading: Boolean,
      search: String,
      searching: ReturnType[js.Function0[Boolean]]
    ): ListSlotScope = {
      val __obj = js.Dynamic.literal(filteredOptions = filteredOptions.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searching = searching.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListSlotScope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListSlotScope] (val x: Self) extends AnyVal {
      
      inline def setFilteredOptions(value: ReturnType[js.Function0[js.Array[VueSelectOption]]]): Self = StObject.set(x, "filteredOptions", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearching(value: ReturnType[js.Function0[Boolean]]): Self = StObject.set(x, "searching", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionConsumer[T] = js.Function1[/* option */ VueSelectOption, T]
  
  trait StateClasses extends StObject {
    
    var `vs--disabled`: Boolean
    
    var `vs--loading`: Boolean
    
    var `vs--open`: Boolean
    
    var `vs--searchable`: Boolean
    
    var `vs--searching`: Boolean
    
    var `vs--single`: Boolean
    
    var `vs--unsearchable`: Boolean
  }
  object StateClasses {
    
    inline def apply(
      `vs--disabled`: Boolean,
      `vs--loading`: Boolean,
      `vs--open`: Boolean,
      `vs--searchable`: Boolean,
      `vs--searching`: Boolean,
      `vs--single`: Boolean,
      `vs--unsearchable`: Boolean
    ): StateClasses = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("vs--disabled")(`vs--disabled`.asInstanceOf[js.Any])
      __obj.updateDynamic("vs--loading")(`vs--loading`.asInstanceOf[js.Any])
      __obj.updateDynamic("vs--open")(`vs--open`.asInstanceOf[js.Any])
      __obj.updateDynamic("vs--searchable")(`vs--searchable`.asInstanceOf[js.Any])
      __obj.updateDynamic("vs--searching")(`vs--searching`.asInstanceOf[js.Any])
      __obj.updateDynamic("vs--single")(`vs--single`.asInstanceOf[js.Any])
      __obj.updateDynamic("vs--unsearchable")(`vs--unsearchable`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StateClasses] (val x: Self) extends AnyVal {
      
      inline def `setVs--disabled`(value: Boolean): Self = StObject.set(x, "vs--disabled", value.asInstanceOf[js.Any])
      
      inline def `setVs--loading`(value: Boolean): Self = StObject.set(x, "vs--loading", value.asInstanceOf[js.Any])
      
      inline def `setVs--open`(value: Boolean): Self = StObject.set(x, "vs--open", value.asInstanceOf[js.Any])
      
      inline def `setVs--searchable`(value: Boolean): Self = StObject.set(x, "vs--searchable", value.asInstanceOf[js.Any])
      
      inline def `setVs--searching`(value: Boolean): Self = StObject.set(x, "vs--searching", value.asInstanceOf[js.Any])
      
      inline def `setVs--single`(value: Boolean): Self = StObject.set(x, "vs--single", value.asInstanceOf[js.Any])
      
      inline def `setVs--unsearchable`(value: Boolean): Self = StObject.set(x, "vs--unsearchable", value.asInstanceOf[js.Any])
    }
  }
  
  type UnbindPositionCallback = js.Function0[Unit]
  
  trait VueSelectComputed extends StObject {
    
    def childComponents(): RecordChildComponentNamea
    
    def dropdownOpen(): Boolean
    
    def filteredOptions(): js.Array[VueSelectOption]
    
    def isTrackingValues(): Boolean
    
    def isValueEmpty(): Boolean
    
    def optionList(): js.Array[VueSelectOption]
    
    def scope(): VueSelectSlotScope
    
    def searchEl(): HTMLInputElement
    
    def searchPlaceholder(): String
    
    def searching(): Boolean
    
    def selectedValue(): js.Array[VueSelectOption]
    
    def showClearButton(): Boolean
    
    def stateClasses(): StateClasses
  }
  object VueSelectComputed {
    
    inline def apply(
      childComponents: () => RecordChildComponentNamea,
      dropdownOpen: () => Boolean,
      filteredOptions: () => js.Array[VueSelectOption],
      isTrackingValues: () => Boolean,
      isValueEmpty: () => Boolean,
      optionList: () => js.Array[VueSelectOption],
      scope: () => VueSelectSlotScope,
      searchEl: () => HTMLInputElement,
      searchPlaceholder: () => String,
      searching: () => Boolean,
      selectedValue: () => js.Array[VueSelectOption],
      showClearButton: () => Boolean,
      stateClasses: () => StateClasses
    ): VueSelectComputed = {
      val __obj = js.Dynamic.literal(childComponents = js.Any.fromFunction0(childComponents), dropdownOpen = js.Any.fromFunction0(dropdownOpen), filteredOptions = js.Any.fromFunction0(filteredOptions), isTrackingValues = js.Any.fromFunction0(isTrackingValues), isValueEmpty = js.Any.fromFunction0(isValueEmpty), optionList = js.Any.fromFunction0(optionList), scope = js.Any.fromFunction0(scope), searchEl = js.Any.fromFunction0(searchEl), searchPlaceholder = js.Any.fromFunction0(searchPlaceholder), searching = js.Any.fromFunction0(searching), selectedValue = js.Any.fromFunction0(selectedValue), showClearButton = js.Any.fromFunction0(showClearButton), stateClasses = js.Any.fromFunction0(stateClasses))
      __obj.asInstanceOf[VueSelectComputed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueSelectComputed] (val x: Self) extends AnyVal {
      
      inline def setChildComponents(value: () => RecordChildComponentNamea): Self = StObject.set(x, "childComponents", js.Any.fromFunction0(value))
      
      inline def setDropdownOpen(value: () => Boolean): Self = StObject.set(x, "dropdownOpen", js.Any.fromFunction0(value))
      
      inline def setFilteredOptions(value: () => js.Array[VueSelectOption]): Self = StObject.set(x, "filteredOptions", js.Any.fromFunction0(value))
      
      inline def setIsTrackingValues(value: () => Boolean): Self = StObject.set(x, "isTrackingValues", js.Any.fromFunction0(value))
      
      inline def setIsValueEmpty(value: () => Boolean): Self = StObject.set(x, "isValueEmpty", js.Any.fromFunction0(value))
      
      inline def setOptionList(value: () => js.Array[VueSelectOption]): Self = StObject.set(x, "optionList", js.Any.fromFunction0(value))
      
      inline def setScope(value: () => VueSelectSlotScope): Self = StObject.set(x, "scope", js.Any.fromFunction0(value))
      
      inline def setSearchEl(value: () => HTMLInputElement): Self = StObject.set(x, "searchEl", js.Any.fromFunction0(value))
      
      inline def setSearchPlaceholder(value: () => String): Self = StObject.set(x, "searchPlaceholder", js.Any.fromFunction0(value))
      
      inline def setSearching(value: () => Boolean): Self = StObject.set(x, "searching", js.Any.fromFunction0(value))
      
      inline def setSelectedValue(value: () => js.Array[VueSelectOption]): Self = StObject.set(x, "selectedValue", js.Any.fromFunction0(value))
      
      inline def setShowClearButton(value: () => Boolean): Self = StObject.set(x, "showClearButton", js.Any.fromFunction0(value))
      
      inline def setStateClasses(value: () => StateClasses): Self = StObject.set(x, "stateClasses", js.Any.fromFunction0(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait VueSelectConstructor extends StObject {
    
    var computed: VueSelectComputed
    
    def data(): VueSelectData
    
    var methods: VueSelectMethods
    
    var props: VueSelectProps
    
    var watch: VueSelectWatch
  }
  object VueSelectConstructor {
    
    inline def apply(
      computed: VueSelectComputed,
      data: () => VueSelectData,
      methods: VueSelectMethods,
      props: VueSelectProps,
      watch: VueSelectWatch
    ): VueSelectConstructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = js.Any.fromFunction0(data), methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueSelectConstructor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueSelectConstructor] (val x: Self) extends AnyVal {
      
      inline def setComputed(value: VueSelectComputed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: () => VueSelectData): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setMethods(value: VueSelectMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: VueSelectProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: VueSelectWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueSelectData extends StObject {
    
    var isComposing: Boolean
    
    // in ajax mixin:
    var mutableLoading: Boolean
    
    var open: Boolean
    
    var pushedTags: js.Array[VueSelectOption]
    
    var search: String
    
    // in typeAheadPointer mixin:
    var typeAheadPointer: Double
  }
  object VueSelectData {
    
    inline def apply(
      isComposing: Boolean,
      mutableLoading: Boolean,
      open: Boolean,
      pushedTags: js.Array[VueSelectOption],
      search: String,
      typeAheadPointer: Double
    ): VueSelectData = {
      val __obj = js.Dynamic.literal(isComposing = isComposing.asInstanceOf[js.Any], mutableLoading = mutableLoading.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pushedTags = pushedTags.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], typeAheadPointer = typeAheadPointer.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueSelectData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueSelectData] (val x: Self) extends AnyVal {
      
      inline def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
      
      inline def setMutableLoading(value: Boolean): Self = StObject.set(x, "mutableLoading", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setPushedTags(value: js.Array[VueSelectOption]): Self = StObject.set(x, "pushedTags", value.asInstanceOf[js.Any])
      
      inline def setPushedTagsVarargs(value: VueSelectOption*): Self = StObject.set(x, "pushedTags", js.Array(value*))
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setTypeAheadPointer(value: Double): Self = StObject.set(x, "typeAheadPointer", value.asInstanceOf[js.Any])
    }
  }
  
  type VueSelectInstance = (InstanceType[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendedVue<Vue, VueSelectData, VueSelectMethods, ComputedValues, VueSelectProps> */ Any
  ]) & Refs
  
  @js.native
  trait VueSelectMethods extends StObject {
    
    def clearSelection(): Unit = js.native
    
    def closeSearchOptions(): Unit = js.native
    
    def deselect(option: VueSelectOption): Unit = js.native
    @JSName("deselect")
    var deselect_Original: OptionConsumer[Unit] = js.native
    
    def findOptionFromReducedValue(option: VueSelectOption): Any = js.native
    @JSName("findOptionFromReducedValue")
    var findOptionFromReducedValue_Original: OptionConsumer[Any] = js.native
    
    def getDropdownViewport(): Any = js.native
    
    def isOptionDeselectable(option: VueSelectOption): Boolean = js.native
    @JSName("isOptionDeselectable")
    var isOptionDeselectable_Original: OptionConsumer[Boolean] = js.native
    
    def isOptionSelected(option: VueSelectOption): Boolean = js.native
    @JSName("isOptionSelected")
    var isOptionSelected_Original: OptionConsumer[Boolean] = js.native
    
    // in pointerScroll mixin:
    def maybeAdjustScroll(): Any = js.native
    
    def maybeDeleteValue(): Unit = js.native
    
    def normalizeOptionForSlot(option: VueSelectOption): VueSelectOption = js.native
    @JSName("normalizeOptionForSlot")
    var normalizeOptionForSlot_Original: OptionConsumer[VueSelectOption] = js.native
    
    def onAfterSelect(option: VueSelectOption): Unit = js.native
    @JSName("onAfterSelect")
    var onAfterSelect_Original: OptionConsumer[Unit] = js.native
    
    def onEscape(): Unit = js.native
    
    def onMouseUp(): Unit = js.native
    
    def onMousedown(): Unit = js.native
    
    def onSearchBlur(): Unit = js.native
    
    def onSearchFocus(): Unit = js.native
    
    def onSearchKeyDown(event: KeyboardEvent): Any = js.native
    
    def optionComparator(a: js.Object, b: js.Object): Boolean = js.native
    
    def optionExists(option: VueSelectOption): Boolean = js.native
    @JSName("optionExists")
    var optionExists_Original: OptionConsumer[Boolean] = js.native
    
    def pushTag(option: VueSelectOption): Unit = js.native
    @JSName("pushTag")
    var pushTag_Original: OptionConsumer[Unit] = js.native
    
    def select(option: VueSelectOption): Unit = js.native
    @JSName("select")
    var select_Original: OptionConsumer[Unit] = js.native
    
    def setInternalValueFromOptions(option: VueSelectOption): Unit = js.native
    @JSName("setInternalValueFromOptions")
    var setInternalValueFromOptions_Original: OptionConsumer[Unit] = js.native
    
    def toggleDropdown(e: Event): Unit = js.native
    
    // in ajax mixin:
    def toggleLoading(): Boolean = js.native
    def toggleLoading(toggle: Boolean): Boolean = js.native
    
    def typeAheadDown(): Unit = js.native
    
    def typeAheadSelect(): Unit = js.native
    
    // in typeAheadPointer mixin:
    def typeAheadUp(): Unit = js.native
    
    def updateValue(value: VueSelectOption): Unit = js.native
  }
  
  type VueSelectOption = String | js.Object
  
  trait VueSelectProps extends StObject {
    
    var appendToBody: Boolean
    
    var autocomplete: String
    
    // in pointerScroll mixin:
    var autoscroll: Boolean
    
    def calculatePosition(dropdownList: HTMLUListElement, component: VueSelectInstance, position: CalculatedPosition): Unit | UnbindPositionCallback
    
    def clearSearchOnBlur(parameters: ClearSearchOnBlurParameters): Boolean
    
    var clearSearchOnSelect: Boolean
    
    var clearable: Boolean
    
    var closeOnSelect: Boolean
    
    var components: RecordChildComponentNameaDeselect
    
    def createOption(option: String): VueSelectOption
    
    var deselectFromDropdown: Boolean
    
    var dir: auto | ltr | rtl
    
    var disabled: Boolean
    
    def dropdownShouldOpen(vSelect: VueSelectInstance): Boolean
    
    def filter(options: js.Array[VueSelectOption], search: String): js.Array[VueSelectOption]
    
    def filterBy(option: VueSelectOption, label: String, search: String): Boolean
    
    var filterable: Boolean
    
    def getOptionKey(option: VueSelectOption): String
    @JSName("getOptionKey")
    var getOptionKey_Original: OptionConsumer[String]
    
    def getOptionLabel(option: VueSelectOption): String
    @JSName("getOptionLabel")
    var getOptionLabel_Original: OptionConsumer[String]
    
    var inputId: String | Null
    
    var label: String
    
    // in ajax mixin:
    var loading: Boolean
    
    def mapKeydown(map: KeyEventMap, vm: VueSelectInstance): KeyEventMap
    
    var multiple: Boolean
    
    var noDrop: Boolean
    
    /** @deprecated since v3.3 */
    def onTab(): Unit
    
    var options: js.Array[VueSelectOption]
    
    var placeholder: String
    
    var pushTags: Boolean
    
    def reduce(option: VueSelectOption): Any
    @JSName("reduce")
    var reduce_Original: OptionConsumer[Any]
    
    var resetOnOptionsChange: Boolean | (js.Function3[
        /* newOptions */ js.Array[VueSelectOption], 
        /* oldOptions */ js.Array[VueSelectOption], 
        /* selectedValue */ js.Array[VueSelectOption], 
        Boolean
      ])
    
    var searchInputQuerySelector: String
    
    var searchable: Boolean
    
    var selectOnKeyCodes: js.Array[Double]
    
    /** @deprecated since v3.3 - use selectOnKeyCodes instead */
    var selectOnTab: Boolean
    
    def selectable(option: VueSelectOption): Boolean
    @JSName("selectable")
    var selectable_Original: OptionConsumer[Boolean]
    
    var tabindex: Double | Null
    
    var taggable: Boolean
    
    var transition: String
    
    var uid: String | Double
    
    var value: VueSelectOption
  }
  object VueSelectProps {
    
    inline def apply(
      appendToBody: Boolean,
      autocomplete: String,
      autoscroll: Boolean,
      calculatePosition: (HTMLUListElement, VueSelectInstance, CalculatedPosition) => Unit | UnbindPositionCallback,
      clearSearchOnBlur: ClearSearchOnBlurParameters => Boolean,
      clearSearchOnSelect: Boolean,
      clearable: Boolean,
      closeOnSelect: Boolean,
      components: RecordChildComponentNameaDeselect,
      createOption: String => VueSelectOption,
      deselectFromDropdown: Boolean,
      dir: auto | ltr | rtl,
      disabled: Boolean,
      dropdownShouldOpen: VueSelectInstance => Boolean,
      filter: (js.Array[VueSelectOption], String) => js.Array[VueSelectOption],
      filterBy: (VueSelectOption, String, String) => Boolean,
      filterable: Boolean,
      getOptionKey: /* option */ VueSelectOption => String,
      getOptionLabel: /* option */ VueSelectOption => String,
      label: String,
      loading: Boolean,
      mapKeydown: (KeyEventMap, VueSelectInstance) => KeyEventMap,
      multiple: Boolean,
      noDrop: Boolean,
      onTab: () => Unit,
      options: js.Array[VueSelectOption],
      placeholder: String,
      pushTags: Boolean,
      reduce: /* option */ VueSelectOption => Any,
      resetOnOptionsChange: Boolean | (js.Function3[
          /* newOptions */ js.Array[VueSelectOption], 
          /* oldOptions */ js.Array[VueSelectOption], 
          /* selectedValue */ js.Array[VueSelectOption], 
          Boolean
        ]),
      searchInputQuerySelector: String,
      searchable: Boolean,
      selectOnKeyCodes: js.Array[Double],
      selectOnTab: Boolean,
      selectable: /* option */ VueSelectOption => Boolean,
      taggable: Boolean,
      transition: String,
      uid: String | Double,
      value: VueSelectOption
    ): VueSelectProps = {
      val __obj = js.Dynamic.literal(appendToBody = appendToBody.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autoscroll = autoscroll.asInstanceOf[js.Any], calculatePosition = js.Any.fromFunction3(calculatePosition), clearSearchOnBlur = js.Any.fromFunction1(clearSearchOnBlur), clearSearchOnSelect = clearSearchOnSelect.asInstanceOf[js.Any], clearable = clearable.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], createOption = js.Any.fromFunction1(createOption), deselectFromDropdown = deselectFromDropdown.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropdownShouldOpen = js.Any.fromFunction1(dropdownShouldOpen), filter = js.Any.fromFunction2(filter), filterBy = js.Any.fromFunction3(filterBy), filterable = filterable.asInstanceOf[js.Any], getOptionKey = js.Any.fromFunction1(getOptionKey), getOptionLabel = js.Any.fromFunction1(getOptionLabel), label = label.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], mapKeydown = js.Any.fromFunction2(mapKeydown), multiple = multiple.asInstanceOf[js.Any], noDrop = noDrop.asInstanceOf[js.Any], onTab = js.Any.fromFunction0(onTab), options = options.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], pushTags = pushTags.asInstanceOf[js.Any], reduce = js.Any.fromFunction1(reduce), resetOnOptionsChange = resetOnOptionsChange.asInstanceOf[js.Any], searchInputQuerySelector = searchInputQuerySelector.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], selectOnKeyCodes = selectOnKeyCodes.asInstanceOf[js.Any], selectOnTab = selectOnTab.asInstanceOf[js.Any], selectable = js.Any.fromFunction1(selectable), taggable = taggable.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], inputId = null, tabindex = null)
      __obj.asInstanceOf[VueSelectProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueSelectProps] (val x: Self) extends AnyVal {
      
      inline def setAppendToBody(value: Boolean): Self = StObject.set(x, "appendToBody", value.asInstanceOf[js.Any])
      
      inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutoscroll(value: Boolean): Self = StObject.set(x, "autoscroll", value.asInstanceOf[js.Any])
      
      inline def setCalculatePosition(value: (HTMLUListElement, VueSelectInstance, CalculatedPosition) => Unit | UnbindPositionCallback): Self = StObject.set(x, "calculatePosition", js.Any.fromFunction3(value))
      
      inline def setClearSearchOnBlur(value: ClearSearchOnBlurParameters => Boolean): Self = StObject.set(x, "clearSearchOnBlur", js.Any.fromFunction1(value))
      
      inline def setClearSearchOnSelect(value: Boolean): Self = StObject.set(x, "clearSearchOnSelect", value.asInstanceOf[js.Any])
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setComponents(value: RecordChildComponentNameaDeselect): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setCreateOption(value: String => VueSelectOption): Self = StObject.set(x, "createOption", js.Any.fromFunction1(value))
      
      inline def setDeselectFromDropdown(value: Boolean): Self = StObject.set(x, "deselectFromDropdown", value.asInstanceOf[js.Any])
      
      inline def setDir(value: auto | ltr | rtl): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDropdownShouldOpen(value: VueSelectInstance => Boolean): Self = StObject.set(x, "dropdownShouldOpen", js.Any.fromFunction1(value))
      
      inline def setFilter(value: (js.Array[VueSelectOption], String) => js.Array[VueSelectOption]): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterBy(value: (VueSelectOption, String, String) => Boolean): Self = StObject.set(x, "filterBy", js.Any.fromFunction3(value))
      
      inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
      
      inline def setGetOptionKey(value: /* option */ VueSelectOption => String): Self = StObject.set(x, "getOptionKey", js.Any.fromFunction1(value))
      
      inline def setGetOptionLabel(value: /* option */ VueSelectOption => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
      
      inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      inline def setInputIdNull: Self = StObject.set(x, "inputId", null)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setMapKeydown(value: (KeyEventMap, VueSelectInstance) => KeyEventMap): Self = StObject.set(x, "mapKeydown", js.Any.fromFunction2(value))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setNoDrop(value: Boolean): Self = StObject.set(x, "noDrop", value.asInstanceOf[js.Any])
      
      inline def setOnTab(value: () => Unit): Self = StObject.set(x, "onTab", js.Any.fromFunction0(value))
      
      inline def setOptions(value: js.Array[VueSelectOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: VueSelectOption*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPushTags(value: Boolean): Self = StObject.set(x, "pushTags", value.asInstanceOf[js.Any])
      
      inline def setReduce(value: /* option */ VueSelectOption => Any): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setResetOnOptionsChange(
        value: Boolean | (js.Function3[
              /* newOptions */ js.Array[VueSelectOption], 
              /* oldOptions */ js.Array[VueSelectOption], 
              /* selectedValue */ js.Array[VueSelectOption], 
              Boolean
            ])
      ): Self = StObject.set(x, "resetOnOptionsChange", value.asInstanceOf[js.Any])
      
      inline def setResetOnOptionsChangeFunction3(
        value: (/* newOptions */ js.Array[VueSelectOption], /* oldOptions */ js.Array[VueSelectOption], /* selectedValue */ js.Array[VueSelectOption]) => Boolean
      ): Self = StObject.set(x, "resetOnOptionsChange", js.Any.fromFunction3(value))
      
      inline def setSearchInputQuerySelector(value: String): Self = StObject.set(x, "searchInputQuerySelector", value.asInstanceOf[js.Any])
      
      inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
      
      inline def setSelectOnKeyCodes(value: js.Array[Double]): Self = StObject.set(x, "selectOnKeyCodes", value.asInstanceOf[js.Any])
      
      inline def setSelectOnKeyCodesVarargs(value: Double*): Self = StObject.set(x, "selectOnKeyCodes", js.Array(value*))
      
      inline def setSelectOnTab(value: Boolean): Self = StObject.set(x, "selectOnTab", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: /* option */ VueSelectOption => Boolean): Self = StObject.set(x, "selectable", js.Any.fromFunction1(value))
      
      inline def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      inline def setTabindexNull: Self = StObject.set(x, "tabindex", null)
      
      inline def setTaggable(value: Boolean): Self = StObject.set(x, "taggable", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setUid(value: String | Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: VueSelectOption): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueSelectSlotScope extends StObject {
    
    var footer: ListSlotScopedeselectVueS
    
    var header: ListSlotScopedeselectVueS
    
    var listFooter: ListSlotScope
    
    var listHeader: ListSlotScope
    
    var noOptions: Search
    
    var openIndicator: AttributesClass
    
    var search: Attributes
    
    var spinner: Loading
  }
  object VueSelectSlotScope {
    
    inline def apply(
      footer: ListSlotScopedeselectVueS,
      header: ListSlotScopedeselectVueS,
      listFooter: ListSlotScope,
      listHeader: ListSlotScope,
      noOptions: Search,
      openIndicator: AttributesClass,
      search: Attributes,
      spinner: Loading
    ): VueSelectSlotScope = {
      val __obj = js.Dynamic.literal(footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], listFooter = listFooter.asInstanceOf[js.Any], listHeader = listHeader.asInstanceOf[js.Any], noOptions = noOptions.asInstanceOf[js.Any], openIndicator = openIndicator.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], spinner = spinner.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueSelectSlotScope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueSelectSlotScope] (val x: Self) extends AnyVal {
      
      inline def setFooter(value: ListSlotScopedeselectVueS): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: ListSlotScopedeselectVueS): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setListFooter(value: ListSlotScope): Self = StObject.set(x, "listFooter", value.asInstanceOf[js.Any])
      
      inline def setListHeader(value: ListSlotScope): Self = StObject.set(x, "listHeader", value.asInstanceOf[js.Any])
      
      inline def setNoOptions(value: Search): Self = StObject.set(x, "noOptions", value.asInstanceOf[js.Any])
      
      inline def setOpenIndicator(value: AttributesClass): Self = StObject.set(x, "openIndicator", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Attributes): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSpinner(value: Loading): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueSelectWatch extends StObject {
    
    // in typeAheadPointer mixin:
    def filteredOptions(): Unit
    
    def loading(`val`: Boolean): Unit
    
    def multiple(): Unit
    
    def open(isOpen: Boolean): Unit
    
    def options(newOptions: js.Array[VueSelectOption], old: js.Array[VueSelectOption]): Unit
    
    // in ajax mixin:
    def search(): Unit
    
    // in pointerScroll mixin:
    def typeAheadPointer(): Unit
    
    def value(option: VueSelectOption): Unit
    @JSName("value")
    var value_Original: OptionConsumer[Unit]
  }
  object VueSelectWatch {
    
    inline def apply(
      filteredOptions: () => Unit,
      loading: Boolean => Unit,
      multiple: () => Unit,
      open: Boolean => Unit,
      options: (js.Array[VueSelectOption], js.Array[VueSelectOption]) => Unit,
      search: () => Unit,
      typeAheadPointer: () => Unit,
      value: /* option */ VueSelectOption => Unit
    ): VueSelectWatch = {
      val __obj = js.Dynamic.literal(filteredOptions = js.Any.fromFunction0(filteredOptions), loading = js.Any.fromFunction1(loading), multiple = js.Any.fromFunction0(multiple), open = js.Any.fromFunction1(open), options = js.Any.fromFunction2(options), search = js.Any.fromFunction0(search), typeAheadPointer = js.Any.fromFunction0(typeAheadPointer), value = js.Any.fromFunction1(value))
      __obj.asInstanceOf[VueSelectWatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueSelectWatch] (val x: Self) extends AnyVal {
      
      inline def setFilteredOptions(value: () => Unit): Self = StObject.set(x, "filteredOptions", js.Any.fromFunction0(value))
      
      inline def setLoading(value: Boolean => Unit): Self = StObject.set(x, "loading", js.Any.fromFunction1(value))
      
      inline def setMultiple(value: () => Unit): Self = StObject.set(x, "multiple", js.Any.fromFunction0(value))
      
      inline def setOpen(value: Boolean => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOptions(value: (js.Array[VueSelectOption], js.Array[VueSelectOption]) => Unit): Self = StObject.set(x, "options", js.Any.fromFunction2(value))
      
      inline def setSearch(value: () => Unit): Self = StObject.set(x, "search", js.Any.fromFunction0(value))
      
      inline def setTypeAheadPointer(value: () => Unit): Self = StObject.set(x, "typeAheadPointer", js.Any.fromFunction0(value))
      
      inline def setValue(value: /* option */ VueSelectOption => Unit): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    }
  }
  
  type _To = VueSelectConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueSelectConstructor = default
}
