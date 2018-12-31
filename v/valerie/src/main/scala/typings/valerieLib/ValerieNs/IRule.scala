package typings
package valerieLib.ValerieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRule extends js.Object {
  var defaultOptions: ValidationOptions
  def test(value: js.Any): ValidationResult
}

