package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.TopLevel
import typings.tampermonkey.Tampermonkey.ReadyState.Done
import typings.tampermonkey.Tampermonkey.ReadyState.HeadersReceived
import typings.tampermonkey.Tampermonkey.ReadyState.Loading
import typings.tampermonkey.Tampermonkey.ReadyState.Opened
import typings.tampermonkey.Tampermonkey.ReadyState.Unsent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

// Response
@JSGlobal("Tampermonkey.ReadyState")
@js.native
object ReadyState extends js.Object {
  @js.native
  sealed trait Done extends ReadyState
  
  @js.native
  sealed trait HeadersReceived extends ReadyState
  
  @js.native
  sealed trait Loading extends ReadyState
  
  @js.native
  sealed trait Opened extends ReadyState
  
  @js.native
  sealed trait Unsent extends ReadyState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
  /* 4 */ @js.native
  object Done extends TopLevel[Done with Double]
  
  /* 2 */ @js.native
  object HeadersReceived extends TopLevel[HeadersReceived with Double]
  
  /* 3 */ @js.native
  object Loading extends TopLevel[Loading with Double]
  
  /* 1 */ @js.native
  object Opened extends TopLevel[Opened with Double]
  
  /* 0 */ @js.native
  object Unsent extends TopLevel[Unsent with Double]
  
}

