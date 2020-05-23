package typings.webpackServe.anon

import typings.node.netMod.Server
import typings.webpackServe.mod.InitializedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: InitializedOptions
  var server: Server
}

object Options {
  @scala.inline
  def apply(options: InitializedOptions, server: Server): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

