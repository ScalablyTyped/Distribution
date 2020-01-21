package typings.vscodeLanguageclient.typeDefinitionMod

import typings.vscode.mod.Definition
import typings.vscode.mod.DefinitionLink
import typings.vscode.mod.Position
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.TextDocument
import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinitionMiddleware extends js.Object {
  var provideTypeDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideTypeDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ]
  ] = js.undefined
}

object TypeDefinitionMiddleware {
  @scala.inline
  def apply(
    provideTypeDefinition: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      /* next */ ProvideTypeDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ] = null
  ): TypeDefinitionMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideTypeDefinition != null) __obj.updateDynamic("provideTypeDefinition")(provideTypeDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionMiddleware]
  }
}

