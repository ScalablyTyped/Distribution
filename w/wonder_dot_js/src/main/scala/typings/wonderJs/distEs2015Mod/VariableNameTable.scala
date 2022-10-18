package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "VariableNameTable")
@js.native
open class VariableNameTable ()
  extends typings.wonderJs.distEs2015RendererShaderVariableVariableNameTableMod.VariableNameTable
/* static members */
object VariableNameTable {
  
  @JSImport("wonder.js/dist/es2015", "VariableNameTable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVariableName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVariableName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
