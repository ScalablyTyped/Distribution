package typings
package vscodeDashLanguageclientLib.libImplementationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ImplementationMiddleware extends js.Object {
  var provideImplementation: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ js.Any, 
      /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideImplementationSignature, 
      _
    ]
  ] = js.undefined
}

