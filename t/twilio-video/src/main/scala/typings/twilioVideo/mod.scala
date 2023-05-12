package typings.twilioVideo

import typings.std.MediaStreamTrack
import typings.twilioVideo.tsdefLocalDataTrackOptionsMod.LocalDataTrackOptions
import typings.twilioVideo.tsdefLocalTrackOptionsMod.LocalTrackOptions
import typings.twilioVideo.tsdefLoglevelMod.Log.RootLogger
import typings.twilioVideo.tsdefPreflightTypesMod.PreflightOptions
import typings.twilioVideo.tsdefTypesMod.CancelablePromise
import typings.twilioVideo.tsdefTypesMod.ConnectOptions
import typings.twilioVideo.tsdefTypesMod.CreateLocalAudioTrackOptions
import typings.twilioVideo.tsdefTypesMod.CreateLocalTrackOptions
import typings.twilioVideo.tsdefTypesMod.CreateLocalTracksOptions
import typings.twilioVideo.tsdefTypesMod.LocalTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("twilio-video", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio-video", "AudioTrack")
  @js.native
  open class AudioTrack ()
    extends typings.twilioVideo.tsdefAudioTrackMod.AudioTrack
  
  @JSImport("twilio-video", "LocalAudioTrack")
  @js.native
  open class LocalAudioTrack protected ()
    extends typings.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack {
    def this(mediaStreamTrack: MediaStreamTrack) = this()
    def this(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions) = this()
  }
  
  @JSImport("twilio-video", "LocalAudioTrackPublication")
  @js.native
  open class LocalAudioTrackPublication ()
    extends typings.twilioVideo.tsdefLocalAudioTrackPublicationMod.LocalAudioTrackPublication
  
  @JSImport("twilio-video", "LocalAudioTrackStats")
  @js.native
  open class LocalAudioTrackStats ()
    extends typings.twilioVideo.tsdefTypesMod.LocalAudioTrackStats
  
  @JSImport("twilio-video", "LocalDataTrack")
  @js.native
  open class LocalDataTrack ()
    extends typings.twilioVideo.tsdefLocalDataTrackMod.LocalDataTrack {
    def this(options: LocalDataTrackOptions) = this()
  }
  
  @JSImport("twilio-video", "LocalDataTrackPublication")
  @js.native
  open class LocalDataTrackPublication ()
    extends typings.twilioVideo.tsdefLocalDataTrackPublicationMod.LocalDataTrackPublication
  
  @JSImport("twilio-video", "LocalParticipant")
  @js.native
  open class LocalParticipant ()
    extends typings.twilioVideo.tsdefLocalParticipantMod.LocalParticipant
  
  @JSImport("twilio-video", "LocalTrackPublication")
  @js.native
  open class LocalTrackPublication ()
    extends typings.twilioVideo.tsdefLocalTrackPublicationMod.LocalTrackPublication
  
  @JSImport("twilio-video", "LocalTrackStats")
  @js.native
  open class LocalTrackStats ()
    extends typings.twilioVideo.tsdefTypesMod.LocalTrackStats
  
  @JSImport("twilio-video", "LocalVideoTrack")
  @js.native
  open class LocalVideoTrack protected ()
    extends typings.twilioVideo.tsdefLocalVideoTrackMod.LocalVideoTrack {
    def this(mediaStreamTrack: MediaStreamTrack) = this()
    def this(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions) = this()
  }
  
  @JSImport("twilio-video", "LocalVideoTrackPublication")
  @js.native
  open class LocalVideoTrackPublication ()
    extends typings.twilioVideo.tsdefLocalVideoTrackPublicationMod.LocalVideoTrackPublication
  
  @JSImport("twilio-video", "LocalVideoTrackStats")
  @js.native
  open class LocalVideoTrackStats ()
    extends typings.twilioVideo.tsdefTypesMod.LocalVideoTrackStats
  
  @JSImport("twilio-video", "Logger")
  @js.native
  val Logger: RootLogger = js.native
  
  @JSImport("twilio-video", "NetworkQualityBandwidthStats")
  @js.native
  open class NetworkQualityBandwidthStats ()
    extends typings.twilioVideo.tsdefTypesMod.NetworkQualityBandwidthStats
  
  @JSImport("twilio-video", "NetworkQualityFractionLostStats")
  @js.native
  open class NetworkQualityFractionLostStats ()
    extends typings.twilioVideo.tsdefTypesMod.NetworkQualityFractionLostStats
  
  @JSImport("twilio-video", "NetworkQualityLatencyStats")
  @js.native
  open class NetworkQualityLatencyStats ()
    extends typings.twilioVideo.tsdefTypesMod.NetworkQualityLatencyStats
  
  @JSImport("twilio-video", "NetworkQualityMediaStats")
  @js.native
  open class NetworkQualityMediaStats ()
    extends typings.twilioVideo.tsdefTypesMod.NetworkQualityMediaStats
  
  @JSImport("twilio-video", "NetworkQualitySendOrRecvStats")
  @js.native
  open class NetworkQualitySendOrRecvStats ()
    extends typings.twilioVideo.tsdefTypesMod.NetworkQualitySendOrRecvStats
  
  @JSImport("twilio-video", "NetworkQualityStats")
  @js.native
  open class NetworkQualityStats ()
    extends typings.twilioVideo.tsdefTypesMod.NetworkQualityStats
  
  @JSImport("twilio-video", "Participant")
  @js.native
  open class Participant ()
    extends typings.twilioVideo.tsdefParticipantMod.Participant
  
  @JSImport("twilio-video", "PreflightTest")
  @js.native
  open class PreflightTest ()
    extends typings.twilioVideo.tsdefPreflighttestMod.PreflightTest
  
  @JSImport("twilio-video", "RemoteAudioTrack")
  @js.native
  open class RemoteAudioTrack ()
    extends typings.twilioVideo.tsdefRemoteAudioTrackMod.RemoteAudioTrack
  
  @JSImport("twilio-video", "RemoteAudioTrackPublication")
  @js.native
  open class RemoteAudioTrackPublication ()
    extends typings.twilioVideo.tsdefRemoteAudioTrackPublicationMod.RemoteAudioTrackPublication
  
  @JSImport("twilio-video", "RemoteAudioTrackStats")
  @js.native
  open class RemoteAudioTrackStats ()
    extends typings.twilioVideo.tsdefTypesMod.RemoteAudioTrackStats
  
  @JSImport("twilio-video", "RemoteDataTrack")
  @js.native
  open class RemoteDataTrack ()
    extends typings.twilioVideo.tsdefRemoteDataTrackMod.RemoteDataTrack
  
  @JSImport("twilio-video", "RemoteDataTrackPublication")
  @js.native
  open class RemoteDataTrackPublication ()
    extends typings.twilioVideo.tsdefRemoteDataTrackPublicationMod.RemoteDataTrackPublication
  
  @JSImport("twilio-video", "RemoteParticipant")
  @js.native
  open class RemoteParticipant ()
    extends typings.twilioVideo.tsdefRemoteParticipantMod.RemoteParticipant
  
  @JSImport("twilio-video", "RemoteTrackPublication")
  @js.native
  open class RemoteTrackPublication ()
    extends typings.twilioVideo.tsdefRemoteTrackPublicationMod.RemoteTrackPublication
  
  @JSImport("twilio-video", "RemoteTrackStats")
  @js.native
  open class RemoteTrackStats ()
    extends typings.twilioVideo.tsdefTypesMod.RemoteTrackStats
  
  @JSImport("twilio-video", "RemoteVideoTrack")
  @js.native
  open class RemoteVideoTrack ()
    extends typings.twilioVideo.tsdefRemoteVideoTrackMod.RemoteVideoTrack
  
  @JSImport("twilio-video", "RemoteVideoTrackPublication")
  @js.native
  open class RemoteVideoTrackPublication ()
    extends typings.twilioVideo.tsdefRemoteVideoTrackPublicationMod.RemoteVideoTrackPublication
  
  @JSImport("twilio-video", "RemoteVideoTrackStats")
  @js.native
  open class RemoteVideoTrackStats ()
    extends typings.twilioVideo.tsdefTypesMod.RemoteVideoTrackStats
  
  @JSImport("twilio-video", "Room")
  @js.native
  open class Room ()
    extends typings.twilioVideo.tsdefRoomMod.Room
  
  @JSImport("twilio-video", "StatsReport")
  @js.native
  open class StatsReport ()
    extends typings.twilioVideo.tsdefTypesMod.StatsReport
  
  @JSImport("twilio-video", "Track")
  @js.native
  open class Track ()
    extends typings.twilioVideo.tsdefTrackMod.Track
  
  @JSImport("twilio-video", "TrackPublication")
  @js.native
  open class TrackPublication ()
    extends typings.twilioVideo.tsdefTrackPublicationMod.TrackPublication
  
  @JSImport("twilio-video", "TrackStats")
  @js.native
  open class TrackStats ()
    extends typings.twilioVideo.tsdefTypesMod.TrackStats
  
  @JSImport("twilio-video", "TwilioError")
  @js.native
  open class TwilioError ()
    extends typings.twilioVideo.tsdefTwilioErrorMod.TwilioError
  
  @JSImport("twilio-video", "VideoProcessor")
  @js.native
  open class VideoProcessor ()
    extends typings.twilioVideo.tsdefVideoProcessorMod.VideoProcessor
  
  @JSImport("twilio-video", "VideoTrack")
  @js.native
  open class VideoTrack ()
    extends typings.twilioVideo.tsdefVideoTrackMod.VideoTrack
  
  inline def connect(token: String): CancelablePromise[typings.twilioVideo.tsdefRoomMod.Room] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(token.asInstanceOf[js.Any]).asInstanceOf[CancelablePromise[typings.twilioVideo.tsdefRoomMod.Room]]
  inline def connect(token: String, options: ConnectOptions): CancelablePromise[typings.twilioVideo.tsdefRoomMod.Room] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[typings.twilioVideo.tsdefRoomMod.Room]]
  
  inline def createLocalAudioTrack(): js.Promise[typings.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalAudioTrack")().asInstanceOf[js.Promise[typings.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack]]
  inline def createLocalAudioTrack(options: CreateLocalAudioTrackOptions): js.Promise[typings.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalAudioTrack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack]]
  inline def createLocalAudioTrack(options: CreateLocalTrackOptions): js.Promise[typings.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalAudioTrack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack]]
  
  inline def createLocalTracks(): js.Promise[js.Array[LocalTrack]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalTracks")().asInstanceOf[js.Promise[js.Array[LocalTrack]]]
  inline def createLocalTracks(options: CreateLocalTracksOptions): js.Promise[js.Array[LocalTrack]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalTracks")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[LocalTrack]]]
  
  inline def createLocalVideoTrack(): js.Promise[typings.twilioVideo.tsdefLocalVideoTrackMod.LocalVideoTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalVideoTrack")().asInstanceOf[js.Promise[typings.twilioVideo.tsdefLocalVideoTrackMod.LocalVideoTrack]]
  inline def createLocalVideoTrack(options: CreateLocalTrackOptions): js.Promise[typings.twilioVideo.tsdefLocalVideoTrackMod.LocalVideoTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalVideoTrack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.twilioVideo.tsdefLocalVideoTrackMod.LocalVideoTrack]]
  
  @JSImport("twilio-video", "isSupported")
  @js.native
  val isSupported: Boolean = js.native
  
  inline def runPreflight(token: String): typings.twilioVideo.tsdefPreflighttestMod.PreflightTest = ^.asInstanceOf[js.Dynamic].applyDynamic("runPreflight")(token.asInstanceOf[js.Any]).asInstanceOf[typings.twilioVideo.tsdefPreflighttestMod.PreflightTest]
  inline def runPreflight(token: String, options: PreflightOptions): typings.twilioVideo.tsdefPreflighttestMod.PreflightTest = (^.asInstanceOf[js.Dynamic].applyDynamic("runPreflight")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.twilioVideo.tsdefPreflighttestMod.PreflightTest]
  
  @JSImport("twilio-video", "version")
  @js.native
  val version: String = js.native
}
