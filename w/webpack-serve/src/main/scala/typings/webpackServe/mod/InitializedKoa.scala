package typings.webpackServe.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.node.netMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializedKoa
  extends typings.koa.mod.^[DefaultState, DefaultContext] {
  
  var server: Server = js.native
  
  def stop(): Unit = js.native
}
