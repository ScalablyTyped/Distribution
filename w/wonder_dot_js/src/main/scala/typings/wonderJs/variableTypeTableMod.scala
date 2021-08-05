package typings.wonderJs

import typings.wonderJs.evariabletypeMod.EVariableType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object variableTypeTableMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/variable/VariableTypeTable", "VariableTypeTable")
  @js.native
  class VariableTypeTable () extends StObject
  /* static members */
  object VariableTypeTable {
    
    @JSImport("wonder.js/dist/es2015/renderer/shader/variable/VariableTypeTable", "VariableTypeTable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getVariableType(`type`: EVariableType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVariableType")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
