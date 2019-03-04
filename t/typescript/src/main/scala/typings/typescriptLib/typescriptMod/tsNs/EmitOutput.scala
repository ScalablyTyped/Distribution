package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitOutput extends js.Object {
  var emitSkipped: scala.Boolean
  var outputFiles: js.Array[OutputFile]
}

object EmitOutput {
  @scala.inline
  def apply(emitSkipped: scala.Boolean, outputFiles: js.Array[OutputFile]): EmitOutput = {
    val __obj = js.Dynamic.literal(emitSkipped = emitSkipped, outputFiles = outputFiles)
  
    __obj.asInstanceOf[EmitOutput]
  }
}

