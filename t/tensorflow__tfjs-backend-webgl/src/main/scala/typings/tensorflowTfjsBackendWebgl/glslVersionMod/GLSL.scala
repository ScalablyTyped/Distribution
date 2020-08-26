package typings.tensorflowTfjsBackendWebgl.glslVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GLSL extends js.Object {
  var attribute: String = js.native
  var defineOutput: String = js.native
  var defineRound: String = js.native
  var defineSpecialInf: String = js.native
  var defineSpecialNaN: String = js.native
  var output: String = js.native
  var texture2D: String = js.native
  var varyingFs: String = js.native
  var varyingVs: String = js.native
  var version: String = js.native
}

object GLSL {
  @scala.inline
  def apply(
    attribute: String,
    defineOutput: String,
    defineRound: String,
    defineSpecialInf: String,
    defineSpecialNaN: String,
    output: String,
    texture2D: String,
    varyingFs: String,
    varyingVs: String,
    version: String
  ): GLSL = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], defineOutput = defineOutput.asInstanceOf[js.Any], defineRound = defineRound.asInstanceOf[js.Any], defineSpecialInf = defineSpecialInf.asInstanceOf[js.Any], defineSpecialNaN = defineSpecialNaN.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], texture2D = texture2D.asInstanceOf[js.Any], varyingFs = varyingFs.asInstanceOf[js.Any], varyingVs = varyingVs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLSL]
  }
  @scala.inline
  implicit class GLSLOps[Self <: GLSL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefineOutput(value: String): Self = this.set("defineOutput", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefineRound(value: String): Self = this.set("defineRound", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefineSpecialInf(value: String): Self = this.set("defineSpecialInf", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefineSpecialNaN(value: String): Self = this.set("defineSpecialNaN", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setTexture2D(value: String): Self = this.set("texture2D", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaryingFs(value: String): Self = this.set("varyingFs", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaryingVs(value: String): Self = this.set("varyingVs", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

