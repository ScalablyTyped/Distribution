package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.CookiePairHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents cookie information used in the Cookie HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpCookiePairHeaderValue")
@js.native
class HttpCookiePairHeaderValue protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue {
  /**
    * Initializes a new instance of the HttpCookiePairHeaderValue class. with a cookie name.
    * @param name A token that represents the cookie name.
    */
  def this(name: String) = this()
  /**
    * Initializes a new instance of the HttpCookiePairHeaderValue class. with a cookie name and a value for the cookie.
    * @param name A token that represents the cookie name.
    * @param value A value for the cookie.
    */
  def this(name: String, value: String) = this()
  
  /** Gets a token that represents the cookie name used in the Cookie HTTP header. */
  /* CompleteClass */
  var name: String = js.native
  
  /** Gets or sets a value for the cookie used in the Cookie HTTP header. */
  /* CompleteClass */
  var value: String = js.native
}
object HttpCookiePairHeaderValue {
  
  @JSGlobal("Windows.Web.Http.Headers.HttpCookiePairHeaderValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string to an HttpCookiePairHeaderValue instance.
    * @param input A string that represents the cookie name and value in the Cookie HTTP header.
    * @return An HttpCookiePairHeaderValue instance.
    */
  /* static member */
  inline def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue]
  
  /**
    * Determines whether a string is valid HttpCookiePairHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  inline def tryParse(input: String): CookiePairHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[CookiePairHeaderValue]
}
