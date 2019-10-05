package typings.twilioDashVideo.twilioDashVideoMod

import typings.node.eventsMod.EventEmitter
import typings.twilioDashVideo.twilioDashVideoMod.Track.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "Track")
@js.native
class Track () extends EventEmitter {
  var kind: Kind = js.native
  var name: String = js.native
}

@JSImport("twilio-video", "Track")
@js.native
object Track extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.twilioDashVideo.twilioDashVideoStrings.audio
    - typings.twilioDashVideo.twilioDashVideoStrings.video
    - typings.twilioDashVideo.twilioDashVideoStrings.data
  */
  trait Kind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilioDashVideo.twilioDashVideoStrings.low
    - typings.twilioDashVideo.twilioDashVideoStrings.standard
    - typings.twilioDashVideo.twilioDashVideoStrings.high
  */
  trait Priority extends js.Object
  
  type ID = String
  type SID = String
}

