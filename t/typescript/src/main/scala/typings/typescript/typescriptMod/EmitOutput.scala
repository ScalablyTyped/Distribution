package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitOutput extends js.Object {
  var emitSkipped: Boolean
  var outputFiles: js.Array[OutputFile]
}

object EmitOutput {
  @scala.inline
  def apply(emitSkipped: Boolean, outputFiles: js.Array[OutputFile]): EmitOutput = {
    val __obj = js.Dynamic.literal(emitSkipped = emitSkipped.asInstanceOf[js.Any], outputFiles = outputFiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EmitOutput]
  }
}

