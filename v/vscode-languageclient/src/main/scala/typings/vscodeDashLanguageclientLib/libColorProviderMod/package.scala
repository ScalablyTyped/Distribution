package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libColorProviderMod {
  type ProvideColorPresentationSignature = js.Function3[
    /* color */ js.Any, 
    /* context */ vscodeDashLanguageclientLib.Anon_Range, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
  type ProvideDocumentColorsSignature = js.Function2[
    /* document */ js.Any, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    js.Any
  ]
}
