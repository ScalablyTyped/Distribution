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
    clear: () => scala.Unit,
    description: java.lang.String,
    fileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String],
    first: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, js.Any]
    ],
    getView: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, js.Any],
    hasKey: java.lang.String => scala.Boolean,
    insert: (java.lang.String, js.Any) => scala.Boolean,
    lookup: java.lang.String => js.Any,
    remove: java.lang.String => scala.Unit,
    size: scala.Double,
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference,
    title: java.lang.String
  ): IDataPackagePropertySet = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri, applicationName = applicationName, clear = js.Any.fromFunction0(clear), description = description, fileTypes = fileTypes, first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size, thumbnail = thumbnail, title = title)
  
    __obj.asInstanceOf[IDataPackagePropertySet]
  }
}

