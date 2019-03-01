package typings
package vscodeDashLanguageclientLib.libImplementationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementationMiddleware extends js.Object {
  var provideImplementation: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextDocument */ /* document */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideImplementationSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VDefinition | Array<VDefinitionLink>> */ _
    ]
  ] = js.undefined
}

object ImplementationMiddleware {
  @scala.inline
  def apply(
    provideImplementation: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextDocument */ /* document */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VPosition */ /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideImplementationSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<VDefinition | Array<VDefinitionLink>> */ _
    ] = null
  ): ImplementationMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideImplementation != null) __obj.updateDynamic("provideImplementation")(provideImplementation)
    __obj.asInstanceOf[ImplementationMiddleware]
  }
}

