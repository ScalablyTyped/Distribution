package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends StObject
/**
  *    VoxImplant.Client general events
  */
@JSImport("voximplant-websdk", "Events")
@js.native
object Events extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Events & Double] = js.native
  
  @js.native
  sealed trait AuthResult
    extends StObject
       with Events
  /* 0 */ val AuthResult: typings.voximplantWebsdk.mod.Events.AuthResult & Double = js.native
  
  @js.native
  sealed trait ConnectionClosed
    extends StObject
       with Events
  /* 1 */ val ConnectionClosed: typings.voximplantWebsdk.mod.Events.ConnectionClosed & Double = js.native
  
  @js.native
  sealed trait ConnectionEstablished
    extends StObject
       with Events
  /* 2 */ val ConnectionEstablished: typings.voximplantWebsdk.mod.Events.ConnectionEstablished & Double = js.native
  
  @js.native
  sealed trait ConnectionFailed
    extends StObject
       with Events
  /* 3 */ val ConnectionFailed: typings.voximplantWebsdk.mod.Events.ConnectionFailed & Double = js.native
  
  @js.native
  sealed trait IncomingCall
    extends StObject
       with Events
  /* 4 */ val IncomingCall: typings.voximplantWebsdk.mod.Events.IncomingCall & Double = js.native
  
  @js.native
  sealed trait MicAccessResult
    extends StObject
       with Events
  /* 5 */ val MicAccessResult: typings.voximplantWebsdk.mod.Events.MicAccessResult & Double = js.native
  
  @js.native
  sealed trait NetStatsReceived
    extends StObject
       with Events
  /* 6 */ val NetStatsReceived: typings.voximplantWebsdk.mod.Events.NetStatsReceived & Double = js.native
  
  @js.native
  sealed trait PlaybackFinished
    extends StObject
       with Events
  /* 7 */ val PlaybackFinished: typings.voximplantWebsdk.mod.Events.PlaybackFinished & Double = js.native
  
  @js.native
  sealed trait SDKReady
    extends StObject
       with Events
  /* 8 */ val SDKReady: typings.voximplantWebsdk.mod.Events.SDKReady & Double = js.native
  
  @js.native
  sealed trait SourcesInfoUpdated
    extends StObject
       with Events
  /* 9 */ val SourcesInfoUpdated: typings.voximplantWebsdk.mod.Events.SourcesInfoUpdated & Double = js.native
}
