package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents content encoding information used in the Content-Encoding HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentCodingHeaderValue")
@js.native
class HttpContentCodingHeaderValue protected () extends js.Object {
  /**
                       * Initializes a new instance of the HttpContentCodingHeaderValue class.
                       * @param contentCoding The value of the content-coding to use.
                       */
  def this(contentCoding: java.lang.String) = this()
  /** Gets the value of the content-coding information used in the Content-Encoding HTTP header. */
  var contentCoding: java.lang.String = js.native
}

/** Represents content encoding information used in the Content-Encoding HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentCodingHeaderValue")
@js.native
object HttpContentCodingHeaderValue extends js.Object {
  /**
                       * Converts a string to an HttpContentCodingHeaderValue instance.
                       * @param input A string that represents the content coding information in the Content-Encoding HTTP header.
                       * @return An HttpContentCodingHeaderValue instance.
                       */
  def parse(input: java.lang.String): winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentCodingHeaderValue = js.native
  /**
                       * Determines whether a string is valid HttpContentCodingHeaderValue information.
                       * @param input The string to validate.
                       */
  def tryParse(input: java.lang.String): winrtDashUwpLib.Anon_ContentCodingHeaderValue = js.native
}

