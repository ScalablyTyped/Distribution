package typings.vueTelInput

import org.scalablytyped.runtime.Shortcut
import typings.std.Event
import typings.vue.optionsMod.DirectiveOptions
import typings.vue.pluginMod.PluginFunction
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-tel-input", JSImport.Default)
  @js.native
  val default: VueTelInputConstructor = js.native
  
  @JSImport("vue-tel-input", "VueTelInput")
  @js.native
  val VueTelInput: VueTelInputConstructor = js.native
  
  trait VueTelInputComputed extends StObject {
    
    def filteredCountries(): js.Array[String]
    
    def formattedResult(): String
    
    def mode(): String
    
    def response(): VueTelInputResponse
    
    def sortedCountries(): js.Array[String]
    
    def state(): Boolean
  }
  object VueTelInputComputed {
    
    @scala.inline
    def apply(
      filteredCountries: () => js.Array[String],
      formattedResult: () => String,
      mode: () => String,
      response: () => VueTelInputResponse,
      sortedCountries: () => js.Array[String],
      state: () => Boolean
    ): VueTelInputComputed = {
      val __obj = js.Dynamic.literal(filteredCountries = js.Any.fromFunction0(filteredCountries), formattedResult = js.Any.fromFunction0(formattedResult), mode = js.Any.fromFunction0(mode), response = js.Any.fromFunction0(response), sortedCountries = js.Any.fromFunction0(sortedCountries), state = js.Any.fromFunction0(state))
      __obj.asInstanceOf[VueTelInputComputed]
    }
    
    @scala.inline
    implicit class VueTelInputComputedMutableBuilder[Self <: VueTelInputComputed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilteredCountries(value: () => js.Array[String]): Self = StObject.set(x, "filteredCountries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFormattedResult(value: () => String): Self = StObject.set(x, "formattedResult", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMode(value: () => String): Self = StObject.set(x, "mode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResponse(value: () => VueTelInputResponse): Self = StObject.set(x, "response", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSortedCountries(value: () => js.Array[String]): Self = StObject.set(x, "sortedCountries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setState(value: () => Boolean): Self = StObject.set(x, "state", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait VueTelInputConstructor
    extends StObject
       with VueConstructor[Vue] {
    
    var computed: VueTelInputComputed = js.native
    
    def data(): VueTelInputData = js.native
    
    var directives: VueTelInputDirective = js.native
    
    def install(Vue: VueConstructor[Vue]): Unit = js.native
    def install(Vue: VueConstructor[Vue], options: scala.Nothing): Unit = js.native
    @JSName("install")
    var install_Original: PluginFunction[scala.Nothing] = js.native
    
    var methods: VueTelInputMethods = js.native
    
    var props: VueTelInputProps = js.native
    
    var watch: VueTelInputWatch = js.native
  }
  
  trait VueTelInputCountryOption extends StObject {
    
    var iso2: String
  }
  object VueTelInputCountryOption {
    
    @scala.inline
    def apply(iso2: String): VueTelInputCountryOption = {
      val __obj = js.Dynamic.literal(iso2 = iso2.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputCountryOption]
    }
    
    @scala.inline
    implicit class VueTelInputCountryOptionMutableBuilder[Self <: VueTelInputCountryOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputData extends StObject {
    
    var activeCountry: VueTelInputCountryOption
    
    var open: Boolean
    
    var phone: String
    
    var selectedIndex: js.Any
    
    var typeToFindInput: String
    
    var typeToFindTimer: js.Any
  }
  object VueTelInputData {
    
    @scala.inline
    def apply(
      activeCountry: VueTelInputCountryOption,
      open: Boolean,
      phone: String,
      selectedIndex: js.Any,
      typeToFindInput: String,
      typeToFindTimer: js.Any
    ): VueTelInputData = {
      val __obj = js.Dynamic.literal(activeCountry = activeCountry.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], typeToFindInput = typeToFindInput.asInstanceOf[js.Any], typeToFindTimer = typeToFindTimer.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputData]
    }
    
    @scala.inline
    implicit class VueTelInputDataMutableBuilder[Self <: VueTelInputData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveCountry(value: VueTelInputCountryOption): Self = StObject.set(x, "activeCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndex(value: js.Any): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeToFindInput(value: String): Self = StObject.set(x, "typeToFindInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeToFindTimer(value: js.Any): Self = StObject.set(x, "typeToFindTimer", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputDirective extends StObject {
    
    var `click-outside`: DirectiveOptions
  }
  object VueTelInputDirective {
    
    @scala.inline
    def apply(`click-outside`: DirectiveOptions): VueTelInputDirective = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("click-outside")(`click-outside`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputDirective]
    }
    
    @scala.inline
    implicit class VueTelInputDirectiveMutableBuilder[Self <: VueTelInputDirective] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setClick-outside`(value: DirectiveOptions): Self = StObject.set(x, "click-outside", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputDowndownOption extends StObject {
    
    var disabledDialCode: Boolean
  }
  object VueTelInputDowndownOption {
    
    @scala.inline
    def apply(disabledDialCode: Boolean): VueTelInputDowndownOption = {
      val __obj = js.Dynamic.literal(disabledDialCode = disabledDialCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputDowndownOption]
    }
    
    @scala.inline
    implicit class VueTelInputDowndownOptionMutableBuilder[Self <: VueTelInputDowndownOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabledDialCode(value: Boolean): Self = StObject.set(x, "disabledDialCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputInputOption extends StObject {
    
    var showDialCode: Boolean
  }
  object VueTelInputInputOption {
    
    @scala.inline
    def apply(showDialCode: Boolean): VueTelInputInputOption = {
      val __obj = js.Dynamic.literal(showDialCode = showDialCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputInputOption]
    }
    
    @scala.inline
    implicit class VueTelInputInputOptionMutableBuilder[Self <: VueTelInputInputOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowDialCode(value: Boolean): Self = StObject.set(x, "showDialCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputMethods extends StObject {
    
    def choose(country: js.Any): Unit
    
    def clickedOutside(): Unit
    
    def findCountry(iso: String): js.Array[js.Any]
    
    def getCountries(list: js.Array[js.Any]): js.Array[js.Any]
    
    def getItemClass(index: Double, iso2: String): js.Any
    
    def initializeCountry(): Unit
    
    def keyboardNav(e: Event): Unit
    
    def onBlur(): Unit
    
    def onInput(): Unit
    
    def reset(): Unit
    
    def toggleDropdown(): Unit
  }
  object VueTelInputMethods {
    
    @scala.inline
    def apply(
      choose: js.Any => Unit,
      clickedOutside: () => Unit,
      findCountry: String => js.Array[js.Any],
      getCountries: js.Array[js.Any] => js.Array[js.Any],
      getItemClass: (Double, String) => js.Any,
      initializeCountry: () => Unit,
      keyboardNav: Event => Unit,
      onBlur: () => Unit,
      onInput: () => Unit,
      reset: () => Unit,
      toggleDropdown: () => Unit
    ): VueTelInputMethods = {
      val __obj = js.Dynamic.literal(choose = js.Any.fromFunction1(choose), clickedOutside = js.Any.fromFunction0(clickedOutside), findCountry = js.Any.fromFunction1(findCountry), getCountries = js.Any.fromFunction1(getCountries), getItemClass = js.Any.fromFunction2(getItemClass), initializeCountry = js.Any.fromFunction0(initializeCountry), keyboardNav = js.Any.fromFunction1(keyboardNav), onBlur = js.Any.fromFunction0(onBlur), onInput = js.Any.fromFunction0(onInput), reset = js.Any.fromFunction0(reset), toggleDropdown = js.Any.fromFunction0(toggleDropdown))
      __obj.asInstanceOf[VueTelInputMethods]
    }
    
    @scala.inline
    implicit class VueTelInputMethodsMutableBuilder[Self <: VueTelInputMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoose(value: js.Any => Unit): Self = StObject.set(x, "choose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickedOutside(value: () => Unit): Self = StObject.set(x, "clickedOutside", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFindCountry(value: String => js.Array[js.Any]): Self = StObject.set(x, "findCountry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCountries(value: js.Array[js.Any] => js.Array[js.Any]): Self = StObject.set(x, "getCountries", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetItemClass(value: (Double, String) => js.Any): Self = StObject.set(x, "getItemClass", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInitializeCountry(value: () => Unit): Self = StObject.set(x, "initializeCountry", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKeyboardNav(value: Event => Unit): Self = StObject.set(x, "keyboardNav", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnInput(value: () => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggleDropdown(value: () => Unit): Self = StObject.set(x, "toggleDropdown", js.Any.fromFunction0(value))
    }
  }
  
  trait VueTelInputProps extends StObject {
    
    var autocomplete: String
    
    var defaultCountry: String
    
    var disabled: Boolean
    
    var disabledFetchingCountry: Boolean
    
    var disabledFormatting: Boolean
    
    var dropdownOptions: VueTelInputDowndownOption
    
    var enabledCountryCode: Boolean
    
    var enabledFlags: Boolean
    
    var ignoredCountries: js.Array[js.Any]
    
    var inputClasses: String
    
    var inputOptions: VueTelInputInputOption
    
    var invalidMsg: String
    
    var maxLen: Double
    
    var name: String
    
    var onlyCountries: js.Array[js.Any]
    
    var placeholder: String
    
    var preferredCountries: Boolean
    
    var required: Boolean
    
    var value: String
    
    var wrapperClasses: String
  }
  object VueTelInputProps {
    
    @scala.inline
    def apply(
      autocomplete: String,
      defaultCountry: String,
      disabled: Boolean,
      disabledFetchingCountry: Boolean,
      disabledFormatting: Boolean,
      dropdownOptions: VueTelInputDowndownOption,
      enabledCountryCode: Boolean,
      enabledFlags: Boolean,
      ignoredCountries: js.Array[js.Any],
      inputClasses: String,
      inputOptions: VueTelInputInputOption,
      invalidMsg: String,
      maxLen: Double,
      name: String,
      onlyCountries: js.Array[js.Any],
      placeholder: String,
      preferredCountries: Boolean,
      required: Boolean,
      value: String,
      wrapperClasses: String
    ): VueTelInputProps = {
      val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], defaultCountry = defaultCountry.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledFetchingCountry = disabledFetchingCountry.asInstanceOf[js.Any], disabledFormatting = disabledFormatting.asInstanceOf[js.Any], dropdownOptions = dropdownOptions.asInstanceOf[js.Any], enabledCountryCode = enabledCountryCode.asInstanceOf[js.Any], enabledFlags = enabledFlags.asInstanceOf[js.Any], ignoredCountries = ignoredCountries.asInstanceOf[js.Any], inputClasses = inputClasses.asInstanceOf[js.Any], inputOptions = inputOptions.asInstanceOf[js.Any], invalidMsg = invalidMsg.asInstanceOf[js.Any], maxLen = maxLen.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onlyCountries = onlyCountries.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], preferredCountries = preferredCountries.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], wrapperClasses = wrapperClasses.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputProps]
    }
    
    @scala.inline
    implicit class VueTelInputPropsMutableBuilder[Self <: VueTelInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCountry(value: String): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledFetchingCountry(value: Boolean): Self = StObject.set(x, "disabledFetchingCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledFormatting(value: Boolean): Self = StObject.set(x, "disabledFormatting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownOptions(value: VueTelInputDowndownOption): Self = StObject.set(x, "dropdownOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledCountryCode(value: Boolean): Self = StObject.set(x, "enabledCountryCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledFlags(value: Boolean): Self = StObject.set(x, "enabledFlags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredCountries(value: js.Array[js.Any]): Self = StObject.set(x, "ignoredCountries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredCountriesVarargs(value: js.Any*): Self = StObject.set(x, "ignoredCountries", js.Array(value :_*))
      
      @scala.inline
      def setInputClasses(value: String): Self = StObject.set(x, "inputClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputOptions(value: VueTelInputInputOption): Self = StObject.set(x, "inputOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidMsg(value: String): Self = StObject.set(x, "invalidMsg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLen(value: Double): Self = StObject.set(x, "maxLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyCountries(value: js.Array[js.Any]): Self = StObject.set(x, "onlyCountries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyCountriesVarargs(value: js.Any*): Self = StObject.set(x, "onlyCountries", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredCountries(value: Boolean): Self = StObject.set(x, "preferredCountries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperClasses(value: String): Self = StObject.set(x, "wrapperClasses", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputResponse extends StObject {
    
    var country: VueTelInputCountryOption
    
    var isValid: Boolean
    
    var number: String
  }
  object VueTelInputResponse {
    
    @scala.inline
    def apply(country: VueTelInputCountryOption, isValid: Boolean, number: String): VueTelInputResponse = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputResponse]
    }
    
    @scala.inline
    implicit class VueTelInputResponseMutableBuilder[Self <: VueTelInputResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: VueTelInputCountryOption): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputWatch extends StObject {
    
    def state(value: js.Any): Unit
    
    def value(): Unit
  }
  object VueTelInputWatch {
    
    @scala.inline
    def apply(state: js.Any => Unit, value: () => Unit): VueTelInputWatch = {
      val __obj = js.Dynamic.literal(state = js.Any.fromFunction1(state), value = js.Any.fromFunction0(value))
      __obj.asInstanceOf[VueTelInputWatch]
    }
    
    @scala.inline
    implicit class VueTelInputWatchMutableBuilder[Self <: VueTelInputWatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setState(value: js.Any => Unit): Self = StObject.set(x, "state", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: () => Unit): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    }
  }
  
  type _To = VueTelInputConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueTelInputConstructor = default
}
