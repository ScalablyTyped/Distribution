package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineHeightParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fontFamily: java.lang.String
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontStyle: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.normal | wegameDashApiLib.wegameDashApiLibStrings.italic
  ] = js.undefined
  var fontWeight: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.normal | wegameDashApiLib.wegameDashApiLibStrings.bold
  ] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_LineHeight, scala.Unit]] = js.undefined
  var text: java.lang.String
}

object LineHeightParams {
  @scala.inline
  def apply(
    fontFamily: java.lang.String,
    text: java.lang.String,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: wegameDashApiLib.wegameDashApiLibStrings.normal | wegameDashApiLib.wegameDashApiLibStrings.italic = null,
    fontWeight: wegameDashApiLib.wegameDashApiLibStrings.normal | wegameDashApiLib.wegameDashApiLibStrings.bold = null,
    success: /* res */ wegameDashApiLib.Anon_LineHeight => scala.Unit = null
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

