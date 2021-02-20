package typings.winrtUwp.global.Windows.Web.Http

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides HTTP content that uses a buffer. */
@JSGlobal("Windows.Web.Http.HttpBufferContent")
@js.native
class HttpBufferContent protected ()
  extends typings.winrtUwp.Windows.Web.Http.HttpBufferContent {
  /**
    * Initializes a new instance of the HttpBufferContent class with the specified buffer.
    * @param content The content used to initialize the HttpBufferContent .
    */
  def this(content: IBuffer) = this()
  /**
    * Initializes a new instance of the HttpBufferContent class with an offset and count of bytes from the specified buffer.
    * @param content The content used to initialize the HttpBufferContent .
    * @param offset The offset in bytes from the beginning of the content buffer to initialize the HttpBufferContent .
    * @param count The count of bytes in the content buffer to initialize the HttpBufferContent .
    */
  def this(content: IBuffer, offset: Double, count: Double) = this()
}
