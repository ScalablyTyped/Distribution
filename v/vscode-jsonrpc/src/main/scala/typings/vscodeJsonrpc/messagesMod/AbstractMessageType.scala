package typings.vscodeJsonrpc.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/messages", "AbstractMessageType")
@js.native
abstract class AbstractMessageType protected ()
  extends StObject
     with MessageType {
  def this(_method: String, _numberOfParams: Double) = this()
  
  var _method: js.Any = js.native
  
  var _numberOfParams: js.Any = js.native
  
  /* CompleteClass */
  override val method: String = js.native
  @JSName("method")
  def method_MAbstractMessageType: String = js.native
  
  /* CompleteClass */
  override val numberOfParams: Double = js.native
  @JSName("numberOfParams")
  def numberOfParams_MAbstractMessageType: Double = js.native
}
