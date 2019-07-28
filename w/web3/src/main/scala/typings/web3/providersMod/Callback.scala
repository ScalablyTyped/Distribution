package typings.web3.providersMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback[ResultType] extends js.Object {
  def apply(error: Null, `val`: ResultType): Unit = js.native
  def apply(error: Error): Unit = js.native
}

