package typings.winrtUwp.global.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines an object that represents a Uniform Resource Identifier (URI) value and parses it into components. The Uri object is used by many other Windows Runtime APIs that are not necessarily confined to web browser scenarios. */
@JSGlobal("Windows.Foundation.Uri")
@js.native
class Uri protected ()
  extends typings.winrtUwp.Windows.Foundation.Uri {
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
}
object Uri {
  
  /**
    * Converts a Uniform Resource Identifier (URI) string to its escaped representation.
    * @param toEscape The string to convert.
    * @return The escaped representation of toEscape.
    */
  /* static member */
  @JSGlobal("Windows.Foundation.Uri.escapeComponent")
  @js.native
  def escapeComponent(toEscape: String): String = js.native
  
  /**
    * Converts the specified string by replacing any escape sequences with their unescaped representation.
    * @param toUnescape The string to convert.
    * @return The unescaped representation of stringToUnescape.
    */
  /* static member */
  @JSGlobal("Windows.Foundation.Uri.unescapeComponent")
  @js.native
  def unescapeComponent(toUnescape: String): String = js.native
}
