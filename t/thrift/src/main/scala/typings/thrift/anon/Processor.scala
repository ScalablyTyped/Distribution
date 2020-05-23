package typings.thrift.anon

import typings.thrift.mod.TProcessorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Processor[THandler, TProcessor] extends TProcessorConstructor[TProcessor, THandler] {
  var Processor: Instantiable[THandler, TProcessor]
}

object Processor {
  @scala.inline
  def apply[THandler, TProcessor](Processor: Instantiable[THandler, TProcessor]): Processor[THandler, TProcessor] = {
    val __obj = js.Dynamic.literal(Processor = Processor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Processor[THandler, TProcessor]]
  }
}

