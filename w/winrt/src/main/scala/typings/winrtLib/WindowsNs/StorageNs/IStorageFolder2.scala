package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IStorageFolder2 extends js.Object {
  def tryGetItemAsync(name: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IStorageItem]
}

