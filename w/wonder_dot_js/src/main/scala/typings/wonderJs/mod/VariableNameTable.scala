package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "VariableNameTable")
@js.native
class VariableNameTable ()
  extends typings.wonderJs.variableNameTableMod.VariableNameTable
/* static members */
object VariableNameTable {
  
  @JSImport("wonder.js/dist/es2015", "VariableNameTable")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getVariableName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVariableName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
