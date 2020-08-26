package typings.winrt.Windows.ApplicationModel.Resources.Management

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexedResourceCandidate extends IIndexedResourceCandidate

object IndexedResourceCandidate {
  @scala.inline
  def apply(
    getQualifierValue: String => String,
    metadata: IMapView[String, String],
    qualifiers: IVectorView[IndexedResourceQualifier],
    `type`: IndexedResourceType,
    uri: Uri,
    valueAsString: String
  ): IndexedResourceCandidate = {
    val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), metadata = metadata.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedResourceCandidate]
  }
}

