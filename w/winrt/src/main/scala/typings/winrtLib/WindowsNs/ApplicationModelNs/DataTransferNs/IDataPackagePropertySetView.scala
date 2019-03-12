package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataPackagePropertySetView
  extends winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, js.Any] {
  var applicationListingUri: winrtLib.WindowsNs.FoundationNs.Uri
  var applicationName: java.lang.String
  var description: java.lang.String
  var fileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference
  var title: java.lang.String
}

object IDataPackagePropertySetView {
  @scala.inline
  def apply(
    applicationListingUri: winrtLib.WindowsNs.FoundationNs.Uri,
    applicationName: java.lang.String,
    description: java.lang.String,
    fileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    first: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, js.Any]
    ],
    hasKey: java.lang.String => scala.Boolean,
    lookup: java.lang.String => js.Any,
    size: scala.Double,
    split: () => winrtLib.Anon_First[java.lang.String, js.Any],
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference,
    title: java.lang.String
  ): IDataPackagePropertySetView = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri, applicationName = applicationName, description = description, fileTypes = fileTypes, first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size, split = js.Any.fromFunction0(split), thumbnail = thumbnail, title = title)
  
    __obj.asInstanceOf[IDataPackagePropertySetView]
  }
}

