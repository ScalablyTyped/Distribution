package typings.vegaDashLite.buildSrcToplevelpropsMod

import typings.vegaDashLite.vegaDashLiteStrings.content
import typings.vegaDashLite.vegaDashLiteStrings.padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSizeParams extends js.Object {
  /**
    * Determines how size calculation should be performed, one of `"content"` or `"padding"`. The default setting (`"content"`) interprets the width and height settings as the data rectangle (plotting) dimensions, to which padding is then added. In contrast, the `"padding"` setting includes the padding within the view size calculations, such that the width and height settings indicate the **total** intended size of the view.
    *
    * __Default value__: `"content"`
    */
  var contains: js.UndefOr[content | padding] = js.undefined
  /**
    * A boolean flag indicating if autosize layout should be re-calculated on every view update.
    *
    * __Default value__: `false`
    */
  var resize: js.UndefOr[Boolean] = js.undefined
  /**
    * The sizing format type. One of `"pad"`, `"fit"` or `"none"`. See the [autosize type](https://vega.github.io/vega-lite/docs/size.html#autosize) documentation for descriptions of each.
    *
    * __Default value__: `"pad"`
    */
  var `type`: js.UndefOr[AutosizeType] = js.undefined
}

object AutoSizeParams {
  @scala.inline
  def apply(
    contains: content | padding = null,
    resize: js.UndefOr[Boolean] = js.undefined,
    `type`: AutosizeType = null
  ): AutoSizeParams = {
    val __obj = js.Dynamic.literal()
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AutoSizeParams]
  }
}

