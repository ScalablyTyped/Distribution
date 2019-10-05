package typings.winrt.Windows.Storage.FileProperties

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImageProperties extends IStorageItemExtraProperties {
  var cameraManufacturer: String = js.native
  var cameraModel: String = js.native
  var dateTaken: Date = js.native
  var height: Double = js.native
  var keywords: IVector[String] = js.native
  var latitude: Double = js.native
  var longitude: Double = js.native
  var orientation: PhotoOrientation = js.native
  var peopleNames: IVectorView[String] = js.native
  var rating: Double = js.native
  var title: String = js.native
  var width: Double = js.native
}

