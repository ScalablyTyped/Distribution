package typings.winrt.Windows.ApplicationModel.Resources.Management

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIndexedResourceCandidate extends js.Object {
  
  def getQualifierValue(qualifierName: String): String = js.native
  
  var metadata: IMapView[String, String] = js.native
  
  var qualifiers: IVectorView[IndexedResourceQualifier] = js.native
  
  var `type`: IndexedResourceType = js.native
  
  var uri: Uri = js.native
  
  var valueAsString: String = js.native
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
  
  @scala.inline
  implicit class IIndexedResourceCandidateOps[Self <: IIndexedResourceCandidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetQualifierValue(value: String => String): Self = this.set("getQualifierValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMetadata(value: IMapView[String, String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifiers(value: IVectorView[IndexedResourceQualifier]): Self = this.set("qualifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IndexedResourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAsString(value: String): Self = this.set("valueAsString", value.asInstanceOf[js.Any])
  }
}
