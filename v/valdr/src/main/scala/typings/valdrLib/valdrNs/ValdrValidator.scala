package typings
package valdrLib.valdrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Custom validators must implement this interface to provide custom validation logic.
     */
@js.native
trait ValdrValidator extends js.Object {
  /**
           *  Custom validator's name, that will be set in the violation's validator field.
           */
  var name: java.lang.String = js.native
  /**
           * Method to be called to perform custom validation over given value.
           */
  def validate(value: js.Any): scala.Boolean = js.native
  /**
           * Method to be called to perform custom validation over given value.
           */
  def validate(value: js.Any, validationArguments: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Boolean = js.native
}

