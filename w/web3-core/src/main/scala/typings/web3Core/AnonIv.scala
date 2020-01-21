package typings.web3Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIv extends js.Object {
  var iv: String
}

object AnonIv {
  @scala.inline
  def apply(iv: String): AnonIv = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIv]
  }
}

