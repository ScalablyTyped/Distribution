package typings
package vscodeDashLanguageclientLib.libTypeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinitionMiddleware extends js.Object {
  var provideTypeDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify TextDocument */ /* document */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideTypeDefinitionSignature, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ProviderResult<VDefinition | Array<VDefinitionLink>> */ _
    ]
  ] = js.undefined
}

