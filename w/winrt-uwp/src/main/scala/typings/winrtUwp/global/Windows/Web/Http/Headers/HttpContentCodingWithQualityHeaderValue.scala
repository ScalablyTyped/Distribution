package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.ContentCodingWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents accept encoding information used in the Accept-Encoding HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue")
@js.native
class HttpContentCodingWithQualityHeaderValue protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue {
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
  var contentCoding: String = js.native
  
  /** Gets the value of the qvalue attribute in the Accept-Encoding HTTP header. */
  /* CompleteClass */
  var quality: Double = js.native
}
object HttpContentCodingWithQualityHeaderValue {
  
  @JSGlobal("Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string to an HttpContentCodingWithQualityHeaderValue instance.
    * @param input A string that represents the content coding information in the Accept-Encoding HTTP header.
    * @return An HttpContentCodingWithQualityHeaderValue instance.
    */
  /* static member */
  inline def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue]
  
  /**
    * Determines whether a string is valid HttpContentCodingWithQualityHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  inline def tryParse(input: String): ContentCodingWithQualityHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[ContentCodingWithQualityHeaderValue]
}
