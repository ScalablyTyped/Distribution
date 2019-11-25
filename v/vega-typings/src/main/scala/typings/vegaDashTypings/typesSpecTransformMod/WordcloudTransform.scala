package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecEncodeMod.FontStyle
import typings.vegaDashTypings.typesSpecEncodeMod.FontWeight
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.typesSpecUtilMod.Vector7
import typings.vegaDashTypings.vegaDashTypingsStrings.wordcloud
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordcloudTransform extends _Transforms {
  var as: js.UndefOr[(Vector7[String | SignalRef]) | SignalRef] = js.undefined
  var font: js.UndefOr[String | TransformField] = js.undefined
  var fontSize: js.UndefOr[Double | TransformField] = js.undefined
  var fontSizeRange: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var fontStyle: js.UndefOr[FontStyle | TransformField] = js.undefined
  var fontWeight: js.UndefOr[FontWeight | TransformField] = js.undefined
  var padding: js.UndefOr[Double | TransformField] = js.undefined
  var rotate: js.UndefOr[Double | TransformField] = js.undefined
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var spiral: js.UndefOr[WordcloudSpiral | SignalRef] = js.undefined
  var text: js.UndefOr[String | TransformField] = js.undefined
  var `type`: wordcloud
}

object WordcloudTransform {
  @scala.inline
  def apply(
    `type`: wordcloud,
    as: (Vector7[String | SignalRef]) | SignalRef = null,
    font: String | TransformField = null,
    fontSize: Double | TransformField = null,
    fontSizeRange: (Vector2[Double | SignalRef]) | SignalRef = null,
    fontStyle: FontStyle | TransformField = null,
    fontWeight: FontWeight | TransformField = null,
    padding: Double | TransformField = null,
    rotate: Double | TransformField = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null,
    spiral: WordcloudSpiral | SignalRef = null,
    text: String | TransformField = null
  ): WordcloudTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeRange != null) __obj.updateDynamic("fontSizeRange")(fontSizeRange.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spiral != null) __obj.updateDynamic("spiral")(spiral.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordcloudTransform]
  }
}

