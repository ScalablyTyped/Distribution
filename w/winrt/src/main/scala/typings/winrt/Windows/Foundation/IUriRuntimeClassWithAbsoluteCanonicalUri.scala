package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUriRuntimeClassWithAbsoluteCanonicalUri extends StObject {
  
  var absoluteCanonicalUri: String
  
  var displayIri: String
}
object IUriRuntimeClassWithAbsoluteCanonicalUri {
  
  inline def apply(absoluteCanonicalUri: String, displayIri: String): IUriRuntimeClassWithAbsoluteCanonicalUri = {
    val __obj = js.Dynamic.literal(absoluteCanonicalUri = absoluteCanonicalUri.asInstanceOf[js.Any], displayIri = displayIri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUriRuntimeClassWithAbsoluteCanonicalUri]
  }
  
  extension [Self <: IUriRuntimeClassWithAbsoluteCanonicalUri](x: Self) {
    
    inline def setAbsoluteCanonicalUri(value: String): Self = StObject.set(x, "absoluteCanonicalUri", value.asInstanceOf[js.Any])
    
    inline def setDisplayIri(value: String): Self = StObject.set(x, "displayIri", value.asInstanceOf[js.Any])
  }
}
