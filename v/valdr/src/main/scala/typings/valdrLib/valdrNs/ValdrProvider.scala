package typings
package valdrLib.valdrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValdrProvider extends js.Object {
  /**
           * Adds a constraint validator alias.
           * @param valdrName the validator name.
           * @param alias the validator alias name.
           */
  def addConstraintAlias(valdrName: java.lang.String, alias: java.lang.String): scala.Unit = js.native
  /**
           * Adds a new list of constraints (JSON Object).
           * @param newConstraints the list of constraints (JSON Object).
           */
  def addConstraints(newConstraints: ValdrConstraints): scala.Unit = js.native
  /**
           * Adds a custom validator.
           * @param validatorName the name of the custom validator.
           */
  def addValidator(validatorName: java.lang.String): scala.Unit = js.native
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
           * Sets the constraint URL (eg "/api/constraints").
           * @param url the URL of the contraints.
           */
  def setConstraintUrl(url: java.lang.String): scala.Unit = js.native
}

