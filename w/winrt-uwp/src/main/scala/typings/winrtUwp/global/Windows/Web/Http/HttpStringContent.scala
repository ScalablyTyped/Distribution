package typings.winrtUwp.global.Windows.Web.Http

import typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides HTTP content that uses a string. */
@JSGlobal("Windows.Web.Http.HttpStringContent")
@js.native
class HttpStringContent protected ()
  extends typings.winrtUwp.Windows.Web.Http.HttpStringContent {
  /**
    * Initializes a new instance of the HttpStringContent class with the specified content.
    * @param content The content used to initialize the HttpStringContent .
    */
  def this(content: String) = this()
  /**
    * Initializes a new instance of the HttpStringContent class with the specified content and encoding.
    * @param content The content used to initialize the HttpStringContent .
    * @param encoding The encoding to use for the content.
    */
  def this(content: String, encoding: UnicodeEncoding) = this()
  /**
    * Initializes a new instance of the HttpStringContent class with the specified content, encoding, and media type.
    * @param content The content used to initialize the HttpStringContent .
    * @param encoding The encoding to use for the content.
    * @param mediaType The media type to use for the content.
    */
  def this(content: String, encoding: UnicodeEncoding, mediaType: String) = this()
}
