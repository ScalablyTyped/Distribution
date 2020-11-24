package typings.vegaTypings.titleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.valuesMod.AlignValue
import typings.vegaTypings.valuesMod.AnchorValue
import typings.vegaTypings.valuesMod.ColorValue
import typings.vegaTypings.valuesMod.FontStyleValue
import typings.vegaTypings.valuesMod.FontWeightValue
import typings.vegaTypings.valuesMod.NumberValue
import typings.vegaTypings.valuesMod.StringValue
import typings.vegaTypings.valuesMod.TextBaselineValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseTitle extends js.Object {
  
  // ---------- Shared Text Properties ----------
  /**
    * Horizontal text alignment for title text. One of `"left"`, `"center"`, or `"right"`.
    */
  var align: js.UndefOr[AlignValue] = js.native
  
  /**
    * The anchor position for placing the title and subtitle text. One of `"start"`, `"middle"`, or `"end"`. For example, with an orientation of top these anchor positions map to a left-, center-, or right-aligned title.
    */
  var anchor: js.UndefOr[AnchorValue] = js.native
  
  /**
    * Angle in degrees of title and subtitle text.
    */
  var angle: js.UndefOr[NumberValue] = js.native
  
  // ---------- ARIA ----------
  /**
    * A boolean flag indicating if [ARIA attributes](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) should be included (SVG output only).
    * If `false`, the "aria-hidden" attribute will be set on the output SVG group, removing the title from the ARIA accessibility tree.
    *
    * __Default value:__ `true`
    */
  var aria: js.UndefOr[Boolean] = js.native
  
  /**
    * Vertical text baseline for title and subtitle text. One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`. The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated relative to the *lineHeight* rather than *fontSize* alone.
    */
  var baseline: js.UndefOr[TextBaselineValue] = js.native
  
  // ---------- Title Text ----------
  /**
    * Text color for title text.
    */
  var color: js.UndefOr[ColorValue] = js.native
  
  /**
    * Delta offset for title and subtitle text x-coordinate.
    */
  var dx: js.UndefOr[NumberValue] = js.native
  
  /**
    * Delta offset for title and subtitle text y-coordinate.
    */
  var dy: js.UndefOr[NumberValue] = js.native
  
  /**
    * Font name for title text.
    */
  var font: js.UndefOr[StringValue] = js.native
  
  /**
    * Font size in pixels for title text.
    *
    * @minimum 0
    */
  var fontSize: js.UndefOr[NumberValue] = js.native
  
  /**
    * Font style for title text.
    */
  var fontStyle: js.UndefOr[FontStyleValue] = js.native
  
  /**
    * Font weight for title text.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var fontWeight: js.UndefOr[FontWeightValue] = js.native
  
  /**
    * The reference frame for the anchor position, one of `"bounds"` (to anchor relative to the full bounding box) or `"group"` (to anchor relative to the group width or height).
    */
  var frame: js.UndefOr[TitleFrame | StringValue] = js.native
  
  /**
    * The maximum allowed length in pixels of title and subtitle text.
    *
    * @minimum 0
    */
  var limit: js.UndefOr[NumberValue] = js.native
  
  /**
    * Line height in pixels for multi-line title text or title text with `"line-top"` or `"line-bottom"` baseline.
    */
  var lineHeight: js.UndefOr[NumberValue] = js.native
  
  /**
    * The orthogonal offset in pixels by which to displace the title group from its position along the edge of the chart.
    */
  var offset: js.UndefOr[NumberValue] = js.native
  
  /**
    * Default title orientation (`"top"`, `"bottom"`, `"left"`, or `"right"`)
    */
  var orient: js.UndefOr[TitleOrient | SignalRef] = js.native
  
  // ---------- Subtitle Text ----------
  /**
    * Text color for subtitle text.
    */
  var subtitleColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Font name for subtitle text.
    */
  var subtitleFont: js.UndefOr[StringValue] = js.native
  
  /**
    * Font size in pixels for subtitle text.
    *
    * @minimum 0
    */
  var subtitleFontSize: js.UndefOr[NumberValue] = js.native
  
  /**
    * Font style for subtitle text.
    */
  var subtitleFontStyle: js.UndefOr[FontStyleValue] = js.native
  
  /**
    * Font weight for subtitle text.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var subtitleFontWeight: js.UndefOr[FontWeightValue] = js.native
  
  /**
    * Line height in pixels for multi-line subtitle text.
    */
  var subtitleLineHeight: js.UndefOr[NumberValue] = js.native
  
  /**
    * The padding in pixels between title and subtitle text.
    */
  var subtitlePadding: js.UndefOr[NumberValue] = js.native
  
  /**
    * 	The integer z-index indicating the layering of the title group relative to other axis, mark, and legend groups.
    *
    * __Default value:__ `0`.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[Double] = js.native
}
object BaseTitle {
  
  @scala.inline
  def apply(): BaseTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTitle]
  }
  
  @scala.inline
  implicit class BaseTitleOps[Self <: BaseTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlign(value: AlignValue): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAnchor(value: AnchorValue): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAnchorNull: Self = this.set("anchor", null)
    
    @scala.inline
    def setAngle(value: NumberValue): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setAria(value: Boolean): Self = this.set("aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    
    @scala.inline
    def setBaseline(value: TextBaselineValue): Self = this.set("baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseline: Self = this.set("baseline", js.undefined)
    
    @scala.inline
    def setColor(value: ColorValue): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorNull: Self = this.set("color", null)
    
    @scala.inline
    def setDx(value: NumberValue): Self = this.set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    
    @scala.inline
    def setDy(value: NumberValue): Self = this.set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    
    @scala.inline
    def setFont(value: StringValue): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontSize(value: NumberValue): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyleValue): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeightValue): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setFrame(value: TitleFrame | StringValue): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    
    @scala.inline
    def setLimit(value: NumberValue): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLineHeight(value: NumberValue): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setOffset(value: NumberValue): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOrient(value: TitleOrient | SignalRef): Self = this.set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    
    @scala.inline
    def setSubtitleColor(value: ColorValue): Self = this.set("subtitleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleColor: Self = this.set("subtitleColor", js.undefined)
    
    @scala.inline
    def setSubtitleColorNull: Self = this.set("subtitleColor", null)
    
    @scala.inline
    def setSubtitleFont(value: StringValue): Self = this.set("subtitleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleFont: Self = this.set("subtitleFont", js.undefined)
    
    @scala.inline
    def setSubtitleFontSize(value: NumberValue): Self = this.set("subtitleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleFontSize: Self = this.set("subtitleFontSize", js.undefined)
    
    @scala.inline
    def setSubtitleFontStyle(value: FontStyleValue): Self = this.set("subtitleFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleFontStyle: Self = this.set("subtitleFontStyle", js.undefined)
    
    @scala.inline
    def setSubtitleFontWeight(value: FontWeightValue): Self = this.set("subtitleFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleFontWeight: Self = this.set("subtitleFontWeight", js.undefined)
    
    @scala.inline
    def setSubtitleLineHeight(value: NumberValue): Self = this.set("subtitleLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleLineHeight: Self = this.set("subtitleLineHeight", js.undefined)
    
    @scala.inline
    def setSubtitlePadding(value: NumberValue): Self = this.set("subtitlePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitlePadding: Self = this.set("subtitlePadding", js.undefined)
    
    @scala.inline
    def setZindex(value: Double): Self = this.set("zindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZindex: Self = this.set("zindex", js.undefined)
  }
}
