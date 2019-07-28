package typings.wonderDotJs.distEs2015RendererBufferElementBufferMod

import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.wonderDotJs.distEs2015RendererBufferCommonBufferMod.CommonBuffer
import typings.wonderDotJs.distEs2015RendererBufferEBufferTypeMod.EBufferType
import typings.wonderDotJs.distEs2015RendererBufferEBufferUsageMod.EBufferUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/ElementBuffer", "ElementBuffer")
@js.native
class ElementBuffer () extends CommonBuffer {
  @JSName("data")
  var data_ElementBuffer: Uint16Array | Uint32Array = js.native
  val typeSize: Double = js.native
  def initWhenCreate(data: js.Array[Double], `type`: EBufferType, usage: EBufferUsage): js.Any = js.native
  def resetData(data: js.Array[Double]): this.type = js.native
  def resetData(data: js.Array[Double], `type`: EBufferType): this.type = js.native
  def resetData(data: js.Array[Double], `type`: EBufferType, offset: Double): this.type = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/renderer/buffer/ElementBuffer", "ElementBuffer")
@js.native
object ElementBuffer extends js.Object {
  def create(data: js.Array[Double]): ElementBuffer = js.native
  def create(data: js.Array[Double], `type`: EBufferType): ElementBuffer = js.native
  def create(data: js.Array[Double], `type`: EBufferType, usage: EBufferUsage): ElementBuffer = js.native
}

