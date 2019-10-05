package typings.webpackDashServe.webpackDashServeMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.^
import typings.node.netMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializedKoa extends ^[DefaultState, DefaultContext] {
  var server: Server = js.native
  def stop(): Unit = js.native
}

