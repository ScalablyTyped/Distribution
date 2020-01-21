package typings.summernote.mod._Global_.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodemirrorOptions extends js.Object {
  var htmlNode: js.UndefOr[Boolean] = js.undefined
  var lineNumbers: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object CodemirrorOptions {
  @scala.inline
  def apply(
    htmlNode: js.UndefOr[Boolean] = js.undefined,
    lineNumbers: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    theme: String = null
  ): CodemirrorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(htmlNode)) __obj.updateDynamic("htmlNode")(htmlNode.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodemirrorOptions]
  }
}

