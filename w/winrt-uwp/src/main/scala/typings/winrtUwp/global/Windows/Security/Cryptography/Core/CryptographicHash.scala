package typings.winrtUwp.global.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reusable hashing object and contains the result of a hashing operation. */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicHash")
@js.native
abstract class CryptographicHash ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Core.CryptographicHash {
  /**
    * Appends a binary encoded string to the data stored in the CryptographicHash object.
    * @param data Data to append.
    */
  /* CompleteClass */
  override def append(data: IBuffer): Unit = js.native
  /**
    * Gets hashed data from the CryptographicHash object and resets the object.
    * @return Hashed data.
    */
  /* CompleteClass */
  override def getValueAndReset(): IBuffer = js.native
}

