package typings.web3

import typings.web3.utilsMod._Mixed
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
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Type]
  }
}

