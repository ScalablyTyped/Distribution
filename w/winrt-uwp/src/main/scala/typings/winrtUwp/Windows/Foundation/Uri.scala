package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an object that represents a Uniform Resource Identifier (URI) value and parses it into components. The Uri object is used by many other Windows Runtime APIs that are not necessarily confined to web browser scenarios. */
trait Uri extends js.Object {
  /** Gets a fully canonical RFC-compliant representation of the current URI. */
  var absoluteCanonicalUri: String
  /** Gets the entire, non-canonical URI (It is non-canonical because it might actually be an IRI, per the Windows.Foundation.Uri encoding behavior; see Remarks.). */
  var absoluteUri: String
  /** Gets the decoded unicode characters that make up the current URI. */
  var displayIri: String
  /** Gets a representation of the Uniform Resource Identifier (URI) that can be used for display purposes. */
  var displayUri: String
  /** Gets the domain name component, including top-level domain, from a Uniform Resource Identifier (URI). */
  var domain: String
  /** Gets the file name extension of the resource that is referenced in the Uri . */
  var extension: String
  /** Gets the text following a fragment marker (#), including the fragment marker itself. */
  var fragment: String
  /** Gets the fully qualified domain name. */
  var host: String
  /** Gets the password component of the Uniform Resource Identifier (URI) as stored in this Uri instance. */
  var password: String
  /** Gets the path and resource name component of the Uniform Resource Identifier (URI) as stored in this Uri instance. */
  var path: String
  /** Gets the port number component of the Uniform Resource Identifier (URI) as stored in this Uri instance */
  var port: Double
  /** Gets the query string component of the Uniform Resource Identifier (URI) as stored in this Uri instance. */
  var query: String
  /** Gets a parsed Uniform Resource Identifier (URI) query string. */
  var queryParsed: WwwFormUrlDecoder
  /** Gets the entire original Uniform Resource Identifier (URI) string as used to construct this Uri object, before parsing, and without any encoding applied. */
  var rawUri: String
  /** Gets the protocol scheme name component of the Uniform Resource Identifier (URI) as stored in this Uri instance */
  var schemeName: String
  /** Gets a value that indicates whether parsing determined that the Uniform Resource Identifier (URI) is not well-formed. */
  var suspicious: Boolean
  /** Gets the user name component of the Uniform Resource Identifier (URI) as stored in this Uri instance. */
  var userName: String
  /**
    * Adds the specified Uniform Resource Identifier (URI) to the current Uri .
    * @param relativeUri A relative URI specified as a string. This relative path is evaluated using the host/authority of the Uri instance where this method is called.
    * @return The combined Uri value.
    */
  def combineUri(relativeUri: String): Uri
  /**
    * Determines whether the specified Uri object is equal to the current Uri object.
    * @param pUri The Uri object to be compared.
    * @return true if the two Uri values are the same; otherwise, false.
    */
  def equals(pUri: Uri): Boolean
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
}

