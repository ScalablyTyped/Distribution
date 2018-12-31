package typings
package vscodeDashLanguageclientLib.libColorProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorProviderMiddleware extends js.Object {
  var provideColorPresentations: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify VColor */ /* color */ js.Any, 
      /* context */ vscodeDashLanguageclientLib.Anon_Range, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideColorPresentationSignature, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ProviderResult<Array<VColorPresentation>> */ _
    ]
  ] = js.undefined
  var provideDocumentColors: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify TextDocument */ /* document */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentColorsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ProviderResult<Array<VColorInformation>> */ _
    ]
  ] = js.undefined
}

