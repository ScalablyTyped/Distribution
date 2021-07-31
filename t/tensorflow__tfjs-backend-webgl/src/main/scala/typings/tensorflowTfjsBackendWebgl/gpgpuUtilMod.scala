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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gpgpuUtilMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bindVertexProgramAttributeStreams(gl: WebGLRenderingContext, program: WebGLProgram, vertexBuffer: WebGLBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bindVertexProgramAttributeStreams")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any], vertexBuffer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def createBufferFromOutputTexture(gl2: WebGL2RenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("createBufferFromOutputTexture")(gl2.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[WebGLBuffer]
  
  @scala.inline
  def createFloat16MatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("createFloat16MatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[WebGLTexture]
  
  @scala.inline
  def createFloat16PackedMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("createFloat16PackedMatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[WebGLTexture]
  
  @scala.inline
  def createFloat32MatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("createFloat32MatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[WebGLTexture]
  
  @scala.inline
  def createIndexBuffer(gl: WebGLRenderingContext): WebGLBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createIndexBuffer")(gl.asInstanceOf[js.Any]).asInstanceOf[WebGLBuffer]
  
  @scala.inline
  def createPackedMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackedMatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[WebGLTexture]
  
  @scala.inline
  def createUnsignedBytesMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnsignedBytesMatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[WebGLTexture]
  
  @scala.inline
  def createVertexBuffer(gl: WebGLRenderingContext): WebGLBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createVertexBuffer")(gl.asInstanceOf[js.Any]).asInstanceOf[WebGLBuffer]
  
  @scala.inline
  def createVertexShader(gl: WebGLRenderingContext): WebGLShader = ^.asInstanceOf[js.Dynamic].applyDynamic("createVertexShader")(gl.asInstanceOf[js.Any]).asInstanceOf[WebGLShader]
  
  @scala.inline
  def downloadByteEncodedFloatMatrixFromOutputTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadByteEncodedFloatMatrixFromOutputTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  @scala.inline
  def downloadFloat32MatrixFromBuffer(gl: WebGLRenderingContext, buffer: WebGLBuffer, size: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadFloat32MatrixFromBuffer")(gl.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  @scala.inline
  def downloadMatrixFromPackedOutputTexture(gl: WebGLRenderingContext, physicalRows: Double, physicalCols: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadMatrixFromPackedOutputTexture")(gl.asInstanceOf[js.Any], physicalRows.asInstanceOf[js.Any], physicalCols.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  @scala.inline
  def downloadPackedMatrixFromBuffer(
    gl: WebGLRenderingContext,
    buffer: WebGLBuffer,
    batch: Double,
    rows: Double,
    cols: Double,
    physicalRows: Double,
    physicalCols: Double,
    textureConfig: TextureConfig
  ): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadPackedMatrixFromBuffer")(gl.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], batch.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], physicalRows.asInstanceOf[js.Any], physicalCols.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  @scala.inline
  def getInternalFormatForFloat16MatrixTexture(textureConfig: TextureConfig): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternalFormatForFloat16MatrixTexture")(textureConfig.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getInternalFormatForFloat16PackedMatrixTexture(textureConfig: TextureConfig): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternalFormatForFloat16PackedMatrixTexture")(textureConfig.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getInternalFormatForFloat32MatrixTexture(textureConfig: TextureConfig): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternalFormatForFloat32MatrixTexture")(textureConfig.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getInternalFormatForPackedMatrixTexture(textureConfig: TextureConfig): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternalFormatForPackedMatrixTexture")(textureConfig.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getInternalFormatForUnsignedBytesMatrixTexture(textureConfig: TextureConfig): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternalFormatForUnsignedBytesMatrixTexture")(textureConfig.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def uploadDenseMatrixToTexture(
    gl: WebGLRenderingContext,
    texture: WebGLTexture,
    width: Double,
    height: Double,
    data: TypedArray,
    textureConfig: TextureConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadDenseMatrixToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: HTMLCanvasElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadPixelDataToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: HTMLImageElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadPixelDataToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: HTMLVideoElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadPixelDataToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: ImageData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadPixelDataToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: PixelData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadPixelDataToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
