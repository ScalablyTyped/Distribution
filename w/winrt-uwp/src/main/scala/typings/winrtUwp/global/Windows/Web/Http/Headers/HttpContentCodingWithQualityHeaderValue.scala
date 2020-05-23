package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.ContentCodingWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents accept encoding information used in the Accept-Encoding HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue")
@js.native
class HttpContentCodingWithQualityHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue {
  /**
    * Initializes a new instance of the HttpContentCodingHeaderValue class with content-coding information.
    * @param contentCoding The value of the content-coding to use.
    */
  def this(contentCoding: String) = this()
  /**
    * Initializes a new instance of the HttpContentCodingHeaderValue class with content-coding information and a qvalue.
    * @param contentCoding The value of the content-coding information to use.
    * @param quality The value of the qvalue to use.
    */
  def this(contentCoding: String, quality: Double) = this()
  /** Gets the value of the content-coding characteristic in the Accept-Encoding HTTP header. */
  /* CompleteClass */
  override var contentCoding: String = js.native
  /** Gets the value of the qvalue attribute in the Accept-Encoding HTTP header. */
  /* CompleteClass */
  override var quality: Double = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue")
@js.native
object HttpContentCodingWithQualityHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpContentCodingWithQualityHeaderValue instance.
    * @param input A string that represents the content coding information in the Accept-Encoding HTTP header.
    * @return An HttpContentCodingWithQualityHeaderValue instance.
    */
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpContentCodingWithQualityHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): ContentCodingWithQualityHeaderValue = js.native
}

