package typings.vegaTypings

import typings.vegaTypings.encodeMod.Encode
import typings.vegaTypings.encodeMod.GroupEncodeEntry
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.encodeMod.TextEncodeEntry
import typings.vegaTypings.legendMod.GuideEncodeEntry
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.valuesMod.AlignValue
import typings.vegaTypings.valuesMod.AnchorValue
import typings.vegaTypings.valuesMod.ColorValue
import typings.vegaTypings.valuesMod.FontStyleValue
import typings.vegaTypings.valuesMod.FontWeightValue
import typings.vegaTypings.valuesMod.NumberValue
import typings.vegaTypings.valuesMod.StringValue
import typings.vegaTypings.valuesMod.TextBaselineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod {
  
  trait BaseTitle extends StObject {
    
    // ---------- Shared Text Properties ----------
    /**
      * Horizontal text alignment for title text. One of `"left"`, `"center"`, or `"right"`.
      */
    var align: js.UndefOr[AlignValue] = js.undefined
    
    /**
      * The anchor position for placing the title and subtitle text. One of `"start"`, `"middle"`, or `"end"`. For example, with an orientation of top these anchor positions map to a left-, center-, or right-aligned title.
      */
    var anchor: js.UndefOr[AnchorValue] = js.undefined
    
    /**
      * Angle in degrees of title and subtitle text.
      */
    var angle: js.UndefOr[NumberValue] = js.undefined
    
    // ---------- ARIA ----------
    /**
      * A boolean flag indicating if [ARIA attributes](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) should be included (SVG output only).
      * If `false`, the "aria-hidden" attribute will be set on the output SVG group, removing the title from the ARIA accessibility tree.
      *
      * __Default value:__ `true`
      */
    var aria: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Vertical text baseline for title and subtitle text. One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`. The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated relative to the *lineHeight* rather than *fontSize* alone.
      */
    var baseline: js.UndefOr[TextBaselineValue] = js.undefined
    
    // ---------- Title Text ----------
    /**
      * Text color for title text.
      */
    var color: js.UndefOr[ColorValue] = js.undefined
    
    /**
      * Delta offset for title and subtitle text x-coordinate.
      */
    var dx: js.UndefOr[NumberValue] = js.undefined
    
    /**
      * Delta offset for title and subtitle text y-coordinate.
      */
    var dy: js.UndefOr[NumberValue] = js.undefined
    
    /**
      * Font name for title text.
      */
    var font: js.UndefOr[StringValue] = js.undefined
    
    /**
      * Font size in pixels for title text.
      *
      * @minimum 0
      */
    var fontSize: js.UndefOr[NumberValue] = js.undefined
    
    /**
      * Font style for title text.
      */
    var fontStyle: js.UndefOr[FontStyleValue] = js.undefined
    
    /**
      * Font weight for title text.
      * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
      */
    var fontWeight: js.UndefOr[FontWeightValue] = js.undefined
    
    /**
      * The reference frame for the anchor position, one of `"bounds"` (to anchor relative to the full bounding box) or `"group"` (to anchor relative to the group width or height).
      */
    var frame: js.UndefOr[TitleFrame | StringValue] = js.undefined
    
    /**
      * The maximum allowed length in pixels of title and subtitle text.
      *
      * @minimum 0
      */
    var limit: js.UndefOr[NumberValue] = js.undefined
    
    /**
      * Line height in pixels for multi-line title text or title text with `"line-top"` or `"line-bottom"` baseline.
      */
    var lineHeight: js.UndefOr[NumberValue] = js.undefined
    
    /**
      * The orthogonal offset in pixels by which to displace the title group from its position along the edge of the chart.
      */
    var offset: js.UndefOr[NumberValue] = js.undefined
    
    /**
      * Default title orientation (`"top"`, `"bottom"`, `"left"`, or `"right"`)
      */
    var orient: js.UndefOr[TitleOrient | SignalRef] = js.undefined
    
    // ---------- Subtitle Text ----------
    /**
      * Text color for subtitle text.
      */
    var subtitleColor: js.UndefOr[ColorValue] = js.undefined
    
    /**
      * Font name for subtitle text.
      */
    var subtitleFont: js.UndefOr[StringValue] = js.undefined
    
    /**
      * Font size in pixels for subtitle text.
      *
      * @minimum 0
      */
    var subtitleFontSize: js.UndefOr[NumberValue] = js.undefined
    
    /**
      * Font style for subtitle text.
      */
    var subtitleFontStyle: js.UndefOr[FontStyleValue] = js.undefined
    
    /**
      * Font weight for subtitle text.
      * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
      */
    var subtitleFontWeight: js.UndefOr[FontWeightValue] = js.undefined
    
    /**
      * Line height in pixels for multi-line subtitle text.
      */
    var subtitleLineHeight: js.UndefOr[NumberValue] = js.undefined
    
    /**
      * The padding in pixels between title and subtitle text.
      */
    var subtitlePadding: js.UndefOr[NumberValue] = js.undefined
    
    /**
      * 	The integer z-index indicating the layering of the title group relative to other axis, mark, and legend groups.
      *
      * __Default value:__ `0`.
      *
      * @TJS-type integer
      * @minimum 0
      */
    var zindex: js.UndefOr[Double] = js.undefined
  }
  object BaseTitle {
    
    inline def apply(): BaseTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseTitle]
    }
    
    extension [Self <: BaseTitle](x: Self) {
      
      inline def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnchor(value: AnchorValue): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAngle(value: NumberValue): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setAria(value: Boolean): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setBaseline(value: TextBaselineValue): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDx(value: NumberValue): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: NumberValue): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setFont(value: StringValue): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: NumberValue): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: FontStyleValue): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontWeight(value: FontWeightValue): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFrame(value: TitleFrame | StringValue): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setLimit(value: NumberValue): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLineHeight(value: NumberValue): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setOffset(value: NumberValue): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrient(value: TitleOrient | SignalRef): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setSubtitleColor(value: ColorValue): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
      
      inline def setSubtitleColorNull: Self = StObject.set(x, "subtitleColor", null)
      
      inline def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
      
      inline def setSubtitleFont(value: StringValue): Self = StObject.set(x, "subtitleFont", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontSize(value: NumberValue): Self = StObject.set(x, "subtitleFontSize", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontSizeUndefined: Self = StObject.set(x, "subtitleFontSize", js.undefined)
      
      inline def setSubtitleFontStyle(value: FontStyleValue): Self = StObject.set(x, "subtitleFontStyle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontStyleUndefined: Self = StObject.set(x, "subtitleFontStyle", js.undefined)
      
      inline def setSubtitleFontUndefined: Self = StObject.set(x, "subtitleFont", js.undefined)
      
      inline def setSubtitleFontWeight(value: FontWeightValue): Self = StObject.set(x, "subtitleFontWeight", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontWeightUndefined: Self = StObject.set(x, "subtitleFontWeight", js.undefined)
      
      inline def setSubtitleLineHeight(value: NumberValue): Self = StObject.set(x, "subtitleLineHeight", value.asInstanceOf[js.Any])
      
      inline def setSubtitleLineHeightUndefined: Self = StObject.set(x, "subtitleLineHeight", js.undefined)
      
      inline def setSubtitlePadding(value: NumberValue): Self = StObject.set(x, "subtitlePadding", value.asInstanceOf[js.Any])
      
      inline def setSubtitlePaddingUndefined: Self = StObject.set(x, "subtitlePadding", js.undefined)
      
      inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  trait Title
    extends StObject
       with BaseTitle {
    
    /**
      * Mark definitions for custom title encoding.
      */
    var encode: js.UndefOr[TitleEncode | Encode[TextEncodeEntry]] = js.undefined
    
    /**
      * A boolean flag indicating if the title element should respond to input events such as mouse hover. (**Deprecated.**)
      */
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A mark name property to apply to the title text mark. (**Deprecated.**)
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A mark style property to apply to the title text mark. If not specified, a default style of `"group-title"` is applied. (**Deprecated**)
      */
    var style: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The subtitle text.
      */
    var subtitle: js.UndefOr[Text | SignalRef] = js.undefined
    
    /**
      * The title text.
      */
    var text: Text | SignalRef
  }
  object Title {
    
    inline def apply(text: Text | SignalRef): Title = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Title]
    }
    
    extension [Self <: Title](x: Self) {
      
      inline def setEncode(value: TitleEncode | Encode[TextEncodeEntry]): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setSubtitle(value: Text | SignalRef): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSubtitleVarargs(value: String*): Self = StObject.set(x, "subtitle", js.Array(value*))
      
      inline def setText(value: Text | SignalRef): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typings.vegaTypings.vegaTypingsStrings.start
    - typings.vegaTypings.vegaTypingsStrings.middle
    - typings.vegaTypings.vegaTypingsStrings.end
  */
  type TitleAnchor = _TitleAnchor | Null
  
  trait TitleEncode extends StObject {
    
    /**
      * Custom encoding for the title container group.
      */
    var group: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.undefined
    
    /**
      * Custom encoding for the subtitle text.
      */
    var subtitle: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.undefined
    
    /**
      * Custom encoding for the title text.
      */
    var title: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.undefined
  }
  object TitleEncode {
    
    inline def apply(): TitleEncode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleEncode]
    }
    
    extension [Self <: TitleEncode](x: Self) {
      
      inline def setGroup(value: GuideEncodeEntry[GroupEncodeEntry]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setSubtitle(value: GuideEncodeEntry[TextEncodeEntry]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: GuideEncodeEntry[TextEncodeEntry]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.bounds
    - typings.vegaTypings.vegaTypingsStrings.group
  */
  trait TitleFrame extends StObject
  object TitleFrame {
    
    inline def bounds: typings.vegaTypings.vegaTypingsStrings.bounds = "bounds".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.bounds]
    
    inline def group: typings.vegaTypings.vegaTypingsStrings.group = "group".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.group]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.none
    - typings.vegaTypings.vegaTypingsStrings.left
    - typings.vegaTypings.vegaTypingsStrings.right
    - typings.vegaTypings.vegaTypingsStrings.top
    - typings.vegaTypings.vegaTypingsStrings.bottom
  */
  trait TitleOrient extends StObject
  object TitleOrient {
    
    inline def bottom: typings.vegaTypings.vegaTypingsStrings.bottom = "bottom".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.bottom]
    
    inline def left: typings.vegaTypings.vegaTypingsStrings.left = "left".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.left]
    
    inline def none: typings.vegaTypings.vegaTypingsStrings.none = "none".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.none]
    
    inline def right: typings.vegaTypings.vegaTypingsStrings.right = "right".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.right]
    
    inline def top: typings.vegaTypings.vegaTypingsStrings.top = "top".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.top]
  }
  
  trait _TitleAnchor extends StObject
}
