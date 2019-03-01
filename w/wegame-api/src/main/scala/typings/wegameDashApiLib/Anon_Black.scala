package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Black extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: wegameDashApiLib.wegameDashApiLibStrings.white | wegameDashApiLib.wegameDashApiLibStrings.black
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_Black {
  @scala.inline
  def apply(
    style: wegameDashApiLib.wegameDashApiLibStrings.white | wegameDashApiLib.wegameDashApiLibStrings.black,
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): Anon_Black = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_Black]
  }
}

