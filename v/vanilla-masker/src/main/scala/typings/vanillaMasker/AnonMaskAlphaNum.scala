package typings.vanillaMasker

import typings.vanillaMasker.mod.MoneyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaskAlphaNum extends js.Object {
  def maskAlphaNum(): Unit = js.native
  def maskMoney(): Unit = js.native
  def maskMoney(options: MoneyOptions): Unit = js.native
  def maskNumber(): Unit = js.native
  def maskPattern(pattern: String): Unit = js.native
  def unMask(): Unit = js.native
}

