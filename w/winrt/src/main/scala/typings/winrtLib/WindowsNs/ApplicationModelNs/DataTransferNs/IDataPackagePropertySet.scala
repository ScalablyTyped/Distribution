package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataPackagePropertySet
  extends winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, js.Any] {
  var applicationListingUri: winrtLib.WindowsNs.FoundationNs.Uri
  var applicationName: java.lang.String
  var description: java.lang.String
  var fileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  var thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
  var title: java.lang.String
}

object IDataPackagePropertySet {
  @scala.inline
  def apply(
    applicationListingUri: winrtLib.WindowsNs.FoundationNs.Uri,
    applicationName: java.lang.String,
    clear: js.Function0[scala.Unit],
    description: java.lang.String,
    fileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String],
    first: js.Function0[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[
        winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, js.Any]
      ]
    ],
    getView: js.Function0[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, js.Any]],
    hasKey: js.Function1[java.lang.String, scala.Boolean],
    insert: js.Function2[java.lang.String, js.Any, scala.Boolean],
    lookup: js.Function1[java.lang.String, js.Any],
    remove: js.Function1[java.lang.String, scala.Unit],
    size: scala.Double,
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference,
    title: java.lang.String
  ): IDataPackagePropertySet = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri, applicationName = applicationName, clear = clear, description = description, fileTypes = fileTypes, first = first, getView = getView, hasKey = hasKey, insert = insert, lookup = lookup, remove = remove, size = size, thumbnail = thumbnail, title = title)
  
    __obj.asInstanceOf[IDataPackagePropertySet]
  }
}

