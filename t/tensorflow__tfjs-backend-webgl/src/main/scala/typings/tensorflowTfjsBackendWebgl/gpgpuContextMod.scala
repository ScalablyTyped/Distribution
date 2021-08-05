package typings.tensorflowTfjsBackendWebgl

import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import typings.std.WebGLBuffer
import typings.std.WebGLFramebuffer
import typings.std.WebGLProgram
import typings.std.WebGLQuery
import typings.std.WebGLRenderingContext
import typings.std.WebGLSync
import typings.std.WebGLTexture
import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureConfig
import typings.tensorflowTfjsBackendWebgl.webglTypesMod.WebGL1DisjointQueryTimerExtension
import typings.tensorflowTfjsBackendWebgl.webglTypesMod.WebGL2DisjointQueryTimerExtension
import typings.tensorflowTfjsCore.distTypesMod.PixelData
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gpgpuContextMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/gpgpu_context", "GPGPUContext")
  @js.native
  class GPGPUContext () extends StObject {
    def this(gl: WebGLRenderingContext) = this()
    
    /* private */ var addItemToPoll: js.Any = js.native
    
    def beginQuery(): WebGLQuery = js.native
    
    /* private */ var bindTextureToFrameBuffer: js.Any = js.native
    
    def blockUntilAllProgramsCompleted(): Unit = js.native
    
    def createAndWaitForFence(): js.Promise[Unit] = js.native
    
    def createBufferFromTexture(texture: WebGLTexture, rows: Double, columns: Double): WebGLBuffer = js.native
    
    /* private */ var createFence: js.Any = js.native
    
    def createFloat16MatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
    
    def createFloat16PackedMatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
    
    def createFloat32MatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
    
    def createPackedMatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
    
    def createProgram(fragmentShaderSource: String): WebGLProgram = js.native
    
    def createUnsignedBytesMatrixTexture(rows: Double, columns: Double): WebGLTexture = js.native
    
    /* private */ val debug: js.Any = js.native
    
    def debugValidate(): Unit = js.native
    
    def deleteMatrixTexture(texture: WebGLTexture): Unit = js.native
    
    def deleteProgram(program: WebGLProgram): Unit = js.native
    
    /* private */ var disjoint: js.Any = js.native
    
    var disjointQueryTimerExtension: WebGL2DisjointQueryTimerExtension | WebGL1DisjointQueryTimerExtension = js.native
    
    def dispose(): Unit = js.native
    
    /* private */ var disposed: js.Any = js.native
    
    def downloadByteEncodedFloatMatrixFromOutputTexture(texture: WebGLTexture, rows: Double, columns: Double): Float32Array = js.native
    
    def downloadFloat32MatrixFromBuffer(buffer: WebGLBuffer, size: Double): Float32Array = js.native
    
    /* private */ var downloadMatrixDriver: js.Any = js.native
    
    def downloadMatrixFromPackedTexture(texture: WebGLTexture, physicalRows: Double, physicalCols: Double): Float32Array = js.native
    
    def downloadPackedMatrixFromBuffer(
      buffer: WebGLBuffer,
      batch: Double,
      rows: Double,
      columns: Double,
      physicalRows: Double,
      physicalCols: Double
    ): Float32Array = js.native
    
    def endQuery(): Unit = js.native
    
    def executeProgram(): Unit = js.native
    
    var framebuffer: WebGLFramebuffer = js.native
    
    def getAttributeLocation(program: WebGLProgram, attribute: String): Double = js.native
    
    /* private */ var getQueryTime: js.Any = js.native
    
    /* private */ var getQueryTimerExtension: js.Any = js.native
    
    /* private */ var getQueryTimerExtensionWebGL1: js.Any = js.native
    
    /* private */ var getQueryTimerExtensionWebGL2: js.Any = js.native
    
    def getUniformLocation(program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
    def getUniformLocation(program: WebGLProgram, uniformName: String, shouldThrow: Boolean): WebGLUniformLocation = js.native
    
    def getUniformLocationNoThrow(program: WebGLProgram, uniformName: String): WebGLUniformLocation = js.native
    
    var gl: WebGLRenderingContext = js.native
    
    var indexBuffer: WebGLBuffer = js.native
    
    /* private */ var isQueryAvailable: js.Any = js.native
    
    /* private */ var itemsToPoll: js.Any = js.native
    
    var outputTexture: WebGLTexture | Null = js.native
    
    def pollFence(fenceContext: FenceContext): js.Promise[Unit] = js.native
    
    def pollItems(): Unit = js.native
    
    var program: WebGLProgram | Null = js.native
    
    def setInputMatrixTexture(inputMatrixTexture: WebGLTexture, uniformLocation: WebGLUniformLocation, textureUnit: Double): Unit = js.native
    
    def setOutputMatrixTexture(outputMatrixTexture: WebGLTexture, rows: Double, columns: Double): Unit = js.native
    
    /* private */ var setOutputMatrixTextureDriver: js.Any = js.native
    
    def setOutputMatrixWriteRegion(startRow: Double, numRows: Double, startColumn: Double, numColumns: Double): Unit = js.native
    
    /* private */ var setOutputMatrixWriteRegionDriver: js.Any = js.native
    
    def setOutputPackedMatrixTexture(outputPackedMatrixTexture: WebGLTexture, rows: Double, columns: Double): Unit = js.native
    
    def setOutputPackedMatrixWriteRegion(startRow: Double, numRows: Double, startColumn: Double, numColumns: Double): Unit = js.native
    
    def setProgram(): Unit = js.native
    def setProgram(program: WebGLProgram): Unit = js.native
    
    var textureConfig: TextureConfig = js.native
    
    /* private */ var throwIfDisposed: js.Any = js.native
    
    /* private */ var throwIfNoProgram: js.Any = js.native
    
    /* private */ var unbindTextureToFrameBuffer: js.Any = js.native
    
    def uploadDenseMatrixToTexture(texture: WebGLTexture, width: Double, height: Double, data: TypedArray): Unit = js.native
    
    def uploadPixelDataToTexture(texture: WebGLTexture, pixels: HTMLCanvasElement): Unit = js.native
    def uploadPixelDataToTexture(texture: WebGLTexture, pixels: HTMLImageElement): Unit = js.native
    def uploadPixelDataToTexture(texture: WebGLTexture, pixels: ImageData): Unit = js.native
    def uploadPixelDataToTexture(texture: WebGLTexture, pixels: PixelData): Unit = js.native
    
    /* private */ var vertexAttrsAreBound: js.Any = js.native
    
    var vertexBuffer: WebGLBuffer = js.native
    
    def waitForQueryAndGetTime(query: WebGLQuery): js.Promise[Double] = js.native
  }
  
  inline def linearSearchLastTrue(arr: js.Array[js.Function0[Boolean]]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("linearSearchLastTrue")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait FenceContext extends StObject {
    
    def isFencePassed(): Boolean
    
    var query: WebGLQuery | WebGLSync
  }
  object FenceContext {
    
    inline def apply(isFencePassed: () => Boolean, query: WebGLQuery | WebGLSync): FenceContext = {
      val __obj = js.Dynamic.literal(isFencePassed = js.Any.fromFunction0(isFencePassed), query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[FenceContext]
    }
    
    extension [Self <: FenceContext](x: Self) {
      
      inline def setIsFencePassed(value: () => Boolean): Self = StObject.set(x, "isFencePassed", js.Any.fromFunction0(value))
      
      inline def setQuery(value: WebGLQuery | WebGLSync): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
