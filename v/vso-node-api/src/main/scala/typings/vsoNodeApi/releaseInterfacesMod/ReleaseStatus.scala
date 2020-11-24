package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseStatus extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseStatus")
@js.native
object ReleaseStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseStatus with Double] = js.native
  
  @js.native
  sealed trait Abandoned extends ReleaseStatus
  /* 4 */ @js.native
  object Abandoned extends TopLevel[Abandoned with Double]
  
  @js.native
  sealed trait Active extends ReleaseStatus
  /* 2 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  @js.native
  sealed trait Draft extends ReleaseStatus
  /* 1 */ @js.native
  object Draft extends TopLevel[Draft with Double]
  
  @js.native
  sealed trait Undefined extends ReleaseStatus
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
}
