package typings.wonderJs

import typings.wonderJs.arrayBufferMod.ArrayBuffer
import typings.wonderJs.evariabletypeMod.EVariableType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferUtilsMod {
  
  @JSImport("wonder.js/dist/es2015/utils/BufferUtils", "BufferUtils")
  @js.native
  class BufferUtils () extends StObject
  /* static members */
  object BufferUtils {
    
    @JSImport("wonder.js/dist/es2015/utils/BufferUtils", "BufferUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convertArrayToArrayBuffer(`type`: EVariableType, value: js.Array[js.Any]): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("convertArrayToArrayBuffer")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
  }
}
