package typings.vegaLite.anon

import typings.vegaTypings.scaleMod.ScaleField
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.TitleEncode
import typings.vegaTypings.valuesMod.AnchorValue
import typings.vegaTypings.valuesMod.ColorValue
import typings.vegaTypings.valuesMod.FontWeightValue
import typings.vegaTypings.valuesMod.NumberValue
import typings.vegaTypings.valuesMod.StringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dx extends StObject {
  
  var align: String | SignalRef | FieldField | Scale | FieldScale | BandScale | Range | ValueAlign
  
  var anchor: js.UndefOr[AnchorValue] = js.undefined
  
  var angle: js.UndefOr[NumberValue] = js.undefined
  
  var aria: js.UndefOr[Boolean] = js.undefined
  
  var baseline: String | SignalRef | FieldField | Scale | FieldScale | BandScale | Range | ValueTextBaseline | Signal
  
  var color: js.UndefOr[ColorValue] = js.undefined
  
  var dx: js.UndefOr[NumberValue] = js.undefined
  
  var dy: js.UndefOr[NumberValue] = js.undefined
  
  var encode: js.UndefOr[TitleEncode | PartialRecordEncodeEntryN] = js.undefined
  
  var font: js.UndefOr[StringValue] = js.undefined
  
  var fontSize: js.UndefOr[NumberValue] = js.undefined
  
  var fontStyle: js.UndefOr[StringValue] = js.undefined
  
  var fontWeight: js.UndefOr[FontWeightValue] = js.undefined
  
  var frame: StringValue
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var limit: js.UndefOr[NumberValue] = js.undefined
  
  var lineHeight: js.UndefOr[NumberValue] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[NumberValue] = js.undefined
  
  var orient: js.UndefOr[ScaleField] = js.undefined
  
  var style: String | js.Array[String]
  
  var subtitle: js.UndefOr[String | js.Array[String] | SignalRef] = js.undefined
  
  var subtitleColor: js.UndefOr[ColorValue] = js.undefined
  
  var subtitleFont: js.UndefOr[StringValue] = js.undefined
  
  var subtitleFontSize: js.UndefOr[NumberValue] = js.undefined
  
  var subtitleFontStyle: js.UndefOr[StringValue] = js.undefined
  
  var subtitleFontWeight: js.UndefOr[FontWeightValue] = js.undefined
  
  var subtitleLineHeight: js.UndefOr[NumberValue] = js.undefined
  
  var subtitlePadding: js.UndefOr[NumberValue] = js.undefined
  
  var text: String | js.Array[String] | SignalRef | Signal
  
  var zindex: js.UndefOr[Double] = js.undefined
}
object Dx {
  
  @scala.inline
  def apply(
    align: String | SignalRef | FieldField | Scale | FieldScale | BandScale | Range | ValueAlign,
    baseline: String | SignalRef | FieldField | Scale | FieldScale | BandScale | Range | ValueTextBaseline | Signal,
    frame: StringValue,
    style: String | js.Array[String],
    text: String | js.Array[String] | SignalRef | Signal
  ): Dx = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dx]
  }
  
  @scala.inline
  implicit class DxMutableBuilder[Self <: Dx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String | SignalRef | FieldField | Scale | FieldScale | BandScale | Range | ValueAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchor(value: AnchorValue): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setAngle(value: NumberValue): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setAria(value: Boolean): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    @scala.inline
    def setBaseline(
      value: String | SignalRef | FieldField | Scale | FieldScale | BandScale | Range | ValueTextBaseline | Signal
    ): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorNull: Self = StObject.set(x, "color", null)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDx(value: NumberValue): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    @scala.inline
    def setDy(value: NumberValue): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setEncode(value: TitleEncode | PartialRecordEncodeEntryN): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    @scala.inline
    def setFont(value: StringValue): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: NumberValue): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: StringValue): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeightValue): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setFrame(value: StringValue): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    @scala.inline
    def setLimit(value: NumberValue): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLineHeight(value: NumberValue): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOffset(value: NumberValue): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrient(value: ScaleField): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    @scala.inline
    def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
    
    @scala.inline
    def setSubtitle(value: String | js.Array[String] | SignalRef): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleColor(value: ColorValue): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleColorNull: Self = StObject.set(x, "subtitleColor", null)
    
    @scala.inline
    def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
    
    @scala.inline
    def setSubtitleFont(value: StringValue): Self = StObject.set(x, "subtitleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleFontSize(value: NumberValue): Self = StObject.set(x, "subtitleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleFontSizeUndefined: Self = StObject.set(x, "subtitleFontSize", js.undefined)
    
    @scala.inline
    def setSubtitleFontStyle(value: StringValue): Self = StObject.set(x, "subtitleFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleFontStyleUndefined: Self = StObject.set(x, "subtitleFontStyle", js.undefined)
    
    @scala.inline
    def setSubtitleFontUndefined: Self = StObject.set(x, "subtitleFont", js.undefined)
    
    @scala.inline
    def setSubtitleFontWeight(value: FontWeightValue): Self = StObject.set(x, "subtitleFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleFontWeightUndefined: Self = StObject.set(x, "subtitleFontWeight", js.undefined)
    
    @scala.inline
    def setSubtitleLineHeight(value: NumberValue): Self = StObject.set(x, "subtitleLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleLineHeightUndefined: Self = StObject.set(x, "subtitleLineHeight", js.undefined)
    
    @scala.inline
    def setSubtitlePadding(value: NumberValue): Self = StObject.set(x, "subtitlePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitlePaddingUndefined: Self = StObject.set(x, "subtitlePadding", js.undefined)
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setSubtitleVarargs(value: String*): Self = StObject.set(x, "subtitle", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String | js.Array[String] | SignalRef | Signal): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
    
    @scala.inline
    def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
  }
}
