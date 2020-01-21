package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an object that represents a Uniform Resource Identifier (URI) value and parses it into components. The Uri object is used by many other Windows Runtime APIs that are not necessarily confined to web browser scenarios. */
@JSGlobal("Windows.Foundation.Uri")
@js.native
class Uri protected () extends js.Object {
  /**
    * Initializes a new Uri object from the specified Uniform Resource Identifier (URI) string. Initializing the Uri also parses the string and populates the Uri properties that represent URI components.
    * @param uri The string from which the new Uri object is created.
    */
  def this(uri: String) = this()
  /**
    * Initializes a new Uri by combining a base Uniform Resource Identifier (URI) and a relative URI. Initializing the Uri also parses the combined string and populates the Uri properties that represent URI components.
    * @param baseUri The base URI.
    * @param relativeUri The relative URI.
    */
  def this(baseUri: String, relativeUri: String) = this()
  /** Gets a fully canonical RFC-compliant representation of the current URI. */
  var absoluteCanonicalUri: String = js.native
  /** Gets the entire, non-canonical URI (It is non-canonical because it might actually be an IRI, per the Windows.Foundation.Uri encoding behavior; see Remarks.). */
  var absoluteUri: String = js.native
  /** Gets the decoded unicode characters that make up the current URI. */
  var displayIri: String = js.native
  /** Gets a representation of the Uniform Resource Identifier (URI) that can be used for display purposes. */
  var displayUri: String = js.native
  /** Gets the domain name component, including top-level domain, from a Uniform Resource Identifier (URI). */
  var domain: String = js.native
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
  /**
    * Adds the specified Uniform Resource Identifier (URI) to the current Uri .
    * @param relativeUri A relative URI specified as a string. This relative path is evaluated using the host/authority of the Uri instance where this method is called.
    * @return The combined Uri value.
    */
  def combineUri(relativeUri: String): Uri = js.native
  /**
    * Determines whether the specified Uri object is equal to the current Uri object.
    * @param pUri The Uri object to be compared.
    * @return true if the two Uri values are the same; otherwise, false.
    */
  def equals(pUri: Uri): Boolean = js.native
}

/* static members */
@JSGlobal("Windows.Foundation.Uri")
@js.native
object Uri extends js.Object {
  /**
    * Converts a Uniform Resource Identifier (URI) string to its escaped representation.
    * @param toEscape The string to convert.
    * @return The escaped representation of toEscape.
    */
  def escapeComponent(toEscape: String): String = js.native
  /**
    * Converts the specified string by replacing any escape sequences with their unescaped representation.
    * @param toUnescape The string to convert.
    * @return The unescaped representation of stringToUnescape.
    */
  def unescapeComponent(toUnescape: String): String = js.native
}

