package typings.validatorjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator[A] extends js.Object {
  @JSName("attributeFormatter")
  var attributeFormatter_Original: AttributeFormatter = js.native
  var errorCount: Double = js.native
  var errors: Errors = js.native
  var hasAsync: Boolean = js.native
  var input: A = js.native
  var lang: String = js.native
  var messages: ErrorMessages = js.native
  var numericRules: js.Array[String] = js.native
  var rules: Rules = js.native
  def attributeFormatter(attribute: js.Any): js.Any = js.native
  def check(): Boolean = js.native
  def checkAsync(): Unit = js.native
  def checkAsync(passes: js.UndefOr[scala.Nothing], fails: js.Function): Unit = js.native
  def checkAsync(passes: js.Function): Unit = js.native
  def checkAsync(passes: js.Function, fails: js.Function): Unit = js.native
  def fails(): Boolean | Unit = js.native
  def fails(fails: js.Function): Boolean | Unit = js.native
  def getRule(name: String): js.Function = js.native
  def passes(): Boolean | Unit = js.native
  def passes(passes: js.Function): Boolean | Unit = js.native
  def setAttributeFormatter(func: AttributeFormatter): Unit = js.native
  def setAttributeNames(attributes: AttributeNames): Unit = js.native
  def stopOnError(): Boolean | Unit = js.native
  def stopOnError(passes: js.Function): Boolean | Unit = js.native
}

