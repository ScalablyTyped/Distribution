package typings.winrtUwp.global.Windows.Web.Http

import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides HTTP content that uses a stream. */
@JSGlobal("Windows.Web.Http.HttpStreamContent")
@js.native
class HttpStreamContent protected ()
  extends typings.winrtUwp.Windows.Web.Http.HttpStreamContent {
  /**
    * Initializes a new instance of the HttpStreamContent class with the specified content.
    * @param content The content used to initialize the HttpStreamContent .
    */
  def this(content: IInputStream) = this()
}
