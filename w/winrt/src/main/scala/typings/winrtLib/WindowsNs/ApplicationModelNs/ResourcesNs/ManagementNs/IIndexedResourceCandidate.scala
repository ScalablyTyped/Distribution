package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndexedResourceCandidate extends js.Object {
  var metadata: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, java.lang.String]
  var qualifiers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IndexedResourceQualifier]
  var `type`: IndexedResourceType
  var uri: winrtLib.WindowsNs.FoundationNs.Uri
  var valueAsString: java.lang.String
  def getQualifierValue(qualifierName: java.lang.String): java.lang.String
}

object IIndexedResourceCandidate {
  @scala.inline
  def apply(
    getQualifierValue: js.Function1[java.lang.String, java.lang.String],
    metadata: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, java.lang.String],
    qualifiers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IndexedResourceQualifier],
    `type`: IndexedResourceType,
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    valueAsString: java.lang.String
  ): IIndexedResourceCandidate = {
    val __obj = js.Dynamic.literal(getQualifierValue = getQualifierValue, metadata = metadata, qualifiers = qualifiers, uri = uri, valueAsString = valueAsString)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IIndexedResourceCandidate]
  }
}

