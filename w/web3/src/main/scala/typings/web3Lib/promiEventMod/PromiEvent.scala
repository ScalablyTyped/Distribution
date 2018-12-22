package typings
package web3Lib.promiEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiEvent[T]
  extends stdLib.Promise[T] {
  @JSName("on")
  def on_confirmation(
    `type`: web3Lib.web3LibStrings.confirmation,
    handler: js.Function1[
      /* error */ stdLib.Error | web3Lib.typesMod.TransactionReceipt | java.lang.String, 
      scala.Unit
    ]
  ): PromiEvent[T] = js.native
  @JSName("on")
  def on_confirmation(
    `type`: web3Lib.web3LibStrings.confirmation,
    handler: js.Function2[
      /* confNumber */ scala.Double, 
      /* receipt */ web3Lib.typesMod.TransactionReceipt, 
      scala.Unit
    ]
  ): PromiEvent[T] = js.native
  @JSName("on")
  def on_error(
    `type`: web3Lib.web3LibStrings.error,
    handler: js.Function1[
      (/* error */ stdLib.Error) | java.lang.String | web3Lib.typesMod.TransactionReceipt, 
      scala.Unit
    ]
  ): PromiEvent[T] = js.native
  @JSName("on")
  def on_receipt(
    `type`: web3Lib.web3LibStrings.receipt,
    handler: js.Function1[
      stdLib.Error | java.lang.String | (/* receipt */ web3Lib.typesMod.TransactionReceipt), 
      scala.Unit
    ]
  ): PromiEvent[T] = js.native
  @JSName("on")
  def on_transactionHash(
    `type`: web3Lib.web3LibStrings.transactionHash,
    handler: js.Function1[
      stdLib.Error | (/* receipt */ java.lang.String) | web3Lib.typesMod.TransactionReceipt, 
      scala.Unit
    ]
  ): PromiEvent[T] = js.native
  def once(
    `type`: PromiEventType,
    handler: js.Function1[
      /* error */ stdLib.Error | web3Lib.typesMod.TransactionReceipt | java.lang.String, 
      scala.Unit
    ]
  ): PromiEvent[T] = js.native
  @JSName("once")
  def once_confirmation(
    `type`: web3Lib.web3LibStrings.confirmation,
    handler: js.Function2[
      /* confNumber */ scala.Double, 
      /* receipt */ web3Lib.typesMod.TransactionReceipt, 
      scala.Unit
    ]
  ): PromiEvent[T] = js.native
  @JSName("once")
  def once_error(`type`: web3Lib.web3LibStrings.error, handler: js.Function1[/* error */ stdLib.Error, scala.Unit]): PromiEvent[T] = js.native
  @JSName("once")
  def once_receipt(
    `type`: web3Lib.web3LibStrings.receipt,
    handler: js.Function1[/* receipt */ web3Lib.typesMod.TransactionReceipt, scala.Unit]
  ): PromiEvent[T] = js.native
  @JSName("once")
  def once_transactionHash(
    `type`: web3Lib.web3LibStrings.transactionHash,
    handler: js.Function1[/* receipt */ java.lang.String, scala.Unit]
  ): PromiEvent[T] = js.native
}

