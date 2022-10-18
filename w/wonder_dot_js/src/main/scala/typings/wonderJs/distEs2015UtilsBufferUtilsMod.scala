package typings.wonderJs

import typings.wonderJs.distEs2015RendererBufferArrayBufferMod.ArrayBuffer
import typings.wonderJs.distEs2015RendererShaderVariableEvariabletypeMod.EVariableType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015UtilsBufferUtilsMod {
  
  @JSImport("wonder.js/dist/es2015/utils/BufferUtils", "BufferUtils")
  @js.native
  open class BufferUtils () extends StObject
  /* static members */
  object BufferUtils {
    
    @JSImport("wonder.js/dist/es2015/utils/BufferUtils", "BufferUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convertArrayToArrayBuffer(`type`: EVariableType, value: js.Array[Any]): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("convertArrayToArrayBuffer")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
  }
}
