package typings.vegaLite.anon

import typings.std.Record
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatType extends StObject {
  
  var format: js.UndefOr[String | (Record[String, js.Any])] = js.undefined
  
  var formatType: js.UndefOr[String] = js.undefined
  
  var labelAlign: js.UndefOr[js.Any] = js.undefined
  
  var labelAnchor: js.UndefOr[TitleAnchor] = js.undefined
  
  var labelAngle: js.UndefOr[Double] = js.undefined
  
  var labelBaseline: js.UndefOr[js.Any] = js.undefined
  
  var labelColor: js.UndefOr[js.Any] = js.undefined
  
  var labelExpr: js.UndefOr[String] = js.undefined
  
  var labelFont: js.UndefOr[js.Any] = js.undefined
  
  var labelFontSize: js.UndefOr[js.Any] = js.undefined
  
  var labelFontStyle: js.UndefOr[js.Any] = js.undefined
  
  var labelFontWeight: js.UndefOr[js.Any] = js.undefined
  
  var labelLimit: js.UndefOr[js.Any] = js.undefined
  
  var labelLineHeight: js.UndefOr[js.Any] = js.undefined
  
  var labelOrient: typings.vegaTypings.encodeMod.Orient
  
  var labelPadding: js.UndefOr[js.Any] = js.undefined
  
  var labels: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String | js.Array[String] | SignalRef] = js.undefined
  
  var titleAlign: js.UndefOr[js.Any] = js.undefined
  
  var titleAnchor: js.UndefOr[TitleAnchor] = js.undefined
  
  var titleAngle: js.UndefOr[Double] = js.undefined
  
  var titleBaseline: js.UndefOr[js.Any] = js.undefined
  
  var titleColor: js.UndefOr[js.Any] = js.undefined
  
  var titleFont: js.UndefOr[js.Any] = js.undefined
  
  var titleFontSize: js.UndefOr[js.Any] = js.undefined
  
  var titleFontStyle: js.UndefOr[js.Any] = js.undefined
  
  /**
    * A ValueDef with Condition<ValueDef | FieldDef> where either the condition or the value are optional.
    * {
    *   condition: {field: ...} | {value: ...},
    *   value: ...,
    * }
    */
  /**
    * @minProperties 1
    */
  var titleFontWeight: js.UndefOr[js.Any] = js.undefined
  
  var titleLimit: js.UndefOr[js.Any] = js.undefined
  
  var titleLineHeight: js.UndefOr[js.Any] = js.undefined
  
  var titleOrient: typings.vegaTypings.encodeMod.Orient
  
  var titlePadding: js.UndefOr[js.Any] = js.undefined
}
object FormatType {
  
  inline def apply(
    labelOrient: typings.vegaTypings.encodeMod.Orient,
    titleOrient: typings.vegaTypings.encodeMod.Orient
  ): FormatType = {
    val __obj = js.Dynamic.literal(labelOrient = labelOrient.asInstanceOf[js.Any], titleOrient = titleOrient.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatType]
  }
  
  extension [Self <: FormatType](x: Self) {
    
    inline def setFormat(value: String | (Record[String, js.Any])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLabelAlign(value: js.Any): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    inline def setLabelAnchor(value: TitleAnchor): Self = StObject.set(x, "labelAnchor", value.asInstanceOf[js.Any])
    
    inline def setLabelAnchorNull: Self = StObject.set(x, "labelAnchor", null)
    
    inline def setLabelAnchorUndefined: Self = StObject.set(x, "labelAnchor", js.undefined)
    
    inline def setLabelAngle(value: Double): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
    
    inline def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
    
    inline def setLabelBaseline(value: js.Any): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
    
    inline def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
    
    inline def setLabelColor(value: js.Any): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    inline def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
    
    inline def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
    
    inline def setLabelFont(value: js.Any): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
    
    inline def setLabelFontSize(value: js.Any): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
    
    inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
    
    inline def setLabelFontStyle(value: js.Any): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
    
    inline def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
    
    inline def setLabelFontWeight(value: js.Any): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
    
    inline def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
    
    inline def setLabelLimit(value: js.Any): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
    
    inline def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
    
    inline def setLabelLineHeight(value: js.Any): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
    
    inline def setLabelLineHeightUndefined: Self = StObject.set(x, "labelLineHeight", js.undefined)
    
    inline def setLabelOrient(value: typings.vegaTypings.encodeMod.Orient): Self = StObject.set(x, "labelOrient", value.asInstanceOf[js.Any])
    
    inline def setLabelPadding(value: js.Any): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
    
    inline def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
    
    inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setTitle(value: String | js.Array[String] | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleAlign(value: js.Any): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
    
    inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
    
    inline def setTitleAnchor(value: TitleAnchor): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
    
    inline def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
    
    inline def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
    
    inline def setTitleAngle(value: Double): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
    
    inline def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
    
    inline def setTitleBaseline(value: js.Any): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
    
    inline def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
    
    inline def setTitleColor(value: js.Any): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
    
    inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
    
    inline def setTitleFont(value: js.Any): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
    
    inline def setTitleFontSize(value: js.Any): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    inline def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
    
    inline def setTitleFontStyle(value: js.Any): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
    
    inline def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
    
    inline def setTitleFontWeight(value: js.Any): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
    
    inline def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
    
    inline def setTitleLimit(value: js.Any): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
    
    inline def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
    
    inline def setTitleLineHeight(value: js.Any): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
    
    inline def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
    
    inline def setTitleOrient(value: typings.vegaTypings.encodeMod.Orient): Self = StObject.set(x, "titleOrient", value.asInstanceOf[js.Any])
    
    inline def setTitlePadding(value: js.Any): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
    
    inline def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
  }
}
