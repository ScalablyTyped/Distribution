package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsType extends js.Object {
  var items: js.UndefOr[scala.Nothing] = js.undefined
  var `type`: String
}

object ItemsType {
  @scala.inline
  def apply(`type`: String): ItemsType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsType]
  }
}

