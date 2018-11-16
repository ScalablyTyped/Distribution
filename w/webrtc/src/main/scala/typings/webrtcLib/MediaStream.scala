package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStream
  extends stdLib.EventTarget {
  def addTrack(track: MediaStreamTrack): scala.Unit = js.native
  def getAudioTracks(): js.Array[MediaStreamTrack] = js.native
  def getTrackById(trackId: java.lang.String): MediaStreamTrack = js.native
  def getTracks(): js.Array[MediaStreamTrack] = js.native
  def getVideoTracks(): js.Array[MediaStreamTrack] = js.native
  def removeTrack(track: MediaStreamTrack): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

