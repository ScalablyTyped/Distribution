package typings.vscodeJsonrpc.libCommonMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("vscode-jsonrpc/lib/common/messages", "AbstractMessageSignature")
@js.native
open class AbstractMessageSignature protected ()
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
