package typings.wonderDotJs.distEs2015RendererBufferArrayBufferMod

import typings.std.Float32Array
import typings.wonderDotJs.distEs2015RendererBufferCommonBufferMod.CommonBuffer
import typings.wonderDotJs.distEs2015RendererBufferEBufferTypeMod.EBufferType
import typings.wonderDotJs.distEs2015RendererBufferEBufferUsageMod.EBufferUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/ArrayBuffer", "ArrayBuffer")
@js.native
class ArrayBuffer () extends CommonBuffer {
  @JSName("data")
  var data_ArrayBuffer: Float32Array = js.native
  var size: Double = js.native
  def initWhenCreate(data: js.Array[Double], size: Double, `type`: EBufferType, usage: EBufferUsage): js.Any = js.native
  def resetData(data: js.Array[Double]): this.type = js.native
  def resetData(data: js.Array[Double], size: Double): this.type = js.native
  def resetData(data: js.Array[Double], size: Double, `type`: EBufferType): this.type = js.native
  def resetData(data: js.Array[Double], size: Double, `type`: EBufferType, offset: Double): this.type = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/renderer/buffer/ArrayBuffer", "ArrayBuffer")
@js.native
object ArrayBuffer extends js.Object {
  def create(data: js.Array[Double], size: Double): ArrayBuffer = js.native
  def create(data: js.Array[Double], size: Double, `type`: EBufferType): ArrayBuffer = js.native
  def create(data: js.Array[Double], size: Double, `type`: EBufferType, usage: EBufferUsage): ArrayBuffer = js.native
}

