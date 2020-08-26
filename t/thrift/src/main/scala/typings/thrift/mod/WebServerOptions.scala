package typings.thrift.mod

import org.scalablytyped.runtime.StringDictionary
import typings.thrift.anon.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebServerOptions[TProcessor, THandler] extends js.Object {
  var services: StringDictionary[Handler[TProcessor, THandler]] = js.native
}

object WebServerOptions {
  @scala.inline
  def apply[TProcessor, THandler](services: StringDictionary[Handler[TProcessor, THandler]]): WebServerOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebServerOptions[TProcessor, THandler]]
  }
  @scala.inline
  implicit class WebServerOptionsOps[Self <: WebServerOptions[_, _], TProcessor, THandler] (val x: Self with (WebServerOptions[TProcessor, THandler])) extends AnyVal {
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
    def setServices(value: StringDictionary[Handler[TProcessor, THandler]]): Self = this.set("services", value.asInstanceOf[js.Any])
  }
  
}

