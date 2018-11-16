package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "LocalDataTrack")
@js.native
class LocalDataTrack () extends Track {
  def this(options: LocalDataTrackOptions) = this()
  var id: twilioDashVideoLib.twilioDashVideoMod.TrackNs.ID = js.native
  @JSName("kind")
  var kind_LocalDataTrack: twilioDashVideoLib.twilioDashVideoLibStrings.data = js.native
  var maxPacketLifeTime: scala.Double | scala.Null = js.native
  var maxRetransmits: scala.Double | scala.Null = js.native
  var ordered: scala.Boolean = js.native
  var reliable: scala.Boolean = js.native
  def send(data: java.lang.String): scala.Unit = js.native
  def send(data: stdLib.ArrayBuffer): scala.Unit = js.native
  def send(data: stdLib.ArrayBufferView): scala.Unit = js.native
  def send(data: stdLib.Blob): scala.Unit = js.native
}

