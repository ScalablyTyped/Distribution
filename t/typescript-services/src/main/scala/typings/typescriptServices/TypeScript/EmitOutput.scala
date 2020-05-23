package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitOutput extends js.Object {
  var emitOutputResult: EmitOutputResult
  var outputFiles: js.Array[OutputFile]
}

object EmitOutput {
  @scala.inline
  def apply(emitOutputResult: EmitOutputResult, outputFiles: js.Array[OutputFile]): EmitOutput = {
    val __obj = js.Dynamic.literal(emitOutputResult = emitOutputResult.asInstanceOf[js.Any], outputFiles = outputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitOutput]
  }
}

