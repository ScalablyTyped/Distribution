package typings.twilioVideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AudioLevel = scala.Double
  
  type NetworkQualityLevel = scala.Double
  
  @scala.inline
  def connect(token: java.lang.String): js.Promise[typings.twilioVideo.mod.Room] = typings.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(token.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.twilioVideo.mod.Room]]
  @scala.inline
  def connect(token: java.lang.String, options: typings.twilioVideo.mod.ConnectOptions): js.Promise[typings.twilioVideo.mod.Room] = (typings.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.twilioVideo.mod.Room]]
  
  @scala.inline
  def createLocalAudioTrack(): js.Promise[typings.twilioVideo.mod.LocalAudioTrack] = typings.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLocalAudioTrack")().asInstanceOf[js.Promise[typings.twilioVideo.mod.LocalAudioTrack]]
  @scala.inline
  def createLocalAudioTrack(options: typings.twilioVideo.mod.CreateLocalTrackOptions): js.Promise[typings.twilioVideo.mod.LocalAudioTrack] = typings.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLocalAudioTrack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.twilioVideo.mod.LocalAudioTrack]]
  
  @scala.inline
  def createLocalTracks(): js.Promise[js.Array[typings.twilioVideo.mod.LocalTrack]] = typings.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLocalTracks")().asInstanceOf[js.Promise[js.Array[typings.twilioVideo.mod.LocalTrack]]]
  @scala.inline
  def createLocalTracks(options: typings.twilioVideo.mod.CreateLocalTracksOptions): js.Promise[js.Array[typings.twilioVideo.mod.LocalTrack]] = typings.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLocalTracks")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.twilioVideo.mod.LocalTrack]]]
  
  @scala.inline
  def createLocalVideoTrack(): js.Promise[typings.twilioVideo.mod.LocalVideoTrack] = typings.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLocalVideoTrack")().asInstanceOf[js.Promise[typings.twilioVideo.mod.LocalVideoTrack]]
  @scala.inline
  def createLocalVideoTrack(options: typings.twilioVideo.mod.CreateLocalTrackOptions): js.Promise[typings.twilioVideo.mod.LocalVideoTrack] = typings.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLocalVideoTrack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.twilioVideo.mod.LocalVideoTrack]]
  
  @scala.inline
  def isSupported: scala.Boolean = typings.twilioVideo.mod.^.asInstanceOf[js.Dynamic].selectDynamic("isSupported").asInstanceOf[scala.Boolean]
  
  @scala.inline
  def rewriteLocalTrackIds(room: typings.twilioVideo.mod.Room, trackStats: js.Array[typings.twilioVideo.mod.LocalTrackStats]): js.Array[typings.twilioVideo.mod.LocalTrackStats] = (typings.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rewriteLocalTrackIds")(room.asInstanceOf[js.Any], trackStats.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.twilioVideo.mod.LocalTrackStats]]
  
  @scala.inline
  def version: java.lang.String = typings.twilioVideo.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
