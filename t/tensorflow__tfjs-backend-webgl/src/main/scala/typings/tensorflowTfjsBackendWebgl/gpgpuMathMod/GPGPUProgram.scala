package typings.tensorflowTfjsBackendWebgl.gpgpuMathMod

import typings.tensorflowTfjsBackendWebgl.texUtilMod.PackingScheme
import typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPGPUProgram extends js.Object {
  
  /**
    * The type of scheme to use when packing texels for the output values.
    * See `PackingScheme` for details. Defaults to `PackingScheme.SHARED_BATCH`.
    */
  var outPackingScheme: js.UndefOr[PackingScheme] = js.native
  
  /**
    * Affects what type of texture we allocate for the output. Defaults to
    * `TextureUsage.RENDER`.
    */
  var outTexUsage: js.UndefOr[TextureUsage] = js.native
  
  var outputShape: js.Array[Double] = js.native
  
  /** If true, this program expects packed input textures. Defaults to false. */
  var packedInputs: js.UndefOr[Boolean] = js.native
  
  /** If true, this program produces a packed texture. Defaults to false. */
  var packedOutput: js.UndefOr[Boolean] = js.native
  
  var userCode: String = js.native
  
  var variableNames: js.Array[String] = js.native
}
object GPGPUProgram {
  
  @scala.inline
  def apply(outputShape: js.Array[Double], userCode: String, variableNames: js.Array[String]): GPGPUProgram = {
    val __obj = js.Dynamic.literal(outputShape = outputShape.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any], variableNames = variableNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPGPUProgram]
  }
  
  @scala.inline
  implicit class GPGPUProgramOps[Self <: GPGPUProgram] (val x: Self) extends AnyVal {
    
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
    def setOutputShapeVarargs(value: Double*): Self = this.set("outputShape", js.Array(value :_*))
    
    @scala.inline
    def setOutputShape(value: js.Array[Double]): Self = this.set("outputShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCode(value: String): Self = this.set("userCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableNamesVarargs(value: String*): Self = this.set("variableNames", js.Array(value :_*))
    
    @scala.inline
    def setVariableNames(value: js.Array[String]): Self = this.set("variableNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutPackingScheme(value: PackingScheme): Self = this.set("outPackingScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutPackingScheme: Self = this.set("outPackingScheme", js.undefined)
    
    @scala.inline
    def setOutTexUsage(value: TextureUsage): Self = this.set("outTexUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutTexUsage: Self = this.set("outTexUsage", js.undefined)
    
    @scala.inline
    def setPackedInputs(value: Boolean): Self = this.set("packedInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackedInputs: Self = this.set("packedInputs", js.undefined)
    
    @scala.inline
    def setPackedOutput(value: Boolean): Self = this.set("packedOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackedOutput: Self = this.set("packedOutput", js.undefined)
  }
}
