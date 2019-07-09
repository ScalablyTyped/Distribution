package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreMathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPGPUBinary extends js.Object {
  var inShapeInfos: js.Array[
    atTensorflowTfjsDashCoreLib.distBackendsWebglShaderUnderscoreCompilerMod.ShapeInfo
  ]
  var infLoc: stdLib.WebGLUniformLocation
  var nanLoc: stdLib.WebGLUniformLocation
  var outShapeInfo: atTensorflowTfjsDashCoreLib.distBackendsWebglShaderUnderscoreCompilerMod.ShapeInfo
  var program: GPGPUProgram
  var source: java.lang.String
  var uniformLocations: org.scalablytyped.runtime.StringDictionary[stdLib.WebGLUniformLocation]
  var webGLProgram: stdLib.WebGLProgram
}

object GPGPUBinary {
  @scala.inline
  def apply(
    inShapeInfos: js.Array[
      atTensorflowTfjsDashCoreLib.distBackendsWebglShaderUnderscoreCompilerMod.ShapeInfo
    ],
    infLoc: stdLib.WebGLUniformLocation,
    nanLoc: stdLib.WebGLUniformLocation,
    outShapeInfo: atTensorflowTfjsDashCoreLib.distBackendsWebglShaderUnderscoreCompilerMod.ShapeInfo,
    program: GPGPUProgram,
    source: java.lang.String,
    uniformLocations: org.scalablytyped.runtime.StringDictionary[stdLib.WebGLUniformLocation],
    webGLProgram: stdLib.WebGLProgram
  ): GPGPUBinary = {
    val __obj = js.Dynamic.literal(inShapeInfos = inShapeInfos, infLoc = infLoc, nanLoc = nanLoc, outShapeInfo = outShapeInfo, program = program, source = source, uniformLocations = uniformLocations, webGLProgram = webGLProgram)
  
    __obj.asInstanceOf[GPGPUBinary]
  }
}

