package typings
package vscodeDashLanguageclientLib.libDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationMiddleware extends js.Object {
  var provideDeclaration: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDeclarationSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.Declaration]
    ]
  ] = js.undefined
}

object DeclarationMiddleware {
  @scala.inline
  def apply(
    provideDeclaration: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDeclarationSignature, 
      vscodeLib.vscodeMod.ProviderResult[vscodeLib.vscodeMod.Declaration]
    ] = null
  ): DeclarationMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideDeclaration != null) __obj.updateDynamic("provideDeclaration")(provideDeclaration)
    __obj.asInstanceOf[DeclarationMiddleware]
  }
}

