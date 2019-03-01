package typings
package uwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Binary extends js.Object {
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  var mask: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Binary {
  @scala.inline
  def apply(binary: js.UndefOr[scala.Boolean] = js.undefined, mask: js.UndefOr[scala.Boolean] = js.undefined): Anon_Binary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    __obj.asInstanceOf[Anon_Binary]
  }
}

