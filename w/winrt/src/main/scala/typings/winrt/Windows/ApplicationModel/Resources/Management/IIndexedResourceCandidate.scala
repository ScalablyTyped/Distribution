package typings.winrt.Windows.ApplicationModel.Resources.Management

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndexedResourceCandidate extends js.Object {
  var metadata: IMapView[String, String]
  var qualifiers: IVectorView[IndexedResourceQualifier]
  var `type`: IndexedResourceType
  var uri: Uri
  var valueAsString: String
  def getQualifierValue(qualifierName: String): String
}

object IIndexedResourceCandidate {
  @scala.inline
  def apply(
    getQualifierValue: String => String,
    metadata: IMapView[String, String],
    qualifiers: IVectorView[IndexedResourceQualifier],
    `type`: IndexedResourceType,
    uri: Uri,
    valueAsString: String
  ): IIndexedResourceCandidate = {
    val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), metadata = metadata.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIndexedResourceCandidate]
  }
}

