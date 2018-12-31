package typings
package winrtLib.WindowsNs.StorageNs.CompressionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompressor
  extends winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream {
  def detachStream(): winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
  def finishAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean]
}

