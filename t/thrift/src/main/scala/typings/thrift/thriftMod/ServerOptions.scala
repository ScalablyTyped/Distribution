package typings.thrift.thriftMod

import typings.node.tlsMod.TlsOptions
import typings.thrift.Anon_Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions[TProcessor, THandler] extends ServiceOptions[TProcessor, THandler] {
  var cors: js.UndefOr[js.Array[String]] = js.undefined
  var files: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  var services: js.UndefOr[ServiceMap[TProcessor, THandler]] = js.undefined
  var tls: js.UndefOr[TlsOptions] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply[TProcessor, THandler](
    cors: js.Array[String] = null,
    files: String = null,
    handler: THandler = null,
    headers: HttpHeaders = null,
    processor: Anon_Handler[THandler, TProcessor] = null,
    protocol: TProtocolConstructor = null,
    services: ServiceMap[TProcessor, THandler] = null,
    tls: TlsOptions = null,
    transport: TTransportConstructor = null
  ): ServerOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal()
    if (cors != null) __obj.updateDynamic("cors")(cors)
    if (files != null) __obj.updateDynamic("files")(files)
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (processor != null) __obj.updateDynamic("processor")(processor)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (services != null) __obj.updateDynamic("services")(services)
    if (tls != null) __obj.updateDynamic("tls")(tls)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[ServerOptions[TProcessor, THandler]]
  }
}

