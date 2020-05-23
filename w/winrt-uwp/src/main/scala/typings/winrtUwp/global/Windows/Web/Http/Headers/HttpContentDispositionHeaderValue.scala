package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.anon.ContentDispositionHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Content-Disposition HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentDispositionHeaderValue")
@js.native
class HttpContentDispositionHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpContentDispositionHeaderValue {
  /**
    * Initializes a new instance of the HttpContentDispositionHeaderValue class with content-coding information for use in the Content-Disposition HTTP header.
    * @param dispositionType The value of the disposition-type information to be used in the Content-Disposition HTTP header.
    */
  def this(dispositionType: String) = this()
  /** Gets or sets the value of the disposition-type information in the Content-Disposition HTTP header. */
  /* CompleteClass */
  override var dispositionType: String = js.native
  /** Gets or sets the value of the filename-parm information in the Content-Disposition HTTP header for a single file. */
  /* CompleteClass */
  override var fileName: String = js.native
  /** Gets or sets the value of the filename-parm characteristic in the Content-Disposition HTTP header for multiple files. */
  /* CompleteClass */
  override var fileNameStar: String = js.native
  /** Gets or sets the name for a content body part in the Content-Disposition HTTP header. */
  /* CompleteClass */
  override var name: String = js.native
  /** Gets a set of parameters included in the Content-Disposition HTTP header. */
  /* CompleteClass */
  override var parameters: IVector[typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue] = js.native
  /** Gets or sets the approximate size, in bytes, of the file used in the Content-Disposition HTTP header. */
  /* CompleteClass */
  override var size: Double = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpContentDispositionHeaderValue")
@js.native
object HttpContentDispositionHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpContentDispositionHeaderValue instance.
    * @param input A string that represents the content disposition information in the Content-Disposition HTTP header.
    * @return An HttpContentDispositionHeaderValue instance.
    */
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpContentDispositionHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpContentDispositionHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): ContentDispositionHeaderValue = js.native
}

