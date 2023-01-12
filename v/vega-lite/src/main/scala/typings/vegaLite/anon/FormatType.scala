package typings.vegaLite.anon

import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaTypings.typesSpecEncodeMod.Text
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecTitleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatType extends StObject {
  
  /**
    * When used with the default `"number"` and `"time"` format type, the text formatting pattern for labels of guides (axes, legends, headers) and text marks.
    *
    * - If the format type is `"number"` (e.g., for quantitative fields), this is D3's [number format pattern](https://github.com/d3/d3-format#locale_format).
    * - If the format type is `"time"` (e.g., for temporal fields), this is D3's [time format pattern](https://github.com/d3/d3-time-format#locale_format).
    *
    * See the [format documentation](https://vega.github.io/vega-lite/docs/format.html) for more examples.
    *
    * When used with a [custom `formatType`](https://vega.github.io/vega-lite/docs/config.html#custom-format-type), this value will be passed as `format` alongside `datum.value` to the registered function.
    *
    * __Default value:__  Derived from [numberFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for number format and from [timeFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for time format.
    */
  var format: js.UndefOr[String | Dict[Any]] = js.undefined
  
  /**
    * The format type for labels. One of `"number"`, `"time"`, or a [registered custom format type](https://vega.github.io/vega-lite/docs/config.html#custom-format-type).
    *
    * __Default value:__
    * - `"time"` for temporal fields and ordinal and nominal fields with `timeUnit`.
    * - `"number"` for quantitative fields as well as ordinal and nominal fields without `timeUnit`.
    */
  var formatType: js.UndefOr[String] = js.undefined
  
  var labelAlign: js.UndefOr[Any] = js.undefined
  
  var labelAnchor: js.UndefOr[TitleAnchor] = js.undefined
  
  var labelAngle: js.UndefOr[Double] = js.undefined
  
  var labelBaseline: js.UndefOr[Any] = js.undefined
  
  var labelColor: js.UndefOr[Any] = js.undefined
  
  var labelExpr: js.UndefOr[String] = js.undefined
  
  var labelFont: js.UndefOr[Any] = js.undefined
  
  var labelFontSize: js.UndefOr[Any] = js.undefined
  
  var labelFontStyle: js.UndefOr[Any] = js.undefined
  
  var labelFontWeight: js.UndefOr[Any] = js.undefined
  
  var labelLimit: js.UndefOr[Any] = js.undefined
  
  var labelLineHeight: js.UndefOr[Any] = js.undefined
  
  var labelOrient: typings.vegaTypings.typesSpecEncodeMod.Orient
  
  var labelPadding: js.UndefOr[Any] = js.undefined
  
  var labels: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[SignalRef | Text] = js.undefined
  
  var titleAlign: js.UndefOr[Any] = js.undefined
  
  var titleAnchor: js.UndefOr[TitleAnchor] = js.undefined
  
  var titleAngle: js.UndefOr[Double] = js.undefined
  
  var titleBaseline: js.UndefOr[Any] = js.undefined
  
  var titleColor: js.UndefOr[Any] = js.undefined
  
  var titleFont: js.UndefOr[Any] = js.undefined
  
  var titleFontSize: js.UndefOr[Any] = js.undefined
  
  var titleFontStyle: js.UndefOr[Any] = js.undefined
  
  var titleFontWeight: js.UndefOr[Any] = js.undefined
  
  var titleLimit: js.UndefOr[Any] = js.undefined
  
  var titleLineHeight: js.UndefOr[Any] = js.undefined
  
  var titleOrient: typings.vegaTypings.typesSpecEncodeMod.Orient
  
  var titlePadding: js.UndefOr[Any] = js.undefined
}
object FormatType {
  
  inline def apply(
    labelOrient: typings.vegaTypings.typesSpecEncodeMod.Orient,
    titleOrient: typings.vegaTypings.typesSpecEncodeMod.Orient
  ): FormatType = {
    val __obj = js.Dynamic.literal(labelOrient = labelOrient.asInstanceOf[js.Any], titleOrient = titleOrient.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatType] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String | Dict[Any]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLabelAlign(value: Any): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    inline def setLabelAnchor(value: TitleAnchor): Self = StObject.set(x, "labelAnchor", value.asInstanceOf[js.Any])
    
    inline def setLabelAnchorNull: Self = StObject.set(x, "labelAnchor", null)
    
    inline def setLabelAnchorUndefined: Self = StObject.set(x, "labelAnchor", js.undefined)
    
    inline def setLabelAngle(value: Double): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
    
    inline def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
    
    inline def setLabelBaseline(value: Any): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
    
    inline def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
    
    inline def setLabelColor(value: Any): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    inline def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
    
    inline def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
    
    inline def setLabelFont(value: Any): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
    
    inline def setLabelFontSize(value: Any): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
    
    inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
    
    inline def setLabelFontStyle(value: Any): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
    
    inline def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
    
    inline def setLabelFontWeight(value: Any): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
    
    inline def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
    
    inline def setLabelLimit(value: Any): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
    
    inline def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
    
    inline def setLabelLineHeight(value: Any): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
    
    inline def setLabelLineHeightUndefined: Self = StObject.set(x, "labelLineHeight", js.undefined)
    
    inline def setLabelOrient(value: typings.vegaTypings.typesSpecEncodeMod.Orient): Self = StObject.set(x, "labelOrient", value.asInstanceOf[js.Any])
    
    inline def setLabelPadding(value: Any): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
    
    inline def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
    
    inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setTitle(value: SignalRef | Text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleAlign(value: Any): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
    
    inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
    
    inline def setTitleAnchor(value: TitleAnchor): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
    
    inline def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
    
    inline def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
    
    inline def setTitleAngle(value: Double): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
    
    inline def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
    
    inline def setTitleBaseline(value: Any): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
    
    inline def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
    
    inline def setTitleColor(value: Any): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
    
    inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
    
    inline def setTitleFont(value: Any): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
    
    inline def setTitleFontSize(value: Any): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    inline def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
    
    inline def setTitleFontStyle(value: Any): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
    
    inline def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
    
    inline def setTitleFontWeight(value: Any): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
    
    inline def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
    
    inline def setTitleLimit(value: Any): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
    
    inline def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
    
    inline def setTitleLineHeight(value: Any): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
    
    inline def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
    
    inline def setTitleOrient(value: typings.vegaTypings.typesSpecEncodeMod.Orient): Self = StObject.set(x, "titleOrient", value.asInstanceOf[js.Any])
    
    inline def setTitlePadding(value: Any): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
    
    inline def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
  }
}
