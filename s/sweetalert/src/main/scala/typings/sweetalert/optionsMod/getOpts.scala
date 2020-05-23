package typings.sweetalert.optionsMod

import typings.sweetalert.anon.PartialSwalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sweetalert/typings/modules/options", "getOpts")
@js.native
object getOpts extends js.Object {
  def apply(params: (String | PartialSwalOptions)*): SwalOptions = js.native
}

