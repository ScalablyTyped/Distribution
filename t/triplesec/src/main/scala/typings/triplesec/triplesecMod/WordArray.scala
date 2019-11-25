package typings.triplesec.triplesecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordArray extends js.Object {
  var sigBytes: Double
  var words: js.Array[Double]
  def to_hex(): String
}

object WordArray {
  @scala.inline
  def apply(sigBytes: Double, to_hex: () => String, words: js.Array[Double]): WordArray = {
    val __obj = js.Dynamic.literal(sigBytes = sigBytes.asInstanceOf[js.Any], to_hex = js.Any.fromFunction0(to_hex), words = words.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WordArray]
  }
}

