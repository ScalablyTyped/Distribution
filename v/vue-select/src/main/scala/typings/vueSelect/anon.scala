package typings.vueSelect

import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import typings.std.KeyboardEvent
import typings.std.ReturnType
import typings.vueRuntimeCore.mod.ComponentOptions
import typings.vueSelect.mod.OptionConsumer
import typings.vueSelect.mod.VueSelectOption
import typings.vueSelect.vueSelectStrings.`vs__open-indicator`
import typings.vueSelect.vueSelectStrings.list
import typings.vueSelect.vueSelectStrings.openIndicator_
import typings.vueSelect.vueSelectStrings.presentation
import typings.vueSelect.vueSelectStrings.search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actions extends StObject {
    
    var actions: HTMLDivElement
    
    var clearButton: HTMLButtonElement
    
    var dropdownMenu: js.UndefOr[HTMLUListElement] = js.undefined
    
    var search: HTMLInputElement
    
    var selectedOptions: HTMLDivElement
    
    var toggle: HTMLDivElement
  }
  object Actions {
    
    inline def apply(
      actions: HTMLDivElement,
      clearButton: HTMLButtonElement,
      search: HTMLInputElement,
      selectedOptions: HTMLDivElement,
      toggle: HTMLDivElement
    ): Actions = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], clearButton = clearButton.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], selectedOptions = selectedOptions.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Actions]
    }
    
    extension [Self <: Actions](x: Self) {
      
      inline def setActions(value: HTMLDivElement): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setClearButton(value: HTMLButtonElement): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
      
      inline def setDropdownMenu(value: HTMLUListElement): Self = StObject.set(x, "dropdownMenu", value.asInstanceOf[js.Any])
      
      inline def setDropdownMenuUndefined: Self = StObject.set(x, "dropdownMenu", js.undefined)
      
      inline def setSearch(value: HTMLInputElement): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSelectedOptions(value: HTMLDivElement): Self = StObject.set(x, "selectedOptions", value.asInstanceOf[js.Any])
      
      inline def setToggle(value: HTMLDivElement): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ariaactivedescendant extends StObject {
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-autocomplete`: list
    
    var `aria-controls`: String
    
    var `aria-labelledby`: String
    
    var autocomplete: String
    
    var disabled: Boolean
    
    var id: String | Null
    
    var placeholder: String
    
    var readonly: Boolean
    
    var ref: search
    
    var tabindex: Double | Null
    
    var `type`: search
    
    var value: String
  }
  object Ariaactivedescendant {
    
    inline def apply(
      `aria-controls`: String,
      `aria-labelledby`: String,
      autocomplete: String,
      disabled: Boolean,
      placeholder: String,
      readonly: Boolean,
      value: String
    ): Ariaactivedescendant = {
      val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], ref = "search", value = value.asInstanceOf[js.Any], id = null, tabindex = null)
      __obj.updateDynamic("aria-autocomplete")("list")
      __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("search")
      __obj.asInstanceOf[Ariaactivedescendant]
    }
    
    extension [Self <: Ariaactivedescendant](x: Self) {
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-autocomplete`(value: list): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setRef(value: search): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      inline def setTabindexNull: Self = StObject.set(x, "tabindex", null)
      
      inline def setType(value: search): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Attributes extends StObject {
    
    var attributes: Ariaactivedescendant
    
    var events: Blur
  }
  object Attributes {
    
    inline def apply(attributes: Ariaactivedescendant, events: Blur): Attributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setAttributes(value: Ariaactivedescendant): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: Blur): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttributesClass extends StObject {
    
    var attributes: Class
  }
  object AttributesClass {
    
    inline def apply(attributes: Class): AttributesClass = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributesClass]
    }
    
    extension [Self <: AttributesClass](x: Self) {
      
      inline def setAttributes(value: Class): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Blur extends StObject {
    
    def blur(): Unit
    @JSName("blur")
    var blur_Original: js.Function0[Unit]
    
    def compositionend(): Any
    
    def compositionstart(): Any
    
    def focus(): Unit
    @JSName("focus")
    var focus_Original: js.Function0[Unit]
    
    def input(event: KeyboardEvent): Any
    
    def keydown(event: KeyboardEvent): Any
    @JSName("keydown")
    var keydown_Original: js.Function1[/* event */ KeyboardEvent, Any]
  }
  object Blur {
    
    inline def apply(
      blur: () => Unit,
      compositionend: () => Any,
      compositionstart: () => Any,
      focus: () => Unit,
      input: KeyboardEvent => Any,
      keydown: /* event */ KeyboardEvent => Any
    ): Blur = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), compositionend = js.Any.fromFunction0(compositionend), compositionstart = js.Any.fromFunction0(compositionstart), focus = js.Any.fromFunction0(focus), input = js.Any.fromFunction1(input), keydown = js.Any.fromFunction1(keydown))
      __obj.asInstanceOf[Blur]
    }
    
    extension [Self <: Blur](x: Self) {
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setCompositionend(value: () => Any): Self = StObject.set(x, "compositionend", js.Any.fromFunction0(value))
      
      inline def setCompositionstart(value: () => Any): Self = StObject.set(x, "compositionstart", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setInput(value: KeyboardEvent => Any): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
      
      inline def setKeydown(value: /* event */ KeyboardEvent => Any): Self = StObject.set(x, "keydown", js.Any.fromFunction1(value))
    }
  }
  
  trait Class extends StObject {
    
    var `class`: `vs__open-indicator`
    
    var ref: openIndicator_
    
    var role: presentation
  }
  object Class {
    
    inline def apply(): Class = {
      val __obj = js.Dynamic.literal(ref = "openIndicator", role = "presentation")
      __obj.updateDynamic("class")("vs__open-indicator")
      __obj.asInstanceOf[Class]
    }
    
    extension [Self <: Class](x: Self) {
      
      inline def setClass(value: `vs__open-indicator`): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setRef(value: openIndicator_): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRole(value: presentation): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined vue-select.vue-select.ListSlotScope & {  deselect :vue-select.vue-select.VueSelectMethods['deselect']} */
  trait ListSlotScopedeselectVueS extends StObject {
    
    def deselect(option: VueSelectOption): Unit
    @JSName("deselect")
    var deselect_Original: OptionConsumer[Unit]
    
    var filteredOptions: ReturnType[js.Function0[js.Array[VueSelectOption]]]
    
    var loading: Boolean
    
    var search: String
    
    var searching: ReturnType[js.Function0[Boolean]]
  }
  object ListSlotScopedeselectVueS {
    
    inline def apply(
      deselect: /* option */ VueSelectOption => Unit,
      filteredOptions: ReturnType[js.Function0[js.Array[VueSelectOption]]],
      loading: Boolean,
      search: String,
      searching: ReturnType[js.Function0[Boolean]]
    ): ListSlotScopedeselectVueS = {
      val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction1(deselect), filteredOptions = filteredOptions.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searching = searching.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListSlotScopedeselectVueS]
    }
    
    extension [Self <: ListSlotScopedeselectVueS](x: Self) {
      
      inline def setDeselect(value: /* option */ VueSelectOption => Unit): Self = StObject.set(x, "deselect", js.Any.fromFunction1(value))
      
      inline def setFilteredOptions(value: ReturnType[js.Function0[js.Array[VueSelectOption]]]): Self = StObject.set(x, "filteredOptions", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearching(value: ReturnType[js.Function0[Boolean]]): Self = StObject.set(x, "searching", value.asInstanceOf[js.Any])
    }
  }
  
  trait Loading extends StObject {
    
    var loading: Boolean
  }
  object Loading {
    
    inline def apply(loading: Boolean): Loading = {
      val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
      __obj.asInstanceOf[Loading]
    }
    
    extension [Self <: Loading](x: Self) {
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<vue-select.vue-select.ChildComponentName, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any> */
  trait RecordChildComponentNamea extends StObject {
    
    var Deselect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any
    
    var OpenIndicator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any
  }
  object RecordChildComponentNamea {
    
    inline def apply(
      Deselect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any,
      OpenIndicator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any
    ): RecordChildComponentNamea = {
      val __obj = js.Dynamic.literal(Deselect = Deselect.asInstanceOf[js.Any], OpenIndicator = OpenIndicator.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordChildComponentNamea]
    }
    
    extension [Self <: RecordChildComponentNamea](x: Self) {
      
      inline def setDeselect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any
      ): Self = StObject.set(x, "Deselect", value.asInstanceOf[js.Any])
      
      inline def setOpenIndicator(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any
      ): Self = StObject.set(x, "OpenIndicator", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<vue-select.vue-select.ChildComponentName, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any | vue.vue.ComponentOptions</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue * / any, any, any, any, any, any, any, any>> */
  trait RecordChildComponentNameaDeselect extends StObject {
    
    var Deselect: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any) | (ComponentOptions[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any, 
        Any, 
        Any, 
        Any, 
        Any, 
        Any, 
        Any, 
        Any
      ])
    
    var OpenIndicator: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any) | (ComponentOptions[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any, 
        Any, 
        Any, 
        Any, 
        Any, 
        Any, 
        Any, 
        Any
      ])
  }
  object RecordChildComponentNameaDeselect {
    
    inline def apply(
      Deselect: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any) | (ComponentOptions[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any, 
          Any, 
          Any, 
          Any, 
          Any, 
          Any, 
          Any, 
          Any
        ]),
      OpenIndicator: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any) | (ComponentOptions[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any, 
          Any, 
          Any, 
          Any, 
          Any, 
          Any, 
          Any, 
          Any
        ])
    ): RecordChildComponentNameaDeselect = {
      val __obj = js.Dynamic.literal(Deselect = Deselect.asInstanceOf[js.Any], OpenIndicator = OpenIndicator.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordChildComponentNameaDeselect]
    }
    
    extension [Self <: RecordChildComponentNameaDeselect](x: Self) {
      
      inline def setDeselect(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any) | (ComponentOptions[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any, 
              Any, 
              Any, 
              Any, 
              Any, 
              Any, 
              Any, 
              Any
            ])
      ): Self = StObject.set(x, "Deselect", value.asInstanceOf[js.Any])
      
      inline def setOpenIndicator(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any) | (ComponentOptions[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any, 
              Any, 
              Any, 
              Any, 
              Any, 
              Any, 
              Any, 
              Any
            ])
      ): Self = StObject.set(x, "OpenIndicator", value.asInstanceOf[js.Any])
    }
  }
  
  trait Refs extends StObject {
    
    @JSName("$refs")
    var $refs: Actions
  }
  object Refs {
    
    inline def apply($refs: Actions): Refs = {
      val __obj = js.Dynamic.literal($refs = $refs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Refs]
    }
    
    extension [Self <: Refs](x: Self) {
      
      inline def set$refs(value: Actions): Self = StObject.set(x, "$refs", value.asInstanceOf[js.Any])
    }
  }
  
  trait Search extends StObject {
    
    var loading: Boolean
    
    var search: String
    
    var searching: ReturnType[js.Function0[Boolean]]
  }
  object Search {
    
    inline def apply(loading: Boolean, search: String, searching: ReturnType[js.Function0[Boolean]]): Search = {
      val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searching = searching.asInstanceOf[js.Any])
      __obj.asInstanceOf[Search]
    }
    
    extension [Self <: Search](x: Self) {
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearching(value: ReturnType[js.Function0[Boolean]]): Self = StObject.set(x, "searching", value.asInstanceOf[js.Any])
    }
  }
}
