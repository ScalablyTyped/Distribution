package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "WebGLState")
@js.native
class WebGLState protected () extends js.Object {
  def this(gl: js.Any, extensions: js.Any, paramThreeToGL: js.Function) = this()
  var buffers: threeLib.Anon_ColorStencil = js.native
  def activeTexture(webglSlot: js.Any): scala.Unit = js.native
  def bindTexture(webglType: js.Any, webglTexture: js.Any): scala.Unit = js.native
  def clearColor(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): scala.Unit = js.native
  def clearDepth(depth: scala.Double): scala.Unit = js.native
  def clearStencil(stencil: js.Any): scala.Unit = js.native
  // Same interface as https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexImage2D
  def compressedTexImage2D(): scala.Unit = js.native
  def disable(id: java.lang.String): scala.Unit = js.native
  def disableUnusedAttributes(): scala.Unit = js.native
  def enable(id: java.lang.String): scala.Unit = js.native
  def enableAttribute(attribute: java.lang.String): scala.Unit = js.native
  def enableAttributeAndDivisor(attribute: java.lang.String, meshPerAttribute: js.Any, extension: js.Any): scala.Unit = js.native
  def getCompressedTextureFormats(): js.Array[_] = js.native
  def getScissorTest(): scala.Boolean = js.native
  def init(): scala.Unit = js.native
  def initAttributes(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def scissor(scissor: js.Any): scala.Unit = js.native
  def setBlending(
    blending: scala.Double,
    blendEquation: js.UndefOr[scala.Double],
    blendSrc: js.UndefOr[scala.Double],
    blendDst: js.UndefOr[scala.Double],
    blendEquationAlpha: js.UndefOr[scala.Double],
    blendSrcAlpha: js.UndefOr[scala.Double],
    blendDstAlpha: js.UndefOr[scala.Double],
    premultiplyAlpha: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  def setColorWrite(colorWrite: scala.Double): scala.Unit = js.native
  def setCullFace(cullFace: CullFace): scala.Unit = js.native
  def setDepthFunc(depthFunc: js.Function): scala.Unit = js.native
  def setDepthTest(depthTest: scala.Double): scala.Unit = js.native
  def setDepthWrite(depthWrite: scala.Double): scala.Unit = js.native
  def setFlipSided(flipSided: scala.Double): scala.Unit = js.native
  def setLineWidth(width: scala.Double): scala.Unit = js.native
  def setPolygonOffset(polygonoffset: scala.Double, factor: scala.Double, units: scala.Double): scala.Unit = js.native
  def setScissorTest(scissorTest: scala.Boolean): scala.Unit = js.native
  def setStencilFunc(stencilFunc: js.Function, stencilRef: js.Any, stencilMask: scala.Double): scala.Unit = js.native
  def setStencilOp(stencilFail: js.Any, stencilZFail: js.Any, stencilZPass: js.Any): scala.Unit = js.native
  def setStencilTest(stencilTest: scala.Boolean): scala.Unit = js.native
  def setStencilWrite(stencilWrite: js.Any): scala.Unit = js.native
  // Same interface as https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D
  def texImage2D(): scala.Unit = js.native
  def viewport(viewport: js.Any): scala.Unit = js.native
}

