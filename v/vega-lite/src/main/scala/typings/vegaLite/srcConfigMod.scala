package typings.vegaLite

import typings.std.Partial
import typings.std.Record
import typings.vegaLite.anon.Groupsubtitle
import typings.vegaLite.anon.Step
import typings.vegaLite.axisMod.Axis
import typings.vegaLite.axisMod.AxisConfigMixins
import typings.vegaLite.compositemarkMod.CompositeMarkConfigMixins
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.headerMod.HeaderConfigMixins
import typings.vegaLite.legendMod.LegendConfig
import typings.vegaLite.projectionMod.ProjectionConfig
import typings.vegaLite.scaleMod.ScaleConfig
import typings.vegaLite.specBaseMod.BaseViewBackground
import typings.vegaLite.specBaseMod.CompositionConfigMixins
import typings.vegaLite.srcMarkMod.AnyMarkConfig
import typings.vegaLite.srcMarkMod.MarkConfigMixins
import typings.vegaLite.srcSelectionMod.SelectionConfig
import typings.vegaLite.titleMod.TitleConfig
import typings.vegaLite.toplevelMod.TopLevelProperties
import typings.vegaLite.vegaLiteStrings.functional
import typings.vegaLite.vegaLiteStrings.height
import typings.vegaLite.vegaLiteStrings.plain
import typings.vegaLite.vegaLiteStrings.verbal
import typings.vegaLite.vegaLiteStrings.width
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.configMod.RangeConfig
import typings.vegaTypings.localeMod.Locale
import typings.vegaTypings.scaleMod.RangeScheme
import typings.vegaTypings.signalMod.InitSignal
import typings.vegaTypings.signalMod.NewSignal
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConfigMod {
  
  @JSImport("vega-lite/build/src/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object DEFAULT_COLOR {
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.blue")
    @js.native
    def blue: String = js.native
    inline def blue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.brown")
    @js.native
    def brown: String = js.native
    inline def brown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brown")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray0")
    @js.native
    def gray0: String = js.native
    inline def gray0_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray0")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray1")
    @js.native
    def gray1: String = js.native
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray10")
    @js.native
    def gray10: String = js.native
    inline def gray10_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray10")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray11")
    @js.native
    def gray11: String = js.native
    inline def gray11_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray11")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray12")
    @js.native
    def gray12: String = js.native
    inline def gray12_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray12")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray13")
    @js.native
    def gray13: String = js.native
    inline def gray13_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray13")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray14")
    @js.native
    def gray14: String = js.native
    inline def gray14_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray14")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray15")
    @js.native
    def gray15: String = js.native
    inline def gray15_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray15")(x.asInstanceOf[js.Any])
    
    inline def gray1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray1")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray2")
    @js.native
    def gray2: String = js.native
    inline def gray2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray2")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray3")
    @js.native
    def gray3: String = js.native
    inline def gray3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray3")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray4")
    @js.native
    def gray4: String = js.native
    inline def gray4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray4")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray5")
    @js.native
    def gray5: String = js.native
    inline def gray5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray5")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray6")
    @js.native
    def gray6: String = js.native
    inline def gray6_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray6")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray7")
    @js.native
    def gray7: String = js.native
    inline def gray7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray7")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray8")
    @js.native
    def gray8: String = js.native
    inline def gray8_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray8")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray9")
    @js.native
    def gray9: String = js.native
    inline def gray9_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray9")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.green")
    @js.native
    def green: String = js.native
    inline def green_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.orange")
    @js.native
    def orange: String = js.native
    inline def orange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orange")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.pink")
    @js.native
    def pink: String = js.native
    inline def pink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pink")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.purple")
    @js.native
    def purple: String = js.native
    inline def purple_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.red")
    @js.native
    def red: String = js.native
    inline def red_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.teal")
    @js.native
    def teal: String = js.native
    inline def teal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("teal")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.yellow")
    @js.native
    def yellow: String = js.native
    inline def yellow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow")(x.asInstanceOf[js.Any])
  }
  
  object DEFAULT_FONT_SIZE {
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_FONT_SIZE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_FONT_SIZE.groupSubtitle")
    @js.native
    def groupSubtitle: Double = js.native
    inline def groupSubtitle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupSubtitle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_FONT_SIZE.groupTitle")
    @js.native
    def groupTitle: Double = js.native
    inline def groupTitle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_FONT_SIZE.guideLabel")
    @js.native
    def guideLabel: Double = js.native
    inline def guideLabel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("guideLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_FONT_SIZE.guideTitle")
    @js.native
    def guideTitle: Double = js.native
    inline def guideTitle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("guideTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_FONT_SIZE.text")
    @js.native
    def text: Double = js.native
    inline def text_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vega-lite/build/src/config", "DEFAULT_STEP")
  @js.native
  val DEFAULT_STEP: /* 20 */ Double = js.native
  
  inline def colorSignalConfig(): Config[ExprRef | SignalRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("colorSignalConfig")().asInstanceOf[Config[ExprRef | SignalRef]]
  inline def colorSignalConfig(color: Boolean): Config[ExprRef | SignalRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("colorSignalConfig")(color.asInstanceOf[js.Any]).asInstanceOf[Config[ExprRef | SignalRef]]
  inline def colorSignalConfig(color: ColorConfig): Config[ExprRef | SignalRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("colorSignalConfig")(color.asInstanceOf[js.Any]).asInstanceOf[Config[ExprRef | SignalRef]]
  
  @JSImport("vega-lite/build/src/config", "defaultConfig")
  @js.native
  val defaultConfig: Config[SignalRef] = js.native
  
  @JSImport("vega-lite/build/src/config", "defaultViewConfig")
  @js.native
  val defaultViewConfig: ViewConfig[SignalRef] = js.native
  
  inline def fontConfig(font: String): Config[ExprRef | SignalRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("fontConfig")(font.asInstanceOf[js.Any]).asInstanceOf[Config[ExprRef | SignalRef]]
  
  inline def fontSizeSignalConfig(fontSize: Boolean): Config[ExprRef | SignalRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("fontSizeSignalConfig")(fontSize.asInstanceOf[js.Any]).asInstanceOf[Config[ExprRef | SignalRef]]
  inline def fontSizeSignalConfig(fontSize: FontSizeConfig): Config[ExprRef | SignalRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("fontSizeSignalConfig")(fontSize.asInstanceOf[js.Any]).asInstanceOf[Config[ExprRef | SignalRef]]
  
  inline def getViewConfigContinuousSize[ES /* <: ExprRef | SignalRef */](viewConfig: ViewConfig[ES], channel: width | height): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getViewConfigContinuousSize")(viewConfig.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getViewConfigDiscreteSize[ES /* <: ExprRef | SignalRef */](viewConfig: ViewConfig[ES], channel: width | height): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getViewConfigDiscreteSize")(viewConfig.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getViewConfigDiscreteStep[ES /* <: ExprRef | SignalRef */](viewConfig: ViewConfig[ES], channel: width | height): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getViewConfigDiscreteStep")(viewConfig.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def initConfig(): Config[SignalRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Config[SignalRef]]
  inline def initConfig(specifiedConfig: Config[ExprRef | SignalRef]): Config[SignalRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(specifiedConfig.asInstanceOf[js.Any]).asInstanceOf[Config[SignalRef]]
  
  inline def isVgScheme(rangeScheme: js.Array[String]): /* is vega-typings.vega-typings/types/spec/scale.RangeScheme */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVgScheme")(rangeScheme.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/scale.RangeScheme */ Boolean]
  inline def isVgScheme(rangeScheme: RangeScheme): /* is vega-typings.vega-typings/types/spec/scale.RangeScheme */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVgScheme")(rangeScheme.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/scale.RangeScheme */ Boolean]
  
  inline def stripAndRedirectConfig(config: Config[SignalRef]): Config[SignalRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripAndRedirectConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Config[SignalRef]]
  
  type ColorConfig = Record[String, Color]
  
  trait Config[ES /* <: ExprRef | SignalRef */]
    extends StObject
       with TopLevelProperties[ES]
       with VLOnlyConfig[ES]
       with MarkConfigMixins[ES]
       with CompositeMarkConfigMixins
       with AxisConfigMixins[ES]
       with HeaderConfigMixins[ES]
       with CompositionConfigMixins {
    
    /**
      * A boolean flag indicating if ARIA default attributes should be included for marks and guides (SVG output only). If false, the `"aria-hidden"` attribute will be set for all guides, removing them from the ARIA accessibility tree and Vega-Lite will not generate default descriptions for marks.
      *
      * __Default value:__ `true`.
      */
    var aria: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Legend configuration, which determines default properties for all [legends](https://vega.github.io/vega-lite/docs/legend.html). For a full list of legend configuration options, please see the [corresponding section of in the legend documentation](https://vega.github.io/vega-lite/docs/legend.html#config).
      */
    var legend: js.UndefOr[LegendConfig[ES]] = js.undefined
    
    /**
      * A delimiter, such as a newline character, upon which to break text strings into multiple lines. This property provides a global default for text marks, which is overridden by mark or style config settings, and by the lineBreak mark encoding channel. If signal-valued, either string or regular expression (regexp) values are valid.
      */
    var lineBreak: js.UndefOr[String | ES] = js.undefined
    
    /**
      * Locale definitions for string parsing and formatting of number and date values. The locale object should contain `number` and/or `time` properties with [locale definitions](https://vega.github.io/vega/docs/api/locale/). Locale definitions provided in the config block may be overridden by the View constructor locale option.
      */
    var locale: js.UndefOr[Locale] = js.undefined
    
    /**
      * Projection configuration, which determines default properties for all [projections](https://vega.github.io/vega-lite/docs/projection.html). For a full list of projection configuration options, please see the [corresponding section of the projection documentation](https://vega.github.io/vega-lite/docs/projection.html#config).
      */
    var projection: js.UndefOr[ProjectionConfig] = js.undefined
    
    /**
      * An object hash that defines default range arrays or schemes for using with scales.
      * For a full list of scale range configuration options, please see the [corresponding section of the scale documentation](https://vega.github.io/vega-lite/docs/scale.html#config).
      */
    var range: js.UndefOr[RangeConfig] = js.undefined
    
    /**
      * @hidden
      */
    var signals: js.UndefOr[js.Array[InitSignal | NewSignal]] = js.undefined
    
    /** An object hash that defines key-value mappings to determine default properties for marks with a given [style](https://vega.github.io/vega-lite/docs/mark.html#mark-def). The keys represent styles names; the values have to be valid [mark configuration objects](https://vega.github.io/vega-lite/docs/mark.html#config). */
    var style: js.UndefOr[StyleConfigIndex[ES]] = js.undefined
    
    /**
      * Title configuration, which determines default properties for all [titles](https://vega.github.io/vega-lite/docs/title.html). For a full list of title configuration options, please see the [corresponding section of the title documentation](https://vega.github.io/vega-lite/docs/title.html#config).
      */
    var title: js.UndefOr[TitleConfig[ES]] = js.undefined
  }
  object Config {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](): Config[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[ES]]
    }
    
    extension [Self <: Config[?], ES /* <: ExprRef | SignalRef */](x: Self & Config[ES]) {
      
      inline def setAria(value: Boolean): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setLegend(value: LegendConfig[ES]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setLineBreak(value: String | ES): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setProjection(value: ProjectionConfig): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setRange(value: RangeConfig): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setSignals(value: js.Array[InitSignal | NewSignal]): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      inline def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      inline def setSignalsVarargs(value: (InitSignal | NewSignal)*): Self = StObject.set(x, "signals", js.Array(value*))
      
      inline def setStyle(value: StyleConfigIndex[ES]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: TitleConfig[ES]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type FontSizeConfig = Record[String, Double]
  
  type StyleConfigIndex[ES /* <: ExprRef | SignalRef */] = (Partial[Record[String, AnyMarkConfig[ES] | Axis[ES]]]) & MarkConfigMixins[ES] & Groupsubtitle[ES]
  
  trait VLOnlyConfig[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    /**
      * Default color signals.
      *
      * @hidden
      */
    var color: js.UndefOr[Boolean | ColorConfig] = js.undefined
    
    /**
      * Default axis and legend title for count fields.
      *
      * __Default value:__ `'Count of Records`.
      *
      * @type {string}
      */
    var countTitle: js.UndefOr[String] = js.undefined
    
    /**
      * Allow the `formatType` property for text marks and guides to accept a custom formatter function [registered as a Vega expression](https://vega.github.io/vega-lite/usage/compile.html#format-type).
      */
    var customFormatTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines how Vega-Lite generates title for fields. There are three possible styles:
      * - `"verbal"` (Default) - displays function in a verbal style (e.g., "Sum of field", "Year-month of date", "field (binned)").
      * - `"function"` - displays function using parentheses and capitalized texts (e.g., "SUM(field)", "YEARMONTH(date)", "BIN(field)").
      * - `"plain"` - displays only the field name without functions (e.g., "field", "date", "field").
      */
    var fieldTitle: js.UndefOr[verbal | functional | plain] = js.undefined
    
    /**
      * Default font for all text marks, titles, and labels.
      */
    var font: js.UndefOr[String] = js.undefined
    
    /**
      * Default font size signals.
      *
      * @hidden
      */
    var fontSize: js.UndefOr[Boolean | FontSizeConfig] = js.undefined
    
    /**
      * If normalizedNumberFormatType is not specified,
      * D3 number format for axis labels, text marks, and tooltips of normalized stacked fields (fields with `stack: "normalize"`). For example `"s"` for SI units.
      * Use [D3's number format pattern](https://github.com/d3/d3-format#locale_format).
      *
      * If `config.normalizedNumberFormatType` is specified and `config.customFormatTypes` is `true`, this value will be passed as `format` alongside `datum.value` to the `config.numberFormatType` function.
      * __Default value:__ `%`
      */
    var normalizedNumberFormat: js.UndefOr[String] = js.undefined
    
    /**
      * [Custom format type](https://vega.github.io/vega-lite/docs/config.html#custom-format-type)
      * for `config.normalizedNumberFormat`.
      *
      * __Default value:__ `undefined` -- This is equilvalent to call D3-format, which is exposed as [`format` in Vega-Expression](https://vega.github.io/vega/docs/expressions/#format).
      * __Note:__ You must also set `customFormatTypes` to `true` to use this feature.
      */
    var normalizedNumberFormatType: js.UndefOr[String] = js.undefined
    
    /**
      * If numberFormatType is not specified,
      * D3 number format for guide labels, text marks, and tooltips of non-normalized fields (fields *without* `stack: "normalize"`). For example `"s"` for SI units.
      * Use [D3's number format pattern](https://github.com/d3/d3-format#locale_format).
      *
      * If `config.numberFormatType` is specified and `config.customFormatTypes` is `true`, this value will be passed as `format` alongside `datum.value` to the `config.numberFormatType` function.
      */
    var numberFormat: js.UndefOr[String] = js.undefined
    
    /**
      * [Custom format type](https://vega.github.io/vega-lite/docs/config.html#custom-format-type)
      * for `config.numberFormat`.
      *
      * __Default value:__ `undefined` -- This is equilvalent to call D3-format, which is exposed as [`format` in Vega-Expression](https://vega.github.io/vega/docs/expressions/#format).
      * __Note:__ You must also set `customFormatTypes` to `true` to use this feature.
      */
    var numberFormatType: js.UndefOr[String] = js.undefined
    
    /**
      * Scale configuration determines default properties for all [scales](https://vega.github.io/vega-lite/docs/scale.html). For a full list of scale configuration options, please see the [corresponding section of the scale documentation](https://vega.github.io/vega-lite/docs/scale.html#config).
      */
    var scale: js.UndefOr[ScaleConfig[ES]] = js.undefined
    
    /** An object hash for defining default properties for each type of selections. */
    var selection: js.UndefOr[SelectionConfig] = js.undefined
    
    /**
      * Default time format for raw time values (without time units) in text marks, legend labels and header labels.
      *
      * __Default value:__ `"%b %d, %Y"`
      * __Note:__ Axes automatically determine the format for each label automatically so this config does not affect axes.
      */
    var timeFormat: js.UndefOr[String] = js.undefined
    
    /**
      * [Custom format type](https://vega.github.io/vega-lite/docs/config.html#custom-format-type)
      * for `config.timeFormat`.
      *
      * __Default value:__ `undefined` -- This is equilvalent to call D3-time-format, which is exposed as [`timeFormat` in Vega-Expression](https://vega.github.io/vega/docs/expressions/#timeFormat).
      * __Note:__ You must also set `customFormatTypes` to `true` and there must *not* be a `timeUnit` defined to use this feature.
      */
    var timeFormatType: js.UndefOr[String] = js.undefined
    
    /** Default properties for [single view plots](https://vega.github.io/vega-lite/docs/spec.html#single). */
    var view: js.UndefOr[ViewConfig[ES]] = js.undefined
  }
  object VLOnlyConfig {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](): VLOnlyConfig[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VLOnlyConfig[ES]]
    }
    
    extension [Self <: VLOnlyConfig[?], ES /* <: ExprRef | SignalRef */](x: Self & VLOnlyConfig[ES]) {
      
      inline def setColor(value: Boolean | ColorConfig): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCountTitle(value: String): Self = StObject.set(x, "countTitle", value.asInstanceOf[js.Any])
      
      inline def setCountTitleUndefined: Self = StObject.set(x, "countTitle", js.undefined)
      
      inline def setCustomFormatTypes(value: Boolean): Self = StObject.set(x, "customFormatTypes", value.asInstanceOf[js.Any])
      
      inline def setCustomFormatTypesUndefined: Self = StObject.set(x, "customFormatTypes", js.undefined)
      
      inline def setFieldTitle(value: verbal | functional | plain): Self = StObject.set(x, "fieldTitle", value.asInstanceOf[js.Any])
      
      inline def setFieldTitleUndefined: Self = StObject.set(x, "fieldTitle", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Boolean | FontSizeConfig): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setNormalizedNumberFormat(value: String): Self = StObject.set(x, "normalizedNumberFormat", value.asInstanceOf[js.Any])
      
      inline def setNormalizedNumberFormatType(value: String): Self = StObject.set(x, "normalizedNumberFormatType", value.asInstanceOf[js.Any])
      
      inline def setNormalizedNumberFormatTypeUndefined: Self = StObject.set(x, "normalizedNumberFormatType", js.undefined)
      
      inline def setNormalizedNumberFormatUndefined: Self = StObject.set(x, "normalizedNumberFormat", js.undefined)
      
      inline def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
      
      inline def setNumberFormatType(value: String): Self = StObject.set(x, "numberFormatType", value.asInstanceOf[js.Any])
      
      inline def setNumberFormatTypeUndefined: Self = StObject.set(x, "numberFormatType", js.undefined)
      
      inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
      
      inline def setScale(value: ScaleConfig[ES]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSelection(value: SelectionConfig): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
      
      inline def setTimeFormatType(value: String): Self = StObject.set(x, "timeFormatType", value.asInstanceOf[js.Any])
      
      inline def setTimeFormatTypeUndefined: Self = StObject.set(x, "timeFormatType", js.undefined)
      
      inline def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
      
      inline def setView(value: ViewConfig[ES]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait ViewConfig[ES /* <: ExprRef | SignalRef */]
    extends StObject
       with BaseViewBackground[ES] {
    
    /**
      * Whether the view should be clipped.
      */
    var clip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default height when the plot has a continuous y-field for x or latitude, or has arc marks.
      *
      * __Default value:__ `200`
      */
    var continuousHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The default width when the plot has a continuous field for x or longitude, or has arc marks.
      *
      * __Default value:__ `200`
      */
    var continuousWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The default height when the plot has non arc marks and either a discrete y-field or no y-field.
      * The height can be either a number indicating a fixed height or an object in the form of `{step: number}` defining the height per discrete step.
      *
      * __Default value:__ a step size based on `config.view.step`.
      */
    var discreteHeight: js.UndefOr[Double | Step] = js.undefined
    
    /**
      * The default width when the plot has non-arc marks and either a discrete x-field or no x-field.
      * The width can be either a number indicating a fixed width or an object in the form of `{step: number}` defining the width per discrete step.
      *
      * __Default value:__ a step size based on `config.view.step`.
      */
    var discreteWidth: js.UndefOr[Double | Step] = js.undefined
    
    /**
      * Default step size for x-/y- discrete fields.
      */
    var step: js.UndefOr[Double] = js.undefined
  }
  object ViewConfig {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](): ViewConfig[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewConfig[ES]]
    }
    
    extension [Self <: ViewConfig[?], ES /* <: ExprRef | SignalRef */](x: Self & ViewConfig[ES]) {
      
      inline def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setContinuousHeight(value: Double): Self = StObject.set(x, "continuousHeight", value.asInstanceOf[js.Any])
      
      inline def setContinuousHeightUndefined: Self = StObject.set(x, "continuousHeight", js.undefined)
      
      inline def setContinuousWidth(value: Double): Self = StObject.set(x, "continuousWidth", value.asInstanceOf[js.Any])
      
      inline def setContinuousWidthUndefined: Self = StObject.set(x, "continuousWidth", js.undefined)
      
      inline def setDiscreteHeight(value: Double | Step): Self = StObject.set(x, "discreteHeight", value.asInstanceOf[js.Any])
      
      inline def setDiscreteHeightUndefined: Self = StObject.set(x, "discreteHeight", js.undefined)
      
      inline def setDiscreteWidth(value: Double | Step): Self = StObject.set(x, "discreteWidth", value.asInstanceOf[js.Any])
      
      inline def setDiscreteWidthUndefined: Self = StObject.set(x, "discreteWidth", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
