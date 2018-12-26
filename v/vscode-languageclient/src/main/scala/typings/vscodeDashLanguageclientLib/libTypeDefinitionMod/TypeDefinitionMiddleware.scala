package typings
package vscodeDashLanguageclientLib.libTypeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TypeDefinitionMiddleware extends js.Object {
  var provideTypeDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ scala.Unit, 
      /* document */ js.Any, 
      /* position */ js.Any, 
      /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
      /* next */ ProvideTypeDefinitionSignature, 
      _
    ]
  ] = js.undefined
}

