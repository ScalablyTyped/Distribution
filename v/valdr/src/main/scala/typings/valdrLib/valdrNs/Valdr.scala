package typings
package valdrLib.valdrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Valdr extends js.Object {
  /**
           * Adds a new list of constraints (JSON Object).
           * @param newConstraints the list of constraints (JSON Object).
           */
  def addConstraints(newConstraints: ValdrConstraints): scala.Unit = js.native
  /**
           * Gets the list of constraints (JSON Object).
           * @returns the list of constraints.
           */
  def getConstraints(): ValdrConstraints = js.native
  /**
           * Removes one or many contraints.
           * @param constraintNames the name or array of constraint names.
           */
  def removeConstraints(constraintNames: java.lang.String): scala.Unit = js.native
  /**
           * Removes one or many contraints.
           * @param constraintNames the name or array of constraint names.
           */
  def removeConstraints(constraintNames: js.Array[java.lang.String]): scala.Unit = js.native
  /**
           * Sets custom classes on the surrounding elements.
           * @param newClasses the new classes.
           */
  def setClasses(newClasses: valdrLib.Anon_Invalid): scala.Unit = js.native
  /**
           * Validates the value of the given type with the constraints for the given field name.
           * @param typeName the type name.
           * @param fieldName the field name.
           * @param value the value to validate.
           * @returns {ValdrValidationResult} the validation result.
           */
  def validate(typeName: java.lang.String, fieldName: java.lang.String, value: java.lang.String): ValdrValidationResult = js.native
}

