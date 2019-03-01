package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gas extends js.Object {
  var gas: java.lang.String
  var gasPrice: java.lang.String
  var hash: java.lang.String
  var input: java.lang.String
  var nonce: java.lang.String
  var r: java.lang.String
  var s: java.lang.String
  var to: java.lang.String
  var v: java.lang.String
  var value: java.lang.String
}

object Anon_Gas {
  @scala.inline
  def apply(
    gas: java.lang.String,
    gasPrice: java.lang.String,
    hash: java.lang.String,
    input: java.lang.String,
    nonce: java.lang.String,
    r: java.lang.String,
    s: java.lang.String,
    to: java.lang.String,
    v: java.lang.String,
    value: java.lang.String
  ): Anon_Gas = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gas")(gas)
    __obj.updateDynamic("gasPrice")(gasPrice)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("nonce")(nonce)
    __obj.updateDynamic("r")(r)
    __obj.updateDynamic("s")(s)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("v")(v)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Gas]
  }
}

