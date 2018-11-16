package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate")
@js.native
class IndexedResourceCandidate () extends IIndexedResourceCandidate {
  /* CompleteClass */
  override var metadata: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, java.lang.String] = js.native
  /* CompleteClass */
  override var qualifiers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IndexedResourceQualifier] = js.native
  /* CompleteClass */
  override var `type`: IndexedResourceType = js.native
  /* CompleteClass */
  override var uri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var valueAsString: java.lang.String = js.native
  /* CompleteClass */
  override def getQualifierValue(qualifierName: java.lang.String): java.lang.String = js.native
}

