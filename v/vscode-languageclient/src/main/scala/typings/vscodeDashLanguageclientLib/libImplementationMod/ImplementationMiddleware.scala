package typings
package vscodeDashLanguageclientLib.libImplementationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementationMiddleware extends js.Object {
  var provideImplementation: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideImplementationSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.Definition | js.Array[vscodeLib.vscodeMod.DefinitionLink]]
    ]
  ] = js.undefined
}

object ImplementationMiddleware {
  @scala.inline
  def apply(
    provideImplementation: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideImplementationSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.Definition | js.Array[vscodeLib.vscodeMod.DefinitionLink]]
    ] = null
  ): ImplementationMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideImplementation != null) __obj.updateDynamic("provideImplementation")(provideImplementation)
    __obj.asInstanceOf[ImplementationMiddleware]
  }
}

