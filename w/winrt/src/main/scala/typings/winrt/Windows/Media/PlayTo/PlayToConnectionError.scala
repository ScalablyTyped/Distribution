package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceError
import typings.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceLocked
import typings.winrt.Windows.Media.PlayTo.PlayToConnectionError.deviceNotResponding
import typings.winrt.Windows.Media.PlayTo.PlayToConnectionError.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayToConnectionError extends js.Object

@JSGlobal("Windows.Media.PlayTo.PlayToConnectionError")
@js.native
object PlayToConnectionError extends js.Object {
  @js.native
  sealed trait deviceError extends PlayToConnectionError
  
  @js.native
  sealed trait deviceLocked extends PlayToConnectionError
  
  @js.native
  sealed trait deviceNotResponding extends PlayToConnectionError
  
  @js.native
  sealed trait none extends PlayToConnectionError
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayToConnectionError with Double] = js.native
  /* 2 */ @js.native
  object deviceError extends TopLevel[deviceError with Double]
  
  /* 3 */ @js.native
  object deviceLocked extends TopLevel[deviceLocked with Double]
  
  /* 1 */ @js.native
  object deviceNotResponding extends TopLevel[deviceNotResponding with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

