package typings.thrift.thriftMod

import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "createWebServer")
@js.native
object createWebServer extends js.Object {
  def apply[TProcessor, THandler](options: WebServerOptions[TProcessor, THandler]): Server | typings.node.tlsMod.Server = js.native
}

