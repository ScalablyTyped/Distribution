package typings.webpackDashServe

import typings.node.netMod.Server
import typings.webpackDashServe.webpackDashServeMod.InitializedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: InitializedOptions
  var server: Server
}

object Anon_Options {
  @scala.inline
  def apply(options: InitializedOptions, server: Server): Anon_Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Options]
  }
}

