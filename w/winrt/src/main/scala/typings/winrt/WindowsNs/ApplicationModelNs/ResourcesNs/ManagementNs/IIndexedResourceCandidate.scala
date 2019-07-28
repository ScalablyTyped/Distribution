package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.Uri
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
    val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), metadata = metadata, qualifiers = qualifiers, uri = uri, valueAsString = valueAsString)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IIndexedResourceCandidate]
  }
}

