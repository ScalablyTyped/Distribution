package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.anon.MediaTypeHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Content-Type HTTP header on the HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeHeaderValue")
@js.native
class HttpMediaTypeHeaderValue protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeHeaderValue {
  /**
    * Initializes a new instance of the HttpMediaTypeHeaderValue class.
    * @param mediaType The media-type of the entity-body used in the Content-Type HTTP header.
    */
  def this(mediaType: String) = this()
  
  /** Gets or sets the character set of the entity-body used in the Content-Type HTTP header. */
  /* CompleteClass */
  var charSet: String = js.native
  
  /** Gets or sets the media-type of the entity-body used in the Content-Type HTTP header. */
  /* CompleteClass */
  var mediaType: String = js.native
  
  /** Gets a set of parameters included in the Content-Type HTTP header. */
  /* CompleteClass */
  var parameters: IVector[typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue] = js.native
}
object HttpMediaTypeHeaderValue {
  
  @JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeHeaderValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string to an HttpMediaTypeHeaderValue instance.
    * @param input A string that represents the media-type and character set information used in the Content-Type HTTP header.
    * @return An HttpMediaTypeHeaderValue instance.
    */
  /* static member */
  inline def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeHeaderValue]
  
  /**
    * Determines whether a string is valid HttpMediaTypeHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  inline def tryParse(input: String): MediaTypeHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[MediaTypeHeaderValue]
}
