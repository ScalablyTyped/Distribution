package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.ProductHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents product information used by the HttpProductHeaderValue and HttpProductInfoHeaderValueCollection classes in the User-Agent HTTP header. */
@JSGlobal("Windows.Web.Http.Headers.HttpProductHeaderValue")
@js.native
class HttpProductHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpProductHeaderValue {
  /**
    * Initializes a new instance of the HttpProductHeaderValue class with a product name.
    * @param productName The name of the product token used in the User-Agent HTTP header.
    */
  def this(productName: String) = this()
  /**
    * Initializes a new instance of the HttpProductHeaderValue class with a product name and a product version.
    * @param productName The name of the product token used in the User-Agent HTTP header.
    * @param productVersion The version of the product token used in the User-Agent HTTP header.
    */
  def this(productName: String, productVersion: String) = this()
}
object HttpProductHeaderValue {
  
  /**
    * Converts a string to an HttpProductHeaderValue instance.
    * @param input A string that represents the product name and version.
    * @return An HttpProductHeaderValue instance.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpProductHeaderValue.parse")
  @js.native
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpProductHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpProductHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpProductHeaderValue.tryParse")
  @js.native
  def tryParse(input: String): ProductHeaderValue = js.native
}
