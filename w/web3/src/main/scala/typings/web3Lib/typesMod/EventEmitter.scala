package typings
package web3Lib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter extends js.Object {
  @JSName("on")
  def on_changed(
    `type`: web3Lib.web3LibStrings.changed,
    handler: js.Function1[
      stdLib.Error | TransactionReceipt | java.lang.String | (/* receipt */ EventLog), 
      scala.Unit
    ]
  ): EventEmitter = js.native
  @JSName("on")
  def on_data(
    `type`: web3Lib.web3LibStrings.data,
    handler: js.Function1[
      stdLib.Error | TransactionReceipt | java.lang.String | (/* event */ EventLog), 
      scala.Unit
    ]
  ): EventEmitter = js.native
  @JSName("on")
  def on_error(
    `type`: web3Lib.web3LibStrings.error,
    handler: js.Function1[stdLib.Error | TransactionReceipt | java.lang.String, scala.Unit]
  ): EventEmitter = js.native
}

