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
    val __obj = js.Dynamic.literal(hasErrors = hasErrors, inputFiles = inputFiles)
  
    __obj.asInstanceOf[OptionsReadResult]
  }
}

