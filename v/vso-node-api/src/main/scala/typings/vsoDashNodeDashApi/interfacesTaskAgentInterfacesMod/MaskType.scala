package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MaskType extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "MaskType")
@js.native
object MaskType extends js.Object {
  @js.native
  sealed trait Regex extends MaskType
  
  @js.native
  sealed trait Variable extends MaskType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MaskType with Double] = js.native
  /* 2 */ @js.native
  object Regex extends TopLevel[Regex with Double]
  
  /* 1 */ @js.native
  object Variable extends TopLevel[Variable with Double]
  
}

