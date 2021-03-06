package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.NameValueHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents name and value information used in a number of HTTP headers. */
@JSGlobal("Windows.Web.Http.Headers.HttpNameValueHeaderValue")
@js.native
class HttpNameValueHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue {
  /**
    * Initializes a new instance of the HttpNameValueHeaderValue class. with a name.
    * @param name The name to be used.
    */
  def this(name: String) = this()
  /**
    * Initializes a new instance of the HttpNameValueHeaderValue class. with a name and value.
    * @param name The name to be used.
    * @param value The value to associate with the name.
    */
  def this(name: String, value: String) = this()
}
object HttpNameValueHeaderValue {
  
  /**
    * Converts a string to an HttpNameValueHeaderValue instance.
    * @param input A string that represents the name and value.
    * @return An HttpNameValueHeaderValue instance.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpNameValueHeaderValue.parse")
  @js.native
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpNameValueHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpNameValueHeaderValue.tryParse")
  @js.native
  def tryParse(input: String): NameValueHeaderValue = js.native
}
