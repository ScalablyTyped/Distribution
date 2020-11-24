package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.ContentCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents content encoding information used in the Content-Encoding HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentCodingHeaderValue")
@js.native
class HttpContentCodingHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingHeaderValue {
  /**
    * Initializes a new instance of the HttpContentCodingHeaderValue class.
    * @param contentCoding The value of the content-coding to use.
    */
  def this(contentCoding: String) = this()
}
/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpContentCodingHeaderValue")
@js.native
object HttpContentCodingHeaderValue extends js.Object {
  
  /**
    * Converts a string to an HttpContentCodingHeaderValue instance.
    * @param input A string that represents the content coding information in the Content-Encoding HTTP header.
    * @return An HttpContentCodingHeaderValue instance.
    */
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpContentCodingHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): ContentCodingHeaderValue = js.native
}
