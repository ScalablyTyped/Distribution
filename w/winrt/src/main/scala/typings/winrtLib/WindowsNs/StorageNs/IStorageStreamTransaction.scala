package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IStorageStreamTransaction
  extends winrtLib.WindowsNs.FoundationNs.IClosable {
  var stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  def commitAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

