package typings.thrift

import typings.thrift.mod.TProcessorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandler[TProcessor, THandler] extends js.Object {
  var handler: THandler
  var processor: TProcessorConstructor[TProcessor, THandler]
}

object AnonHandler {
  @scala.inline
  def apply[TProcessor, THandler](handler: THandler, processor: TProcessorConstructor[TProcessor, THandler]): AnonHandler[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandler[TProcessor, THandler]]
  }
}

