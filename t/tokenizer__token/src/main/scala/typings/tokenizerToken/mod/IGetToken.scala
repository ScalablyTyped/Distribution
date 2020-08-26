package typings.tokenizerToken.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGetToken[T] extends js.Object {
  /**
    * Length of encoded token in bytes
    */
  var len: Double = js.native
  /**
    * Decode value from buffer at offset
    * @param buffer - Buffer to read the decoded value from
    * @param offset - Decode offset
    * @return Decoded value
    */
  def get(buffer: Buffer, offset: Double): T = js.native
}

object IGetToken {
  @scala.inline
  def apply[T](get: (Buffer, Double) => T, len: Double): IGetToken[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), len = len.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetToken[T]]
  }
  @scala.inline
  implicit class IGetTokenOps[Self <: IGetToken[_], T] (val x: Self with IGetToken[T]) extends AnyVal {
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
    def setGet(value: (Buffer, Double) => T): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setLen(value: Double): Self = this.set("len", value.asInstanceOf[js.Any])
  }
  
}

