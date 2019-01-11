package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: java.lang.String = js.native
  def connect(token: java.lang.String): js.Promise[twilioDashVideoLib.twilioDashVideoMod.Room] = js.native
  def connect(token: java.lang.String, options: twilioDashVideoLib.twilioDashVideoMod.ConnectOptions): js.Promise[twilioDashVideoLib.twilioDashVideoMod.Room] = js.native
  def createLocalAudioTrack(): js.Promise[twilioDashVideoLib.twilioDashVideoMod.LocalAudioTrack] = js.native
  def createLocalAudioTrack(options: twilioDashVideoLib.twilioDashVideoMod.CreateLocalTrackOptions): js.Promise[twilioDashVideoLib.twilioDashVideoMod.LocalAudioTrack] = js.native
  def createLocalTracks(): js.Promise[js.Array[twilioDashVideoLib.twilioDashVideoMod.LocalTrack]] = js.native
  def createLocalTracks(options: twilioDashVideoLib.twilioDashVideoMod.CreateLocalTracksOptions): js.Promise[js.Array[twilioDashVideoLib.twilioDashVideoMod.LocalTrack]] = js.native
  def createLocalVideoTrack(): js.Promise[twilioDashVideoLib.twilioDashVideoMod.LocalVideoTrack] = js.native
  def createLocalVideoTrack(options: twilioDashVideoLib.twilioDashVideoMod.CreateLocalTrackOptions): js.Promise[twilioDashVideoLib.twilioDashVideoMod.LocalVideoTrack] = js.native
  def isSupported(): scala.Boolean = js.native
  def rewriteLocalTrackIds(
    room: twilioDashVideoLib.twilioDashVideoMod.Room,
    trackStats: js.Array[twilioDashVideoLib.twilioDashVideoMod.LocalTrackStats]
  ): js.Array[twilioDashVideoLib.twilioDashVideoMod.LocalTrackStats] = js.native
}

