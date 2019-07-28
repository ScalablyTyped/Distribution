package typings.thrift

import typings.thrift.thriftMod.TProcessorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerProcessor[TProcessor, THandler] extends js.Object {
  var handler: THandler
  var processor: TProcessorConstructor[TProcessor, THandler]
}

object Anon_HandlerProcessor {
  @scala.inline
  def apply[TProcessor, THandler](handler: THandler, processor: TProcessorConstructor[TProcessor, THandler]): Anon_HandlerProcessor[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], processor = processor)
  
    __obj.asInstanceOf[Anon_HandlerProcessor[TProcessor, THandler]]
  }
}

