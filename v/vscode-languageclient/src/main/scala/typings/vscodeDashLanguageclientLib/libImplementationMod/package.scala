package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libImplementationMod {
  type ProvideImplementationSignature = js.Function3[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify TextDocument */ /* document */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify VPosition */ /* position */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ProviderResult<VDefinition | Array<VDefinitionLink>> */ js.Any
  ]
}
