package typings.vscodeDashLanguageclient.libTypeDefinitionMod

import typings.vscode.vscodeMod.Definition
import typings.vscode.vscodeMod.DefinitionLink
import typings.vscode.vscodeMod.Position
import typings.vscode.vscodeMod.ProviderResult
import typings.vscode.vscodeMod.TextDocument
import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
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
    if (provideTypeDefinition != null) __obj.updateDynamic("provideTypeDefinition")(provideTypeDefinition)
    __obj.asInstanceOf[TypeDefinitionMiddleware]
  }
}

