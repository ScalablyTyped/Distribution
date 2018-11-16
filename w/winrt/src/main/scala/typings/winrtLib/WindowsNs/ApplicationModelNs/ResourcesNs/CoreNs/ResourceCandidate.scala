package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidate")
@js.native
class ResourceCandidate () extends IResourceCandidate {
  /* CompleteClass */
  override var isDefault: scala.Boolean = js.native
  /* CompleteClass */
  override var isMatch: scala.Boolean = js.native
  /* CompleteClass */
  override var isMatchAsDefault: scala.Boolean = js.native
  /* CompleteClass */
  override var qualifiers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ResourceQualifier] = js.native
  /* CompleteClass */
  override var valueAsString: java.lang.String = js.native
  /* CompleteClass */
  override def getQualifierValue(qualifierName: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getValueAsFileAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
}

