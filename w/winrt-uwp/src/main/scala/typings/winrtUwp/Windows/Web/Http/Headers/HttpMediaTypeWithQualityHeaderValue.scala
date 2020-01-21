package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.AnonMediaTypeWithQualityHeaderValue
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents accept information used in the Accept HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue")
@js.native
class HttpMediaTypeWithQualityHeaderValue protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpMediaTypeHeaderValue class with a media type.
    * @param mediaType The media-type of the entity-body to accept that is used in the Accept HTTP header.
    */
  def this(mediaType: String) = this()
  /**
    * Initializes a new instance of the HttpMediaTypeHeaderValue class with a media type and quality.
    * @param mediaType The media-type of the entity-body to accept that is used in the Accept HTTP header.
    * @param quality The qvalue or quality.
    */
  def this(mediaType: String, quality: Double) = this()
  /** Gets or sets the character set of the content to accept that is used in the Accept HTTP header. */
  var charSet: String = js.native
  /** Gets or sets the media-type of the content to accept that is used in the Accept HTTP header. */
  var mediaType: String = js.native
  /** Gets a set of parameters included in the Accept HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue] = js.native
  /** Get or set the qvalue or quality used in the Accept HTTP header. */
  var quality: Double = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue")
@js.native
object HttpMediaTypeWithQualityHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpMediaTypeWithQualityHeaderValue instance.
    * @param input A string that represents the media-type, character set, and quality information used in the Accept HTTP header.
    * @return An HttpMediaTypeWithQualityHeaderValue instance.
    */
  def parse(input: String): HttpMediaTypeWithQualityHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpMediaTypeWithQualityHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): AnonMediaTypeWithQualityHeaderValue = js.native
}

