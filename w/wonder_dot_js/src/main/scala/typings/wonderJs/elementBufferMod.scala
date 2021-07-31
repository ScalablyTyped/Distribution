package typings.wonderJs

import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.wonderJs.commonBufferMod.CommonBuffer
import typings.wonderJs.ebuffertypeMod.EBufferType
import typings.wonderJs.ebufferusageMod.EBufferUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementBufferMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/buffer/ElementBuffer", "ElementBuffer")
  @js.native
  class ElementBuffer () extends CommonBuffer {
    
    @JSName("data")
    var data_ElementBuffer: Uint16Array | Uint32Array = js.native
    
    def initWhenCreate(data: js.Array[Double], `type`: EBufferType, usage: EBufferUsage): js.Any = js.native
    
    def resetData(data: js.Array[Double]): this.type = js.native
    def resetData(data: js.Array[Double], `type`: Unit, offset: Double): this.type = js.native
    def resetData(data: js.Array[Double], `type`: EBufferType): this.type = js.native
    def resetData(data: js.Array[Double], `type`: EBufferType, offset: Double): this.type = js.native
    
    val typeSize: Double = js.native
  }
  /* static members */
  object ElementBuffer {
    
    @JSImport("wonder.js/dist/es2015/renderer/buffer/ElementBuffer", "ElementBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(data: js.Array[Double]): ElementBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any]).asInstanceOf[ElementBuffer]
    @scala.inline
    def create(data: js.Array[Double], `type`: Unit, usage: EBufferUsage): ElementBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[ElementBuffer]
    @scala.inline
    def create(data: js.Array[Double], `type`: EBufferType): ElementBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[ElementBuffer]
    @scala.inline
    def create(data: js.Array[Double], `type`: EBufferType, usage: EBufferUsage): ElementBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[ElementBuffer]
  }
}
