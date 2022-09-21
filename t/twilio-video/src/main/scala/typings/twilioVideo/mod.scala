package typings.twilioVideo

import typings.std.MediaStreamTrack
import typings.twilioVideo.localDataTrackOptionsMod.LocalDataTrackOptions
import typings.twilioVideo.localTrackOptionsMod.LocalTrackOptions
import typings.twilioVideo.loglevelMod.Log.RootLogger
import typings.twilioVideo.preflightTypesMod.PreflightOptions
import typings.twilioVideo.typesMod.CancelablePromise
import typings.twilioVideo.typesMod.ConnectOptions
import typings.twilioVideo.typesMod.CreateLocalAudioTrackOptions
import typings.twilioVideo.typesMod.CreateLocalTrackOptions
import typings.twilioVideo.typesMod.CreateLocalTracksOptions
import typings.twilioVideo.typesMod.LocalTrack
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
    extends typings.twilioVideo.audioTrackMod.AudioTrack
  
  @JSImport("twilio-video", "LocalAudioTrack")
  @js.native
  open class LocalAudioTrack protected ()
    extends typings.twilioVideo.localAudioTrackMod.LocalAudioTrack {
    def this(mediaStreamTrack: MediaStreamTrack) = this()
    def this(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions) = this()
  }
  
  @JSImport("twilio-video", "LocalAudioTrackPublication")
  @js.native
  open class LocalAudioTrackPublication ()
    extends typings.twilioVideo.localAudioTrackPublicationMod.LocalAudioTrackPublication
  
  @JSImport("twilio-video", "LocalAudioTrackStats")
  @js.native
  open class LocalAudioTrackStats ()
    extends typings.twilioVideo.typesMod.LocalAudioTrackStats
  
  @JSImport("twilio-video", "LocalDataTrack")
  @js.native
  open class LocalDataTrack ()
    extends typings.twilioVideo.localDataTrackMod.LocalDataTrack {
    def this(options: LocalDataTrackOptions) = this()
  }
  
  @JSImport("twilio-video", "LocalDataTrackPublication")
  @js.native
  open class LocalDataTrackPublication ()
    extends typings.twilioVideo.localDataTrackPublicationMod.LocalDataTrackPublication
  
  @JSImport("twilio-video", "LocalParticipant")
  @js.native
  open class LocalParticipant ()
    extends typings.twilioVideo.localParticipantMod.LocalParticipant
  
  @JSImport("twilio-video", "LocalTrackPublication")
  @js.native
  open class LocalTrackPublication ()
    extends typings.twilioVideo.localTrackPublicationMod.LocalTrackPublication
  
  @JSImport("twilio-video", "LocalTrackStats")
  @js.native
  open class LocalTrackStats ()
    extends typings.twilioVideo.typesMod.LocalTrackStats
  
  @JSImport("twilio-video", "LocalVideoTrack")
  @js.native
  open class LocalVideoTrack protected ()
    extends typings.twilioVideo.localVideoTrackMod.LocalVideoTrack {
    def this(mediaStreamTrack: MediaStreamTrack) = this()
    def this(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions) = this()
  }
  
  @JSImport("twilio-video", "LocalVideoTrackPublication")
  @js.native
  open class LocalVideoTrackPublication ()
    extends typings.twilioVideo.localVideoTrackPublicationMod.LocalVideoTrackPublication
  
  @JSImport("twilio-video", "LocalVideoTrackStats")
  @js.native
  open class LocalVideoTrackStats ()
    extends typings.twilioVideo.typesMod.LocalVideoTrackStats
  
  @JSImport("twilio-video", "Logger")
  @js.native
  val Logger: RootLogger = js.native
  
  @JSImport("twilio-video", "NetworkQualityBandwidthStats")
  @js.native
  open class NetworkQualityBandwidthStats ()
    extends typings.twilioVideo.typesMod.NetworkQualityBandwidthStats
  
  @JSImport("twilio-video", "NetworkQualityFractionLostStats")
  @js.native
  open class NetworkQualityFractionLostStats ()
    extends typings.twilioVideo.typesMod.NetworkQualityFractionLostStats
  
  @JSImport("twilio-video", "NetworkQualityLatencyStats")
  @js.native
  open class NetworkQualityLatencyStats ()
    extends typings.twilioVideo.typesMod.NetworkQualityLatencyStats
  
  @JSImport("twilio-video", "NetworkQualityMediaStats")
  @js.native
  open class NetworkQualityMediaStats ()
    extends typings.twilioVideo.typesMod.NetworkQualityMediaStats
  
  @JSImport("twilio-video", "NetworkQualitySendOrRecvStats")
  @js.native
  open class NetworkQualitySendOrRecvStats ()
    extends typings.twilioVideo.typesMod.NetworkQualitySendOrRecvStats
  
  @JSImport("twilio-video", "NetworkQualityStats")
  @js.native
  open class NetworkQualityStats ()
    extends typings.twilioVideo.typesMod.NetworkQualityStats
  
  @JSImport("twilio-video", "Participant")
  @js.native
  open class Participant ()
    extends typings.twilioVideo.participantMod.Participant
  
  @JSImport("twilio-video", "PreflightTest")
  @js.native
  open class PreflightTest ()
    extends typings.twilioVideo.preflighttestMod.PreflightTest
  
  @JSImport("twilio-video", "RemoteAudioTrack")
  @js.native
  open class RemoteAudioTrack ()
    extends typings.twilioVideo.remoteAudioTrackMod.RemoteAudioTrack
  
  @JSImport("twilio-video", "RemoteAudioTrackPublication")
  @js.native
  open class RemoteAudioTrackPublication ()
    extends typings.twilioVideo.remoteAudioTrackPublicationMod.RemoteAudioTrackPublication
  
  @JSImport("twilio-video", "RemoteAudioTrackStats")
  @js.native
  open class RemoteAudioTrackStats ()
    extends typings.twilioVideo.typesMod.RemoteAudioTrackStats
  
  @JSImport("twilio-video", "RemoteDataTrack")
  @js.native
  open class RemoteDataTrack ()
    extends typings.twilioVideo.remoteDataTrackMod.RemoteDataTrack
  
  @JSImport("twilio-video", "RemoteDataTrackPublication")
  @js.native
  open class RemoteDataTrackPublication ()
    extends typings.twilioVideo.remoteDataTrackPublicationMod.RemoteDataTrackPublication
  
  @JSImport("twilio-video", "RemoteParticipant")
  @js.native
  open class RemoteParticipant ()
    extends typings.twilioVideo.remoteParticipantMod.RemoteParticipant
  
  @JSImport("twilio-video", "RemoteTrackPublication")
  @js.native
  open class RemoteTrackPublication ()
    extends typings.twilioVideo.remoteTrackPublicationMod.RemoteTrackPublication
  
  @JSImport("twilio-video", "RemoteTrackStats")
  @js.native
  open class RemoteTrackStats ()
    extends typings.twilioVideo.typesMod.RemoteTrackStats
  
  @JSImport("twilio-video", "RemoteVideoTrack")
  @js.native
  open class RemoteVideoTrack ()
    extends typings.twilioVideo.remoteVideoTrackMod.RemoteVideoTrack
  
  @JSImport("twilio-video", "RemoteVideoTrackPublication")
  @js.native
  open class RemoteVideoTrackPublication ()
    extends typings.twilioVideo.remoteVideoTrackPublicationMod.RemoteVideoTrackPublication
  
  @JSImport("twilio-video", "RemoteVideoTrackStats")
  @js.native
  open class RemoteVideoTrackStats ()
    extends typings.twilioVideo.typesMod.RemoteVideoTrackStats
  
  @JSImport("twilio-video", "Room")
  @js.native
  open class Room ()
    extends typings.twilioVideo.roomMod.Room
  
  @JSImport("twilio-video", "StatsReport")
  @js.native
  open class StatsReport ()
    extends typings.twilioVideo.typesMod.StatsReport
  
  @JSImport("twilio-video", "Track")
  @js.native
  open class Track ()
    extends typings.twilioVideo.trackMod.Track
  
  @JSImport("twilio-video", "TrackPublication")
  @js.native
  open class TrackPublication ()
    extends typings.twilioVideo.trackPublicationMod.TrackPublication
  
  @JSImport("twilio-video", "TrackStats")
  @js.native
  open class TrackStats ()
    extends typings.twilioVideo.typesMod.TrackStats
  
  @JSImport("twilio-video", "TwilioError")
  @js.native
  open class TwilioError ()
    extends typings.twilioVideo.twilioErrorMod.TwilioError
  
  @JSImport("twilio-video", "VideoProcessor")
  @js.native
  open class VideoProcessor ()
    extends typings.twilioVideo.videoProcessorMod.VideoProcessor
  
  @JSImport("twilio-video", "VideoTrack")
  @js.native
  open class VideoTrack ()
    extends typings.twilioVideo.videoTrackMod.VideoTrack
  
  inline def connect(token: String): CancelablePromise[typings.twilioVideo.roomMod.Room] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(token.asInstanceOf[js.Any]).asInstanceOf[CancelablePromise[typings.twilioVideo.roomMod.Room]]
  inline def connect(token: String, options: ConnectOptions): CancelablePromise[typings.twilioVideo.roomMod.Room] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[typings.twilioVideo.roomMod.Room]]
  
  inline def createLocalAudioTrack(): js.Promise[typings.twilioVideo.localAudioTrackMod.LocalAudioTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalAudioTrack")().asInstanceOf[js.Promise[typings.twilioVideo.localAudioTrackMod.LocalAudioTrack]]
  inline def createLocalAudioTrack(options: CreateLocalAudioTrackOptions): js.Promise[typings.twilioVideo.localAudioTrackMod.LocalAudioTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalAudioTrack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.twilioVideo.localAudioTrackMod.LocalAudioTrack]]
  inline def createLocalAudioTrack(options: CreateLocalTracksOptions): js.Promise[typings.twilioVideo.localAudioTrackMod.LocalAudioTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalAudioTrack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.twilioVideo.localAudioTrackMod.LocalAudioTrack]]
  
  inline def createLocalTracks(): js.Promise[js.Array[LocalTrack]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalTracks")().asInstanceOf[js.Promise[js.Array[LocalTrack]]]
  inline def createLocalTracks(options: CreateLocalTracksOptions): js.Promise[js.Array[LocalTrack]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalTracks")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[LocalTrack]]]
  
  inline def createLocalVideoTrack(): js.Promise[typings.twilioVideo.localVideoTrackMod.LocalVideoTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalVideoTrack")().asInstanceOf[js.Promise[typings.twilioVideo.localVideoTrackMod.LocalVideoTrack]]
  inline def createLocalVideoTrack(options: CreateLocalTrackOptions): js.Promise[typings.twilioVideo.localVideoTrackMod.LocalVideoTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalVideoTrack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.twilioVideo.localVideoTrackMod.LocalVideoTrack]]
  
  @JSImport("twilio-video", "isSupported")
  @js.native
  val isSupported: Boolean = js.native
  
  inline def runPreflight(token: String): typings.twilioVideo.preflighttestMod.PreflightTest = ^.asInstanceOf[js.Dynamic].applyDynamic("runPreflight")(token.asInstanceOf[js.Any]).asInstanceOf[typings.twilioVideo.preflighttestMod.PreflightTest]
  inline def runPreflight(token: String, options: PreflightOptions): typings.twilioVideo.preflighttestMod.PreflightTest = (^.asInstanceOf[js.Dynamic].applyDynamic("runPreflight")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.twilioVideo.preflighttestMod.PreflightTest]
  
  @JSImport("twilio-video", "version")
  @js.native
  val version: String = js.native
}
