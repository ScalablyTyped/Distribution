package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteDark extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 样式风格
    */
  var style: wegameDashApiLib.wegameDashApiLibStrings.light | wegameDashApiLib.wegameDashApiLibStrings.dark
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_CompleteDark {
  @scala.inline
  def apply(
    style: wegameDashApiLib.wegameDashApiLibStrings.light | wegameDashApiLib.wegameDashApiLibStrings.dark,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): Anon_CompleteDark = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_CompleteDark]
  }
}

