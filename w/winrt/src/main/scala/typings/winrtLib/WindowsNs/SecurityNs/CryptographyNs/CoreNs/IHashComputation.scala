package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashComputation extends js.Object {
  def append(data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): scala.Unit
  def getValueAndReset(): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
}

object IHashComputation {
  @scala.inline
  def apply(
    append: js.Function1[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Unit],
    getValueAndReset: js.Function0[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer]
  ): IHashComputation = {
    val __obj = js.Dynamic.literal(append = append, getValueAndReset = getValueAndReset)
  
    __obj.asInstanceOf[IHashComputation]
  }
}

