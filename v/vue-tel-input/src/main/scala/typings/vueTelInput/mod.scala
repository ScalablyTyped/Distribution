package typings.vueTelInput

import org.scalablytyped.runtime.Shortcut
import typings.std.Event
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
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: VueTelInputComputed] (val x: Self) extends AnyVal {
      
      inline def setFilteredCountries(value: () => js.Array[String]): Self = StObject.set(x, "filteredCountries", js.Any.fromFunction0(value))
      
      inline def setFormattedResult(value: () => String): Self = StObject.set(x, "formattedResult", js.Any.fromFunction0(value))
      
      inline def setMode(value: () => String): Self = StObject.set(x, "mode", js.Any.fromFunction0(value))
      
      inline def setResponse(value: () => VueTelInputResponse): Self = StObject.set(x, "response", js.Any.fromFunction0(value))
      
      inline def setSortedCountries(value: () => js.Array[String]): Self = StObject.set(x, "sortedCountries", js.Any.fromFunction0(value))
      
      inline def setState(value: () => Boolean): Self = StObject.set(x, "state", js.Any.fromFunction0(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait VueTelInputConstructor extends StObject {
    
    var computed: VueTelInputComputed
    
    def data(): VueTelInputData
    
    var directives: VueTelInputDirective
    
    var install: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFunction<never> */ Any
    
    var methods: VueTelInputMethods
    
    var props: VueTelInputProps
    
    var watch: VueTelInputWatch
  }
  object VueTelInputConstructor {
    
    inline def apply(
      computed: VueTelInputComputed,
      data: () => VueTelInputData,
      directives: VueTelInputDirective,
      install: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFunction<never> */ Any,
      methods: VueTelInputMethods,
      props: VueTelInputProps,
      watch: VueTelInputWatch
    ): VueTelInputConstructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = js.Any.fromFunction0(data), directives = directives.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputConstructor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueTelInputConstructor] (val x: Self) extends AnyVal {
      
      inline def setComputed(value: VueTelInputComputed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: () => VueTelInputData): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setDirectives(value: VueTelInputDirective): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setInstall(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFunction<never> */ Any
      ): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: VueTelInputMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: VueTelInputProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: VueTelInputWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputCountryOption extends StObject {
    
    var iso2: String
  }
  object VueTelInputCountryOption {
    
    inline def apply(iso2: String): VueTelInputCountryOption = {
      val __obj = js.Dynamic.literal(iso2 = iso2.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputCountryOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueTelInputCountryOption] (val x: Self) extends AnyVal {
      
      inline def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputData extends StObject {
    
    var activeCountry: VueTelInputCountryOption
    
    var open: Boolean
    
    var phone: String
    
    var selectedIndex: Any
    
    var typeToFindInput: String
    
    var typeToFindTimer: Any
  }
  object VueTelInputData {
    
    inline def apply(
      activeCountry: VueTelInputCountryOption,
      open: Boolean,
      phone: String,
      selectedIndex: Any,
      typeToFindInput: String,
      typeToFindTimer: Any
    ): VueTelInputData = {
      val __obj = js.Dynamic.literal(activeCountry = activeCountry.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], typeToFindInput = typeToFindInput.asInstanceOf[js.Any], typeToFindTimer = typeToFindTimer.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueTelInputData] (val x: Self) extends AnyVal {
      
      inline def setActiveCountry(value: VueTelInputCountryOption): Self = StObject.set(x, "activeCountry", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndex(value: Any): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setTypeToFindInput(value: String): Self = StObject.set(x, "typeToFindInput", value.asInstanceOf[js.Any])
      
      inline def setTypeToFindTimer(value: Any): Self = StObject.set(x, "typeToFindTimer", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputDirective extends StObject {
    
    var `click-outside`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DirectiveOptions */ Any
  }
  object VueTelInputDirective {
    
    inline def apply(
      `click-outside`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DirectiveOptions */ Any
    ): VueTelInputDirective = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("click-outside")(`click-outside`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputDirective]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueTelInputDirective] (val x: Self) extends AnyVal {
      
      inline def `setClick-outside`(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DirectiveOptions */ Any
      ): Self = StObject.set(x, "click-outside", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputDowndownOption extends StObject {
    
    var disabledDialCode: Boolean
  }
  object VueTelInputDowndownOption {
    
    inline def apply(disabledDialCode: Boolean): VueTelInputDowndownOption = {
      val __obj = js.Dynamic.literal(disabledDialCode = disabledDialCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputDowndownOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueTelInputDowndownOption] (val x: Self) extends AnyVal {
      
      inline def setDisabledDialCode(value: Boolean): Self = StObject.set(x, "disabledDialCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputInputOption extends StObject {
    
    var showDialCode: Boolean
  }
  object VueTelInputInputOption {
    
    inline def apply(showDialCode: Boolean): VueTelInputInputOption = {
      val __obj = js.Dynamic.literal(showDialCode = showDialCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputInputOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueTelInputInputOption] (val x: Self) extends AnyVal {
      
      inline def setShowDialCode(value: Boolean): Self = StObject.set(x, "showDialCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputMethods extends StObject {
    
    def choose(country: Any): Unit
    
    def clickedOutside(): Unit
    
    def findCountry(iso: String): js.Array[Any]
    
    def getCountries(list: js.Array[Any]): js.Array[Any]
    
    def getItemClass(index: Double, iso2: String): Any
    
    def initializeCountry(): Unit
    
    def keyboardNav(e: Event): Unit
    
    def onBlur(): Unit
    
    def onInput(): Unit
    
    def reset(): Unit
    
    def toggleDropdown(): Unit
  }
  object VueTelInputMethods {
    
    inline def apply(
      choose: Any => Unit,
      clickedOutside: () => Unit,
      findCountry: String => js.Array[Any],
      getCountries: js.Array[Any] => js.Array[Any],
      getItemClass: (Double, String) => Any,
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
    implicit open class MutableBuilder[Self <: VueTelInputMethods] (val x: Self) extends AnyVal {
      
      inline def setChoose(value: Any => Unit): Self = StObject.set(x, "choose", js.Any.fromFunction1(value))
      
      inline def setClickedOutside(value: () => Unit): Self = StObject.set(x, "clickedOutside", js.Any.fromFunction0(value))
      
      inline def setFindCountry(value: String => js.Array[Any]): Self = StObject.set(x, "findCountry", js.Any.fromFunction1(value))
      
      inline def setGetCountries(value: js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "getCountries", js.Any.fromFunction1(value))
      
      inline def setGetItemClass(value: (Double, String) => Any): Self = StObject.set(x, "getItemClass", js.Any.fromFunction2(value))
      
      inline def setInitializeCountry(value: () => Unit): Self = StObject.set(x, "initializeCountry", js.Any.fromFunction0(value))
      
      inline def setKeyboardNav(value: Event => Unit): Self = StObject.set(x, "keyboardNav", js.Any.fromFunction1(value))
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnInput(value: () => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setToggleDropdown(value: () => Unit): Self = StObject.set(x, "toggleDropdown", js.Any.fromFunction0(value))
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
    
    var ignoredCountries: js.Array[Any]
    
    var inputClasses: String
    
    var inputOptions: VueTelInputInputOption
    
    var invalidMsg: String
    
    var maxLen: Double
    
    var name: String
    
    var onlyCountries: js.Array[Any]
    
    var placeholder: String
    
    var preferredCountries: Boolean
    
    var required: Boolean
    
    var value: String
    
    var wrapperClasses: String
  }
  object VueTelInputProps {
    
    inline def apply(
      autocomplete: String,
      defaultCountry: String,
      disabled: Boolean,
      disabledFetchingCountry: Boolean,
      disabledFormatting: Boolean,
      dropdownOptions: VueTelInputDowndownOption,
      enabledCountryCode: Boolean,
      enabledFlags: Boolean,
      ignoredCountries: js.Array[Any],
      inputClasses: String,
      inputOptions: VueTelInputInputOption,
      invalidMsg: String,
      maxLen: Double,
      name: String,
      onlyCountries: js.Array[Any],
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
    implicit open class MutableBuilder[Self <: VueTelInputProps] (val x: Self) extends AnyVal {
      
      inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setDefaultCountry(value: String): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledFetchingCountry(value: Boolean): Self = StObject.set(x, "disabledFetchingCountry", value.asInstanceOf[js.Any])
      
      inline def setDisabledFormatting(value: Boolean): Self = StObject.set(x, "disabledFormatting", value.asInstanceOf[js.Any])
      
      inline def setDropdownOptions(value: VueTelInputDowndownOption): Self = StObject.set(x, "dropdownOptions", value.asInstanceOf[js.Any])
      
      inline def setEnabledCountryCode(value: Boolean): Self = StObject.set(x, "enabledCountryCode", value.asInstanceOf[js.Any])
      
      inline def setEnabledFlags(value: Boolean): Self = StObject.set(x, "enabledFlags", value.asInstanceOf[js.Any])
      
      inline def setIgnoredCountries(value: js.Array[Any]): Self = StObject.set(x, "ignoredCountries", value.asInstanceOf[js.Any])
      
      inline def setIgnoredCountriesVarargs(value: Any*): Self = StObject.set(x, "ignoredCountries", js.Array(value*))
      
      inline def setInputClasses(value: String): Self = StObject.set(x, "inputClasses", value.asInstanceOf[js.Any])
      
      inline def setInputOptions(value: VueTelInputInputOption): Self = StObject.set(x, "inputOptions", value.asInstanceOf[js.Any])
      
      inline def setInvalidMsg(value: String): Self = StObject.set(x, "invalidMsg", value.asInstanceOf[js.Any])
      
      inline def setMaxLen(value: Double): Self = StObject.set(x, "maxLen", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnlyCountries(value: js.Array[Any]): Self = StObject.set(x, "onlyCountries", value.asInstanceOf[js.Any])
      
      inline def setOnlyCountriesVarargs(value: Any*): Self = StObject.set(x, "onlyCountries", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPreferredCountries(value: Boolean): Self = StObject.set(x, "preferredCountries", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWrapperClasses(value: String): Self = StObject.set(x, "wrapperClasses", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputResponse extends StObject {
    
    var country: VueTelInputCountryOption
    
    var isValid: Boolean
    
    var number: String
  }
  object VueTelInputResponse {
    
    inline def apply(country: VueTelInputCountryOption, isValid: Boolean, number: String): VueTelInputResponse = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueTelInputResponse] (val x: Self) extends AnyVal {
      
      inline def setCountry(value: VueTelInputCountryOption): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputWatch extends StObject {
    
    def state(value: Any): Unit
    
    def value(): Unit
  }
  object VueTelInputWatch {
    
    inline def apply(state: Any => Unit, value: () => Unit): VueTelInputWatch = {
      val __obj = js.Dynamic.literal(state = js.Any.fromFunction1(state), value = js.Any.fromFunction0(value))
      __obj.asInstanceOf[VueTelInputWatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueTelInputWatch] (val x: Self) extends AnyVal {
      
      inline def setState(value: Any => Unit): Self = StObject.set(x, "state", js.Any.fromFunction1(value))
      
      inline def setValue(value: () => Unit): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    }
  }
  
  type _To = VueTelInputConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueTelInputConstructor = default
}
