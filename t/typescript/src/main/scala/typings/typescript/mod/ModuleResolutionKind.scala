package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleResolutionKind with Double] = js.native
  /* 1 */ @js.native
  object Classic extends TopLevel[Classic with Double]
  
  /* 2 */ @js.native
  object NodeJs extends TopLevel[NodeJs with Double]
  
}

