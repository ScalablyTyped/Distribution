package typings.winrt.WindowsNs.StorageNs.FilePropertiesNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentProperties extends IStorageItemExtraProperties {
  var author: IVector[String] = js.native
  var comment: String = js.native
  var keywords: IVector[String] = js.native
  var title: String = js.native
}

