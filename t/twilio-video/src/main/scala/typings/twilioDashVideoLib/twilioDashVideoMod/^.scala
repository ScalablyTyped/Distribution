package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: java.lang.String = js.native
  def connect(token: java.lang.String): js.Promise[Room] = js.native
  def connect(token: java.lang.String, options: ConnectOptions): js.Promise[Room] = js.native
  def createLocalAudioTrack(): js.Promise[LocalAudioTrack] = js.native
  def createLocalAudioTrack(options: CreateLocalTrackOptions): js.Promise[LocalAudioTrack] = js.native
  def createLocalTracks(): js.Promise[js.Array[LocalTrack]] = js.native
  def createLocalTracks(options: CreateLocalTracksOptions): js.Promise[js.Array[LocalTrack]] = js.native
  def createLocalVideoTrack(): js.Promise[LocalVideoTrack] = js.native
  def createLocalVideoTrack(options: CreateLocalTrackOptions): js.Promise[LocalVideoTrack] = js.native
  def isSupported(): scala.Boolean = js.native
  def rewriteLocalTrackIds(room: Room, trackStats: js.Array[LocalTrackStats]): js.Array[LocalTrackStats] = js.native
}

