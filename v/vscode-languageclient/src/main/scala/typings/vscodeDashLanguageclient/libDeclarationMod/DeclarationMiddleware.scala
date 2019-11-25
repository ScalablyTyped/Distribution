package typings.vscodeDashLanguageclient.libDeclarationMod

import typings.vscode.vscodeMod.Declaration
import typings.vscode.vscodeMod.Position
import typings.vscode.vscodeMod.ProviderResult
import typings.vscode.vscodeMod.TextDocument
import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationMiddleware extends js.Object {
  var provideDeclaration: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideDeclarationSignature, 
      ProviderResult[Declaration]
    ]
  ] = js.undefined
}

object DeclarationMiddleware {
  @scala.inline
  def apply(
    provideDeclaration: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideDeclarationSignature, 
      ProviderResult[Declaration]
    ] = null
  ): DeclarationMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideDeclaration != null) __obj.updateDynamic("provideDeclaration")(provideDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationMiddleware]
  }
}

