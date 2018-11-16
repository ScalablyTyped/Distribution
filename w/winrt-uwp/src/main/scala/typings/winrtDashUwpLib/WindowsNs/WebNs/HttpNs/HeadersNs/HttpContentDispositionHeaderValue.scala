package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Content-Disposition HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentDispositionHeaderValue")
@js.native
class HttpContentDispositionHeaderValue protected () extends js.Object {
  /**
                       * Initializes a new instance of the HttpContentDispositionHeaderValue class with content-coding information for use in the Content-Disposition HTTP header.
                       * @param dispositionType The value of the disposition-type information to be used in the Content-Disposition HTTP header.
                       */
  def this(dispositionType: java.lang.String) = this()
  /** Gets or sets the value of the disposition-type information in the Content-Disposition HTTP header. */
  var dispositionType: java.lang.String = js.native
  /** Gets or sets the value of the filename-parm information in the Content-Disposition HTTP header for a single file. */
  var fileName: java.lang.String = js.native
  /** Gets or sets the value of the filename-parm characteristic in the Content-Disposition HTTP header for multiple files. */
  var fileNameStar: java.lang.String = js.native
  /** Gets or sets the name for a content body part in the Content-Disposition HTTP header. */
  var name: java.lang.String = js.native
  /** Gets a set of parameters included in the Content-Disposition HTTP header. */
  var parameters: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[HttpNameValueHeaderValue] = js.native
  /** Gets or sets the approximate size, in bytes, of the file used in the Content-Disposition HTTP header. */
  var size: scala.Double = js.native
}

/** Represents the value of the Content-Disposition HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentDispositionHeaderValue")
@js.native
object HttpContentDispositionHeaderValue extends js.Object {
  /**
                       * Converts a string to an HttpContentDispositionHeaderValue instance.
                       * @param input A string that represents the content disposition information in the Content-Disposition HTTP header.
                       * @return An HttpContentDispositionHeaderValue instance.
                       */
  def parse(input: java.lang.String): winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentDispositionHeaderValue = js.native
  /**
                       * Determines whether a string is valid HttpContentDispositionHeaderValue information.
                       * @param input The string to validate.
                       */
  def tryParse(input: java.lang.String): winrtDashUwpLib.Anon_ContentDispositionHeaderValue = js.native
}

