package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageFolderStatics extends js.Object {
  def getFolderFromPathAsync(path: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFolder]
}

object IStorageFolderStatics {
  @scala.inline
  def apply(
    getFolderFromPathAsync: java.lang.String => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFolder]
  ): IStorageFolderStatics = {
    val __obj = js.Dynamic.literal(getFolderFromPathAsync = js.Any.fromFunction1(getFolderFromPathAsync))
  
    __obj.asInstanceOf[IStorageFolderStatics]
  }
}

