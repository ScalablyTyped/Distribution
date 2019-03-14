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
      vscodeLib.vscodeMod.ProviderResult[
        js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VColorPresentation */ _
        ]
      ]
    ]
  ] = js.undefined
  var provideDocumentColors: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentColorsSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VColorInformation */ _
        ]
      ]
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
      vscodeLib.vscodeMod.ProviderResult[
        js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VColorPresentation */ _
        ]
      ]
    ] = null,
    provideDocumentColors: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentColorsSignature, 
      vscodeLib.vscodeMod.ProviderResult[
        js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VColorInformation */ _
        ]
      ]
    ] = null
  ): ColorProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideColorPresentations != null) __obj.updateDynamic("provideColorPresentations")(provideColorPresentations)
    if (provideDocumentColors != null) __obj.updateDynamic("provideDocumentColors")(provideDocumentColors)
    __obj.asInstanceOf[ColorProviderMiddleware]
  }
}

