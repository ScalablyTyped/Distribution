package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web-streams-polyfill", "TransformStream")
@js.native
open class TransformStream[I, O] () extends StObject {
  def this(transformer: Transformer[I, O]) = this()
  def this(transformer: Unit, writableStrategy: QueuingStrategy[I]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: QueuingStrategy[I]) = this()
  def this(transformer: Unit, writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
  def this(transformer: Unit, writableStrategy: QueuingStrategy[I], readableStrategy: QueuingStrategy[O]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
  def this(
    transformer: Transformer[I, O],
    writableStrategy: QueuingStrategy[I],
    readableStrategy: QueuingStrategy[O]
  ) = this()
  
  /**
    * The readable side of the transform stream.
    */
  val readable: ReadableStream[O] = js.native
  
  /**
    * The writable side of the transform stream.
    */
  val writable: WritableStream[I] = js.native
}
