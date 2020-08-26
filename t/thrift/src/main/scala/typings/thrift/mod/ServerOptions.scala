package typings.thrift.mod

import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions[TProcessor, THandler] extends ServiceOptions[TProcessor, THandler] {
  var cors: js.UndefOr[js.Array[String]] = js.native
  var files: js.UndefOr[String] = js.native
  var headers: js.UndefOr[HttpHeaders] = js.native
  var services: js.UndefOr[ServiceMap[TProcessor, THandler]] = js.native
  var tls: js.UndefOr[TlsOptions] = js.native
}

object ServerOptions {
  @scala.inline
  def apply[TProcessor, THandler](): ServerOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions[TProcessor, THandler]]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions[_, _], TProcessor, THandler] (val x: Self with (ServerOptions[TProcessor, THandler])) extends AnyVal {
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
    def setCorsVarargs(value: String*): Self = this.set("cors", js.Array(value :_*))
    @scala.inline
    def setCors(value: js.Array[String]): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    @scala.inline
    def setFiles(value: String): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setHeaders(value: HttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setServices(value: ServiceMap[TProcessor, THandler]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
    @scala.inline
    def setTls(value: TlsOptions): Self = this.set("tls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
  }
  
}

