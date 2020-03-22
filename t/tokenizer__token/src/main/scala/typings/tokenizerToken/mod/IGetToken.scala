package typings.tokenizerToken.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetToken[T] extends js.Object {
  /**
    * Length of encoded token in bytes
    */
  var len: Double
  /**
    * Decode value from buffer at offset
    * @param buffer - Buffer to read the decoded value from
    * @param offset - Decode offset
    * @return Decoded value
    */
  def get(buffer: Buffer, offset: Double): T
}

object IGetToken {
  @scala.inline
  def apply[T](get: (Buffer, Double) => T, len: Double): IGetToken[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), len = len.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGetToken[T]]
  }
}

