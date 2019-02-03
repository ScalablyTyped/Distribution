package typings
package wonderDotJsLib.distEs2015RendererBufferArrayBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/ArrayBuffer", "ArrayBuffer")
@js.native
class ArrayBuffer ()
  extends wonderDotJsLib.distEs2015RendererBufferCommonBufferMod.CommonBuffer {
  @JSName("data")
  var data_ArrayBuffer: stdLib.Float32Array = js.native
  var size: scala.Double = js.native
  def initWhenCreate(
    data: js.Array[scala.Double],
    size: scala.Double,
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType,
    usage: wonderDotJsLib.distEs2015RendererBufferEBufferUsageMod.EBufferUsage
  ): js.Any = js.native
  def resetData(data: js.Array[scala.Double]): this.type = js.native
  def resetData(data: js.Array[scala.Double], size: scala.Double): this.type = js.native
  def resetData(
    data: js.Array[scala.Double],
    size: scala.Double,
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType
  ): this.type = js.native
  def resetData(
    data: js.Array[scala.Double],
    size: scala.Double,
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType,
    offset: scala.Double
  ): this.type = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/renderer/buffer/ArrayBuffer", "ArrayBuffer")
@js.native
object ArrayBuffer extends js.Object {
  def create(data: js.Array[scala.Double], size: scala.Double): wonderDotJsLib.distEs2015RendererBufferArrayBufferMod.ArrayBuffer = js.native
  def create(
    data: js.Array[scala.Double],
    size: scala.Double,
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType
  ): wonderDotJsLib.distEs2015RendererBufferArrayBufferMod.ArrayBuffer = js.native
  def create(
    data: js.Array[scala.Double],
    size: scala.Double,
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType,
    usage: wonderDotJsLib.distEs2015RendererBufferEBufferUsageMod.EBufferUsage
  ): wonderDotJsLib.distEs2015RendererBufferArrayBufferMod.ArrayBuffer = js.native
}

