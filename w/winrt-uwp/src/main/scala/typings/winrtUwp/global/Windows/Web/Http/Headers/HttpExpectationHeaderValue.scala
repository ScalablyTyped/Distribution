package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.anon.ExpectationHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a token for a particular server behavior required by the client that is used in the Expect HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpExpectationHeaderValue")
@js.native
class HttpExpectationHeaderValue protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.Headers.HttpExpectationHeaderValue {
  /**
    * Initializes a new instance of the HttpExpectationHeaderValue class with a name.
    * @param name A token that represents a name used in the Expect HTTP header.
    */
  def this(name: String) = this()
  /**
    * Initializes a new instance of the HttpExpectationHeaderValue class with a name and value for the name.
    * @param name A token that represents a name used in the Expect HTTP header.
    * @param value A value for the name used in the Expect HTTP header.
    */
  def this(name: String, value: String) = this()
  
  /** Gets or sets a token that represents a name for a server behavior used in the Expect HTTP header. */
  /* CompleteClass */
  var name: String = js.native
  
  /** Gets a set of parameters for a server behavior included in the Expect HTTP header. */
  /* CompleteClass */
  var parameters: IVector[typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue] = js.native
  
  /** Gets or sets a value for a server behavior used in the Expect HTTP header. */
  /* CompleteClass */
  var value: String = js.native
}
object HttpExpectationHeaderValue {
  
  @JSGlobal("Windows.Web.Http.Headers.HttpExpectationHeaderValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string to an HttpExpectationHeaderValue instance.
    * @param input A string that represents the information in the Expect HTTP header.
    * @return An HttpExpectationHeaderValue instance.
    */
  /* static member */
  @scala.inline
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpExpectationHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.Http.Headers.HttpExpectationHeaderValue]
  
  /**
    * Determines whether a string is valid HttpCredentialsHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @scala.inline
  def tryParse(input: String): ExpectationHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[ExpectationHeaderValue]
}
