package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.ChallengeHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents authentication information used in the Proxy-Authenticate and WWW-Authenticate HTTP header values. */
@JSGlobal("Windows.Web.Http.Headers.HttpChallengeHeaderValue")
@js.native
class HttpChallengeHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValue {
  /**
    * Initializes a new instance of the HttpChallengeHeaderValue class with the scheme to use for authorization.
    * @param scheme The scheme to use for authorization.
    */
  def this(scheme: String) = this()
  /**
    * Initializes a new instance of the HttpChallengeHeaderValue class with the scheme to use for authorization and the SPNEGO token.
    * @param scheme The scheme to use for authorization.
    * @param token The SPNEGO token to use with the Negotiate protocol scheme.
    */
  def this(scheme: String, token: String) = this()
}
object HttpChallengeHeaderValue {
  
  /**
    * Converts a string to an HttpChallengeHeaderValue instance.
    * @param input A string that represents authentication header value information.
    * @return An HttpChallengeHeaderValue instance.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpChallengeHeaderValue.parse")
  @js.native
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpChallengeHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpChallengeHeaderValue.tryParse")
  @js.native
  def tryParse(input: String): ChallengeHeaderValue = js.native
}
