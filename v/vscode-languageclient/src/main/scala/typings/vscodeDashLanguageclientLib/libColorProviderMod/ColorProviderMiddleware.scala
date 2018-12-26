package typings
package vscodeDashLanguageclientLib.libColorProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ColorProviderMiddleware extends js.Object {
  var provideColorPresentations: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* color */ js.Any, 
      /* context */ vscodeDashLanguageclientLib.Anon_Range, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideColorPresentationSignature, 
      _
    ]
  ] = js.undefined
  var provideDocumentColors: js.UndefOr[
    js.ThisFunction3[
      /* this */ scala.Unit, 
      /* document */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDocumentColorsSignature, 
      _
    ]
  ] = js.undefined
}

