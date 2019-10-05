package typings.winrtDashUwp.Windows.Web.Http.Headers

import typings.winrtDashUwp.Anon_ProductInfoHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents product information used in the User-Agent HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpProductInfoHeaderValue")
@js.native
class HttpProductInfoHeaderValue protected () extends js.Object {
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
  /** Gets the product comment from the HttpProductInfoHeaderValue used in the User-Agent HTTP header. */
  var comment: String = js.native
  /** Gets the product from the HttpProductInfoHeaderValue used in the User-Agent HTTP header. */
  var product: HttpProductHeaderValue = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpProductInfoHeaderValue")
@js.native
object HttpProductInfoHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpProductInfoHeaderValue instance.
    * @param input A string that represents the product information.
    * @return An HttpProductInfoHeaderValue instance.
    */
  def parse(input: String): HttpProductInfoHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpProductInfoHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): Anon_ProductInfoHeaderValue = js.native
}

