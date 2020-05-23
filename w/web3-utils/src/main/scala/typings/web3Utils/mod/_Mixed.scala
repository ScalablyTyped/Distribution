package typings.web3Utils.mod

import typings.bnJs.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Mixed extends js.Object

object _Mixed {
  @scala.inline
  def Type(`type`: String, value: String): _Mixed = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Mixed]
  }
  @scala.inline
  def T(t: String, v: String | ^  | Double): _Mixed = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Mixed]
  }
}

