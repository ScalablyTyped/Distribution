package typings
package typedocLib.distLibUtilsOptionsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsReadResult extends js.Object {
  var hasErrors: scala.Boolean
  var inputFiles: js.Array[java.lang.String]
}

object OptionsReadResult {
  @scala.inline
  def apply(hasErrors: scala.Boolean, inputFiles: js.Array[java.lang.String]): OptionsReadResult = {
    val __obj = js.Dynamic.literal(hasErrors = hasErrors, inputFiles = inputFiles)
  
    __obj.asInstanceOf[OptionsReadResult]
  }
}

