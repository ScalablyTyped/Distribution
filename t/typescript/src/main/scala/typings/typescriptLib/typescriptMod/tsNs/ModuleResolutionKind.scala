package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModuleResolutionKind extends js.Object

@JSImport("typescript/ts", "ModuleResolutionKind")
@js.native
object ModuleResolutionKind extends js.Object {
  @js.native
  sealed trait Classic
    extends typescriptLib.typescriptMod.tsNs.ModuleResolutionKind
  
  @js.native
  sealed trait NodeJs
    extends typescriptLib.typescriptMod.tsNs.ModuleResolutionKind
  
}

