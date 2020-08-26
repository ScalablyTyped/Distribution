package typings.thrift.mod

import typings.thrift.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceOptions[TProcessor, THandler] extends js.Object {
  var handler: js.UndefOr[THandler] = js.native
  var processor: js.UndefOr[Instantiable[THandler, TProcessor]] = js.native
  var protocol: js.UndefOr[TProtocolConstructor] = js.native
  var transport: js.UndefOr[TTransportConstructor] = js.native
}

object ServiceOptions {
  @scala.inline
  def apply[TProcessor, THandler](): ServiceOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceOptions[TProcessor, THandler]]
  }
  @scala.inline
  implicit class ServiceOptionsOps[Self <: ServiceOptions[_, _], TProcessor, THandler] (val x: Self with (ServiceOptions[TProcessor, THandler])) extends AnyVal {
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
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setProcessor(value: Instantiable[THandler, TProcessor]): Self = this.set("processor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessor: Self = this.set("processor", js.undefined)
    @scala.inline
    def setProtocol(value: TProtocolConstructor): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setTransport(value: TTransportConstructor): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
  
}

