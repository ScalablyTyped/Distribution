package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapView")
@js.native
class ResourceMapMapView ()
  extends winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ResourceMap] {
  /* CompleteClass */
  override var size: scala.Double = js.native
  /* CompleteClass */
  override def first(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, ResourceMap]
  ] = js.native
  /* CompleteClass */
  override def hasKey(key: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def lookup(key: java.lang.String): ResourceMap = js.native
  /* CompleteClass */
  override def split(): winrtLib.Anon_First[java.lang.String, ResourceMap] = js.native
}

