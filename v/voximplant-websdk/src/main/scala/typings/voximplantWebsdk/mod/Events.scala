package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Events extends js.Object

/**
  *    VoxImplant.Client general events
  */
@JSImport("voximplant-websdk", "Events")
@js.native
object Events extends js.Object {
  @js.native
  sealed trait AuthResult extends Events
  
  @js.native
  sealed trait ConnectionClosed extends Events
  
  @js.native
  sealed trait ConnectionEstablished extends Events
  
  @js.native
  sealed trait ConnectionFailed extends Events
  
  @js.native
  sealed trait IncomingCall extends Events
  
  @js.native
  sealed trait MicAccessResult extends Events
  
  @js.native
  sealed trait NetStatsReceived extends Events
  
  @js.native
  sealed trait PlaybackFinished extends Events
  
  @js.native
  sealed trait SDKReady extends Events
  
  @js.native
  sealed trait SourcesInfoUpdated extends Events
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Events with Double] = js.native
  /* 0 */ @js.native
  object AuthResult extends TopLevel[AuthResult with Double]
  
  /* 1 */ @js.native
  object ConnectionClosed extends TopLevel[ConnectionClosed with Double]
  
  /* 2 */ @js.native
  object ConnectionEstablished extends TopLevel[ConnectionEstablished with Double]
  
  /* 3 */ @js.native
  object ConnectionFailed extends TopLevel[ConnectionFailed with Double]
  
  /* 4 */ @js.native
  object IncomingCall extends TopLevel[IncomingCall with Double]
  
  /* 5 */ @js.native
  object MicAccessResult extends TopLevel[MicAccessResult with Double]
  
  /* 6 */ @js.native
  object NetStatsReceived extends TopLevel[NetStatsReceived with Double]
  
  /* 7 */ @js.native
  object PlaybackFinished extends TopLevel[PlaybackFinished with Double]
  
  /* 8 */ @js.native
  object SDKReady extends TopLevel[SDKReady with Double]
  
  /* 9 */ @js.native
  object SourcesInfoUpdated extends TopLevel[SourcesInfoUpdated with Double]
  
}

