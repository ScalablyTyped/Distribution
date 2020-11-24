package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines an object that represents a Uniform Resource Identifier (URI) value and parses it into components. The Uri object is used by many other Windows Runtime APIs that are not necessarily confined to web browser scenarios. */
@js.native
trait Uri extends js.Object {
  
  /** Gets a fully canonical RFC-compliant representation of the current URI. */
  var absoluteCanonicalUri: String = js.native
  
  /** Gets the entire, non-canonical URI (It is non-canonical because it might actually be an IRI, per the Windows.Foundation.Uri encoding behavior; see Remarks.). */
  var absoluteUri: String = js.native
  
  /**
    * Adds the specified Uniform Resource Identifier (URI) to the current Uri .
    * @param relativeUri A relative URI specified as a string. This relative path is evaluated using the host/authority of the Uri instance where this method is called.
    * @return The combined Uri value.
    */
  def combineUri(relativeUri: String): Uri = js.native
  
  /** Gets the decoded unicode characters that make up the current URI. */
  var displayIri: String = js.native
  
  /** Gets a representation of the Uniform Resource Identifier (URI) that can be used for display purposes. */
  var displayUri: String = js.native
  
  /** Gets the domain name component, including top-level domain, from a Uniform Resource Identifier (URI). */
  var domain: String = js.native
  
  /**
    * Determines whether the specified Uri object is equal to the current Uri object.
    * @param pUri The Uri object to be compared.
    * @return true if the two Uri values are the same; otherwise, false.
    */
  def equals(pUri: Uri): Boolean = js.native
  
  /** Gets the file name extension of the resource that is referenced in the Uri . */
  var extension: String = js.native
  
  /** Gets the text following a fragment marker (#), including the fragment marker itself. */
  var fragment: String = js.native
  
  /** Gets the fully qualified domain name. */
  var host: String = js.native
  
  /** Gets the password component of the Uniform Resource Identifier (URI) as stored in this Uri instance. */
  var password: String = js.native
  
  /** Gets the path and resource name component of the Uniform Resource Identifier (URI) as stored in this Uri instance. */
  var path: String = js.native
  
  /** Gets the port number component of the Uniform Resource Identifier (URI) as stored in this Uri instance */
  var port: Double = js.native
  
  /** Gets the query string component of the Uniform Resource Identifier (URI) as stored in this Uri instance. */
  var query: String = js.native
  
  /** Gets a parsed Uniform Resource Identifier (URI) query string. */
  var queryParsed: WwwFormUrlDecoder = js.native
  
  /** Gets the entire original Uniform Resource Identifier (URI) string as used to construct this Uri object, before parsing, and without any encoding applied. */
  var rawUri: String = js.native
  
  /** Gets the protocol scheme name component of the Uniform Resource Identifier (URI) as stored in this Uri instance */
  var schemeName: String = js.native
  
  /** Gets a value that indicates whether parsing determined that the Uniform Resource Identifier (URI) is not well-formed. */
  var suspicious: Boolean = js.native
  
  /** Gets the user name component of the Uniform Resource Identifier (URI) as stored in this Uri instance. */
  var userName: String = js.native
}
object Uri {
  
  @scala.inline
  def apply(
    absoluteCanonicalUri: String,
    absoluteUri: String,
    combineUri: String => Uri,
    displayIri: String,
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
  ): Uri = {
    val __obj = js.Dynamic.literal(absoluteCanonicalUri = absoluteCanonicalUri.asInstanceOf[js.Any], absoluteUri = absoluteUri.asInstanceOf[js.Any], combineUri = js.Any.fromFunction1(combineUri), displayIri = displayIri.asInstanceOf[js.Any], displayUri = displayUri.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), extension = extension.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryParsed = queryParsed.asInstanceOf[js.Any], rawUri = rawUri.asInstanceOf[js.Any], schemeName = schemeName.asInstanceOf[js.Any], suspicious = suspicious.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
  
  @scala.inline
  implicit class UriOps[Self <: Uri] (val x: Self) extends AnyVal {
    
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
    def setAbsoluteCanonicalUri(value: String): Self = this.set("absoluteCanonicalUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteUri(value: String): Self = this.set("absoluteUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombineUri(value: String => Uri): Self = this.set("combineUri", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayIri(value: String): Self = this.set("displayIri", value.asInstanceOf[js.Any])
    
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
