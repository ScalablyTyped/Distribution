package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelNeutral extends js.Object {
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var neutral: js.UndefOr[java.lang.String] = js.undefined
  var ok: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CancelNeutral {
  @scala.inline
  def apply(cancel: java.lang.String = null, neutral: java.lang.String = null, ok: java.lang.String = null): Anon_CancelNeutral = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (neutral != null) __obj.updateDynamic("neutral")(neutral)
    if (ok != null) __obj.updateDynamic("ok")(ok)
    __obj.asInstanceOf[Anon_CancelNeutral]
  }
}

