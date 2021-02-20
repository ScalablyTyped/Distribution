package typings.tensorflowTfjsBackendWebgl

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
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglNumbers.`1`
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglNumbers.`2`
import typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureConfig
import typings.tensorflowTfjsCore.distTypesMod.PixelData
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl", "GPGPUContext")
  @js.native
  class GPGPUContext ()
    extends typings.tensorflowTfjsBackendWebgl.baseMod.GPGPUContext {
    def this(gl: WebGLRenderingContext) = this()
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl", "MathBackendWebGL")
  @js.native
  class MathBackendWebGL ()
    extends typings.tensorflowTfjsBackendWebgl.baseMod.MathBackendWebGL {
    def this(gpgpu: typings.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext) = this()
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl", "forceHalfFloat")
  @js.native
  def forceHalfFloat(): Unit = js.native
  
  object gpgpuUtil {
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.bindVertexProgramAttributeStreams")
    @js.native
    def bindVertexProgramAttributeStreams(gl: WebGLRenderingContext, program: WebGLProgram, vertexBuffer: WebGLBuffer): Boolean = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.createBufferFromOutputTexture")
    @js.native
    def createBufferFromOutputTexture(gl2: WebGL2RenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLBuffer = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.createFloat16MatrixTexture")
    @js.native
    def createFloat16MatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.createFloat16PackedMatrixTexture")
    @js.native
    def createFloat16PackedMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.createFloat32MatrixTexture")
    @js.native
    def createFloat32MatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.createIndexBuffer")
    @js.native
    def createIndexBuffer(gl: WebGLRenderingContext): WebGLBuffer = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.createPackedMatrixTexture")
    @js.native
    def createPackedMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.createUnsignedBytesMatrixTexture")
    @js.native
    def createUnsignedBytesMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.createVertexBuffer")
    @js.native
    def createVertexBuffer(gl: WebGLRenderingContext): WebGLBuffer = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.createVertexShader")
    @js.native
    def createVertexShader(gl: WebGLRenderingContext): WebGLShader = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.downloadByteEncodedFloatMatrixFromOutputTexture")
    @js.native
    def downloadByteEncodedFloatMatrixFromOutputTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): Float32Array = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.downloadFloat32MatrixFromBuffer")
    @js.native
    def downloadFloat32MatrixFromBuffer(gl: WebGLRenderingContext, buffer: WebGLBuffer, size: Double): Float32Array = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.downloadMatrixFromPackedOutputTexture")
    @js.native
    def downloadMatrixFromPackedOutputTexture(gl: WebGLRenderingContext, physicalRows: Double, physicalCols: Double): Float32Array = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.downloadPackedMatrixFromBuffer")
    @js.native
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
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.getInternalFormatForFloat16MatrixTexture")
    @js.native
    def getInternalFormatForFloat16MatrixTexture(textureConfig: TextureConfig): Double = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.getInternalFormatForFloat16PackedMatrixTexture")
    @js.native
    def getInternalFormatForFloat16PackedMatrixTexture(textureConfig: TextureConfig): Double = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.getInternalFormatForFloat32MatrixTexture")
    @js.native
    def getInternalFormatForFloat32MatrixTexture(textureConfig: TextureConfig): Double = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.getInternalFormatForPackedMatrixTexture")
    @js.native
    def getInternalFormatForPackedMatrixTexture(textureConfig: TextureConfig): Double = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.getInternalFormatForUnsignedBytesMatrixTexture")
    @js.native
    def getInternalFormatForUnsignedBytesMatrixTexture(textureConfig: TextureConfig): Double = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.uploadDenseMatrixToTexture")
    @js.native
    def uploadDenseMatrixToTexture(
      gl: WebGLRenderingContext,
      texture: WebGLTexture,
      width: Double,
      height: Double,
      data: TypedArray,
      textureConfig: TextureConfig
    ): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.uploadPixelDataToTexture")
    @js.native
    def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: HTMLCanvasElement): Unit = js.native
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.uploadPixelDataToTexture")
    @js.native
    def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: HTMLImageElement): Unit = js.native
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.uploadPixelDataToTexture")
    @js.native
    def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: HTMLVideoElement): Unit = js.native
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.uploadPixelDataToTexture")
    @js.native
    def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: ImageData): Unit = js.native
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util.uploadPixelDataToTexture")
    @js.native
    def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: PixelData): Unit = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl", "setWebGLContext")
  @js.native
  def setWebGLContext(webGLVersion: Double, gl: WebGLRenderingContext): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl", "version_webgl")
  @js.native
  val versionWebgl: /* "2.7.0" */ String = js.native
  
  object webgl {
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl.forceHalfFloat")
    @js.native
    def forceHalfFloat(): Unit = js.native
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl.forceHalfFloat")
    @js.native
    def forceHalfFloat_Fwebgl: js.Function0[Unit] = js.native
    
    @scala.inline
    def forceHalfFloat_Fwebgl_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceHalfFloat")(x.asInstanceOf[js.Any])
  }
  
  object webglUtil {
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.assertNotComplex")
    @js.native
    def assertNotComplex(tensor: js.Array[TensorInfo], opName: String): Unit = js.native
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.assertNotComplex")
    @js.native
    def assertNotComplex(tensor: TensorInfo, opName: String): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.bindCanvasToFramebuffer")
    @js.native
    def bindCanvasToFramebuffer(gl: WebGLRenderingContext): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.bindColorTextureToFramebuffer")
    @js.native
    def bindColorTextureToFramebuffer(gl: WebGLRenderingContext, texture: WebGLTexture, framebuffer: WebGLFramebuffer): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.bindTextureToProgramUniformSampler")
    @js.native
    def bindTextureToProgramUniformSampler(
      gl: WebGLRenderingContext,
      texture: WebGLTexture,
      uniformSamplerLocation: WebGLUniformLocation,
      textureUnit: Double
    ): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.bindTextureUnit")
    @js.native
    def bindTextureUnit(gl: WebGLRenderingContext, texture: WebGLTexture, textureUnit: Double): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.bindVertexBufferToProgramAttribute")
    @js.native
    def bindVertexBufferToProgramAttribute(
      gl: WebGLRenderingContext,
      program: WebGLProgram,
      attribute: String,
      buffer: WebGLBuffer,
      arrayEntriesPerItem: Double,
      itemStrideInBytes: Double,
      itemOffsetInBytes: Double
    ): Boolean = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.callAndCheck")
    @js.native
    def callAndCheck[T](gl: WebGLRenderingContext, func: js.Function0[T]): T = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.canBeRepresented")
    @js.native
    def canBeRepresented(num: Double): Boolean = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.createFragmentShader")
    @js.native
    def createFragmentShader(gl: WebGLRenderingContext, fragmentShaderSource: String): WebGLShader = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.createFramebuffer")
    @js.native
    def createFramebuffer(gl: WebGLRenderingContext): WebGLFramebuffer = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.createProgram")
    @js.native
    def createProgram(gl: WebGLRenderingContext): WebGLProgram = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.createStaticIndexBuffer")
    @js.native
    def createStaticIndexBuffer(gl: WebGLRenderingContext, data: Uint16Array): WebGLBuffer = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.createStaticVertexBuffer")
    @js.native
    def createStaticVertexBuffer(gl: WebGLRenderingContext, data: Float32Array): WebGLBuffer = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.createTexture")
    @js.native
    def createTexture(gl: WebGLRenderingContext): WebGLTexture = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.createVertexShader")
    @js.native
    def createVertexShader(gl: WebGLRenderingContext, vertexShaderSource: String): WebGLShader = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getBatchDim")
    @js.native
    def getBatchDim(shape: js.Array[Double]): Double = js.native
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getBatchDim")
    @js.native
    def getBatchDim(shape: js.Array[Double], dimsToSkip: Double): Double = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getExtensionOrThrow")
    @js.native
    def getExtensionOrThrow(gl: WebGLRenderingContext, extensionName: String): js.Object = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getFramebufferErrorMessage")
    @js.native
    def getFramebufferErrorMessage(gl: WebGLRenderingContext, status: Double): String = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getMaxTexturesInShader")
    @js.native
    def getMaxTexturesInShader(webGLVersion: Double): Double = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getNumChannels")
    @js.native
    def getNumChannels(): Double = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getProgramUniformLocation")
    @js.native
    def getProgramUniformLocation(gl: WebGLRenderingContext, program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getProgramUniformLocationOrThrow")
    @js.native
    def getProgramUniformLocationOrThrow(gl: WebGLRenderingContext, program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getRowsCols")
    @js.native
    def getRowsCols(shape: js.Array[Double]): js.Tuple2[Double, Double] = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getShapeAs3D")
    @js.native
    def getShapeAs3D(shape: js.Array[Double]): js.Tuple3[Double, Double, Double] = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getTextureShapeFromLogicalShape")
    @js.native
    def getTextureShapeFromLogicalShape(logShape: js.Array[Double]): js.Tuple2[Double, Double] = js.native
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getTextureShapeFromLogicalShape")
    @js.native
    def getTextureShapeFromLogicalShape(logShape: js.Array[Double], isPacked: Boolean): js.Tuple2[Double, Double] = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getWebGLDisjointQueryTimerVersion")
    @js.native
    def getWebGLDisjointQueryTimerVersion(webGLVersion: Double): Double = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getWebGLErrorMessage")
    @js.native
    def getWebGLErrorMessage(gl: WebGLRenderingContext, status: Double): String = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.getWebGLMaxTextureSize")
    @js.native
    def getWebGLMaxTextureSize(webGLVersion: Double): Double = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.hasExtension")
    @js.native
    def hasExtension(gl: WebGLRenderingContext, extensionName: String): Boolean = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.isCapableOfRenderingToFloatTexture")
    @js.native
    def isCapableOfRenderingToFloatTexture(webGLVersion: Double): Boolean = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.isDownloadFloatTextureEnabled")
    @js.native
    def isDownloadFloatTextureEnabled(webGLVersion: Double): Boolean = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.isReshapeFree")
    @js.native
    def isReshapeFree(shape1: js.Array[Double], shape2: js.Array[Double]): Boolean = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.isWebGLFenceEnabled")
    @js.native
    def isWebGLFenceEnabled(webGLVersion: Double): Boolean = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.isWebGLVersionEnabled")
    @js.native
    def isWebGLVersionEnabled_1(webGLVersion: `1`): Boolean = js.native
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.isWebGLVersionEnabled")
    @js.native
    def isWebGLVersionEnabled_2(webGLVersion: `2`): Boolean = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.linkProgram")
    @js.native
    def linkProgram(gl: WebGLRenderingContext, program: WebGLProgram): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.resetMaxTextureSize")
    @js.native
    def resetMaxTextureSize(): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.resetMaxTexturesInShader")
    @js.native
    def resetMaxTexturesInShader(): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.unbindColorTextureFromFramebuffer")
    @js.native
    def unbindColorTextureFromFramebuffer(gl: WebGLRenderingContext, framebuffer: WebGLFramebuffer): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.unbindTextureUnit")
    @js.native
    def unbindTextureUnit(gl: WebGLRenderingContext, textureUnit: Double): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.validateFramebuffer")
    @js.native
    def validateFramebuffer(gl: WebGLRenderingContext): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.validateProgram")
    @js.native
    def validateProgram(gl: WebGLRenderingContext, program: WebGLProgram): Unit = js.native
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util.validateTextureSize")
    @js.native
    def validateTextureSize(width: Double, height: Double): Unit = js.native
  }
}
