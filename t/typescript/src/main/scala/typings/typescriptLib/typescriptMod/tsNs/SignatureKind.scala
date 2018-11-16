package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignatureKind extends js.Object

@JSImport("typescript/ts", "SignatureKind")
@js.native
object SignatureKind extends js.Object {
  @js.native
  sealed trait Call
    extends typescriptLib.typescriptMod.tsNs.SignatureKind
  
  @js.native
  sealed trait Construct
    extends typescriptLib.typescriptMod.tsNs.SignatureKind
  
}

