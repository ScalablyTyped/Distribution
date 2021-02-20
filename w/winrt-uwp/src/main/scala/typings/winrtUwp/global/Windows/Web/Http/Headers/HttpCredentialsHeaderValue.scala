package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.CredentialsHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Authorization or Proxy-Authorization HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpCredentialsHeaderValue")
@js.native
class HttpCredentialsHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpCredentialsHeaderValue {
  /**
    * Initializes a new instance of the HttpCredentialsHeaderValue class with the scheme to use for authentication.
    * @param scheme The scheme to use for authentication.
    */
  def this(scheme: String) = this()
  /**
    * Initializes a new instance of the HttpCredentialsHeaderValue class with the scheme and user token information to use for authentication.
    * @param scheme The scheme to use for authentication.
    * @param token The user token information to use for authentication.
    */
  def this(scheme: String, token: String) = this()
}
object HttpCredentialsHeaderValue {
  
  /**
    * Converts a string to an HttpCredentialsHeaderValue instance.
    * @param input A string that represents the credential information in the Authorization or Proxy-Authorization HTTP header.
    * @return An HttpCredentialsHeaderValue instance.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpCredentialsHeaderValue.parse")
  @js.native
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpCredentialsHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpCredentialsHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpCredentialsHeaderValue.tryParse")
  @js.native
  def tryParse(input: String): CredentialsHeaderValue = js.native
}
