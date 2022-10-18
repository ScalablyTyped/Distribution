package typings.wonderJs

import typings.wonderJs.distEs2015RendererBufferCommonBufferMod.CommonBuffer
import typings.wonderJs.distEs2015RendererBufferEbuffertypeMod.EBufferType
import typings.wonderJs.distEs2015RendererBufferEbufferusageMod.EBufferUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererBufferArrayBufferMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/buffer/ArrayBuffer", "ArrayBuffer")
  @js.native
  open class ArrayBuffer () extends CommonBuffer {
    
    @JSName("data")
    var data_ArrayBuffer: js.typedarray.Float32Array = js.native
    
    def initWhenCreate(data: js.Array[Double], size: Double, `type`: EBufferType, usage: EBufferUsage): Any = js.native
    
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
