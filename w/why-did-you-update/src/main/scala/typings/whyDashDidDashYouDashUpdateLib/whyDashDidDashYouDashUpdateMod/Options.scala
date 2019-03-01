package typings
package whyDashDidDashYouDashUpdateLib.whyDashDidDashYouDashUpdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var exclude: js.UndefOr[stdLib.RegExp] = js.undefined
  var include: js.UndefOr[stdLib.RegExp] = js.undefined
}

object Options {
  @scala.inline
  def apply(exclude: stdLib.RegExp = null, include: stdLib.RegExp = null): Options = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[Options]
  }
}

