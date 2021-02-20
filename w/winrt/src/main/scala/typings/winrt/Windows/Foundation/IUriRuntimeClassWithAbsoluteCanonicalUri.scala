package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUriRuntimeClassWithAbsoluteCanonicalUri extends StObject {
  
  var absoluteCanonicalUri: String = js.native
  
  var displayIri: String = js.native
}
object IUriRuntimeClassWithAbsoluteCanonicalUri {
  
  @scala.inline
  def apply(absoluteCanonicalUri: String, displayIri: String): IUriRuntimeClassWithAbsoluteCanonicalUri = {
    val __obj = js.Dynamic.literal(absoluteCanonicalUri = absoluteCanonicalUri.asInstanceOf[js.Any], displayIri = displayIri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUriRuntimeClassWithAbsoluteCanonicalUri]
  }
  
  @scala.inline
  implicit class IUriRuntimeClassWithAbsoluteCanonicalUriMutableBuilder[Self <: IUriRuntimeClassWithAbsoluteCanonicalUri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteCanonicalUri(value: String): Self = StObject.set(x, "absoluteCanonicalUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayIri(value: String): Self = StObject.set(x, "displayIri", value.asInstanceOf[js.Any])
  }
}
