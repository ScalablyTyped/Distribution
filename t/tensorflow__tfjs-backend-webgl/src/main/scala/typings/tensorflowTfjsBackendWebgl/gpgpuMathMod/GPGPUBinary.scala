package typings.tensorflowTfjsBackendWebgl.gpgpuMathMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsBackendWebgl.shaderCompilerMod.ShapeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPGPUBinary extends js.Object {
  
  var inShapeInfos: js.Array[ShapeInfo] = js.native
  
  var infLoc: WebGLUniformLocation = js.native
  
  var nanLoc: WebGLUniformLocation = js.native
  
  var outShapeInfo: ShapeInfo = js.native
  
  var program: GPGPUProgram = js.native
  
  var source: String = js.native
  
  var uniformLocations: StringDictionary[WebGLUniformLocation] = js.native
  
  var webGLProgram: WebGLProgram = js.native
}
object GPGPUBinary {
  
  @scala.inline
  def apply(
    inShapeInfos: js.Array[ShapeInfo],
    infLoc: WebGLUniformLocation,
    nanLoc: WebGLUniformLocation,
    outShapeInfo: ShapeInfo,
    program: GPGPUProgram,
    source: String,
    uniformLocations: StringDictionary[WebGLUniformLocation],
    webGLProgram: WebGLProgram
  ): GPGPUBinary = {
    val __obj = js.Dynamic.literal(inShapeInfos = inShapeInfos.asInstanceOf[js.Any], infLoc = infLoc.asInstanceOf[js.Any], nanLoc = nanLoc.asInstanceOf[js.Any], outShapeInfo = outShapeInfo.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], uniformLocations = uniformLocations.asInstanceOf[js.Any], webGLProgram = webGLProgram.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPGPUBinary]
  }
  
  @scala.inline
  implicit class GPGPUBinaryOps[Self <: GPGPUBinary] (val x: Self) extends AnyVal {
    
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
    def setInShapeInfosVarargs(value: ShapeInfo*): Self = this.set("inShapeInfos", js.Array(value :_*))
    
    @scala.inline
    def setInShapeInfos(value: js.Array[ShapeInfo]): Self = this.set("inShapeInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfLoc(value: WebGLUniformLocation): Self = this.set("infLoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanLoc(value: WebGLUniformLocation): Self = this.set("nanLoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutShapeInfo(value: ShapeInfo): Self = this.set("outShapeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgram(value: GPGPUProgram): Self = this.set("program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformLocations(value: StringDictionary[WebGLUniformLocation]): Self = this.set("uniformLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebGLProgram(value: WebGLProgram): Self = this.set("webGLProgram", value.asInstanceOf[js.Any])
  }
}
