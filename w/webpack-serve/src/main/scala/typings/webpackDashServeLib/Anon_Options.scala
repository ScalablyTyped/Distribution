package typings
package webpackDashServeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: webpackDashServeLib.webpackDashServeMod.InitializedOptions
  var server: nodeLib.netMod.Server
}

object Anon_Options {
  @scala.inline
  def apply(options: webpackDashServeLib.webpackDashServeMod.InitializedOptions, server: nodeLib.netMod.Server): Anon_Options = {
    val __obj = js.Dynamic.literal(options = options, server = server)
  
    __obj.asInstanceOf[Anon_Options]
  }
}

