package typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.distBackendsWebglShaderUnderscoreCompilerMod.ShapeInfo
import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPGPUBinary extends js.Object {
  var inShapeInfos: js.Array[ShapeInfo]
  var infLoc: WebGLUniformLocation
  var nanLoc: WebGLUniformLocation
  var outShapeInfo: ShapeInfo
  var program: GPGPUProgram
  var source: String
  var uniformLocations: StringDictionary[WebGLUniformLocation]
  var webGLProgram: WebGLProgram
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
    val __obj = js.Dynamic.literal(inShapeInfos = inShapeInfos, infLoc = infLoc, nanLoc = nanLoc, outShapeInfo = outShapeInfo, program = program, source = source, uniformLocations = uniformLocations, webGLProgram = webGLProgram)
  
    __obj.asInstanceOf[GPGPUBinary]
  }
}

