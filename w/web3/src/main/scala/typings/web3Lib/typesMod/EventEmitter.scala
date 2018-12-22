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
      stdLib.Error | (/* receipt */ EventLog) | java.lang.String | TransactionReceipt, 
      scala.Unit
    ]
  ): EventEmitter = js.native
  @JSName("on")
  def on_data(
    `type`: web3Lib.web3LibStrings.data,
    handler: js.Function1[
      stdLib.Error | (/* event */ EventLog) | java.lang.String | TransactionReceipt, 
      scala.Unit
    ]
  ): EventEmitter = js.native
  @JSName("on")
  def on_error(
    `type`: web3Lib.web3LibStrings.error,
    handler: js.Function1[(/* error */ stdLib.Error) | java.lang.String | TransactionReceipt, scala.Unit]
  ): EventEmitter = js.native
}

