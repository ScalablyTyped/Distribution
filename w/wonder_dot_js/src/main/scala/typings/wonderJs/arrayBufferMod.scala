package typings.wonderJs

import typings.std.Float32Array
import typings.wonderJs.commonBufferMod.CommonBuffer
import typings.wonderJs.ebuffertypeMod.EBufferType
import typings.wonderJs.ebufferusageMod.EBufferUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayBufferMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/buffer/ArrayBuffer", "ArrayBuffer")
  @js.native
  class ArrayBuffer () extends CommonBuffer {
    
    @JSName("data")
    var data_ArrayBuffer: Float32Array = js.native
    
    def initWhenCreate(data: js.Array[Double], size: Double, `type`: EBufferType, usage: EBufferUsage): js.Any = js.native
    
    def resetData(data: js.Array[Double]): this.type = js.native
    def resetData(data: js.Array[Double], size: Double): this.type = js.native
    def resetData(data: js.Array[Double], size: Double, `type`: Unit, offset: Double): this.type = js.native
    def resetData(data: js.Array[Double], size: Double, `type`: EBufferType): this.type = js.native
    def resetData(data: js.Array[Double], size: Double, `type`: EBufferType, offset: Double): this.type = js.native
    def resetData(data: js.Array[Double], size: Unit, `type`: Unit, offset: Double): this.type = js.native
    def resetData(data: js.Array[Double], size: Unit, `type`: EBufferType): this.type = js.native
    def resetData(data: js.Array[Double], size: Unit, `type`: EBufferType, offset: Double): this.type = js.native
    
    var size: Double = js.native
  }
  /* static members */
  object ArrayBuffer {
    
    @JSImport("wonder.js/dist/es2015/renderer/buffer/ArrayBuffer", "ArrayBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(data: js.Array[Double], size: Double): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
    inline def create(data: js.Array[Double], size: Double, `type`: Unit, usage: EBufferUsage): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
    inline def create(data: js.Array[Double], size: Double, `type`: EBufferType): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
    inline def create(data: js.Array[Double], size: Double, `type`: EBufferType, usage: EBufferUsage): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
  }
}
