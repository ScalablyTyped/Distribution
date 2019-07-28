package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reusable hashing object and contains the result of a hashing operation. */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicHash")
@js.native
abstract class CryptographicHash () extends js.Object {
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

