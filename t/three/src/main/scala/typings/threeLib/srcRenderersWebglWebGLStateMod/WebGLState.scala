package typings
package threeLib.srcRenderersWebglWebGLStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLState", "WebGLState")
@js.native
class WebGLState protected () extends js.Object {
  def this(gl: stdLib.WebGLRenderingContext, extensions: threeLib.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions, utils: js.Any, capabilities: threeLib.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities) = this()
  var buffers: threeLib.Anon_ColorDepth = js.native
  def activeTexture(webglSlot: scala.Double): scala.Unit = js.native
  def bindTexture(webglType: scala.Double, webglTexture: js.Any): scala.Unit = js.native
  // Same interface as https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexImage2D
  def compressedTexImage2D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    border: scala.Double,
    data: stdLib.ArrayBufferView
  ): scala.Unit = js.native
  def disable(id: scala.Double): scala.Unit = js.native
  def disableUnusedAttributes(): scala.Unit = js.native
  def enable(id: scala.Double): scala.Unit = js.native
  def enableAttribute(attribute: scala.Double): scala.Unit = js.native
  def enableAttributeAndDivisor(attribute: scala.Double, meshPerAttribute: scala.Double): scala.Unit = js.native
  def getCompressedTextureFormats(): js.Array[scala.Double] = js.native
  def initAttributes(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def scissor(scissor: threeLib.srcMathVector4Mod.Vector4): scala.Unit = js.native
  def setBlending(
    blending: threeLib.srcConstantsMod.Blending,
    blendEquation: js.UndefOr[threeLib.srcConstantsMod.BlendingEquation],
    blendSrc: js.UndefOr[threeLib.srcConstantsMod.BlendingSrcFactor],
    blendDst: js.UndefOr[threeLib.srcConstantsMod.BlendingDstFactor],
    blendEquationAlpha: js.UndefOr[threeLib.srcConstantsMod.BlendingEquation],
    blendSrcAlpha: js.UndefOr[threeLib.srcConstantsMod.BlendingSrcFactor],
    blendDstAlpha: js.UndefOr[threeLib.srcConstantsMod.BlendingDstFactor],
    premultiplyAlpha: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  def setCullFace(cullFace: threeLib.srcConstantsMod.CullFace): scala.Unit = js.native
  def setFlipSided(flipSided: scala.Boolean): scala.Unit = js.native
  def setLineWidth(width: scala.Double): scala.Unit = js.native
  def setMaterial(material: threeLib.srcMaterialsMaterialMod.Material, frontFaceCW: scala.Boolean): scala.Unit = js.native
  def setPolygonOffset(polygonoffset: scala.Boolean, factor: scala.Double, units: scala.Double): scala.Unit = js.native
  def setScissorTest(scissorTest: scala.Boolean): scala.Unit = js.native
  def texImage2D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    source: js.Any
  ): scala.Unit = js.native
  def texImage2D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    border: scala.Double,
    format: scala.Double,
    `type`: scala.Double
  ): scala.Unit = js.native
  // Same interface as https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D
  def texImage2D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    border: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    pixels: stdLib.ArrayBufferView
  ): scala.Unit = js.native
  def texImage3D(
    target: scala.Double,
    level: scala.Double,
    internalformat: scala.Double,
    width: scala.Double,
    height: scala.Double,
    depth: scala.Double,
    border: scala.Double,
    format: scala.Double,
    `type`: scala.Double,
    pixels: js.Any
  ): scala.Unit = js.native
  def useProgram(program: js.Any): scala.Boolean = js.native
  def viewport(viewport: threeLib.srcMathVector4Mod.Vector4): scala.Unit = js.native
}

