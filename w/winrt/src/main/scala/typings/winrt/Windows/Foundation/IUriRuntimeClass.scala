package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUriRuntimeClass extends js.Object {
  
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
    equals: Uri => Boolean,
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
    val __obj = js.Dynamic.literal(absoluteUri = absoluteUri.asInstanceOf[js.Any], combineUri = js.Any.fromFunction1(combineUri), displayUri = displayUri.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), extension = extension.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryParsed = queryParsed.asInstanceOf[js.Any], rawUri = rawUri.asInstanceOf[js.Any], schemeName = schemeName.asInstanceOf[js.Any], suspicious = suspicious.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUriRuntimeClass]
  }
  
  @scala.inline
  implicit class IUriRuntimeClassOps[Self <: IUriRuntimeClass] (val x: Self) extends AnyVal {
    
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
    def setAbsoluteUri(value: String): Self = this.set("absoluteUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombineUri(value: String => Uri): Self = this.set("combineUri", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayUri(value: String): Self = this.set("displayUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals(value: Uri => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParsed(value: WwwFormUrlDecoder): Self = this.set("queryParsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUri(value: String): Self = this.set("rawUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeName(value: String): Self = this.set("schemeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspicious(value: Boolean): Self = this.set("suspicious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
  }
}
