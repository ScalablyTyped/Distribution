package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libColorProviderMod {
  type ProvideColorPresentationSignature = js.Function3[
    /* color */ vscodeLib.vscodeMod.Color, 
    /* context */ vscodeDashLanguageclientLib.Anon_Document, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.ColorPresentation]]
  ]
  type ProvideDocumentColorsSignature = js.Function2[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[js.Array[vscodeLib.vscodeMod.ColorInformation]]
  ]
}
