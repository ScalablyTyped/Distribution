package typings.webStreamsPolyfill.mod

import typings.webStreamsPolyfill.webStreamsPolyfillInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-streams-polyfill", "CountQueuingStrategy")
@js.native
open class CountQueuingStrategy protected ()
  extends StObject
     with QueuingStrategy[Any] {
  def this(options: QueuingStrategyInit) = this()
  
  /**
    * Returns the high water mark provided to the constructor.
    */
  @JSName("highWaterMark")
  val highWaterMark_CountQueuingStrategy: Double = js.native
  
  /**
    * Measures the size of `chunk` by always returning 1.
    * This ensures that the total queue size is a count of the number of chunks in the queue.
    */
  @JSName("size")
  def size_MCountQueuingStrategy(chunk: Any): `1` = js.native
}
