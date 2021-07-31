package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.ContentRangeHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Content-Range HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentRangeHeaderValue")
@js.native
class HttpContentRangeHeaderValue protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.Headers.HttpContentRangeHeaderValue {
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
  
  /** Gets the position at which to start sending data in the Content-Range HTTP header. */
  /* CompleteClass */
  var firstBytePosition: Double = js.native
  
  /** Gets the position at which to stop sending data in the Content-Range HTTP header. */
  /* CompleteClass */
  var lastBytePosition: Double = js.native
  
  /** Gets the length of the full content entity body in the Content-Range HTTP header. */
  /* CompleteClass */
  var length: Double = js.native
  
  /** Gets or sets the value of the range units used in the Content-Range HTTP header. */
  /* CompleteClass */
  var unit: String = js.native
}
object HttpContentRangeHeaderValue {
  
  @JSGlobal("Windows.Web.Http.Headers.HttpContentRangeHeaderValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string to an HttpContentRangeHeaderValue instance.
    * @param input A string that represents the content range information in the Content-Range HTTP header.
    * @return An HttpContentRangeHeaderValue instance.
    */
  /* static member */
  @scala.inline
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpContentRangeHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.Http.Headers.HttpContentRangeHeaderValue]
  
  /**
    * Determines whether a string is valid HttpContentRangeHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @scala.inline
  def tryParse(input: String): ContentRangeHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[ContentRangeHeaderValue]
}
