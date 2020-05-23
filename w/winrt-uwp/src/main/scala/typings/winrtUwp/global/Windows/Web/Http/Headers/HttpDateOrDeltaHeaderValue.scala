package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.std.Date
import typings.winrtUwp.anon.DateOrDeltaHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Retry-After HTTP header on an HTTP response. */
@JSGlobal("Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue")
@js.native
abstract class HttpDateOrDeltaHeaderValue ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue {
  /** Gets the value of the HTTP-date information used in the Retry-After HTTP header. */
  /* CompleteClass */
  override var date: Date = js.native
  /** Gets the value of the delta-seconds information used in the Retry-After HTTP header. */
  /* CompleteClass */
  override var delta: Double = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue")
@js.native
object HttpDateOrDeltaHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpDateOrDeltaHeaderValue instance.
    * @param input A string that represents the HTTP-date or delta-seconds information in the Retry-After HTTP header.
    * @return An HttpDateOrDeltaHeaderValue instance.
    */
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpDateOrDeltaHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): DateOrDeltaHeaderValue = js.native
}

