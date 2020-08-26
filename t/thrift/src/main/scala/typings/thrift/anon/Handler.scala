package typings.thrift.anon

import typings.thrift.mod.TProcessorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler[TProcessor, THandler] extends js.Object {
  var handler: THandler = js.native
  var processor: TProcessorConstructor[TProcessor, THandler] = js.native
}

object Handler {
  @scala.inline
  def apply[TProcessor, THandler](handler: THandler, processor: TProcessorConstructor[TProcessor, THandler]): Handler[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler[TProcessor, THandler]]
  }
  @scala.inline
  implicit class HandlerOps[Self <: Handler[_, _], TProcessor, THandler] (val x: Self with (Handler[TProcessor, THandler])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandler(value: THandler): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessor(value: TProcessorConstructor[TProcessor, THandler]): Self = this.set("processor", value.asInstanceOf[js.Any])
  }
  
}

