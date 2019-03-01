package typings
package vscodeDashLanguageclientLib.libColorProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorProviderMiddleware extends js.Object {
  var provideColorPresentations: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VColor */ /* color */ js.Any, 
      /* context */ vscodeDashLanguageclientLib.Anon_Document, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideColorPresentationSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VColorPresentation>> */ _
    ]
  ] = js.undefined
  var provideDocumentColors: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextDocument */ /* document */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentColorsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VColorInformation>> */ _
    ]
  ] = js.undefined
}

object ColorProviderMiddleware {
  @scala.inline
  def apply(
    provideColorPresentations: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VColor */ /* color */ js.Any, 
      /* context */ vscodeDashLanguageclientLib.Anon_Document, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideColorPresentationSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VColorPresentation>> */ _
    ] = null,
    provideDocumentColors: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextDocument */ /* document */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentColorsSignature, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProviderResult<Array<VColorInformation>> */ _
    ] = null
  ): ColorProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideColorPresentations != null) __obj.updateDynamic("provideColorPresentations")(provideColorPresentations)
    if (provideDocumentColors != null) __obj.updateDynamic("provideDocumentColors")(provideDocumentColors)
    __obj.asInstanceOf[ColorProviderMiddleware]
  }
}

