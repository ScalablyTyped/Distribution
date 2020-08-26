package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reusable hashing object and contains the result of a hashing operation. */
@js.native
trait CryptographicHash extends js.Object {
  /**
    * Appends a binary encoded string to the data stored in the CryptographicHash object.
    * @param data Data to append.
    */
  def append(data: IBuffer): Unit = js.native
  /**
    * Gets hashed data from the CryptographicHash object and resets the object.
    * @return Hashed data.
    */
  def getValueAndReset(): IBuffer = js.native
}

object CryptographicHash {
  @scala.inline
  def apply(append: IBuffer => Unit, getValueAndReset: () => IBuffer): CryptographicHash = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), getValueAndReset = js.Any.fromFunction0(getValueAndReset))
    __obj.asInstanceOf[CryptographicHash]
  }
  @scala.inline
  implicit class CryptographicHashOps[Self <: CryptographicHash] (val x: Self) extends AnyVal {
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
    def setAppend(value: IBuffer => Unit): Self = this.set("append", js.Any.fromFunction1(value))
    @scala.inline
    def setGetValueAndReset(value: () => IBuffer): Self = this.set("getValueAndReset", js.Any.fromFunction0(value))
  }
  
}

