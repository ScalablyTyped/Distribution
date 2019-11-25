package typings.web3DashUtils

import typings.web3DashUtils.web3DashUtilsMod._Mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends _Mixed {
  var `type`: String
  var value: String
}

object Anon_Type {
  @scala.inline
  def apply(`type`: String, value: String): Anon_Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Type]
  }
}

