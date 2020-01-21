package typings.thrift

import typings.thrift.mod.TProcessorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProcessor[THandler, TProcessor] extends TProcessorConstructor[TProcessor, THandler] {
  var Processor: AnonHandler[THandler, TProcessor]
}

object AnonProcessor {
  @scala.inline
  def apply[THandler, TProcessor](Processor: AnonHandler[THandler, TProcessor]): AnonProcessor[THandler, TProcessor] = {
    val __obj = js.Dynamic.literal(Processor = Processor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProcessor[THandler, TProcessor]]
  }
}

