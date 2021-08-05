package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.anon.ContentDispositionHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Content-Disposition HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentDispositionHeaderValue")
@js.native
class HttpContentDispositionHeaderValue protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.Headers.HttpContentDispositionHeaderValue {
  /**
    * Initializes a new instance of the HttpContentDispositionHeaderValue class with content-coding information for use in the Content-Disposition HTTP header.
    * @param dispositionType The value of the disposition-type information to be used in the Content-Disposition HTTP header.
    */
  def this(dispositionType: String) = this()
  
  /** Gets or sets the value of the disposition-type information in the Content-Disposition HTTP header. */
  /* CompleteClass */
  var dispositionType: String = js.native
  
  /** Gets or sets the value of the filename-parm information in the Content-Disposition HTTP header for a single file. */
  /* CompleteClass */
  var fileName: String = js.native
  
  /** Gets or sets the value of the filename-parm characteristic in the Content-Disposition HTTP header for multiple files. */
  /* CompleteClass */
  var fileNameStar: String = js.native
  
  /** Gets or sets the name for a content body part in the Content-Disposition HTTP header. */
  /* CompleteClass */
  var name: String = js.native
  
  /** Gets a set of parameters included in the Content-Disposition HTTP header. */
  /* CompleteClass */
  var parameters: IVector[typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue] = js.native
  
  /** Gets or sets the approximate size, in bytes, of the file used in the Content-Disposition HTTP header. */
  /* CompleteClass */
  var size: Double = js.native
}
object HttpContentDispositionHeaderValue {
  
  @JSGlobal("Windows.Web.Http.Headers.HttpContentDispositionHeaderValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string to an HttpContentDispositionHeaderValue instance.
    * @param input A string that represents the content disposition information in the Content-Disposition HTTP header.
    * @return An HttpContentDispositionHeaderValue instance.
    */
  /* static member */
  inline def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpContentDispositionHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.Http.Headers.HttpContentDispositionHeaderValue]
  
  /**
    * Determines whether a string is valid HttpContentDispositionHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  inline def tryParse(input: String): ContentDispositionHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[ContentDispositionHeaderValue]
}
