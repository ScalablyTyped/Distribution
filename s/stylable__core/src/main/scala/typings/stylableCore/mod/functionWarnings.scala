package typings.stylableCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "functionWarnings")
@js.native
object functionWarnings extends js.Object {
  
  def CANNOT_FIND_IMPORTED_VAR(varName: String): String = js.native
  
  def CANNOT_USE_AS_VALUE(`type`: String, varName: String): String = js.native
  
  def CANNOT_USE_JS_AS_VALUE(varName: String): String = js.native
  
  def COULD_NOT_RESOLVE_VALUE(args: String): String = js.native
  
  def CYCLIC_VALUE(cyclicChain: js.Array[String]): String = js.native
  
  def FAIL_TO_EXECUTE_FORMATTER(resolvedValue: String, message: String): String = js.native
  
  def MULTI_ARGS_IN_VALUE(args: String): String = js.native
  
  def UNKNOWN_FORMATTER(name: String): String = js.native
  
  def UNKNOWN_VAR(name: String): String = js.native
}
