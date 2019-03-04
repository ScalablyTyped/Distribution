package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.ShareTargetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuickLink extends js.Object {
  var id: java.lang.String
  var supportedDataFormats: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  var supportedFileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  var thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference
  var title: java.lang.String
}

object IQuickLink {
  @scala.inline
  def apply(
    id: java.lang.String,
    supportedDataFormats: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String],
    supportedFileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String],
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference,
    title: java.lang.String
  ): IQuickLink = {
    val __obj = js.Dynamic.literal(id = id, supportedDataFormats = supportedDataFormats, supportedFileTypes = supportedFileTypes, thumbnail = thumbnail, title = title)
  
    __obj.asInstanceOf[IQuickLink]
  }
}

