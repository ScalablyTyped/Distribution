package typings
package vscodeDashLanguageclientLib.libColorProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorProviderMiddleware extends js.Object {
  var provideColorPresentations: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* color */ vscodeLib.vscodeMod.Color, 
      /* context */ vscodeDashLanguageclientLib.Anon_Document, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideColorPresentationSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.ColorPresentation]]
    ]
  ] = js.undefined
  var provideDocumentColors: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentColorsSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.ColorInformation]]
    ]
  ] = js.undefined
}

object ColorProviderMiddleware {
  @scala.inline
  def apply(
    provideColorPresentations: js.ThisFunction4[
      /* this */ scala.Unit, 
      /* color */ vscodeLib.vscodeMod.Color, 
      /* context */ vscodeDashLanguageclientLib.Anon_Document, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideColorPresentationSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.ColorPresentation]]
    ] = null,
    provideDocumentColors: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ vscodeLib.vscodeMod.TextDocument, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentColorsSignature, 
      vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.ColorInformation]]
    ] = null
  ): ColorProviderMiddleware = {
    val __obj = js.Dynamic.literal()
    if (provideColorPresentations != null) __obj.updateDynamic("provideColorPresentations")(provideColorPresentations)
    if (provideDocumentColors != null) __obj.updateDynamic("provideDocumentColors")(provideDocumentColors)
    __obj.asInstanceOf[ColorProviderMiddleware]
  }
}

