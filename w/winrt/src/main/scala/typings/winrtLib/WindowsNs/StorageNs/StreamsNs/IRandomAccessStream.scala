package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRandomAccessStream
  extends IInputStream
     with IOutputStream {
  var canRead: scala.Boolean
  var canWrite: scala.Boolean
  var position: scala.Double
  var size: scala.Double
  def cloneStream(): IRandomAccessStream
  def getInputStreamAt(position: scala.Double): IInputStream
  def getOutputStreamAt(position: scala.Double): IOutputStream
  def seek(position: scala.Double): scala.Unit
}

