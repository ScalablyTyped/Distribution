package typings
package twilioDashVideoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twilioDashVideoMod {
  type AudioCodec = twilioDashVideoLib.twilioDashVideoLibStrings.isac | twilioDashVideoLib.twilioDashVideoLibStrings.opus | twilioDashVideoLib.twilioDashVideoLibStrings.PCMA | twilioDashVideoLib.twilioDashVideoLibStrings.PCMU
  type AudioLevel = scala.Double
  type AudioTrackPublication = LocalAudioTrackPublication | RemoteAudioTrackPublication
  type DataTrack = LocalDataTrack | RemoteDataTrack
  type DataTrackPublication = LocalDataTrackPublication | RemoteDataTrackPublication
  type LocalTrack = LocalAudioTrack | LocalVideoTrack | LocalDataTrack
  type LogLevel = twilioDashVideoLib.twilioDashVideoLibStrings.debug | twilioDashVideoLib.twilioDashVideoLibStrings.info | twilioDashVideoLib.twilioDashVideoLibStrings.warn | twilioDashVideoLib.twilioDashVideoLibStrings.error | twilioDashVideoLib.twilioDashVideoLibStrings.off
  type NetworkQualityLevel = scala.Double
  type RemoteTrack = RemoteAudioTrack | RemoteVideoTrack | RemoteDataTrack
  type VideoCodec = twilioDashVideoLib.twilioDashVideoLibStrings.H264 | twilioDashVideoLib.twilioDashVideoLibStrings.VP8 | twilioDashVideoLib.twilioDashVideoLibStrings.VP9
  type VideoTrackPublication = LocalVideoTrackPublication | RemoteVideoTrackPublication
}
