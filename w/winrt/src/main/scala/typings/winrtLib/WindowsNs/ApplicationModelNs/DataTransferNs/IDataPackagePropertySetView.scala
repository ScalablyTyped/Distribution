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
    first: js.Function0[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[
        winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, js.Any]
      ]
    ],
    hasKey: js.Function1[java.lang.String, scala.Boolean],
    lookup: js.Function1[java.lang.String, js.Any],
    size: scala.Double,
    split: js.Function0[winrtLib.Anon_First[java.lang.String, js.Any]],
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference,
    title: java.lang.String
  ): IDataPackagePropertySetView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applicationListingUri")(applicationListingUri)
    __obj.updateDynamic("applicationName")(applicationName)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("fileTypes")(fileTypes)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("hasKey")(hasKey)
    __obj.updateDynamic("lookup")(lookup)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("split")(split)
    __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IDataPackagePropertySetView]
  }
}

