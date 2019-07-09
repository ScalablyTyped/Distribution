package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/gpgpu_util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bindVertexProgramAttributeStreams(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    program: stdLib.WebGLProgram,
    vertexBuffer: stdLib.WebGLBuffer
  ): scala.Boolean = js.native
  def createBufferFromOutputTexture(
    gl2: webgl2Lib.WebGL2RenderingContext,
    debug: scala.Boolean,
    rows: scala.Double,
    columns: scala.Double,
    textureConfig: TextureConfig
  ): stdLib.WebGLBuffer = js.native
  def createFloat16MatrixTexture(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    rows: scala.Double,
    columns: scala.Double,
    textureConfig: TextureConfig
  ): stdLib.WebGLTexture = js.native
  def createFloat16PackedMatrixTexture(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    rows: scala.Double,
    columns: scala.Double,
    textureConfig: TextureConfig
  ): stdLib.WebGLTexture = js.native
  def createFloat32MatrixTexture(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    rows: scala.Double,
    columns: scala.Double,
    textureConfig: TextureConfig
  ): stdLib.WebGLTexture = js.native
  def createIndexBuffer(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean): stdLib.WebGLBuffer = js.native
  def createPackedMatrixTexture(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    rows: scala.Double,
    columns: scala.Double,
    textureConfig: TextureConfig
  ): stdLib.WebGLTexture = js.native
  def createUnsignedBytesMatrixTexture(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    rows: scala.Double,
    columns: scala.Double,
    textureConfig: TextureConfig
  ): stdLib.WebGLTexture = js.native
  def createVertexBuffer(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean): stdLib.WebGLBuffer = js.native
  def createVertexShader(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean): stdLib.WebGLShader = js.native
  def downloadByteEncodedFloatMatrixFromOutputTexture(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    rows: scala.Double,
    columns: scala.Double,
    textureConfig: TextureConfig
  ): stdLib.Float32Array = js.native
  def downloadFloat32MatrixFromBuffer(gl: stdLib.WebGLRenderingContext, buffer: stdLib.WebGLBuffer, size: scala.Double): stdLib.Float32Array = js.native
  def downloadMatrixFromPackedOutputTexture(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    physicalRows: scala.Double,
    physicalCols: scala.Double
  ): stdLib.Float32Array = js.native
  def downloadPackedMatrixFromBuffer(
    gl: stdLib.WebGLRenderingContext,
    buffer: stdLib.WebGLBuffer,
    batch: scala.Double,
    rows: scala.Double,
    cols: scala.Double,
    physicalRows: scala.Double,
    physicalCols: scala.Double,
    textureConfig: TextureConfig
  ): stdLib.Float32Array = js.native
  def getTextureConfig(gl: stdLib.WebGLRenderingContext): TextureConfig = js.native
  def getTextureConfig(gl: stdLib.WebGLRenderingContext, textureHalfFloatExtension: js.Any): TextureConfig = js.native
  def uploadDenseMatrixToTexture(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    texture: stdLib.WebGLTexture,
    width: scala.Double,
    height: scala.Double,
    data: atTensorflowTfjsDashCoreLib.distTypesMod.TypedArray,
    textureConfig: TextureConfig
  ): scala.Unit = js.native
  def uploadPixelDataToTexture(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    texture: stdLib.WebGLTexture,
    pixels: atTensorflowTfjsDashCoreLib.distTypesMod.PixelData
  ): scala.Unit = js.native
  def uploadPixelDataToTexture(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    texture: stdLib.WebGLTexture,
    pixels: stdLib.HTMLCanvasElement
  ): scala.Unit = js.native
  def uploadPixelDataToTexture(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    texture: stdLib.WebGLTexture,
    pixels: stdLib.HTMLImageElement
  ): scala.Unit = js.native
  def uploadPixelDataToTexture(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    texture: stdLib.WebGLTexture,
    pixels: stdLib.HTMLVideoElement
  ): scala.Unit = js.native
  def uploadPixelDataToTexture(
    gl: stdLib.WebGLRenderingContext,
    debug: scala.Boolean,
    texture: stdLib.WebGLTexture,
    pixels: stdLib.ImageData
  ): scala.Unit = js.native
}

