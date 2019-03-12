package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageFolder2 extends js.Object {
  def tryGetItemAsync(name: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IStorageItem]
}

object IStorageFolder2 {
  @scala.inline
  def apply(tryGetItemAsync: java.lang.String => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IStorageItem]): IStorageFolder2 = {
    val __obj = js.Dynamic.literal(tryGetItemAsync = js.Any.fromFunction1(tryGetItemAsync))
  
    __obj.asInstanceOf[IStorageFolder2]
  }
}

