package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod.TextureConfig
import typings.atTensorflowTfjsDashCore.distTypesMod.PixelData
import typings.atTensorflowTfjsDashCore.distTypesMod.TypedArray
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.std.WebGL2RenderingContext
import typings.std.WebGLBuffer
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLShader
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/gpgpu_util", JSImport.Namespace)
@js.native
object distBackendsWebglGpgpuUnderscoreUtilMod extends js.Object {
  def bindVertexProgramAttributeStreams(gl: WebGLRenderingContext, debug: Boolean, program: WebGLProgram, vertexBuffer: WebGLBuffer): Boolean = js.native
  def createBufferFromOutputTexture(
    gl2: WebGL2RenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): WebGLBuffer = js.native
  def createFloat16MatrixTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): WebGLTexture = js.native
  def createFloat16PackedMatrixTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): WebGLTexture = js.native
  def createFloat32MatrixTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): WebGLTexture = js.native
  def createIndexBuffer(gl: WebGLRenderingContext, debug: Boolean): WebGLBuffer = js.native
  def createPackedMatrixTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): WebGLTexture = js.native
  def createUnsignedBytesMatrixTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): WebGLTexture = js.native
  def createVertexBuffer(gl: WebGLRenderingContext, debug: Boolean): WebGLBuffer = js.native
  def createVertexShader(gl: WebGLRenderingContext, debug: Boolean): WebGLShader = js.native
  def downloadByteEncodedFloatMatrixFromOutputTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    rows: Double,
    columns: Double,
    textureConfig: TextureConfig
  ): Float32Array = js.native
  def downloadFloat32MatrixFromBuffer(gl: WebGLRenderingContext, buffer: WebGLBuffer, size: Double): Float32Array = js.native
  def downloadMatrixFromPackedOutputTexture(gl: WebGLRenderingContext, debug: Boolean, physicalRows: Double, physicalCols: Double): Float32Array = js.native
  def downloadPackedMatrixFromBuffer(
    gl: WebGLRenderingContext,
    buffer: WebGLBuffer,
    batch: Double,
    rows: Double,
    cols: Double,
    physicalRows: Double,
    physicalCols: Double,
    textureConfig: TextureConfig
  ): Float32Array = js.native
  def uploadDenseMatrixToTexture(
    gl: WebGLRenderingContext,
    debug: Boolean,
    texture: WebGLTexture,
    width: Double,
    height: Double,
    data: TypedArray,
    textureConfig: TextureConfig
  ): Unit = js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, debug: Boolean, texture: WebGLTexture, pixels: PixelData): Unit = js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, debug: Boolean, texture: WebGLTexture, pixels: HTMLCanvasElement): Unit = js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, debug: Boolean, texture: WebGLTexture, pixels: HTMLImageElement): Unit = js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, debug: Boolean, texture: WebGLTexture, pixels: HTMLVideoElement): Unit = js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, debug: Boolean, texture: WebGLTexture, pixels: ImageData): Unit = js.native
}

