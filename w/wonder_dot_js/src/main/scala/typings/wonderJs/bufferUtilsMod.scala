package typings.wonderJs

import typings.wonderJs.arrayBufferMod.ArrayBuffer
import typings.wonderJs.evariabletypeMod.EVariableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/utils/BufferUtils", JSImport.Namespace)
@js.native
object bufferUtilsMod extends js.Object {
  @js.native
  class BufferUtils () extends js.Object
  
  /* static members */
  @js.native
  object BufferUtils extends js.Object {
    def convertArrayToArrayBuffer(`type`: EVariableType, value: js.Array[_]): ArrayBuffer = js.native
  }
  
}

