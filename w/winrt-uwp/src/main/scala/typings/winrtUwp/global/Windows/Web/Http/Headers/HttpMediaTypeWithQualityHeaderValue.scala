package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.anon.MediaTypeWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents accept information used in the Accept HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue")
@js.native
open class HttpMediaTypeWithQualityHeaderValue protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue {
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
  /* CompleteClass */
  var charSet: String = js.native
  
  /** Gets or sets the media-type of the content to accept that is used in the Accept HTTP header. */
  /* CompleteClass */
  var mediaType: String = js.native
  
  /** Gets a set of parameters included in the Accept HTTP header. */
  /* CompleteClass */
  var parameters: IVector[typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue] = js.native
  
  /** Get or set the qvalue or quality used in the Accept HTTP header. */
  /* CompleteClass */
  var quality: Double = js.native
}
object HttpMediaTypeWithQualityHeaderValue {
  
  @JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string to an HttpMediaTypeWithQualityHeaderValue instance.
    * @param input A string that represents the media-type, character set, and quality information used in the Accept HTTP header.
    * @return An HttpMediaTypeWithQualityHeaderValue instance.
    */
  /* static member */
  inline def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue]
  
  /**
    * Determines whether a string is valid HttpMediaTypeWithQualityHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  inline def tryParse(input: String): MediaTypeWithQualityHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[MediaTypeWithQualityHeaderValue]
}
