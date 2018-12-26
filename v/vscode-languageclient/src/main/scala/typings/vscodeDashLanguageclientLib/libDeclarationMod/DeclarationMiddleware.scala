package typings
package vscodeDashLanguageclientLib.libDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeclarationMiddleware extends js.Object {
  var provideDeclaration: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ js.Any, 
      /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideDeclarationSignature, 
      _
    ]
  ] = js.undefined
}

