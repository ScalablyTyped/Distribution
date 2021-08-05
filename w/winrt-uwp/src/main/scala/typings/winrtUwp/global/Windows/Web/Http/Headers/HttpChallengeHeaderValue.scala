package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.anon.ChallengeHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents authentication information used in the Proxy-Authenticate and WWW-Authenticate HTTP header values. */
@JSGlobal("Windows.Web.Http.Headers.HttpChallengeHeaderValue")
@js.native
class HttpChallengeHeaderValue protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValue {
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
  
  /** Gets the credentials that contain the authentication information of the user agent for the resource being requested. */
  /* CompleteClass */
  var parameters: IVector[typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue] = js.native
  
  /** Gets the scheme to use for authentication. */
  /* CompleteClass */
  var scheme: String = js.native
  
  /** The SPNEGO token to use with the Negotiate protocol scheme. */
  /* CompleteClass */
  var token: String = js.native
}
object HttpChallengeHeaderValue {
  
  @JSGlobal("Windows.Web.Http.Headers.HttpChallengeHeaderValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string to an HttpChallengeHeaderValue instance.
    * @param input A string that represents authentication header value information.
    * @return An HttpChallengeHeaderValue instance.
    */
  /* static member */
  inline def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValue]
  
  /**
    * Determines whether a string is valid HttpChallengeHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  inline def tryParse(input: String): ChallengeHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[ChallengeHeaderValue]
}
