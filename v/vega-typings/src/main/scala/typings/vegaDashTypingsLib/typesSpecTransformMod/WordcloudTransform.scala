package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordcloudTransform extends _Transforms {
  var as: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector7[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var font: js.UndefOr[java.lang.String | TransformField] = js.undefined
  var fontSize: js.UndefOr[scala.Double | TransformField] = js.undefined
  var fontSizeRange: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var fontStyle: js.UndefOr[vegaDashTypingsLib.typesSpecEncodeMod.FontStyle | TransformField] = js.undefined
  var fontWeight: js.UndefOr[vegaDashTypingsLib.typesSpecEncodeMod.FontWeight | TransformField] = js.undefined
  var padding: js.UndefOr[scala.Double | TransformField] = js.undefined
  var rotate: js.UndefOr[scala.Double | TransformField] = js.undefined
  var signal: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var spiral: js.UndefOr[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.archimedian | vegaDashTypingsLib.vegaDashTypingsLibStrings.rectangular
  ] = js.undefined
  var text: js.UndefOr[java.lang.String | TransformField] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.wordcloud
}

object WordcloudTransform {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.wordcloud,
    as: (vegaDashTypingsLib.typesSpecUtilMod.Vector7[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    font: java.lang.String | TransformField = null,
    fontSize: scala.Double | TransformField = null,
    fontSizeRange: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    fontStyle: vegaDashTypingsLib.typesSpecEncodeMod.FontStyle | TransformField = null,
    fontWeight: vegaDashTypingsLib.typesSpecEncodeMod.FontWeight | TransformField = null,
    padding: scala.Double | TransformField = null,
    rotate: scala.Double | TransformField = null,
    signal: java.lang.String = null,
    size: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    spiral: vegaDashTypingsLib.vegaDashTypingsLibStrings.archimedian | vegaDashTypingsLib.vegaDashTypingsLibStrings.rectangular = null,
    text: java.lang.String | TransformField = null
  ): WordcloudTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeRange != null) __obj.updateDynamic("fontSizeRange")(fontSizeRange.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spiral != null) __obj.updateDynamic("spiral")(spiral.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordcloudTransform]
  }
}

