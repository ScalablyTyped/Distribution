package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.ContentRangeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Content-Range HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentRangeHeaderValue")
@js.native
class HttpContentRangeHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpContentRangeHeaderValue {
  /**
    * Initializes a new instance of the HttpContentRangeHeaderValue class with a content length.
    * @param length The length, in bytes, of the full content entity body.
    */
  def this(length: Double) = this()
  /**
    * Initializes a new instance of the HttpContentRangeHeaderValue class with a start and stop position.
    * @param from The position, in bytes, at which to start sending data.
    * @param to The position, in bytes, at which to stop sending data.
    */
  def this(from: Double, to: Double) = this()
  /**
    * Initializes a new instance of the HttpContentRangeHeaderValue class with a start and stop position and a content length.
    * @param from The position, in bytes, at which to start sending data.
    * @param to The position, in bytes, at which to stop sending data.
    * @param length The length, in bytes, of the full content entity body.
    */
  def this(from: Double, to: Double, length: Double) = this()
}
/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpContentRangeHeaderValue")
@js.native
object HttpContentRangeHeaderValue extends js.Object {
  
  /**
    * Converts a string to an HttpContentRangeHeaderValue instance.
    * @param input A string that represents the content range information in the Content-Range HTTP header.
    * @return An HttpContentRangeHeaderValue instance.
    */
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpContentRangeHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpContentRangeHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): ContentRangeHeaderValue = js.native
}
