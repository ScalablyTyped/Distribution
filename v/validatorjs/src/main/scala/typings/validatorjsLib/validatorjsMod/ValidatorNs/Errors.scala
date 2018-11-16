package typings
package validatorjsLib.validatorjsMod.ValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Errors extends js.Object {
  var errors: ValidationErrors
  def add(attribute: java.lang.String, message: java.lang.String): scala.Unit
  def all(): ValidationErrors
  def first(attribute: java.lang.String): java.lang.String | scala.Boolean
  def get(attribute: java.lang.String): js.Array[java.lang.String]
  def has(attribute: java.lang.String): scala.Boolean
}

