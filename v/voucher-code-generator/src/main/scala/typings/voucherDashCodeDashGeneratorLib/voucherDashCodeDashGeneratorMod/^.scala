package typings
package voucherDashCodeDashGeneratorLib.voucherDashCodeDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("voucher-code-generator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("charset")
  def charset_alphabetic(name: voucherDashCodeDashGeneratorLib.voucherDashCodeDashGeneratorLibStrings.alphabetic): java.lang.String = js.native
  @JSName("charset")
  def charset_alphanumeric(name: voucherDashCodeDashGeneratorLib.voucherDashCodeDashGeneratorLibStrings.alphanumeric): java.lang.String = js.native
  @JSName("charset")
  def charset_numbers(name: voucherDashCodeDashGeneratorLib.voucherDashCodeDashGeneratorLibStrings.numbers): java.lang.String = js.native
  def generate(): js.Array[java.lang.String] = js.native
  def generate(config: voucherDashCodeDashGeneratorLib.voucherDashCodeDashGeneratorMod.generatorConfig): js.Array[java.lang.String] = js.native
}

