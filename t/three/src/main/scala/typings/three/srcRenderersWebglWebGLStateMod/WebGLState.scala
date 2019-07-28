package typings.three.srcRenderersWebglWebGLStateMod

import typings.std.ArrayBufferView
import typings.std.WebGLRenderingContext
import typings.three.Anon_ColorDepth
import typings.three.srcConstantsMod.Blending
import typings.three.srcConstantsMod.BlendingDstFactor
import typings.three.srcConstantsMod.BlendingEquation
import typings.three.srcConstantsMod.BlendingSrcFactor
import typings.three.srcConstantsMod.CullFace
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathVector4Mod.Vector4
import typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import typings.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLState", "WebGLState")
@js.native
class WebGLState protected () extends js.Object {
  def this(
    gl: WebGLRenderingContext,
    extensions: WebGLExtensions,
    utils: js.Any,
    capabilities: WebGLCapabilities
  ) = this()
  var buffers: Anon_ColorDepth = js.native
  def activeTexture(webglSlot: Double): Unit = js.native
  def bindTexture(webglType: Double, webglTexture: js.Any): Unit = js.native
  // Same interface as https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexImage2D
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    data: ArrayBufferView
  ): Unit = js.native
  def disable(id: Double): Unit = js.native
  def disableUnusedAttributes(): Unit = js.native
  def enable(id: Double): Unit = js.native
  def enableAttribute(attribute: Double): Unit = js.native
  def enableAttributeAndDivisor(attribute: Double, meshPerAttribute: Double): Unit = js.native
  def getCompressedTextureFormats(): js.Array[Double] = js.native
  def initAttributes(): Unit = js.native
  def reset(): Unit = js.native
  def scissor(scissor: Vector4): Unit = js.native
  def setBlending(
    blending: Blending,
    blendEquation: js.UndefOr[BlendingEquation],
    blendSrc: js.UndefOr[BlendingSrcFactor],
    blendDst: js.UndefOr[BlendingDstFactor],
    blendEquationAlpha: js.UndefOr[BlendingEquation],
    blendSrcAlpha: js.UndefOr[BlendingSrcFactor],
    blendDstAlpha: js.UndefOr[BlendingDstFactor],
    premultiplyAlpha: js.UndefOr[Boolean]
  ): Unit = js.native
  def setCullFace(cullFace: CullFace): Unit = js.native
  def setFlipSided(flipSided: Boolean): Unit = js.native
  def setLineWidth(width: Double): Unit = js.native
  def setMaterial(material: Material, frontFaceCW: Boolean): Unit = js.native
  def setPolygonOffset(polygonoffset: Boolean, factor: Double, units: Double): Unit = js.native
  def setScissorTest(scissorTest: Boolean): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    format: Double,
    `type`: Double,
    source: js.Any
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    format: Double,
    `type`: Double
  ): Unit = js.native
  // Same interface as https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    format: Double,
    `type`: Double,
    pixels: ArrayBufferView
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    pixels: js.Any
  ): Unit = js.native
  def useProgram(program: js.Any): Boolean = js.native
  def viewport(viewport: Vector4): Unit = js.native
}

