package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/gpgpu_context", "GPGPUContext")
@js.native
class GPGPUContext () extends js.Object {
  def this(gl: stdLib.WebGLRenderingContext) = this()
  var addItemToPoll: js.Any = js.native
  var bindTextureToFrameBuffer: js.Any = js.native
  var createFence: js.Any = js.native
  val debug: js.Any = js.native
  var disjoint: js.Any = js.native
  var disjointQueryTimerExtension: atTensorflowTfjsDashCoreLib.distBackendsWebglWebglUnderscoreTypesMod.WebGL2DisjointQueryTimerExtension | atTensorflowTfjsDashCoreLib.distBackendsWebglWebglUnderscoreTypesMod.WebGL1DisjointQueryTimerExtension = js.native
  var disposed: js.Any = js.native
  var downloadMatrixDriver: js.Any = js.native
  var framebuffer: stdLib.WebGLFramebuffer = js.native
  var getQueryTime: js.Any = js.native
  var getQueryTimerExtension: js.Any = js.native
  var getQueryTimerExtensionWebGL1: js.Any = js.native
  var getQueryTimerExtensionWebGL2: js.Any = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var indexBuffer: stdLib.WebGLBuffer = js.native
  var isQueryAvailable: js.Any = js.native
  var itemsToPoll: js.Any = js.native
  var outputTexture: stdLib.WebGLTexture | scala.Null = js.native
  var program: stdLib.WebGLProgram | scala.Null = js.native
  var setOutputMatrixTextureDriver: js.Any = js.native
  var setOutputMatrixWriteRegionDriver: js.Any = js.native
  var textureConfig: js.Any = js.native
  var throwIfDisposed: js.Any = js.native
  var throwIfNoProgram: js.Any = js.native
  var unbindTextureToFrameBuffer: js.Any = js.native
  var vertexAttrsAreBound: js.Any = js.native
  var vertexBuffer: stdLib.WebGLBuffer = js.native
  def beginQuery(): webgl2Lib.WebGLQuery = js.native
  def blockUntilAllProgramsCompleted(): scala.Unit = js.native
  def createAndWaitForFence(): js.Promise[scala.Unit] = js.native
  def createBufferFromTexture(texture: stdLib.WebGLTexture, rows: scala.Double, columns: scala.Double): stdLib.WebGLBuffer = js.native
  def createFloat16MatrixTexture(rows: scala.Double, columns: scala.Double): stdLib.WebGLTexture = js.native
  def createFloat16PackedMatrixTexture(rows: scala.Double, columns: scala.Double): stdLib.WebGLTexture = js.native
  def createFloat32MatrixTexture(rows: scala.Double, columns: scala.Double): stdLib.WebGLTexture = js.native
  def createPackedMatrixTexture(rows: scala.Double, columns: scala.Double): stdLib.WebGLTexture = js.native
  def createProgram(fragmentShaderSource: java.lang.String): stdLib.WebGLProgram = js.native
  def createUnsignedBytesMatrixTexture(rows: scala.Double, columns: scala.Double): stdLib.WebGLTexture = js.native
  def debugValidate(): scala.Unit = js.native
  def deleteMatrixTexture(texture: stdLib.WebGLTexture): scala.Unit = js.native
  def deleteProgram(program: stdLib.WebGLProgram): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def downloadByteEncodedFloatMatrixFromOutputTexture(texture: stdLib.WebGLTexture, rows: scala.Double, columns: scala.Double): stdLib.Float32Array = js.native
  def downloadFloat32MatrixFromBuffer(buffer: stdLib.WebGLBuffer, size: scala.Double): stdLib.Float32Array = js.native
  def downloadMatrixFromPackedTexture(texture: stdLib.WebGLTexture, physicalRows: scala.Double, physicalCols: scala.Double): stdLib.Float32Array = js.native
  def downloadPackedMatrixFromBuffer(
    buffer: stdLib.WebGLBuffer,
    batch: scala.Double,
    rows: scala.Double,
    columns: scala.Double,
    physicalRows: scala.Double,
    physicalCols: scala.Double
  ): stdLib.Float32Array = js.native
  def endQuery(): scala.Unit = js.native
  def executeProgram(): scala.Unit = js.native
  def getAttributeLocation(program: stdLib.WebGLProgram, attribute: java.lang.String): scala.Double = js.native
  def getUniformLocation(program: stdLib.WebGLProgram, uniformName: java.lang.String): stdLib.WebGLUniformLocation = js.native
  def getUniformLocation(program: stdLib.WebGLProgram, uniformName: java.lang.String, shouldThrow: scala.Boolean): stdLib.WebGLUniformLocation = js.native
  def getUniformLocationNoThrow(program: stdLib.WebGLProgram, uniformName: java.lang.String): stdLib.WebGLUniformLocation = js.native
  def pollFence(fenceContext: FenceContext): js.Promise[scala.Unit] = js.native
  def pollItems(): scala.Unit = js.native
  def setInputMatrixTexture(
    inputMatrixTexture: stdLib.WebGLTexture,
    uniformLocation: stdLib.WebGLUniformLocation,
    textureUnit: scala.Double
  ): scala.Unit = js.native
  def setOutputMatrixTexture(outputMatrixTexture: stdLib.WebGLTexture, rows: scala.Double, columns: scala.Double): scala.Unit = js.native
  def setOutputMatrixWriteRegion(startRow: scala.Double, numRows: scala.Double, startColumn: scala.Double, numColumns: scala.Double): scala.Unit = js.native
  def setOutputPackedMatrixTexture(outputPackedMatrixTexture: stdLib.WebGLTexture, rows: scala.Double, columns: scala.Double): scala.Unit = js.native
  def setOutputPackedMatrixWriteRegion(startRow: scala.Double, numRows: scala.Double, startColumn: scala.Double, numColumns: scala.Double): scala.Unit = js.native
  def setProgram(): scala.Unit = js.native
  def setProgram(program: stdLib.WebGLProgram): scala.Unit = js.native
  def uploadDenseMatrixToTexture(
    texture: stdLib.WebGLTexture,
    width: scala.Double,
    height: scala.Double,
    data: atTensorflowTfjsDashCoreLib.distTypesMod.TypedArray
  ): scala.Unit = js.native
  def uploadPixelDataToTexture(texture: stdLib.WebGLTexture, pixels: atTensorflowTfjsDashCoreLib.distTypesMod.PixelData): scala.Unit = js.native
  def uploadPixelDataToTexture(texture: stdLib.WebGLTexture, pixels: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def uploadPixelDataToTexture(texture: stdLib.WebGLTexture, pixels: stdLib.HTMLImageElement): scala.Unit = js.native
  def uploadPixelDataToTexture(texture: stdLib.WebGLTexture, pixels: stdLib.ImageData): scala.Unit = js.native
  def waitForQueryAndGetTime(query: webgl2Lib.WebGLQuery): js.Promise[scala.Double] = js.native
}

