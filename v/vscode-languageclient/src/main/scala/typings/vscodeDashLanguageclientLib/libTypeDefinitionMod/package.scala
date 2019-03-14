package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypeDefinitionMod {
  type ProvideTypeDefinitionSignature = js.Function3[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* position */ vscodeLib.vscodeMod.Position, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[
      vscodeLib.vscodeMod.Definition | (js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDefinitionLink */ js.Any
      ])
    ]
  ]
}
