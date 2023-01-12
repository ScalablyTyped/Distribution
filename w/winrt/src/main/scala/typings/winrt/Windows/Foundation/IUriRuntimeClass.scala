package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUriRuntimeClass extends StObject {
  
  var absoluteUri: String
  
  def combineUri(relativeUri: String): Uri
  
  var displayUri: String
  
  var domain: String
  
  def equals(pUri: Uri): Boolean
  
  var `extension`: String
  
  var fragment: String
  
  var host: String
  
  var password: String
  
  var path: String
  
  var port: Double
  
  var query: String
  
  var queryParsed: WwwFormUrlDecoder
  
  var rawUri: String
  
  var schemeName: String
  
  var suspicious: Boolean
  
  var userName: String
}
object IUriRuntimeClass {
  
  inline def apply(
    absoluteUri: String,
    combineUri: String => Uri,
    displayUri: String,
    domain: String,
    equals_ : Uri => Boolean,
    `extension`: String,
    fragment: String,
    host: String,
    password: String,
    path: String,
    port: Double,
    query: String,
    queryParsed: WwwFormUrlDecoder,
    rawUri: String,
    schemeName: String,
    suspicious: Boolean,
    userName: String
  ): IUriRuntimeClass = {
    val __obj = js.Dynamic.literal(absoluteUri = absoluteUri.asInstanceOf[js.Any], combineUri = js.Any.fromFunction1(combineUri), displayUri = displayUri.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryParsed = queryParsed.asInstanceOf[js.Any], rawUri = rawUri.asInstanceOf[js.Any], schemeName = schemeName.asInstanceOf[js.Any], suspicious = suspicious.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUriRuntimeClass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUriRuntimeClass] (val x: Self) extends AnyVal {
    
    inline def setAbsoluteUri(value: String): Self = StObject.set(x, "absoluteUri", value.asInstanceOf[js.Any])
    
    inline def setCombineUri(value: String => Uri): Self = StObject.set(x, "combineUri", js.Any.fromFunction1(value))
    
    inline def setDisplayUri(value: String): Self = StObject.set(x, "displayUri", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setEquals_(value: Uri => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryParsed(value: WwwFormUrlDecoder): Self = StObject.set(x, "queryParsed", value.asInstanceOf[js.Any])
    
    inline def setRawUri(value: String): Self = StObject.set(x, "rawUri", value.asInstanceOf[js.Any])
    
    inline def setSchemeName(value: String): Self = StObject.set(x, "schemeName", value.asInstanceOf[js.Any])
    
    inline def setSuspicious(value: Boolean): Self = StObject.set(x, "suspicious", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
