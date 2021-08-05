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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def forceHalfFloat(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceHalfFloat")().asInstanceOf[Unit]
  
  object gpgpuUtil {
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "gpgpu_util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bindVertexProgramAttributeStreams(gl: WebGLRenderingContext, program: WebGLProgram, vertexBuffer: WebGLBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bindVertexProgramAttributeStreams")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any], vertexBuffer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def createBufferFromOutputTexture(gl2: WebGL2RenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("createBufferFromOutputTexture")(gl2.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[WebGLBuffer]
    
    inline def createFloat16MatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("createFloat16MatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[WebGLTexture]
    
    inline def createFloat16PackedMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("createFloat16PackedMatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[WebGLTexture]
    
    inline def createFloat32MatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("createFloat32MatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[WebGLTexture]
    
    inline def createIndexBuffer(gl: WebGLRenderingContext): WebGLBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createIndexBuffer")(gl.asInstanceOf[js.Any]).asInstanceOf[WebGLBuffer]
    
    inline def createPackedMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackedMatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[WebGLTexture]
    
    inline def createUnsignedBytesMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnsignedBytesMatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[WebGLTexture]
    
    inline def createVertexBuffer(gl: WebGLRenderingContext): WebGLBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createVertexBuffer")(gl.asInstanceOf[js.Any]).asInstanceOf[WebGLBuffer]
    
    inline def createVertexShader(gl: WebGLRenderingContext): WebGLShader = ^.asInstanceOf[js.Dynamic].applyDynamic("createVertexShader")(gl.asInstanceOf[js.Any]).asInstanceOf[WebGLShader]
    
    inline def downloadByteEncodedFloatMatrixFromOutputTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadByteEncodedFloatMatrixFromOutputTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
    
    inline def downloadFloat32MatrixFromBuffer(gl: WebGLRenderingContext, buffer: WebGLBuffer, size: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadFloat32MatrixFromBuffer")(gl.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
    
    inline def downloadMatrixFromPackedOutputTexture(gl: WebGLRenderingContext, physicalRows: Double, physicalCols: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadMatrixFromPackedOutputTexture")(gl.asInstanceOf[js.Any], physicalRows.asInstanceOf[js.Any], physicalCols.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
    
    inline def downloadPackedMatrixFromBuffer(
      gl: WebGLRenderingContext,
      buffer: WebGLBuffer,
      batch: Double,
      rows: Double,
      cols: Double,
      physicalRows: Double,
      physicalCols: Double,
      textureConfig: TextureConfig
    ): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadPackedMatrixFromBuffer")(gl.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], batch.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], physicalRows.asInstanceOf[js.Any], physicalCols.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
    
    inline def getInternalFormatForFloat16MatrixTexture(textureConfig: TextureConfig): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternalFormatForFloat16MatrixTexture")(textureConfig.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getInternalFormatForFloat16PackedMatrixTexture(textureConfig: TextureConfig): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternalFormatForFloat16PackedMatrixTexture")(textureConfig.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getInternalFormatForFloat32MatrixTexture(textureConfig: TextureConfig): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternalFormatForFloat32MatrixTexture")(textureConfig.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getInternalFormatForPackedMatrixTexture(textureConfig: TextureConfig): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternalFormatForPackedMatrixTexture")(textureConfig.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getInternalFormatForUnsignedBytesMatrixTexture(textureConfig: TextureConfig): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternalFormatForUnsignedBytesMatrixTexture")(textureConfig.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def uploadDenseMatrixToTexture(
      gl: WebGLRenderingContext,
      texture: WebGLTexture,
      width: Double,
      height: Double,
      data: TypedArray,
      textureConfig: TextureConfig
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadDenseMatrixToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: HTMLCanvasElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadPixelDataToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: HTMLImageElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadPixelDataToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: HTMLVideoElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadPixelDataToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: ImageData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadPixelDataToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: PixelData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadPixelDataToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def setWebGLContext(webGLVersion: Double, gl: WebGLRenderingContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWebGLContext")(webGLVersion.asInstanceOf[js.Any], gl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@tensorflow/tfjs-backend-webgl", "version_webgl")
  @js.native
  val versionWebgl: /* "2.7.0" */ String = js.native
  
  object webgl {
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def forceHalfFloat(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceHalfFloat")().asInstanceOf[Unit]
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl.forceHalfFloat")
    @js.native
    def forceHalfFloat_Fwebgl: js.Function0[Unit] = js.native
    
    inline def forceHalfFloat_Fwebgl_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceHalfFloat")(x.asInstanceOf[js.Any])
  }
  
  object webglUtil {
    
    @JSImport("@tensorflow/tfjs-backend-webgl", "webgl_util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def assertNotComplex(tensor: js.Array[TensorInfo], opName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNotComplex")(tensor.asInstanceOf[js.Any], opName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def assertNotComplex(tensor: TensorInfo, opName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNotComplex")(tensor.asInstanceOf[js.Any], opName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def bindCanvasToFramebuffer(gl: WebGLRenderingContext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCanvasToFramebuffer")(gl.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def bindColorTextureToFramebuffer(gl: WebGLRenderingContext, texture: WebGLTexture, framebuffer: WebGLFramebuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindColorTextureToFramebuffer")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], framebuffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def bindTextureToProgramUniformSampler(
      gl: WebGLRenderingContext,
      texture: WebGLTexture,
      uniformSamplerLocation: WebGLUniformLocation,
      textureUnit: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindTextureToProgramUniformSampler")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], uniformSamplerLocation.asInstanceOf[js.Any], textureUnit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def bindTextureUnit(gl: WebGLRenderingContext, texture: WebGLTexture, textureUnit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bindTextureUnit")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], textureUnit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def bindVertexBufferToProgramAttribute(
      gl: WebGLRenderingContext,
      program: WebGLProgram,
      attribute: String,
      buffer: WebGLBuffer,
      arrayEntriesPerItem: Double,
      itemStrideInBytes: Double,
      itemOffsetInBytes: Double
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bindVertexBufferToProgramAttribute")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], arrayEntriesPerItem.asInstanceOf[js.Any], itemStrideInBytes.asInstanceOf[js.Any], itemOffsetInBytes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def callAndCheck[T](gl: WebGLRenderingContext, func: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("callAndCheck")(gl.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def canBeRepresented(num: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canBeRepresented")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def createFragmentShader(gl: WebGLRenderingContext, fragmentShaderSource: String): WebGLShader = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragmentShader")(gl.asInstanceOf[js.Any], fragmentShaderSource.asInstanceOf[js.Any])).asInstanceOf[WebGLShader]
    
    inline def createFramebuffer(gl: WebGLRenderingContext): WebGLFramebuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createFramebuffer")(gl.asInstanceOf[js.Any]).asInstanceOf[WebGLFramebuffer]
    
    inline def createProgram(gl: WebGLRenderingContext): WebGLProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(gl.asInstanceOf[js.Any]).asInstanceOf[WebGLProgram]
    
    inline def createStaticIndexBuffer(gl: WebGLRenderingContext, data: Uint16Array): WebGLBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("createStaticIndexBuffer")(gl.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[WebGLBuffer]
    
    inline def createStaticVertexBuffer(gl: WebGLRenderingContext, data: Float32Array): WebGLBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("createStaticVertexBuffer")(gl.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[WebGLBuffer]
    
    inline def createTexture(gl: WebGLRenderingContext): WebGLTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("createTexture")(gl.asInstanceOf[js.Any]).asInstanceOf[WebGLTexture]
    
    inline def createVertexShader(gl: WebGLRenderingContext, vertexShaderSource: String): WebGLShader = (^.asInstanceOf[js.Dynamic].applyDynamic("createVertexShader")(gl.asInstanceOf[js.Any], vertexShaderSource.asInstanceOf[js.Any])).asInstanceOf[WebGLShader]
    
    inline def getBatchDim(shape: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBatchDim")(shape.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def getBatchDim(shape: js.Array[Double], dimsToSkip: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getBatchDim")(shape.asInstanceOf[js.Any], dimsToSkip.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getExtensionOrThrow(gl: WebGLRenderingContext, extensionName: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getExtensionOrThrow")(gl.asInstanceOf[js.Any], extensionName.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def getFramebufferErrorMessage(gl: WebGLRenderingContext, status: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFramebufferErrorMessage")(gl.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getMaxTexturesInShader(webGLVersion: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxTexturesInShader")(webGLVersion.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getNumChannels(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumChannels")().asInstanceOf[Double]
    
    inline def getProgramUniformLocation(gl: WebGLRenderingContext, program: WebGLProgram, uniformName: String): WebGLUniformLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("getProgramUniformLocation")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any], uniformName.asInstanceOf[js.Any])).asInstanceOf[WebGLUniformLocation]
    
    inline def getProgramUniformLocationOrThrow(gl: WebGLRenderingContext, program: WebGLProgram, uniformName: String): WebGLUniformLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("getProgramUniformLocationOrThrow")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any], uniformName.asInstanceOf[js.Any])).asInstanceOf[WebGLUniformLocation]
    
    inline def getRowsCols(shape: js.Array[Double]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRowsCols")(shape.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
    
    inline def getShapeAs3D(shape: js.Array[Double]): js.Tuple3[Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShapeAs3D")(shape.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, Double, Double]]
    
    inline def getTextureShapeFromLogicalShape(logShape: js.Array[Double]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextureShapeFromLogicalShape")(logShape.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
    inline def getTextureShapeFromLogicalShape(logShape: js.Array[Double], isPacked: Boolean): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextureShapeFromLogicalShape")(logShape.asInstanceOf[js.Any], isPacked.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
    
    inline def getWebGLDisjointQueryTimerVersion(webGLVersion: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebGLDisjointQueryTimerVersion")(webGLVersion.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getWebGLErrorMessage(gl: WebGLRenderingContext, status: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebGLErrorMessage")(gl.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getWebGLMaxTextureSize(webGLVersion: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebGLMaxTextureSize")(webGLVersion.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def hasExtension(gl: WebGLRenderingContext, extensionName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasExtension")(gl.asInstanceOf[js.Any], extensionName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isCapableOfRenderingToFloatTexture(webGLVersion: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCapableOfRenderingToFloatTexture")(webGLVersion.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isDownloadFloatTextureEnabled(webGLVersion: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDownloadFloatTextureEnabled")(webGLVersion.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isReshapeFree(shape1: js.Array[Double], shape2: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReshapeFree")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isWebGLFenceEnabled(webGLVersion: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebGLFenceEnabled")(webGLVersion.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isWebGLVersionEnabled_1(webGLVersion: `1`): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebGLVersionEnabled")(webGLVersion.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isWebGLVersionEnabled_2(webGLVersion: `2`): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebGLVersionEnabled")(webGLVersion.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def linkProgram(gl: WebGLRenderingContext, program: WebGLProgram): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linkProgram")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def resetMaxTextureSize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetMaxTextureSize")().asInstanceOf[Unit]
    
    inline def resetMaxTexturesInShader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetMaxTexturesInShader")().asInstanceOf[Unit]
    
    inline def unbindColorTextureFromFramebuffer(gl: WebGLRenderingContext, framebuffer: WebGLFramebuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unbindColorTextureFromFramebuffer")(gl.asInstanceOf[js.Any], framebuffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def unbindTextureUnit(gl: WebGLRenderingContext, textureUnit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unbindTextureUnit")(gl.asInstanceOf[js.Any], textureUnit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def validateFramebuffer(gl: WebGLRenderingContext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateFramebuffer")(gl.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def validateProgram(gl: WebGLRenderingContext, program: WebGLProgram): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateProgram")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def validateTextureSize(width: Double, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateTextureSize")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
