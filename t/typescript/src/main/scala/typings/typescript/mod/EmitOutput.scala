package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitOutput extends js.Object {
  var emitSkipped: Boolean = js.native
  var outputFiles: js.Array[OutputFile] = js.native
}

object EmitOutput {
  @scala.inline
  def apply(emitSkipped: Boolean, outputFiles: js.Array[OutputFile]): EmitOutput = {
    val __obj = js.Dynamic.literal(emitSkipped = emitSkipped.asInstanceOf[js.Any], outputFiles = outputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitOutput]
  }
  @scala.inline
  implicit class EmitOutputOps[Self <: EmitOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmitSkipped(value: Boolean): Self = this.set("emitSkipped", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputFilesVarargs(value: OutputFile*): Self = this.set("outputFiles", js.Array(value :_*))
    @scala.inline
    def setOutputFiles(value: js.Array[OutputFile]): Self = this.set("outputFiles", value.asInstanceOf[js.Any])
  }
  
}

