package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.ProductInfoHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents product information used in the User-Agent HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpProductInfoHeaderValue")
@js.native
class HttpProductInfoHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpProductInfoHeaderValue {
  /**
    * Initializes a new instance of the HttpProductInfoHeaderValue class with a product comment.
    * @param productComment The product comment used in the User-Agent HTTP header.
    */
  def this(productComment: String) = this()
  /**
    * Initializes a new instance of the HttpProductInfoHeaderValue class with a product name and version.
    * @param productName The name of the product token used in the User-Agent HTTP header.
    * @param productVersion The version of the product token used in the User-Agent HTTP header.
    */
  def this(productName: String, productVersion: String) = this()
}
object HttpProductInfoHeaderValue {
  
  /**
    * Converts a string to an HttpProductInfoHeaderValue instance.
    * @param input A string that represents the product information.
    * @return An HttpProductInfoHeaderValue instance.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpProductInfoHeaderValue.parse")
  @js.native
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpProductInfoHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpProductInfoHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpProductInfoHeaderValue.tryParse")
  @js.native
  def tryParse(input: String): ProductInfoHeaderValue = js.native
}
