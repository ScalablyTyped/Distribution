package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate")
@js.native
class IndexedResourceCandidate () extends IIndexedResourceCandidate {
  /* CompleteClass */
  override var metadata: IMapView[String, String] = js.native
  /* CompleteClass */
  override var qualifiers: IVectorView[IndexedResourceQualifier] = js.native
  /* CompleteClass */
  override var `type`: IndexedResourceType = js.native
  /* CompleteClass */
  override var uri: Uri = js.native
  /* CompleteClass */
  override var valueAsString: String = js.native
  /* CompleteClass */
  override def getQualifierValue(qualifierName: String): String = js.native
}

