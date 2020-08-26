package typings.triplesec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordArray extends js.Object {
  var sigBytes: Double = js.native
  var words: js.Array[Double] = js.native
  def to_hex(): String = js.native
}

object WordArray {
  @scala.inline
  def apply(sigBytes: Double, to_hex: () => String, words: js.Array[Double]): WordArray = {
    val __obj = js.Dynamic.literal(sigBytes = sigBytes.asInstanceOf[js.Any], to_hex = js.Any.fromFunction0(to_hex), words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordArray]
  }
  @scala.inline
  implicit class WordArrayOps[Self <: WordArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSigBytes(value: Double): Self = this.set("sigBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo_hex(value: () => String): Self = this.set("to_hex", js.Any.fromFunction0(value))
    @scala.inline
    def setWordsVarargs(value: Double*): Self = this.set("words", js.Array(value :_*))
    @scala.inline
    def setWords(value: js.Array[Double]): Self = this.set("words", value.asInstanceOf[js.Any])
  }
  
}

