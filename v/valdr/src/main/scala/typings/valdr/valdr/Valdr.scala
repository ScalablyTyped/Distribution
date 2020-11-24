package typings.valdr.valdr

import typings.valdr.anon.Invalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Valdr extends js.Object {
  
  /**
    * Adds a new list of constraints (JSON Object).
    * @param newConstraints the list of constraints (JSON Object).
    */
  def addConstraints(newConstraints: ValdrConstraints): Unit = js.native
  
  /**
    * Gets the list of constraints (JSON Object).
    * @returns the list of constraints.
    */
  def getConstraints(): ValdrConstraints = js.native
  
  /**
    * Removes one or many contraints.
    * @param constraintNames the name or array of constraint names.
    */
  def removeConstraints(constraintNames: String): Unit = js.native
  def removeConstraints(constraintNames: js.Array[String]): Unit = js.native
  
  /**
    * Sets custom classes on the surrounding elements.
    * @param newClasses the new classes.
    */
  def setClasses(newClasses: Invalid): Unit = js.native
  
  /**
    * Validates the value of the given type with the constraints for the given field name.
    * @param typeName the type name.
    * @param fieldName the field name.
    * @param value the value to validate.
    * @returns {ValdrValidationResult} the validation result.
    */
  def validate(typeName: String, fieldName: String, value: String): ValdrValidationResult = js.native
}
