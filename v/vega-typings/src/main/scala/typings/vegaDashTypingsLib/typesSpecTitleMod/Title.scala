package typings
package vegaDashTypingsLib.typesSpecTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title
  extends vegaDashTypingsLib.typesSpecEncodeMod.Encodable[vegaDashTypingsLib.typesSpecEncodeMod.TextEncodeEntry]
     with BaseTitle[
      vegaDashTypingsLib.typesSpecValuesMod.NumberValue, 
      vegaDashTypingsLib.typesSpecValuesMod.StringValue, 
      vegaDashTypingsLib.typesSpecValuesMod.ColorValue, 
      vegaDashTypingsLib.typesSpecValuesMod.FontWeightValue, 
      vegaDashTypingsLib.typesSpecValuesMod.FontStyleValue, 
      vegaDashTypingsLib.typesSpecValuesMod.AlignValue, 
      vegaDashTypingsLib.typesSpecValuesMod.TextBaselineValue, 
      TitleFrame | vegaDashTypingsLib.typesSpecValuesMod.StringValue, 
      vegaDashTypingsLib.typesSpecValuesMod.AnchorValue, 
      TitleOrient | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
    ] {
  /**
    * A boolean flag indicating if the title element should respond to input events such as mouse hover.
    */
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A mark name property to apply to the title text mark.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A mark style property to apply to the title text mark. If not specified, a default style of `"group-title"` is applied.
    */
  var style: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The title text.
    */
  var text: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  /**
    * 	The integer z-index indicating the layering of the title group relative to other axis, mark and legend groups.
    *
    * __Default value:__ `0`.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[scala.Double] = js.undefined
}

object Title {
  @scala.inline
  def apply(
    text: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef,
    align: vegaDashTypingsLib.typesSpecValuesMod.AlignValue = null,
    anchor: vegaDashTypingsLib.typesSpecValuesMod.AnchorValue = null,
    angle: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    baseline: vegaDashTypingsLib.typesSpecValuesMod.TextBaselineValue = null,
    color: vegaDashTypingsLib.typesSpecValuesMod.ColorValue = null,
    dx: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    dy: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    encode: vegaDashTypingsLib.typesSpecEncodeMod.Encode[vegaDashTypingsLib.typesSpecEncodeMod.TextEncodeEntry] = null,
    font: vegaDashTypingsLib.typesSpecValuesMod.StringValue = null,
    fontSize: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    fontStyle: vegaDashTypingsLib.typesSpecValuesMod.FontStyleValue = null,
    fontWeight: vegaDashTypingsLib.typesSpecValuesMod.FontWeightValue = null,
    frame: TitleFrame | vegaDashTypingsLib.typesSpecValuesMod.StringValue = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    limit: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    name: java.lang.String = null,
    offset: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    orient: TitleOrient | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    style: java.lang.String | js.Array[java.lang.String] = null,
    zindex: scala.Int | scala.Double = null
  ): Title = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

