package typings.tokenizerToken.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToken[T] extends IGetToken[T] {
  /**
    * Encode value to buffer
    * @param buffer - Buffer to write the encoded value to
    * @param offset - Buffer write offset
    * @param value - Value to decode of type T
    */
  def put(buffer: Buffer, offset: Double, value: T): Double
}

object IToken {
  @scala.inline
  def apply[T](get: (Buffer, Double) => T, len: Double, put: (Buffer, Double, T) => Double): IToken[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), len = len.asInstanceOf[js.Any], put = js.Any.fromFunction3(put))
    __obj.asInstanceOf[IToken[T]]
  }
}

