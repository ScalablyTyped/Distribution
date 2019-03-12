package typings
package triplesecLib.triplesecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordArray extends js.Object {
  var sigBytes: scala.Double
  var words: js.Array[scala.Double]
  def to_hex(): java.lang.String
}

object WordArray {
  @scala.inline
  def apply(sigBytes: scala.Double, to_hex: () => java.lang.String, words: js.Array[scala.Double]): WordArray = {
    val __obj = js.Dynamic.literal(sigBytes = sigBytes, to_hex = js.Any.fromFunction0(to_hex), words = words)
  
    __obj.asInstanceOf[WordArray]
  }
}

