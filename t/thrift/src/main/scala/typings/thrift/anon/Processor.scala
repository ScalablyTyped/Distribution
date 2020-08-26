package typings.thrift.anon

import typings.thrift.mod.TProcessorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Processor[THandler, TProcessor] extends TProcessorConstructor[TProcessor, THandler] {
  var Processor: Instantiable[THandler, TProcessor] = js.native
}

object Processor {
  @scala.inline
  def apply[THandler, TProcessor](Processor: Instantiable[THandler, TProcessor]): Processor[THandler, TProcessor] = {
    val __obj = js.Dynamic.literal(Processor = Processor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Processor[THandler, TProcessor]]
  }
  @scala.inline
  implicit class ProcessorOps[Self <: Processor[_, _], THandler, TProcessor] (val x: Self with (Processor[THandler, TProcessor])) extends AnyVal {
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
    def setProcessor(value: Instantiable[THandler, TProcessor]): Self = this.set("Processor", value.asInstanceOf[js.Any])
  }
  
}

