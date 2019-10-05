package typings.winrt.Windows.Storage.FileProperties

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.FileProperties.BasicProperties")
@js.native
class BasicProperties ()
  extends IBasicProperties
     with IStorageItemExtraProperties {
  /* CompleteClass */
  override var dateModified: Date = js.native
  /* CompleteClass */
  override var itemDate: Date = js.native
  /* CompleteClass */
  override var size: Double = js.native
}

