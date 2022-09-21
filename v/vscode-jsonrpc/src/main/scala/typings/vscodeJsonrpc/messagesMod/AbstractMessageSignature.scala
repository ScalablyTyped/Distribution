package typings.vscodeJsonrpc.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/common/messages", "AbstractMessageSignature")
@js.native
abstract class AbstractMessageSignature protected ()
  extends StObject
     with MessageSignature {
  def this(method: String, numberOfParams: Double) = this()
  
  /* CompleteClass */
  override val method: String = js.native
  
  /* CompleteClass */
  override val numberOfParams: Double = js.native
  
  /* CompleteClass */
  override val parameterStructures: ParameterStructures = js.native
  @JSName("parameterStructures")
  def parameterStructures_MAbstractMessageSignature: ParameterStructures = js.native
}
