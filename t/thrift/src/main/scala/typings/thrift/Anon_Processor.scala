package typings.thrift

import typings.thrift.thriftMod.TProcessorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Processor[THandler, TProcessor] extends TProcessorConstructor[TProcessor, THandler] {
  var Processor: Anon_Handler[THandler, TProcessor]
}

object Anon_Processor {
  @scala.inline
  def apply[THandler, TProcessor](Processor: Anon_Handler[THandler, TProcessor]): Anon_Processor[THandler, TProcessor] = {
    val __obj = js.Dynamic.literal(Processor = Processor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Processor[THandler, TProcessor]]
  }
}

