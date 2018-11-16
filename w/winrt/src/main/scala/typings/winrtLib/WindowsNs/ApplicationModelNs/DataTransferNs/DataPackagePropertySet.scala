package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySet")
@js.native
class DataPackagePropertySet () extends IDataPackagePropertySet {
  /* CompleteClass */
  override var applicationListingUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var applicationName: java.lang.String = js.native
  /* CompleteClass */
  override var description: java.lang.String = js.native
  /* CompleteClass */
  override var fileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /* CompleteClass */
  override var size: scala.Double = js.native
  /* CompleteClass */
  override var thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /* CompleteClass */
  override var title: java.lang.String = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def first(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, js.Any]
  ] = js.native
  /* CompleteClass */
  override def getView(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, js.Any] = js.native
  /* CompleteClass */
  override def hasKey(key: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def insert(key: java.lang.String, value: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def lookup(key: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def remove(key: java.lang.String): scala.Unit = js.native
}

