package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libColorProviderMod {
  type ProvideColorPresentationSignature = js.Function3[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VColor */ /* color */ js.Any, 
    /* context */ vscodeDashLanguageclientLib.Anon_Document, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VColorPresentation>> */ js.Any
  ]
  type ProvideDocumentColorsSignature = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextDocument */ /* document */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VColorInformation>> */ js.Any
  ]
}
