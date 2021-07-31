package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.ConnectionOptionHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents connection information used in the Connection HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue")
@js.native
class HttpConnectionOptionHeaderValue protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue {
  /**
    * Initializes a new instance of the HttpConnectionOptionHeaderValue class.
    * @param token The value of the connection-token to use.
    */
  def this(token: String) = this()
  
  /** Gets the value of the connection-token in the Connection HTTP header. */
  /* CompleteClass */
  var token: String = js.native
}
object HttpConnectionOptionHeaderValue {
  
  @JSGlobal("Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string to an HttpConnectionOptionHeaderValue instance.
    * @param input A string that represents the connection information in the Connection HTTP header.
    * @return An HttpConnectionOptionHeaderValue instance.
    */
  /* static member */
  @scala.inline
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue]
  
  /**
    * Determines whether a string is valid HttpConnectionOptionHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @scala.inline
  def tryParse(input: String): ConnectionOptionHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[ConnectionOptionHeaderValue]
}
