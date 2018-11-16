package typings
package winrtLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FilePickerFileTypesOrderedMap")
@js.native
class FilePickerFileTypesOrderedMap ()
  extends winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMap[
      java.lang.String, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
    ] {
  /* CompleteClass */
  override var size: scala.Double = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def first(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[
      java.lang.String, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
    ]
  ] = js.native
  /* CompleteClass */
  override def getView(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
    java.lang.String, 
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  ] = js.native
  /* CompleteClass */
  override def hasKey(key: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def insert(
    key: java.lang.String,
    value: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  ): scala.Boolean = js.native
  /* CompleteClass */
  override def lookup(key: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /* CompleteClass */
  override def remove(key: java.lang.String): scala.Unit = js.native
}

