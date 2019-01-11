package typings
package xhrDashMockLib.xhrDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: xhrDashMockLib.libXHRMockMod.XHRMock = js.native
  def delay(mock: xhrDashMockLib.libTypesMod.MockFunction): xhrDashMockLib.libTypesMod.MockFunction = js.native
  def delay(mock: xhrDashMockLib.libTypesMod.MockFunction, ms: scala.Double): xhrDashMockLib.libTypesMod.MockFunction = js.native
  def delay(mock: xhrDashMockLib.libTypesMod.MockObject): xhrDashMockLib.libTypesMod.MockFunction = js.native
  def delay(mock: xhrDashMockLib.libTypesMod.MockObject, ms: scala.Double): xhrDashMockLib.libTypesMod.MockFunction = js.native
  def once(mock: xhrDashMockLib.libTypesMod.MockFunction): xhrDashMockLib.libTypesMod.MockFunction = js.native
  def once(mock: xhrDashMockLib.libTypesMod.MockObject): xhrDashMockLib.libTypesMod.MockFunction = js.native
  def proxy(req: xhrDashMockLib.libMockRequestMod.default, res: xhrDashMockLib.libMockResponseMod.default): js.Promise[xhrDashMockLib.libMockResponseMod.default] = js.native
}

