package typings
package thriftLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Processor[THandler, TProcessor]
  extends thriftLib.thriftMod.TProcessorConstructor[TProcessor, THandler] {
  var Processor: Anon_Handler[THandler, TProcessor]
}

object Anon_Processor {
  @scala.inline
  def apply[THandler, TProcessor](Processor: Anon_Handler[THandler, TProcessor]): Anon_Processor[THandler, TProcessor] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Processor")(Processor)
    __obj.asInstanceOf[Anon_Processor[THandler, TProcessor]]
  }
}

