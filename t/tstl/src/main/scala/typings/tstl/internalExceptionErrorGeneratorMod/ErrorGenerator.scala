package typings.tstl.internalExceptionErrorGeneratorMod

import typings.tstl.exceptionInvalidArgumentMod.InvalidArgument
import typings.tstl.exceptionOutOfRangeMod.OutOfRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/exception/ErrorGenerator", "ErrorGenerator")
@js.native
object ErrorGenerator extends js.Object {
  def empty(instance: Instance, method: String): OutOfRange = js.native
  def erased_iterator(instance: Instance, method: String): InvalidArgument = js.native
  def excessive_index(instance: Instance, method: String, index: Double, size: Double): OutOfRange = js.native
  def get_class_name(instance: String): String = js.native
  def get_class_name(instance: Instance): String = js.native
  def iterator_end_value(instance: Instance): OutOfRange = js.native
  def iterator_end_value(instance: Instance, method: String): OutOfRange = js.native
  def key_nout_found[Key](instance: Instance, method: String, key: Key): OutOfRange = js.native
  def negative_index(instance: Instance, method: String, index: Double): OutOfRange = js.native
  def negative_iterator(instance: Instance, method: String, index: Double): OutOfRange = js.native
  def not_my_iterator(instance: Instance, method: String): InvalidArgument = js.native
}

