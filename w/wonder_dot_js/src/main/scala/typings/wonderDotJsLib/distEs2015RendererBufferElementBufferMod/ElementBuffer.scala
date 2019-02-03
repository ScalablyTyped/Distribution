package typings
package wonderDotJsLib.distEs2015RendererBufferElementBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/ElementBuffer", "ElementBuffer")
@js.native
class ElementBuffer ()
  extends wonderDotJsLib.distEs2015RendererBufferCommonBufferMod.CommonBuffer {
  @JSName("data")
  var data_ElementBuffer: stdLib.Uint16Array | stdLib.Uint32Array = js.native
  val typeSize: scala.Double = js.native
  def initWhenCreate(
    data: js.Array[scala.Double],
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType,
    usage: wonderDotJsLib.distEs2015RendererBufferEBufferUsageMod.EBufferUsage
  ): js.Any = js.native
  def resetData(data: js.Array[scala.Double]): this.type = js.native
  def resetData(
    data: js.Array[scala.Double],
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType
  ): this.type = js.native
  def resetData(
    data: js.Array[scala.Double],
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType,
    offset: scala.Double
  ): this.type = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/renderer/buffer/ElementBuffer", "ElementBuffer")
@js.native
object ElementBuffer extends js.Object {
  def create(data: js.Array[scala.Double]): wonderDotJsLib.distEs2015RendererBufferElementBufferMod.ElementBuffer = js.native
  def create(
    data: js.Array[scala.Double],
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType
  ): wonderDotJsLib.distEs2015RendererBufferElementBufferMod.ElementBuffer = js.native
  def create(
    data: js.Array[scala.Double],
    `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType,
    usage: wonderDotJsLib.distEs2015RendererBufferEBufferUsageMod.EBufferUsage
  ): wonderDotJsLib.distEs2015RendererBufferElementBufferMod.ElementBuffer = js.native
}

