package typings.thrift.thriftMod

import typings.thrift.Anon_Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOptions[TProcessor, THandler] extends js.Object {
  var handler: js.UndefOr[THandler] = js.undefined
  var processor: js.UndefOr[Anon_Handler[THandler, TProcessor]] = js.undefined
  var protocol: js.UndefOr[TProtocolConstructor] = js.undefined
  var transport: js.UndefOr[TTransportConstructor] = js.undefined
}

object ServiceOptions {
  @scala.inline
  def apply[TProcessor, THandler](
    handler: THandler = null,
    processor: Anon_Handler[THandler, TProcessor] = null,
    protocol: TProtocolConstructor = null,
    transport: TTransportConstructor = null
  ): ServiceOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal()
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (processor != null) __obj.updateDynamic("processor")(processor.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOptions[TProcessor, THandler]]
  }
}

