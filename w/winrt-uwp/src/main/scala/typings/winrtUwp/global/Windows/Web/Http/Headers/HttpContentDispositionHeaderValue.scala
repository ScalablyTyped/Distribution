package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.ContentDispositionHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
object HttpContentDispositionHeaderValue {
  
  /**
    * Converts a string to an HttpContentDispositionHeaderValue instance.
    * @param input A string that represents the content disposition information in the Content-Disposition HTTP header.
    * @return An HttpContentDispositionHeaderValue instance.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpContentDispositionHeaderValue.parse")
  @js.native
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpContentDispositionHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpContentDispositionHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpContentDispositionHeaderValue.tryParse")
  @js.native
  def tryParse(input: String): ContentDispositionHeaderValue = js.native
}
