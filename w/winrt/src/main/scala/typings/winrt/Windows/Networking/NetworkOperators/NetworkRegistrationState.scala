package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkRegistrationState extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.NetworkRegistrationState")
@js.native
object NetworkRegistrationState extends js.Object {
  @js.native
  sealed trait denied extends NetworkRegistrationState
  
  @js.native
  sealed trait deregistered extends NetworkRegistrationState
  
  @js.native
  sealed trait home extends NetworkRegistrationState
  
  @js.native
  sealed trait none extends NetworkRegistrationState
  
  @js.native
  sealed trait partner extends NetworkRegistrationState
  
  @js.native
  sealed trait roaming extends NetworkRegistrationState
  
  @js.native
  sealed trait searching extends NetworkRegistrationState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkRegistrationState with Double] = js.native
  /* 6 */ @js.native
  object denied extends TopLevel[denied with Double]
  
  /* 1 */ @js.native
  object deregistered extends TopLevel[deregistered with Double]
  
  /* 3 */ @js.native
  object home extends TopLevel[home with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 5 */ @js.native
  object partner extends TopLevel[partner with Double]
  
  /* 4 */ @js.native
  object roaming extends TopLevel[roaming with Double]
  
  /* 2 */ @js.native
  object searching extends TopLevel[searching with Double]
  
}

