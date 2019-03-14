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
    vscodeLib.vscodeMod.ProviderResult[
      js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VColorPresentation */ js.Any
      ]
    ]
  ]
  type ProvideDocumentColorsSignature = js.Function2[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[
      js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VColorInformation */ js.Any
      ]
    ]
  ]
}
