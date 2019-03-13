package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDeclarationMod {
  type ProvideDeclarationSignature = js.Function3[
    /* document */ vscodeLib.vscodeMod.TextDocument, 
    /* position */ vscodeLib.vscodeMod.Position, 
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    vscodeLib.vscodeMod.ProviderResult[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VDeclaration */ js.Any
    ]
  ]
}
