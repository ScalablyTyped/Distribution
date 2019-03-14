package typings
package vscodeDashLanguageclientLib.libTypeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinitionMiddleware extends js.Object {
  var provideTypeDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideTypeDefinitionSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        vscodeLib.vscodeMod.Definition | (js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDefinitionLink */ _
        ])
      ]
    ]
  ] = js.undefined
}

object TypeDefinitionMiddleware {
  @scala.inline
  def apply(
    provideTypeDefinition: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* position */ vscodeLib.vscodeMod.Position, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideTypeDefinitionSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        vscodeLib.vscodeMod.Definition | (js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDefinitionLink */ _
        ])
      ]
    ] = null
  ): TypeDefinitionMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideTypeDefinition != null) __obj.updateDynamic("provideTypeDefinition")(provideTypeDefinition)
    __obj.asInstanceOf[TypeDefinitionMiddleware]
  }
}

