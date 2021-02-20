package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUriRuntimeClass extends StObject {
  
  var absoluteUri: String = js.native
  
  def combineUri(relativeUri: String): Uri = js.native
  
  var displayUri: String = js.native
  
  var domain: String = js.native
  
  def equals(pUri: Uri): Boolean = js.native
  
  var extension: String = js.native
  
  var fragment: String = js.native
  
  var host: String = js.native
  
  var password: String = js.native
  
  var path: String = js.native
  
  var port: Double = js.native
  
  var query: String = js.native
  
  var queryParsed: WwwFormUrlDecoder = js.native
  
  var rawUri: String = js.native
  
  var schemeName: String = js.native
  
  var suspicious: Boolean = js.native
  
  var userName: String = js.native
}
object IUriRuntimeClass {
  
  @scala.inline
  def apply(
    absoluteUri: String,
    combineUri: String => Uri,
    displayUri: String,
    domain: String,
    equals_ : Uri => Boolean,
    extension: String,
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
    val __obj = js.Dynamic.literal(absoluteUri = absoluteUri.asInstanceOf[js.Any], combineUri = js.Any.fromFunction1(combineUri), displayUri = displayUri.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryParsed = queryParsed.asInstanceOf[js.Any], rawUri = rawUri.asInstanceOf[js.Any], schemeName = schemeName.asInstanceOf[js.Any], suspicious = suspicious.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IUriRuntimeClass]
  }
  
  @scala.inline
  implicit class IUriRuntimeClassMutableBuilder[Self <: IUriRuntimeClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteUri(value: String): Self = StObject.set(x, "absoluteUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombineUri(value: String => Uri): Self = StObject.set(x, "combineUri", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayUri(value: String): Self = StObject.set(x, "displayUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals_(value: Uri => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParsed(value: WwwFormUrlDecoder): Self = StObject.set(x, "queryParsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUri(value: String): Self = StObject.set(x, "rawUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeName(value: String): Self = StObject.set(x, "schemeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspicious(value: Boolean): Self = StObject.set(x, "suspicious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
