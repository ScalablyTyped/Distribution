package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashComputation extends js.Object {
  def append(data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): scala.Unit
  def getValueAndReset(): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
}

