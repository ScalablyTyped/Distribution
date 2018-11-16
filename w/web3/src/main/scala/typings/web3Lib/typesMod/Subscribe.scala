package typings
package web3Lib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribe[T] extends js.Object {
  var subscription: web3Lib.Anon_Arguments[T] = js.native
  @JSName("on")
  def on_changed(`type`: web3Lib.web3LibStrings.changed, handler: js.Function1[/* data */ T, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_data(`type`: web3Lib.web3LibStrings.data, handler: js.Function1[/* data */ T, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_error(`type`: web3Lib.web3LibStrings.error, handler: js.Function1[/* data */ stdLib.Error, scala.Unit]): scala.Unit = js.native
}

