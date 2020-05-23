package typings.winrt.anon

import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `8` extends js.Object {
  var items: js.Array[StorageFile]
  var returnValue: Double
}

object `8` {
  @scala.inline
  def apply(items: js.Array[StorageFile], returnValue: Double): `8` = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
}

