package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-streams-polyfill", "ByteLengthQueuingStrategy")
@js.native
open class ByteLengthQueuingStrategy protected ()
  extends StObject
     with QueuingStrategy[js.typedarray.ArrayBufferView] {
  def this(options: QueuingStrategyInit) = this()
  
  /**
    * Returns the high water mark provided to the constructor.
    */
  @JSName("highWaterMark")
  val highWaterMark_ByteLengthQueuingStrategy: Double = js.native
  
  /**
    * Measures the size of `chunk` by returning the value of its `byteLength` property.
    */
  @JSName("size")
  def size_MByteLengthQueuingStrategy(chunk: js.typedarray.ArrayBufferView): Double = js.native
}
