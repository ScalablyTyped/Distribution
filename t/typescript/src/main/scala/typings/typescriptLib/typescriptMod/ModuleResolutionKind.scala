package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModuleResolutionKind extends js.Object

@JSImport("typescript", "ModuleResolutionKind")
@js.native
object ModuleResolutionKind extends js.Object {
  @js.native
  sealed trait Classic
    extends typescriptLib.typescriptMod.ModuleResolutionKind
  
  @js.native
  sealed trait NodeJs
    extends typescriptLib.typescriptMod.ModuleResolutionKind
  
  /* 1 */ val Classic: Classic with scala.Double = js.native
  /* 2 */ val NodeJs: NodeJs with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.ModuleResolutionKind with scala.Double] = js.native
}

