package typings.tensorflowTfjsBackendWebgl

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
import typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureConfig
import typings.tensorflowTfjsCore.distTypesMod.PixelData
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gpgpuUtilMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "bindVertexProgramAttributeStreams")
  @js.native
  def bindVertexProgramAttributeStreams(gl: WebGLRenderingContext, program: WebGLProgram, vertexBuffer: WebGLBuffer): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "createBufferFromOutputTexture")
  @js.native
  def createBufferFromOutputTexture(gl2: WebGL2RenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLBuffer = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "createFloat16MatrixTexture")
  @js.native
  def createFloat16MatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "createFloat16PackedMatrixTexture")
  @js.native
  def createFloat16PackedMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "createFloat32MatrixTexture")
  @js.native
  def createFloat32MatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "createIndexBuffer")
  @js.native
  def createIndexBuffer(gl: WebGLRenderingContext): WebGLBuffer = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "createPackedMatrixTexture")
  @js.native
  def createPackedMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "createUnsignedBytesMatrixTexture")
  @js.native
  def createUnsignedBytesMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "createVertexBuffer")
  @js.native
  def createVertexBuffer(gl: WebGLRenderingContext): WebGLBuffer = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "createVertexShader")
  @js.native
  def createVertexShader(gl: WebGLRenderingContext): WebGLShader = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "downloadByteEncodedFloatMatrixFromOutputTexture")
  @js.native
  def downloadByteEncodedFloatMatrixFromOutputTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): Float32Array = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "downloadFloat32MatrixFromBuffer")
  @js.native
  def downloadFloat32MatrixFromBuffer(gl: WebGLRenderingContext, buffer: WebGLBuffer, size: Double): Float32Array = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "downloadMatrixFromPackedOutputTexture")
  @js.native
  def downloadMatrixFromPackedOutputTexture(gl: WebGLRenderingContext, physicalRows: Double, physicalCols: Double): Float32Array = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "downloadPackedMatrixFromBuffer")
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
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "getInternalFormatForFloat16MatrixTexture")
  @js.native
  def getInternalFormatForFloat16MatrixTexture(textureConfig: TextureConfig): Double = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "getInternalFormatForFloat16PackedMatrixTexture")
  @js.native
  def getInternalFormatForFloat16PackedMatrixTexture(textureConfig: TextureConfig): Double = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "getInternalFormatForFloat32MatrixTexture")
  @js.native
  def getInternalFormatForFloat32MatrixTexture(textureConfig: TextureConfig): Double = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "getInternalFormatForPackedMatrixTexture")
  @js.native
  def getInternalFormatForPackedMatrixTexture(textureConfig: TextureConfig): Double = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "getInternalFormatForUnsignedBytesMatrixTexture")
  @js.native
  def getInternalFormatForUnsignedBytesMatrixTexture(textureConfig: TextureConfig): Double = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "uploadDenseMatrixToTexture")
  @js.native
  def uploadDenseMatrixToTexture(
    gl: WebGLRenderingContext,
    texture: WebGLTexture,
    width: Double,
    height: Double,
    data: TypedArray,
    textureConfig: TextureConfig
  ): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "uploadPixelDataToTexture")
  @js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: HTMLCanvasElement): Unit = js.native
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "uploadPixelDataToTexture")
  @js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: HTMLImageElement): Unit = js.native
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "uploadPixelDataToTexture")
  @js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: HTMLVideoElement): Unit = js.native
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "uploadPixelDataToTexture")
  @js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: ImageData): Unit = js.native
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", "uploadPixelDataToTexture")
  @js.native
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: PixelData): Unit = js.native
}
