package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.AnonProductHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents product information used by the HttpProductHeaderValue and HttpProductInfoHeaderValueCollection classes in the User-Agent HTTP header. */
@JSGlobal("Windows.Web.Http.Headers.HttpProductHeaderValue")
@js.native
class HttpProductHeaderValue protected () extends js.Object {
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
  /** Gets a token that represents the name of the product to be used in the User-Agent HTTP header. */
  var name: String = js.native
  /** Gets a token that represents the version of the product to be used in the User-Agent HTTP header. */
  var version: String = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpProductHeaderValue")
@js.native
object HttpProductHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpProductHeaderValue instance.
    * @param input A string that represents the product name and version.
    * @return An HttpProductHeaderValue instance.
    */
  def parse(input: String): HttpProductHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpProductHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): AnonProductHeaderValue = js.native
}

