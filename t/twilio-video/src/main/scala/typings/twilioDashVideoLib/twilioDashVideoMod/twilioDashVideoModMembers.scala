package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", JSImport.Namespace)
@js.native
object twilioDashVideoModMembers extends js.Object {
  val version: java.lang.String = js.native
  def connect(token: java.lang.String): stdLib.Promise[Room] = js.native
  def connect(token: java.lang.String, options: ConnectOptions): stdLib.Promise[Room] = js.native
  def createLocalAudioTrack(): stdLib.Promise[LocalAudioTrack] = js.native
  def createLocalAudioTrack(options: CreateLocalTrackOptions): stdLib.Promise[LocalAudioTrack] = js.native
  def createLocalTracks(): stdLib.Promise[js.Array[LocalTrack]] = js.native
  def createLocalTracks(options: CreateLocalTracksOptions): stdLib.Promise[js.Array[LocalTrack]] = js.native
  def createLocalVideoTrack(): stdLib.Promise[LocalVideoTrack] = js.native
  def createLocalVideoTrack(options: CreateLocalTrackOptions): stdLib.Promise[LocalVideoTrack] = js.native
  def isSupported(): scala.Boolean = js.native
  def rewriteLocalTrackIds(room: Room, trackStats: js.Array[LocalTrackStats]): js.Array[LocalTrackStats] = js.native
}

