package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Date
import typings.std.Element
import typings.std.Event
import typings.wixStyleReact.anon.Format
import typings.wixStyleReact.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarPanelMod {
  
  @JSImport("wix-style-react/dist/es/src/CalendarPanel", JSImport.Default)
  @js.native
  class default () extends CalendarPanel
  
  @js.native
  trait CalendarPanel
    extends Component[CalendarPanelProps, js.Object, js.Any] {
    
    def getSelectedPresetId(): String | Double = js.native
    
    def isSubmitDisabled(): Boolean = js.native
    
    def onSelectPreset(): Unit = js.native
  }
  
  trait CalendarPanelProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var excludePastDates: js.UndefOr[Boolean] = js.undefined
    
    var filterDate: js.UndefOr[js.Function1[/* date */ Date, Boolean]] = js.undefined
    
    var footer: js.UndefOr[
        js.Function2[/* selectedDays */ SelectedDaysType, /* submitDisabled */ Boolean, Unit]
      ] = js.undefined
    
    var locale: js.UndefOr[LanguageType | Format] = js.undefined
    
    var numOfMonths: js.UndefOr[Double] = js.undefined
    
    def onChange(selectedDays: SelectedDaysType): Unit
    
    var onClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var presets: js.UndefOr[js.Array[PresetType] | Id] = js.undefined
    
    var selectionMode: js.UndefOr[SelectionModeType] = js.undefined
    
    var shouldCloseOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var showMonthDropdown: js.UndefOr[Boolean] = js.undefined
    
    var showYearDropdown: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[SelectedDaysType] = js.undefined
  }
  object CalendarPanelProps {
    
    @scala.inline
    def apply(onChange: SelectedDaysType => Unit): CalendarPanelProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[CalendarPanelProps]
    }
    
    @scala.inline
    implicit class CalendarPanelPropsMutableBuilder[Self <: CalendarPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setExcludePastDates(value: Boolean): Self = StObject.set(x, "excludePastDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludePastDatesUndefined: Self = StObject.set(x, "excludePastDates", js.undefined)
      
      @scala.inline
      def setFilterDate(value: /* date */ Date => Boolean): Self = StObject.set(x, "filterDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
      
      @scala.inline
      def setFooter(value: (/* selectedDays */ SelectedDaysType, /* submitDisabled */ Boolean) => Unit): Self = StObject.set(x, "footer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setLocale(value: LanguageType | Format): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setNumOfMonths(value: Double): Self = StObject.set(x, "numOfMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumOfMonthsUndefined: Self = StObject.set(x, "numOfMonths", js.undefined)
      
      @scala.inline
      def setOnChange(value: SelectedDaysType => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClose(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPresets(value: js.Array[PresetType] | Id): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      @scala.inline
      def setPresetsVarargs(value: PresetType*): Self = StObject.set(x, "presets", js.Array(value :_*))
      
      @scala.inline
      def setSelectionMode(value: SelectionModeType): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setShouldCloseOnSelect(value: Boolean): Self = StObject.set(x, "shouldCloseOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldCloseOnSelectUndefined: Self = StObject.set(x, "shouldCloseOnSelect", js.undefined)
      
      @scala.inline
      def setShowMonthDropdown(value: Boolean): Self = StObject.set(x, "showMonthDropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMonthDropdownUndefined: Self = StObject.set(x, "showMonthDropdown", js.undefined)
      
      @scala.inline
      def setShowYearDropdown(value: Boolean): Self = StObject.set(x, "showYearDropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowYearDropdownUndefined: Self = StObject.set(x, "showYearDropdown", js.undefined)
      
      @scala.inline
      def setValue(value: SelectedDaysType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DateRangeType extends StObject {
    
    var from: js.UndefOr[String | Date] = js.undefined
    
    var to: js.UndefOr[String | Date] = js.undefined
  }
  object DateRangeType {
    
    @scala.inline
    def apply(): DateRangeType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRangeType]
    }
    
    @scala.inline
    implicit class DateRangeTypeMutableBuilder[Self <: DateRangeType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String | Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: String | Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.en
    - typings.wixStyleReact.wixStyleReactStrings.es
    - typings.wixStyleReact.wixStyleReactStrings.pt
    - typings.wixStyleReact.wixStyleReactStrings.fr
    - typings.wixStyleReact.wixStyleReactStrings.de
    - typings.wixStyleReact.wixStyleReactStrings.pl
    - typings.wixStyleReact.wixStyleReactStrings.it
    - typings.wixStyleReact.wixStyleReactStrings.ru
    - typings.wixStyleReact.wixStyleReactStrings.ja
    - typings.wixStyleReact.wixStyleReactStrings.ko
    - typings.wixStyleReact.wixStyleReactStrings.tr
    - typings.wixStyleReact.wixStyleReactStrings.sv
    - typings.wixStyleReact.wixStyleReactStrings.no
    - typings.wixStyleReact.wixStyleReactStrings.nl
    - typings.wixStyleReact.wixStyleReactStrings.da
    - typings.wixStyleReact.wixStyleReactStrings.zh
    - typings.wixStyleReact.wixStyleReactStrings.th
    - typings.wixStyleReact.wixStyleReactStrings.cs
  */
  trait LanguageType extends StObject
  object LanguageType {
    
    @scala.inline
    def cs: typings.wixStyleReact.wixStyleReactStrings.cs = "cs".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.cs]
    
    @scala.inline
    def da: typings.wixStyleReact.wixStyleReactStrings.da = "da".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.da]
    
    @scala.inline
    def de: typings.wixStyleReact.wixStyleReactStrings.de = "de".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.de]
    
    @scala.inline
    def en: typings.wixStyleReact.wixStyleReactStrings.en = "en".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.en]
    
    @scala.inline
    def es: typings.wixStyleReact.wixStyleReactStrings.es = "es".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.es]
    
    @scala.inline
    def fr: typings.wixStyleReact.wixStyleReactStrings.fr = "fr".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.fr]
    
    @scala.inline
    def it: typings.wixStyleReact.wixStyleReactStrings.it = "it".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.it]
    
    @scala.inline
    def ja: typings.wixStyleReact.wixStyleReactStrings.ja = "ja".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.ja]
    
    @scala.inline
    def ko: typings.wixStyleReact.wixStyleReactStrings.ko = "ko".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.ko]
    
    @scala.inline
    def nl: typings.wixStyleReact.wixStyleReactStrings.nl = "nl".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.nl]
    
    @scala.inline
    def no: typings.wixStyleReact.wixStyleReactStrings.no = "no".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.no]
    
    @scala.inline
    def pl: typings.wixStyleReact.wixStyleReactStrings.pl = "pl".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.pl]
    
    @scala.inline
    def pt: typings.wixStyleReact.wixStyleReactStrings.pt = "pt".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.pt]
    
    @scala.inline
    def ru: typings.wixStyleReact.wixStyleReactStrings.ru = "ru".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.ru]
    
    @scala.inline
    def sv: typings.wixStyleReact.wixStyleReactStrings.sv = "sv".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.sv]
    
    @scala.inline
    def th: typings.wixStyleReact.wixStyleReactStrings.th = "th".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.th]
    
    @scala.inline
    def tr: typings.wixStyleReact.wixStyleReactStrings.tr = "tr".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tr]
    
    @scala.inline
    def zh: typings.wixStyleReact.wixStyleReactStrings.zh = "zh".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.zh]
  }
  
  trait OptionType
    extends StObject
       with PresetType {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String | Double
    
    var overrideStyle: js.UndefOr[Boolean] = js.undefined
    
    var selectedDays: SelectedDaysType
    
    var value: ReactNode | String | js.Function
  }
  object OptionType {
    
    @scala.inline
    def apply(id: String | Double, selectedDays: SelectedDaysType): OptionType = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], selectedDays = selectedDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionType]
    }
    
    @scala.inline
    implicit class OptionTypeMutableBuilder[Self <: OptionType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideStyle(value: Boolean): Self = StObject.set(x, "overrideStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideStyleUndefined: Self = StObject.set(x, "overrideStyle", js.undefined)
      
      @scala.inline
      def setSelectedDays(value: SelectedDaysType): Self = StObject.set(x, "selectedDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: ReactNode | String | js.Function): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.calendarPanelMod.OptionType
    - typings.wixStyleReact.anon.Value
  */
  trait PresetType extends StObject
  object PresetType {
    
    @scala.inline
    def OptionType(id: String | Double, selectedDays: SelectedDaysType): typings.wixStyleReact.calendarPanelMod.OptionType = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], selectedDays = selectedDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wixStyleReact.calendarPanelMod.OptionType]
    }
    
    @scala.inline
    def Value(): typings.wixStyleReact.anon.Value = {
      val __obj = js.Dynamic.literal(value = "-")
      __obj.asInstanceOf[typings.wixStyleReact.anon.Value]
    }
  }
  
  type SelectedDaysType = String | Date | DateRangeType
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.day
    - typings.wixStyleReact.wixStyleReactStrings.range
  */
  trait SelectionModeType extends StObject
  object SelectionModeType {
    
    @scala.inline
    def day: typings.wixStyleReact.wixStyleReactStrings.day = "day".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.day]
    
    @scala.inline
    def range: typings.wixStyleReact.wixStyleReactStrings.range = "range".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.range]
  }
}
