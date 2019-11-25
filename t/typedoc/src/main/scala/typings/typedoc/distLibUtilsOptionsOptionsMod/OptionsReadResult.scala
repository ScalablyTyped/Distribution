package typings.typedoc.distLibUtilsOptionsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsReadResult extends js.Object {
  var hasErrors: Boolean
  var inputFiles: js.Array[String]
}

object OptionsReadResult {
  @scala.inline
  def apply(hasErrors: Boolean, inputFiles: js.Array[String]): OptionsReadResult = {
    val __obj = js.Dynamic.literal(hasErrors = hasErrors.asInstanceOf[js.Any], inputFiles = inputFiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OptionsReadResult]
  }
}

