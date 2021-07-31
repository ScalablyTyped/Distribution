package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "VariableTypeTable")
@js.native
class VariableTypeTable ()
  extends typings.wonderJs.variableTypeTableMod.VariableTypeTable
/* static members */
object VariableTypeTable {
  
  @JSImport("wonder.js/dist/es2015", "VariableTypeTable")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getVariableType(`type`: typings.wonderJs.evariabletypeMod.EVariableType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVariableType")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
}
