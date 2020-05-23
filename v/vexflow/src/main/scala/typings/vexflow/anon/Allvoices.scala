package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Allvoices extends js.Object {
  var all_voices: js.UndefOr[Boolean] = js.undefined
}

object Allvoices {
  @scala.inline
  def apply(all_voices: js.UndefOr[Boolean] = js.undefined): Allvoices = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all_voices)) __obj.updateDynamic("all_voices")(all_voices.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allvoices]
  }
}

