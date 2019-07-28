package typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs

import typings.winrt.Anon_First
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataPackagePropertySetView
  extends IMapView[String, js.Any] {
  var applicationListingUri: Uri
  var applicationName: String
  var description: String
  var fileTypes: IVectorView[String]
  var thumbnail: RandomAccessStreamReference
  var title: String
}

object IDataPackagePropertySetView {
  @scala.inline
  def apply(
    applicationListingUri: Uri,
    applicationName: String,
    description: String,
    fileTypes: IVectorView[String],
    first: () => IIterator[IKeyValuePair[String, js.Any]],
    hasKey: String => Boolean,
    lookup: String => js.Any,
    size: Double,
    split: () => Anon_First[String, js.Any],
    thumbnail: RandomAccessStreamReference,
    title: String
  ): IDataPackagePropertySetView = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri, applicationName = applicationName, description = description, fileTypes = fileTypes, first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size, split = js.Any.fromFunction0(split), thumbnail = thumbnail, title = title)
  
    __obj.asInstanceOf[IDataPackagePropertySetView]
  }
}

