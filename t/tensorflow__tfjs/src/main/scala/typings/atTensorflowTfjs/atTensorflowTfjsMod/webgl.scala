package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjs.atTensorflowTfjsNumbers.`1`
import typings.atTensorflowTfjs.atTensorflowTfjsNumbers.`2`
import typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod.TextureConfig
import typings.atTensorflowTfjsDashCore.distTypesMod.PixelData
import typings.atTensorflowTfjsDashCore.distTypesMod.TypedArray
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.std.Uint16Array
import typings.std.WebGL2RenderingContext
import typings.std.WebGLBuffer
import typings.std.WebGLFramebuffer
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLShader
import typings.std.WebGLTexture
import typings.std.WebGLUniformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "webgl")
@js.native
object webgl extends js.Object {
  @js.native
  class GPGPUContext ()
    extends typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.webgl.GPGPUContext {
    def this(gl: WebGLRenderingContext) = this()
  }
  
  @js.native
  class MathBackendWebGL ()
    extends typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.webgl.MathBackendWebGL {
    def this(gpgpu: typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreContextMod.GPGPUContext) = this()
  }
  
  def forceHalfFloat(): Unit = js.native
  def setWebGLContext(webGLVersion: Double, gl: WebGLRenderingContext): Unit = js.native
  @js.native
  object gpgpu_util extends js.Object {
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
  
  @js.native
  object webgl_util extends js.Object {
    def bindCanvasToFramebuffer(gl: WebGLRenderingContext, debug: Boolean): Unit = js.native
    def bindColorTextureToFramebuffer(gl: WebGLRenderingContext, debug: Boolean, texture: WebGLTexture, framebuffer: WebGLFramebuffer): Unit = js.native
    def bindTextureToProgramUniformSampler(
      gl: WebGLRenderingContext,
      debug: Boolean,
      program: WebGLProgram,
      texture: WebGLTexture,
      uniformSamplerLocation: WebGLUniformLocation,
      textureUnit: Double
    ): Unit = js.native
    def bindTextureUnit(gl: WebGLRenderingContext, debug: Boolean, texture: WebGLTexture, textureUnit: Double): Unit = js.native
    def bindVertexBufferToProgramAttribute(
      gl: WebGLRenderingContext,
      debug: Boolean,
      program: WebGLProgram,
      attribute: String,
      buffer: WebGLBuffer,
      arrayEntriesPerItem: Double,
      itemStrideInBytes: Double,
      itemOffsetInBytes: Double
    ): Boolean = js.native
    def callAndCheck[T](gl: WebGLRenderingContext, debugMode: Boolean, func: js.Function0[T]): T = js.native
    def canBeRepresented(num: Double): Boolean = js.native
    def createFragmentShader(gl: WebGLRenderingContext, debug: Boolean, fragmentShaderSource: String): WebGLShader = js.native
    def createFramebuffer(gl: WebGLRenderingContext, debug: Boolean): WebGLFramebuffer = js.native
    def createProgram(gl: WebGLRenderingContext, debug: Boolean): WebGLProgram = js.native
    def createStaticIndexBuffer(gl: WebGLRenderingContext, debug: Boolean, data: Uint16Array): WebGLBuffer = js.native
    def createStaticVertexBuffer(gl: WebGLRenderingContext, debug: Boolean, data: Float32Array): WebGLBuffer = js.native
    def createTexture(gl: WebGLRenderingContext, debug: Boolean): WebGLTexture = js.native
    def createVertexShader(gl: WebGLRenderingContext, debug: Boolean, vertexShaderSource: String): WebGLShader = js.native
    def getBatchDim(shape: js.Array[Double]): Double = js.native
    def getBatchDim(shape: js.Array[Double], dimsToSkip: Double): Double = js.native
    def getExtensionOrThrow(gl: WebGLRenderingContext, debug: Boolean, extensionName: String): js.Object = js.native
    def getFramebufferErrorMessage(gl: WebGLRenderingContext, status: Double): String = js.native
    def getMaxTexturesInShader(webGLVersion: Double): Double = js.native
    def getNumChannels(): Double = js.native
    def getProgramUniformLocation(gl: WebGLRenderingContext, program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
    def getProgramUniformLocationOrThrow(gl: WebGLRenderingContext, debug: Boolean, program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
    def getRowsCols(shape: js.Array[Double]): js.Tuple2[Double, Double] = js.native
    def getShapeAs3D(shape: js.Array[Double]): js.Tuple3[Double, Double, Double] = js.native
    def getTextureShapeFromLogicalShape(logShape: js.Array[Double]): js.Tuple2[Double, Double] = js.native
    def getTextureShapeFromLogicalShape(logShape: js.Array[Double], isPacked: Boolean): js.Tuple2[Double, Double] = js.native
    def getWebGLDisjointQueryTimerVersion(webGLVersion: Double): Double = js.native
    def getWebGLErrorMessage(gl: WebGLRenderingContext, status: Double): String = js.native
    def getWebGLMaxTextureSize(webGLVersion: Double): Double = js.native
    def hasExtension(gl: WebGLRenderingContext, extensionName: String): Boolean = js.native
    def isCapableOfRenderingToFloatTexture(webGLVersion: Double): Boolean = js.native
    def isDownloadFloatTextureEnabled(webGLVersion: Double): Boolean = js.native
    def isReshapeFree(shape1: js.Array[Double], shape2: js.Array[Double]): Boolean = js.native
    def isWebGLFenceEnabled(webGLVersion: Double): Boolean = js.native
    @JSName("isWebGLVersionEnabled")
    def isWebGLVersionEnabled_1(webGLVersion: `1`): Boolean = js.native
    @JSName("isWebGLVersionEnabled")
    def isWebGLVersionEnabled_2(webGLVersion: `2`): Boolean = js.native
    def linkProgram(gl: WebGLRenderingContext, debug: Boolean, program: WebGLProgram): Unit = js.native
    def resetMaxTextureSize(): Unit = js.native
    def resetMaxTexturesInShader(): Unit = js.native
    def unbindColorTextureFromFramebuffer(gl: WebGLRenderingContext, debug: Boolean, framebuffer: WebGLFramebuffer): Unit = js.native
    def unbindTextureUnit(gl: WebGLRenderingContext, debug: Boolean, textureUnit: Double): Unit = js.native
    def validateFramebuffer(gl: WebGLRenderingContext): Unit = js.native
    def validateProgram(gl: WebGLRenderingContext, debug: Boolean, program: WebGLProgram): Unit = js.native
    def validateTextureSize(width: Double, height: Double): Unit = js.native
  }
  
}

