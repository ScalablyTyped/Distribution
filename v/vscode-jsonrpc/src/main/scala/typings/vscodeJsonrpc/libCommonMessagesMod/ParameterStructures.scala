package typings.vscodeJsonrpc.libCommonMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/common/messages", "ParameterStructures")
@js.native
/* private */ open class ParameterStructures () extends StObject {
  
  /* private */ val kind: Any = js.native
}
/* static members */
object ParameterStructures {
  
  @JSImport("vscode-jsonrpc/lib/common/messages", "ParameterStructures")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The parameter structure is automatically inferred on the number of parameters
    * and the parameter type in case of a single param.
    */
  @JSImport("vscode-jsonrpc/lib/common/messages", "ParameterStructures.auto")
  @js.native
  val auto: ParameterStructures = js.native
  
  /**
    * Forces `byName` parameter structure. This is only useful when having a single
    * parameter. The library will report errors if used with a different number of
    * parameters.
    */
  @JSImport("vscode-jsonrpc/lib/common/messages", "ParameterStructures.byName")
  @js.native
  val byName: ParameterStructures = js.native
  
  /**
    * Forces `byPosition` parameter structure. This is useful if you have a single
    * parameter which has a literal type.
    */
  @JSImport("vscode-jsonrpc/lib/common/messages", "ParameterStructures.byPosition")
  @js.native
  val byPosition: ParameterStructures = js.native
  
  inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.ParameterStructures */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.ParameterStructures */ Boolean]
}
