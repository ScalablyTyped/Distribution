package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkTypes extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkTypes")
@js.native
object NetworkTypes extends js.Object {
  @js.native
  sealed trait internet extends NetworkTypes
  
  @js.native
  sealed trait none extends NetworkTypes
  
  @js.native
  sealed trait privateNetwork extends NetworkTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkTypes with Double] = js.native
  /* 1 */ @js.native
  object internet extends TopLevel[internet with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object privateNetwork extends TopLevel[privateNetwork with Double]
  
}

