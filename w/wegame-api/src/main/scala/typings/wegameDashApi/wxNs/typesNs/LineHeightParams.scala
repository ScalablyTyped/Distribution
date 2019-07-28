package typings.wegameDashApi.wxNs.typesNs

import typings.wegameDashApi.Anon_LineHeight
import typings.wegameDashApi.wegameDashApiStrings.bold
import typings.wegameDashApi.wegameDashApiStrings.italic
import typings.wegameDashApi.wegameDashApiStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineHeightParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fontFamily: String
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[normal | italic] = js.undefined
  var fontWeight: js.UndefOr[normal | bold] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ Anon_LineHeight, Unit]] = js.undefined
  var text: String
}

object LineHeightParams {
  @scala.inline
  def apply(
    fontFamily: String,
    text: String,
    complete: () => Unit = null,
    fail: () => Unit = null,
    fontSize: Int | Double = null,
    fontStyle: normal | italic = null,
    fontWeight: normal | bold = null,
    success: /* res */ Anon_LineHeight => Unit = null
  ): LineHeightParams = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily, text = text)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[LineHeightParams]
  }
}

