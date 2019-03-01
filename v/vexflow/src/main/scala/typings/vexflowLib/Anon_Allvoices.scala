package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Allvoices extends js.Object {
  var all_voices: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Allvoices {
  @scala.inline
  def apply(all_voices: js.UndefOr[scala.Boolean] = js.undefined): Anon_Allvoices = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all_voices)) __obj.updateDynamic("all_voices")(all_voices)
    __obj.asInstanceOf[Anon_Allvoices]
  }
}

