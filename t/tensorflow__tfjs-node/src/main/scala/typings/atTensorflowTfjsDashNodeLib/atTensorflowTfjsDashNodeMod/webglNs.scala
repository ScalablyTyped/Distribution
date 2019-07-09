package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "webgl")
@js.native
object webglNs extends js.Object {
  @js.native
  class GPGPUContext ()
    extends atTensorflowTfjsLib.atTensorflowTfjsMod.webglNs.GPGPUContext {
    def this(gl: stdLib.WebGLRenderingContext) = this()
  }
  
  @js.native
  class MathBackendWebGL ()
    extends atTensorflowTfjsLib.atTensorflowTfjsMod.webglNs.MathBackendWebGL {
    def this(gpgpu: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreContextMod.GPGPUContext) = this()
  }
  
  def setWebGLContext(webGLVersion: scala.Double, gl: stdLib.WebGLRenderingContext): scala.Unit = js.native
  @JSName("gpgpu_util")
  @js.native
  object gpgpuUnderscoreUtilNs extends js.Object {
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
      textureConfig: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreUtilMod.TextureConfig
    ): stdLib.WebGLBuffer = js.native
    def createFloat16MatrixTexture(
      gl: stdLib.WebGLRenderingContext,
      debug: scala.Boolean,
      rows: scala.Double,
      columns: scala.Double,
      textureConfig: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreUtilMod.TextureConfig
    ): stdLib.WebGLTexture = js.native
    def createFloat16PackedMatrixTexture(
      gl: stdLib.WebGLRenderingContext,
      debug: scala.Boolean,
      rows: scala.Double,
      columns: scala.Double,
      textureConfig: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreUtilMod.TextureConfig
    ): stdLib.WebGLTexture = js.native
    def createFloat32MatrixTexture(
      gl: stdLib.WebGLRenderingContext,
      debug: scala.Boolean,
      rows: scala.Double,
      columns: scala.Double,
      textureConfig: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreUtilMod.TextureConfig
    ): stdLib.WebGLTexture = js.native
    def createIndexBuffer(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean): stdLib.WebGLBuffer = js.native
    def createPackedMatrixTexture(
      gl: stdLib.WebGLRenderingContext,
      debug: scala.Boolean,
      rows: scala.Double,
      columns: scala.Double,
      textureConfig: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreUtilMod.TextureConfig
    ): stdLib.WebGLTexture = js.native
    def createUnsignedBytesMatrixTexture(
      gl: stdLib.WebGLRenderingContext,
      debug: scala.Boolean,
      rows: scala.Double,
      columns: scala.Double,
      textureConfig: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreUtilMod.TextureConfig
    ): stdLib.WebGLTexture = js.native
    def createVertexBuffer(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean): stdLib.WebGLBuffer = js.native
    def createVertexShader(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean): stdLib.WebGLShader = js.native
    def downloadByteEncodedFloatMatrixFromOutputTexture(
      gl: stdLib.WebGLRenderingContext,
      debug: scala.Boolean,
      rows: scala.Double,
      columns: scala.Double,
      textureConfig: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreUtilMod.TextureConfig
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
      textureConfig: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreUtilMod.TextureConfig
    ): stdLib.Float32Array = js.native
    def getTextureConfig(gl: stdLib.WebGLRenderingContext): atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreUtilMod.TextureConfig = js.native
    def getTextureConfig(gl: stdLib.WebGLRenderingContext, textureHalfFloatExtension: js.Any): atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreUtilMod.TextureConfig = js.native
    def uploadDenseMatrixToTexture(
      gl: stdLib.WebGLRenderingContext,
      debug: scala.Boolean,
      texture: stdLib.WebGLTexture,
      width: scala.Double,
      height: scala.Double,
      data: atTensorflowTfjsDashCoreLib.distTypesMod.TypedArray,
      textureConfig: atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreUtilMod.TextureConfig
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
  
  @JSName("webgl_util")
  @js.native
  object webglUnderscoreUtilNs extends js.Object {
    var MAX_TEXTURES_IN_SHADER: scala.Double = js.native
    var MAX_TEXTURE_SIZE: scala.Double = js.native
    def bindCanvasToFramebuffer(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean): scala.Unit = js.native
    def bindColorTextureToFramebuffer(
      gl: stdLib.WebGLRenderingContext,
      debug: scala.Boolean,
      texture: stdLib.WebGLTexture,
      framebuffer: stdLib.WebGLFramebuffer
    ): scala.Unit = js.native
    def bindTextureToProgramUniformSampler(
      gl: stdLib.WebGLRenderingContext,
      debug: scala.Boolean,
      program: stdLib.WebGLProgram,
      texture: stdLib.WebGLTexture,
      uniformSamplerLocation: stdLib.WebGLUniformLocation,
      textureUnit: scala.Double
    ): scala.Unit = js.native
    def bindTextureUnit(
      gl: stdLib.WebGLRenderingContext,
      debug: scala.Boolean,
      texture: stdLib.WebGLTexture,
      textureUnit: scala.Double
    ): scala.Unit = js.native
    def bindVertexBufferToProgramAttribute(
      gl: stdLib.WebGLRenderingContext,
      debug: scala.Boolean,
      program: stdLib.WebGLProgram,
      attribute: java.lang.String,
      buffer: stdLib.WebGLBuffer,
      arrayEntriesPerItem: scala.Double,
      itemStrideInBytes: scala.Double,
      itemOffsetInBytes: scala.Double
    ): scala.Boolean = js.native
    def callAndCheck[T](gl: stdLib.WebGLRenderingContext, debugMode: scala.Boolean, func: js.Function0[T]): T = js.native
    def canBeRepresented(num: scala.Double): scala.Boolean = js.native
    def createFragmentShader(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean, fragmentShaderSource: java.lang.String): stdLib.WebGLShader = js.native
    def createFramebuffer(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean): stdLib.WebGLFramebuffer = js.native
    def createProgram(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean): stdLib.WebGLProgram = js.native
    def createStaticIndexBuffer(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean, data: stdLib.Uint16Array): stdLib.WebGLBuffer = js.native
    def createStaticVertexBuffer(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean, data: stdLib.Float32Array): stdLib.WebGLBuffer = js.native
    def createTexture(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean): stdLib.WebGLTexture = js.native
    def createVertexShader(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean, vertexShaderSource: java.lang.String): stdLib.WebGLShader = js.native
    def getBatchDim(shape: js.Array[scala.Double]): scala.Double = js.native
    def getBatchDim(shape: js.Array[scala.Double], dimsToSkip: scala.Double): scala.Double = js.native
    def getExtensionOrThrow(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean, extensionName: java.lang.String): js.Object = js.native
    def getFramebufferErrorMessage(gl: stdLib.WebGLRenderingContext, status: scala.Double): java.lang.String = js.native
    def getMaxTexturesInShader(webGLVersion: scala.Double): scala.Double = js.native
    def getNumChannels(): scala.Double = js.native
    def getProgramUniformLocation(gl: stdLib.WebGLRenderingContext, program: stdLib.WebGLProgram, uniformName: java.lang.String): stdLib.WebGLUniformLocation = js.native
    def getProgramUniformLocationOrThrow(
      gl: stdLib.WebGLRenderingContext,
      debug: scala.Boolean,
      program: stdLib.WebGLProgram,
      uniformName: java.lang.String
    ): stdLib.WebGLUniformLocation = js.native
    def getRowsCols(shape: js.Array[scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
    def getShapeAs3D(shape: js.Array[scala.Double]): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
    def getTextureShapeFromLogicalShape(logShape: js.Array[scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
    def getTextureShapeFromLogicalShape(logShape: js.Array[scala.Double], isPacked: scala.Boolean): js.Tuple2[scala.Double, scala.Double] = js.native
    def getWebGLDisjointQueryTimerVersion(webGLVersion: scala.Double): scala.Double = js.native
    def getWebGLErrorMessage(gl: stdLib.WebGLRenderingContext, status: scala.Double): java.lang.String = js.native
    def getWebGLMaxTextureSize(webGLVersion: scala.Double): scala.Double = js.native
    def isDownloadFloatTextureEnabled(webGLVersion: scala.Double): scala.Boolean = js.native
    def isRenderToFloatTextureEnabled(webGLVersion: scala.Double): scala.Boolean = js.native
    def isReshapeFree(shape1: js.Array[scala.Double], shape2: js.Array[scala.Double]): scala.Boolean = js.native
    def isWebGLFenceEnabled(webGLVersion: scala.Double): scala.Boolean = js.native
    @JSName("isWebGLVersionEnabled")
    def isWebGLVersionEnabled_1(webGLVersion: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibNumbers.`1`): scala.Boolean = js.native
    @JSName("isWebGLVersionEnabled")
    def isWebGLVersionEnabled_2(webGLVersion: atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeLibNumbers.`2`): scala.Boolean = js.native
    def linkProgram(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean, program: stdLib.WebGLProgram): scala.Unit = js.native
    def unbindColorTextureFromFramebuffer(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean, framebuffer: stdLib.WebGLFramebuffer): scala.Unit = js.native
    def unbindTextureUnit(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean, textureUnit: scala.Double): scala.Unit = js.native
    def validateFramebuffer(gl: stdLib.WebGLRenderingContext): scala.Unit = js.native
    def validateProgram(gl: stdLib.WebGLRenderingContext, debug: scala.Boolean, program: stdLib.WebGLProgram): scala.Unit = js.native
    def validateTextureSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  }
  
}

