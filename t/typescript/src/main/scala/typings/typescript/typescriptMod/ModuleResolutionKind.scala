package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModuleResolutionKind extends js.Object

@JSImport("typescript", "ModuleResolutionKind")
@js.native
object ModuleResolutionKind extends js.Object {
  @js.native
  sealed trait Classic extends ModuleResolutionKind
  
  @js.native
  sealed trait NodeJs extends ModuleResolutionKind
  
  /* 1 */ val Classic: typings.typescript.typescriptMod.ModuleResolutionKind.Classic with Double = js.native
  /* 2 */ val NodeJs: typings.typescript.typescriptMod.ModuleResolutionKind.NodeJs with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleResolutionKind with Double] = js.native
}

