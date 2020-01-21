package typings.wonderJs

import typings.std.Float32Array
import typings.wonderJs.commonBufferMod.CommonBuffer
import typings.wonderJs.ebuffertypeMod.EBufferType
import typings.wonderJs.ebufferusageMod.EBufferUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/ArrayBuffer", JSImport.Namespace)
@js.native
object arrayBufferMod extends js.Object {
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
  @js.native
  object ArrayBuffer extends js.Object {
    def create(data: js.Array[Double], size: Double): ArrayBuffer = js.native
    def create(data: js.Array[Double], size: Double, `type`: EBufferType): ArrayBuffer = js.native
    def create(data: js.Array[Double], size: Double, `type`: EBufferType, usage: EBufferUsage): ArrayBuffer = js.native
  }
  
}

