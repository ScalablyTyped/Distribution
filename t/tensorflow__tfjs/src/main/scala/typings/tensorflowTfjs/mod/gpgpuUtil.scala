package typings.tensorflowTfjs.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.std.WebGL2RenderingContext
import typings.std.WebGLBuffer
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLShader
import typings.std.WebGLTexture
import typings.tensorflowTfjsBackendWebgl.distTexUtilMod.Texture
import typings.tensorflowTfjsBackendWebgl.distTexUtilMod.TextureConfig
import typings.tensorflowTfjsCore.distTypesMod.PixelData
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gpgpuUtil {
  
  @JSImport("@tensorflow/tfjs", "gpgpu_util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindVertexProgramAttributeStreams(gl: WebGLRenderingContext, program: WebGLProgram, vertexBuffer: WebGLBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bindVertexProgramAttributeStreams")(gl.asInstanceOf[js.Any], program.asInstanceOf[js.Any], vertexBuffer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createBufferFromOutputTexture(gl2: WebGL2RenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): WebGLBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("createBufferFromOutputTexture")(gl2.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[WebGLBuffer]
  
  inline def createFloat16MatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("createFloat16MatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[Texture]
  
  inline def createFloat16PackedMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("createFloat16PackedMatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[Texture]
  
  inline def createFloat32MatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("createFloat32MatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[Texture]
  
  inline def createIndexBuffer(gl: WebGLRenderingContext): WebGLBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createIndexBuffer")(gl.asInstanceOf[js.Any]).asInstanceOf[WebGLBuffer]
  
  inline def createPackedMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackedMatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[Texture]
  
  inline def createUnsignedBytesMatrixTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnsignedBytesMatrixTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[Texture]
  
  inline def createVertexBuffer(gl: WebGLRenderingContext): WebGLBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createVertexBuffer")(gl.asInstanceOf[js.Any]).asInstanceOf[WebGLBuffer]
  
  inline def createVertexShader(gl: WebGLRenderingContext): WebGLShader = ^.asInstanceOf[js.Dynamic].applyDynamic("createVertexShader")(gl.asInstanceOf[js.Any]).asInstanceOf[WebGLShader]
  
  inline def downloadByteEncodedFloatMatrixFromOutputTexture(gl: WebGLRenderingContext, rows: Double, columns: Double, textureConfig: TextureConfig): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadByteEncodedFloatMatrixFromOutputTexture")(gl.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  inline def downloadFloat32MatrixFromBuffer(gl: WebGLRenderingContext, buffer: WebGLBuffer, size: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadFloat32MatrixFromBuffer")(gl.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  inline def downloadMatrixFromPackedOutputTexture(gl: WebGLRenderingContext, physicalRows: Double, physicalCols: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadMatrixFromPackedOutputTexture")(gl.asInstanceOf[js.Any], physicalRows.asInstanceOf[js.Any], physicalCols.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  inline def downloadPackedMatrixFromBuffer(
    gl: WebGLRenderingContext,
    buffer: WebGLBuffer,
    batch: Double,
    rows: Double,
    cols: Double,
    physicalRows: Double,
    physicalCols: Double,
    textureConfig: TextureConfig
  ): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadPackedMatrixFromBuffer")(gl.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], batch.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], physicalRows.asInstanceOf[js.Any], physicalCols.asInstanceOf[js.Any], textureConfig.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
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
  inline def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: ImageBitmap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadPixelDataToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: ImageData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadPixelDataToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def uploadPixelDataToTexture(gl: WebGLRenderingContext, texture: WebGLTexture, pixels: PixelData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadPixelDataToTexture")(gl.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
