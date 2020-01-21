package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.InvocationTypeArgumentInferenceContext")
@js.native
class InvocationTypeArgumentInferenceContext protected () extends TypeArgumentInferenceContext {
  def this(
    resolver: PullTypeResolver,
    context: PullTypeResolutionContext,
    signatureBeingInferred: PullSignatureSymbol,
    argumentASTs: ISeparatedSyntaxList2
  ) = this()
  var argumentASTs: ISeparatedSyntaxList2 = js.native
}

