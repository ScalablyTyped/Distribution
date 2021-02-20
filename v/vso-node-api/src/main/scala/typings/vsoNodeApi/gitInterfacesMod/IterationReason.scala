package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IterationReason extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "IterationReason")
@js.native
object IterationReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IterationReason with Double] = js.native
  
  @js.native
  sealed trait Create extends IterationReason
  /* 2 */ val Create: typings.vsoNodeApi.gitInterfacesMod.IterationReason.Create with Double = js.native
  
  @js.native
  sealed trait ForcePush extends IterationReason
  /* 1 */ val ForcePush: typings.vsoNodeApi.gitInterfacesMod.IterationReason.ForcePush with Double = js.native
  
  @js.native
  sealed trait Push extends IterationReason
  /* 0 */ val Push: typings.vsoNodeApi.gitInterfacesMod.IterationReason.Push with Double = js.native
  
  @js.native
  sealed trait Rebase extends IterationReason
  /* 4 */ val Rebase: typings.vsoNodeApi.gitInterfacesMod.IterationReason.Rebase with Double = js.native
  
  @js.native
  sealed trait Unknown extends IterationReason
  /* 8 */ val Unknown: typings.vsoNodeApi.gitInterfacesMod.IterationReason.Unknown with Double = js.native
}
