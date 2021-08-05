package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.ContentCodingHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents content encoding information used in the Content-Encoding HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentCodingHeaderValue")
@js.native
class HttpContentCodingHeaderValue protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingHeaderValue {
  /**
    * Initializes a new instance of the HttpContentCodingHeaderValue class.
    * @param contentCoding The value of the content-coding to use.
    */
  def this(contentCoding: String) = this()
  
  /** Gets the value of the content-coding information used in the Content-Encoding HTTP header. */
  /* CompleteClass */
  var contentCoding: String = js.native
}
object HttpContentCodingHeaderValue {
  
  @JSGlobal("Windows.Web.Http.Headers.HttpContentCodingHeaderValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string to an HttpContentCodingHeaderValue instance.
    * @param input A string that represents the content coding information in the Content-Encoding HTTP header.
    * @return An HttpContentCodingHeaderValue instance.
    */
  /* static member */
  inline def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingHeaderValue]
  
  /**
    * Determines whether a string is valid HttpContentCodingHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  inline def tryParse(input: String): ContentCodingHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[ContentCodingHeaderValue]
}
