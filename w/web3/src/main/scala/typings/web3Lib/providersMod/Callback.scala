package typings
package web3Lib.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback[ResultType] extends js.Object {
  def apply(error: scala.Null, `val`: ResultType): scala.Unit = js.native
  def apply(error: stdLib.Error): scala.Unit = js.native
}

