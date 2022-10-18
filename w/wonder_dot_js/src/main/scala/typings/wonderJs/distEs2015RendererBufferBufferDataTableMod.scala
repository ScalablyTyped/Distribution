package typings.wonderJs

import typings.wonderJs.distEs2015RendererBufferEbufferdatatypeMod.EBufferDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererBufferBufferDataTableMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/buffer/BufferDataTable", "BufferDataTable")
  @js.native
  open class BufferDataTable () extends StObject
  /* static members */
  object BufferDataTable {
    
    @JSImport("wonder.js/dist/es2015/renderer/buffer/BufferDataTable", "BufferDataTable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getGeometryDataName(`type`: EBufferDataType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeometryDataName")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
