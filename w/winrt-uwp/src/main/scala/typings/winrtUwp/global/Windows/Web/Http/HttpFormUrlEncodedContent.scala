package typings.winrtUwp.global.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides HTTP content that uses name/value data encoded with the application/x-www-form-urlencoded MIME type. */
@JSGlobal("Windows.Web.Http.HttpFormUrlEncodedContent")
@js.native
class HttpFormUrlEncodedContent protected ()
  extends typings.winrtUwp.Windows.Web.Http.HttpFormUrlEncodedContent {
  /**
    * Initializes a new instance of the HttpFormUrlEncodedContent class with the specified content.
    * @param content The content used to initialize the HttpFormUrlEncodedContent .
    */
  def this(content: IIterable[IKeyValuePair[_, _]]) = this()
}

