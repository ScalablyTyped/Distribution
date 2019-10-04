package typings.webpackDashServe.webpackDashServeMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.node.netMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializedKoa
  extends typings.koa.koaMod.^[DefaultState, DefaultContext] {
  var server: Server = js.native
  def stop(): Unit = js.native
}

