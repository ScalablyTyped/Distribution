package typings.twilioDashVideo.twilioDashVideoMod

import typings.node.eventsMod.EventEmitter
import typings.twilioDashVideo.twilioDashVideoMod.TrackNs.SID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "TrackPublication")
@js.native
class TrackPublication () extends EventEmitter {
  var trackName: String = js.native
  var trackSid: SID = js.native
}

