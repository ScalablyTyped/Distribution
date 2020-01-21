package typings.wonderJs

import typings.wonderJs.evariabletypeMod.EVariableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/variable/VariableTypeTable", JSImport.Namespace)
@js.native
object variableTypeTableMod extends js.Object {
  @js.native
  class VariableTypeTable () extends js.Object
  
  /* static members */
  @js.native
  object VariableTypeTable extends js.Object {
    def getVariableType(`type`: EVariableType): String = js.native
  }
  
}

