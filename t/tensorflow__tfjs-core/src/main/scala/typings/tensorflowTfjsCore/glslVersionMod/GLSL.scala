package typings.tensorflowTfjsCore.glslVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GLSL extends js.Object {
  var attribute: String
  var defineOutput: String
  var defineRound: String
  var defineSpecialInf: String
  var defineSpecialNaN: String
  var output: String
  var texture2D: String
  var varyingFs: String
  var varyingVs: String
  var version: String
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
}

