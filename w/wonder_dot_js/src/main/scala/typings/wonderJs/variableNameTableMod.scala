package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object variableNameTableMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/variable/VariableNameTable", "VariableNameTable")
  @js.native
  open class VariableNameTable () extends StObject
  /* static members */
  object VariableNameTable {
    
    @JSImport("wonder.js/dist/es2015/renderer/shader/variable/VariableNameTable", "VariableNameTable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getVariableName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVariableName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
