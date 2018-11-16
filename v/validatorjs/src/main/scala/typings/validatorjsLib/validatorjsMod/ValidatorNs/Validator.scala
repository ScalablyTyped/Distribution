package typings
package validatorjsLib.validatorjsMod.ValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator[A] extends js.Object {
  @JSName("attributeFormatter")
  var attributeFormatter_Original: AttributeFormatter = js.native
  var errorCount: scala.Double = js.native
  var errors: Errors = js.native
  var hasAsync: scala.Boolean = js.native
  var input: A = js.native
  var lang: java.lang.String = js.native
  var messages: ErrorMessages = js.native
  var numericRules: js.Array[java.lang.String] = js.native
  var rules: js.Any = js.native
  def attributeFormatter(attribute: js.Any): js.Any = js.native
  def check(): scala.Boolean = js.native
  def checkAsync(): scala.Unit = js.native
  def checkAsync(passes: js.Function): scala.Unit = js.native
  def checkAsync(passes: js.Function, fails: js.Function): scala.Unit = js.native
  def fails(): scala.Boolean | scala.Unit = js.native
  def fails(fails: js.Function): scala.Boolean | scala.Unit = js.native
  def getRule(name: java.lang.String): js.Function = js.native
  def passes(): scala.Boolean | scala.Unit = js.native
  def passes(passes: js.Function): scala.Boolean | scala.Unit = js.native
  def setAttributeFormatter(func: AttributeFormatter): scala.Unit = js.native
  def setAttributeNames(attributes: AttributeNames): scala.Unit = js.native
  def stopOnError(): scala.Boolean | scala.Unit = js.native
  def stopOnError(passes: js.Function): scala.Boolean | scala.Unit = js.native
}

