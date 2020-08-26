package typings.tokenizerToken.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToken[T] extends IGetToken[T] {
  /**
    * Encode value to buffer
    * @param buffer - Buffer to write the encoded value to
    * @param offset - Buffer write offset
    * @param value - Value to decode of type T
    */
  def put(buffer: Buffer, offset: Double, value: T): Double = js.native
}

object IToken {
  @scala.inline
  def apply[T](get: (Buffer, Double) => T, len: Double, put: (Buffer, Double, T) => Double): IToken[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), len = len.asInstanceOf[js.Any], put = js.Any.fromFunction3(put))
    __obj.asInstanceOf[IToken[T]]
  }
  @scala.inline
  implicit class ITokenOps[Self <: IToken[_], T] (val x: Self with IToken[T]) extends AnyVal {
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
    def setPut(value: (Buffer, Double, T) => Double): Self = this.set("put", js.Any.fromFunction3(value))
  }
  
}

