package typings
package valerieLib.ValerieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The interface for a converter, a pair of functions: format and parse, which work in tandem on a single type of value.
@js.native
trait IConverter extends js.Object {
  def format(value: js.Any): java.lang.String = js.native
  def format(value: js.Any, format: java.lang.String): java.lang.String = js.native
   // Formats the given value as a string.
  def parse(value: java.lang.String): js.Any = js.native
}

