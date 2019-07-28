package typings.webpackDashServe.webpackDashServeMod

import typings.node.netMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializedKoa
  extends typings.koa.koaMod.^[js.Any, js.Object] {
  var server: Server = js.native
  def stop(): Unit = js.native
}

