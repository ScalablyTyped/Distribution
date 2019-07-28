package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ContextualSignatureInstantiationTypeArgumentInferenceContext")
@js.native
class ContextualSignatureInstantiationTypeArgumentInferenceContext protected () extends TypeArgumentInferenceContext {
  def this(
    resolver: PullTypeResolver,
    context: PullTypeResolutionContext,
    signatureBeingInferred: PullSignatureSymbol,
    contextualSignature: PullSignatureSymbol,
    shouldFixContextualSignatureParameterTypes: Boolean
  ) = this()
  var contextualSignature: js.Any = js.native
  var shouldFixContextualSignatureParameterTypes: js.Any = js.native
}

