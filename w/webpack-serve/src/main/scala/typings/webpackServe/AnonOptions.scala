package typings.webpackServe

import typings.node.netMod.Server
import typings.webpackServe.mod.InitializedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: InitializedOptions
  var server: Server
}

object AnonOptions {
  @scala.inline
  def apply(options: InitializedOptions, server: Server): AnonOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
}

