package typings
package tstlLib.baseErrorInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/ErrorInstance", "ErrorInstance")
@js.native
/**
  * Default Constructor.
  */
abstract class ErrorInstance () extends js.Object {
  /**
    * Initializer Constructor.
    *
    * @param val Identifier of an error instance.
    * @param category An error category instance.
    */
  def this(`val`: scala.Double, category: tstlLib.exceptionErrorCategoryMod.ErrorCategory) = this()
  /**
    * @hidden
    */
  var `category_`: tstlLib.exceptionErrorCategoryMod.ErrorCategory = js.native
  /**
    * @hidden
    */
  var `value_`: scala.Double = js.native
  /**
    * Assign content.
    *
    * @param val Identifier of an error condition.
    * @param category An error category instance.
    */
  def assign(`val`: scala.Double, category: tstlLib.exceptionErrorCategoryMod.ErrorCategory): scala.Unit = js.native
  /**
    * Get category.
    *
    * @return The category object.
    */
  def category(): tstlLib.exceptionErrorCategoryMod.ErrorCategory = js.native
  /**
    * Clear content.
    */
  def clear(): scala.Unit = js.native
  /**
    * Get message.
    *
    * @return The message.
    */
  def message(): java.lang.String = js.native
  /**
    * Covert bo bool.
    *
    * @return Whether the {@link value} is not zero.
    */
  def to_bool(): scala.Boolean = js.native
  /**
    * Get value, the identifier.
    *
    * @return The value, identifier of this object.
    */
  def value(): scala.Double = js.native
}

