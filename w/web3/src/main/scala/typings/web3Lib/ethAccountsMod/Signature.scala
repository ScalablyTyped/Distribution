package typings
package web3Lib.ethAccountsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  var messageHash: java.lang.String
  var r: java.lang.String
  var s: java.lang.String
  var v: java.lang.String
}

object Signature {
  @scala.inline
  def apply(messageHash: java.lang.String, r: java.lang.String, s: java.lang.String, v: java.lang.String): Signature = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messageHash")(messageHash)
    __obj.updateDynamic("r")(r)
    __obj.updateDynamic("s")(s)
    __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[Signature]
  }
}

